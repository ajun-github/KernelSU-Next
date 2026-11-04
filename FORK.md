# AjunSu 二改说明

基于 [KernelSU-Next](https://github.com/KernelSU-Next/KernelSU-Next) 的品牌定制分支。

## 已做的改动

| 项目 | 位置 | 说明 |
| --- | --- | --- |
| 应用名 | `manager/app/src/main/res/values/strings.xml` → `app_name` | `AjunSu` |
| 包名 | `manager/app/build.gradle.kts` → `namespace`<br>`manager/app/src/main/java/io/github/ajun/ksunext/`<br>`manager/app/src/main/aidl/io/github/ajun/ksunext/`<br>`manager/app/src/main/cpp/jni.cc` | `com.rifsxd.ksunext` → `io.github.ajun.ksunext` |
| 主色 / 配色 | `ui/theme/Color.kt` | 固定 Material 3 青绿配色（种子色 `#00BFA5`） |
| 关闭动态取色 | `ui/theme/Theme.kt` | `dynamicColor` 默认 `false` |
| 图标 | `res/mipmap-*` + `res/values/colors.xml` | 青绿底 + 白色盾牌钥匙孔 |
| About / 链接 | `Branding.kt`、`AboutCard.kt`、`Home.kt` | 仓库、Issue、更新检查地址统一从 `Branding.kt` 取 |
| 版本号 | `manager/build.gradle.kts` | 版本名追加 `-demo` 后缀，APK 文件名改为 `KernelSU_Demo_*` |
| ksud 默认包名 | `userspace/ksud/src/cli.rs`、`late_load.rs` | 与新的 manager 包名保持一致 |
| 云编译 | `.github/workflows/build-apk.yml` | push / 手动触发，产出 arm64 + x86_64 的 APK |

## 想继续改的时候

- **换应用名**：改 `strings.xml` 的 `app_name`，以及 `Branding.NAME`（可选）。
- **换主题色**：只改 `ui/theme/Color.kt` 里的 `BRAND` 和两套 `ColorScheme`（建议用 [Material Theme Builder](https://m3.material.io/theme-builder) 生成后粘贴）。
- **换仓库 / 联系方式**：改 `Branding.kt`；`strings.xml` 里各语言的 `issue_report_*` 链接也顺带改。
- **换图标**：用你自己的 512×512 PNG 覆盖 `res/mipmap-xxxhdpi/ic_launcher.png` 等，或用仓库根目录的 `make-icon.ps1` 重新生成。
- **换包名**：用仓库根目录的 `brand-rename.ps1 -NewPackage io.github.xxx.yyy`，再同步 `Branding.kt` / workflow。

## 编译

GitHub Actions → **Build APK** → Run workflow（或直接 push 到 `dev` / `main` / `fork/brand`）。

push 到 `dev` 时会自动：
1. 编 ksud（arm64-v8a / x86_64）+ manager APK
2. 用固定的 `v1.0.0` 标签把 APK 发布到 Releases（每次删掉旧 APK 资产再上传，属于滚动更新）

上游的 `Release` 工作流（tag push 触发、会编全套 LKM 矩阵）已改为仅手动触发；
`Build Manager CI` 的 push 触发也已关闭，避免重复构建。

首次使用建议配置签名 Secrets，保证后续版本可以覆盖安装：

| Secret | 内容 |
| --- | --- |
| `KEYSTORE` | keystore 文件的 base64（`base64 -w0 key.jks`） |
| `KEYSTORE_PASSWORD` | keystore 密码 |
| `KEY_ALIAS` | 别名 |
| `KEY_PASSWORD` | 别名密码 |

没有配置时会用临时密钥签名，**下一次构建签名会变，无法覆盖安装**（日志里会有 warning）。

## 注意事项

1. 改包名后**不能覆盖官方 KernelSU-Next**，需要先卸载官方管理器；已授权的 root 应用可能需要重新授权。
2. 内核 / ksuinit 不需要改，管理器仍然通过 ioctl 与内核通信。
3. 如果使用 **late-load** 模式，ksud 是通过包名拉起管理器的，本仓库已同步；但如果你用的是官方内核自带的 ksud，则拉起会失败。
4. 从上游同步更新时，`ui/theme/Color.kt`、`Branding.kt`、`res/values/strings.xml`、`mipmap-*` 这几处最容易冲突。

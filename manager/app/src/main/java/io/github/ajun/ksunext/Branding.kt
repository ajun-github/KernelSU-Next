package io.github.ajun.ksunext

/**
 * 品牌信息集中在这里，二改时只需要改这个文件。
 * 注意：字符串资源 res/values 下各语言的 strings.xml 里的链接需要同步修改。
 */
object Branding {
    /** 项目名，仅用于展示（桌面名称在 strings.xml 的 app_name） */
    const val NAME = "KernelSU-Demo"

    /** 你的仓库地址（About 页、更新检查、问题反馈都用它） */
    const val REPO_URL = "https://github.com/ajun-github/KernelSU-Next"

    /** 问题反馈地址 */
    const val ISSUES_URL = "$REPO_URL/issues"

    /** Telegram 群组，留空字符串则不显示 */
    const val TELEGRAM_URL = ""

    /** 作者署名 */
    const val AUTHOR = "ajun"

    /** GitHub Release API，用于检查管理器更新；留空则关闭更新检查 */
    const val RELEASE_API = "https://api.github.com/repos/ajun-github/KernelSU-Next/releases/latest"
}

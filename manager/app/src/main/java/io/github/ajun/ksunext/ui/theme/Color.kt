package io.github.ajun.ksunext.ui.theme

import androidx.compose.ui.graphics.Color
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme

// ===== 品牌主色 =====
// 想换主题色只需要改这一个值，再按下面对应关系调整 PRIMARY_DARK / PRIMARY_LIGHT
val BRAND = Color(0xFF00BFA5)

val PRIMARY = BRAND
val PRIMARY_LIGHT = Color(0xFF4DD9C4)     // 浅色模式次要色
val SECONDARY_LIGHT = Color(0xFF7FE3D3)

val PRIMARY_DARK = Color(0xFF53DBC9)      // 深色模式次要色
val SECONDARY_DARK = Color(0xFFB1CCC5)

val AMOLED_BLACK = Color(0xFF000000)      // Pure black for AMOLED

val DARK_PURPLE = Color(0xFF6E6CB6)
val DARK_GREY = Color(0xFF363A4F)

val GREEN = Color(0xFF4CAF50)
val RED = Color(0xFFF44336)
val YELLOW = Color(0xFFFFEB3B)
val ORANGE = Color(0xFFFF9800)

// ===== 固定主题（Material 3，由 #00BFA5 生成）=====
val LightColorScheme = lightColorScheme(
    primary = Color(0xFF006A60),
    onPrimary = Color(0xFFFFFFFF),
    primaryContainer = Color(0xFF74F8E5),
    onPrimaryContainer = Color(0xFF00201C),
    secondary = Color(0xFF4B635E),
    onSecondary = Color(0xFFFFFFFF),
    secondaryContainer = Color(0xFFCDE8E1),
    onSecondaryContainer = Color(0xFF07201B),
    tertiary = Color(0xFF456179),
    onTertiary = Color(0xFFFFFFFF),
    tertiaryContainer = Color(0xFFCCE5FF),
    onTertiaryContainer = Color(0xFF001E31),
    error = Color(0xFFBA1A1A),
    onError = Color(0xFFFFFFFF),
    errorContainer = Color(0xFFFFDAD6),
    onErrorContainer = Color(0xFF410002),
    background = Color(0xFFFAFDFB),
    onBackground = Color(0xFF191C1B),
    surface = Color(0xFFFAFDFB),
    onSurface = Color(0xFF191C1B),
    surfaceVariant = Color(0xFFDAE5E1),
    onSurfaceVariant = Color(0xFF3F4947),
    outline = Color(0xFF6F7977),
    outlineVariant = Color(0xFFBEC9C6),
    inverseSurface = Color(0xFF2D3130),
    inverseOnSurface = Color(0xFFEFF1EF),
    inversePrimary = Color(0xFF53DBC9),
)

val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF53DBC9),
    onPrimary = Color(0xFF003731),
    primaryContainer = Color(0xFF005048),
    onPrimaryContainer = Color(0xFF74F8E5),
    secondary = Color(0xFFB1CCC5),
    onSecondary = Color(0xFF1C3530),
    secondaryContainer = Color(0xFF334B47),
    onSecondaryContainer = Color(0xFFCDE8E1),
    tertiary = Color(0xFFADCAE6),
    onTertiary = Color(0xFF163349),
    tertiaryContainer = Color(0xFF2D4961),
    onTertiaryContainer = Color(0xFFCCE5FF),
    error = Color(0xFFFFB4AB),
    onError = Color(0xFF690005),
    errorContainer = Color(0xFF93000A),
    onErrorContainer = Color(0xFFFFDAD6),
    background = Color(0xFF191C1B),
    onBackground = Color(0xFFE1E3E1),
    surface = Color(0xFF191C1B),
    onSurface = Color(0xFFE1E3E1),
    surfaceVariant = Color(0xFF3F4947),
    onSurfaceVariant = Color(0xFFBEC9C6),
    outline = Color(0xFF899391),
    outlineVariant = Color(0xFF3F4947),
    inverseSurface = Color(0xFFE1E3E1),
    inverseOnSurface = Color(0xFF2D3130),
    inversePrimary = Color(0xFF006A60),
)

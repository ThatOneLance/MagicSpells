rootProject.name = "MagicSpellsParent"

include("core")
include("factions")
include("memory")
include("shop")
include("teams")
include("towny")

include(":nms:shared")
include(":nms:v1_20_R2")
include(":nms:v1_20_R3")

startParameter.isParallelProjectExecutionEnabled = true

pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}


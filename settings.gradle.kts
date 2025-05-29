plugins {
    id("com.gradle.develocity") version("4.0.2")
}

rootProject.name = "advent-of-code-2020"

include("aoc2020")
include("aoc2020:aoc2020-kotlin")

include("utils")
include("utils:utils-java")
include("utils:utils-kotlin")

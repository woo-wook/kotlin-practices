package higherfunction

data class SiteVisit(
    val path: String,
    val duration: Double,
    val os: OS
)

enum class OS {
    WINDOWS, LINUX, MAC, IOS, ANDROID
}

fun List<SiteVisit>.averageDurationFor(os: OS) = filter { it.os == os }.map(SiteVisit::duration).average()
fun List<SiteVisit>.averageDurationFor(predicate: (SiteVisit) -> Boolean) = filter(predicate).map(SiteVisit::duration).average()

fun main() {
    val log = listOf(
        SiteVisit("/", 34.0, OS.WINDOWS),
        SiteVisit("/", 22.0, OS.MAC),
        SiteVisit("/login", 12.0, OS.WINDOWS),
        SiteVisit("/signup", 8.0, OS.IOS),
        SiteVisit("/", 16.0, OS.ANDROID),
    )

    val averageWindowsDuration = log.filter { it.os == OS.WINDOWS }
        .map(SiteVisit::duration)
        .average()

    println("averageWindowsDuration : $averageWindowsDuration")
    println("averageMacsDuration : ${log.averageDurationFor(OS.MAC)}")
    println("averageMobilesDuration : ${log.averageDurationFor { it.os in setOf(OS.ANDROID, OS.IOS) }}")
    println("averageSignInPageIosDuration : ${log.averageDurationFor { it.os == OS.IOS && it.path == "/signup" }}")
}
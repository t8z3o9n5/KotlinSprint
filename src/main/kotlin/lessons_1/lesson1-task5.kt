package lessons_1

fun main() {
    val fullSeconds = 6480

    val hours = fullSeconds / 3600
    val minutes = (fullSeconds % 3600) / 60
    val seconds = fullSeconds % 60

    val formatTime = "%02d:%02d:%02d".format(hours, minutes, seconds)

    println("Время в космосе: $formatTime")
}

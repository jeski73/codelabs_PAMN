fun main() {

    if (todayMoreTime(timeSpentToday = 300, timeSpentYesterday = 250)) {
        println("You spent more time on the phone today compared to yesterday")
    } else {
        println("You spent less time on the phone today compared to yesterday")
    }
	
}

fun todayMoreTime(timeSpentToday: Int, timeSpentYesterday: Int): Boolean {
    return timeSpentToday > timeSpentYesterday
}
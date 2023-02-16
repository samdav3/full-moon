import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

fun main(args: Array<String>) {
    Calendar.getInstance().get(Calendar.YEAR)
    val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")
    var today = LocalDate.now()
    val formattedToday = today.format(formatter)

    println("Today is $formattedToday")
    var lastFull = today.minusDays(11) // it has been 11 days since the last full moon
    var holdLastFull = lastFull
    var formatHoldLastFull = holdLastFull.format(formatter)

    println("The last full moon was on $formatHoldLastFull")

    var nextFull = holdLastFull.plusDays(30) // the average time until the next full moon is 29.5 days - i rounded up
    var formatNextFull = nextFull.format(formatter)

    println("The next full moon will be $formatNextFull")
}


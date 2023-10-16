import java.util.Scanner

fun main(args: Array<String>) {


    val seconds = Scanner(System.`in`).nextInt()
        val hours = seconds / 3600
        val minutes = (seconds % 3600) / 60
        val remainingSeconds = seconds % 60

        println("$hours:$minutes:$remainingSeconds")
    }

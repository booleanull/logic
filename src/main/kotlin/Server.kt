import controller.settings.SettingsController
import controller.solution.SolutionController
import di.DaggerSolutionComponent
import manager.Parser
import manager.solution.BaseSolution
import spark.Spark
import java.net.InetAddress
import java.text.SimpleDateFormat
import java.util.*

val daggerSolutionComponent = DaggerSolutionComponent
    .builder()
    .build()

fun main(args: Array<String>) {
    if (args.isEmpty() || args[0].toIntOrNull() == null) {
        println("Post is empty")
        return
    }

    val port = args[0].toInt()
    initServer(port)

    val controllers = listOf(SolutionController(), SettingsController())
    controllers.forEach { it.start() }
}

private fun initServer(port: Int) {
    val sdf = SimpleDateFormat("hh:mm dd/MM/yyyy")
    val date = sdf.format(Date())
    val ip = InetAddress.getLocalHost()
    Spark.port(port)

    println("=======================================")
    println("Port: $port")
    println("IP address: ${ip.hostAddress}")
    println("Date: $date")
    println("=======================================\n")
}
package for_kotlin
import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.features.ContentNegotiation
import io.ktor.jackson.jackson
class App {
    val greeting: String
        get() {
            return "Hello world."
        }
}

fun main(args: Array<String>) {
    embeddedServer(Netty, 8080) {
        install(ContentNegotiation){
            jackson {
            }
        }
        routing {
            get("/") {
                call.respondText("My Example Blog")
            }
            get("/snippets") {
	        call.respond(mapOf("OK" to true))
            }
        }
    }.start(wait = true)
}

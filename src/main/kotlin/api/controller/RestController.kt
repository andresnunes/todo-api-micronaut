package api.controller

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import java.net.http.HttpResponse

@Controller("/hello")
class RestController{

    @Get
    fun hello(): String{
        return "{Hello}"
    }
}
package example.micronaut;

import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.*;

@Controller("/hello")
public class HelloController {
    @Get
    @Produces(MediaType.TEXT_PLAIN)
    public String index() {
        return "Welcome to the wonderful world of Pokemon!";
    }
}

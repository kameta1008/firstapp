package in.techcamp.firstapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PostController {
    @GetMapping("/hello")
    public String showHello(){
        return "<h1>Hello World!</h1>";
    }
}

package py.edu.uc.lp3.apirest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "<h1 style='color: red; font-size: 36px; text-align: center; margin-top: 200px;'>Hello, World!</h1>";
    }
}
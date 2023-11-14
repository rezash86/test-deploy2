package jac.deployment;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/message")
    public String getResult(){
        return  "hello dummy";
    }
}

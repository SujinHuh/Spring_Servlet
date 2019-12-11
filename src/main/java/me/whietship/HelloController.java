package me.whietship;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    @ResponseBody// ResponseBody를 통해서 반환받은 값
    //Model and View가 Null값
    public String hello() {
        return "Hello, "  + helloService.getName();
    }

    @GetMapping("/sample")//ResponseBody를 없이 문자열만 반환받은 값
    //Model and View가 NotNull
    public String sample() {
        return "sample";
    }

}

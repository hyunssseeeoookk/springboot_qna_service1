package com.test.qna_service1.BoundedContext.home;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @GetMapping("/home/main")
    @ResponseBody
    public String showHome(){
        return "안녕 ! ";
    }
}

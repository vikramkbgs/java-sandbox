package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/job-portal")
public class JobPotalHomeController {

    @GetMapping
    public String serverMessage(){
        return "Server is listening.....";
    }
}

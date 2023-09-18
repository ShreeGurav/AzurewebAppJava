package com.example.AzurewebAppJava;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello from Azure Devops World";
    }
}

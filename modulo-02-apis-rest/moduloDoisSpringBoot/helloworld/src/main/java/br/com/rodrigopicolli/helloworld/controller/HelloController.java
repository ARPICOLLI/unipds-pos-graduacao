package br.com.rodrigopicolli.helloworld.controller;


import br.com.rodrigopicolli.helloworld.model.Produto;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.IntStream;

@RestController

public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }



}




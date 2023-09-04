package com.example.springLearning.controller;

import com.example.springLearning.model.Mineral;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/web")
public class MyWebController {

    @GetMapping("/greeting")
    @ResponseBody
    public String greeting() {
        return "greeting";
    }

    @GetMapping("/mineral")
    @ResponseBody
    public Mineral mineral() {

        return new Mineral(1, "gold");
    }
}

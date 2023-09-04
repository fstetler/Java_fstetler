package com.example.springLearning.controller;

import com.example.springLearning.model.Mineral;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MineralRestController {

    @GetMapping("/mineral")
    public Mineral mineral() {
        return new Mineral();
    }
}

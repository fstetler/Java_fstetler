package com.example.springLearning.model;

import org.springframework.stereotype.Component;

@Component
public class NavigationComputer {

    public String navigate() {
        return "Fly to the small moon to the left then turn right";
    }

}

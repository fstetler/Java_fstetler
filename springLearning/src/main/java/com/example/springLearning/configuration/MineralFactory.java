package com.example.springLearning.configuration;

import com.example.springLearning.model.Mineral;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MineralFactory {

    @Bean(name = "gold")
    public Mineral gold() {
        return new Mineral(100, "gold");
    }

    @Bean(name = "diamond")
    public Mineral diamond() {
        return new Mineral(200, "diamond");
    }

}

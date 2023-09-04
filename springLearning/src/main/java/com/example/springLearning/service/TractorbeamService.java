package com.example.springLearning.service;

import com.example.springLearning.model.Mineral;
import com.example.springLearning.model.NavigationComputer;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TractorbeamService {

    @Autowired
    private NavigationComputer navigationComputer;

    public void tractorBeamSomethingHome(String something) {
        String tractorbeamstr = String.format("wooopity woop beaming %s by using path %s", something, navigationComputer.navigate());
        System.out.println(tractorbeamstr);

    }

    @PostConstruct
    public void done() {
        tractorBeamSomethingHome("Furry alien");
    }



}

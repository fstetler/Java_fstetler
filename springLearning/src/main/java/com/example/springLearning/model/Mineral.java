package com.example.springLearning.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Mineral {

    @Id
    private Integer id;

    private String mineralType;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMineralType() {
        return mineralType;
    }

    public void setMineralType(String mineralType) {
        this.mineralType = mineralType;
    }
}

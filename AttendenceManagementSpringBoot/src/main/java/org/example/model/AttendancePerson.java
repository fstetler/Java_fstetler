package org.example.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "attendances")
public class AttendancePerson {

    @Id
    @Column(name = "id", nullable = false)
    private int id;

    @Column(name = "name_column")
    private String name;

    @Column(name = "companyTheyWorkFor_column")
    private String companyTheyWorkFOr;

    @Column(name = "foodOfChoice_column")
    private String foodOfChoice;

    @Column(name = "allergies_column")
    private String allergies;

    @Column(name = "handicapAssistanceNeeded_column")
    private String handicapAssistanceNeeded;

}

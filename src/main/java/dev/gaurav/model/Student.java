package dev.gaurav.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;
    private String studentName;
    private String about;
//cascade all se jab hm  parent pe koi operation perfrom karenge tab child pe bhi effect karega
    //jaise student ko add karenge to uske related laptop bhi add ho jaayega
    @OneToOne(mappedBy = "student",cascade = CascadeType.ALL)
    private Laptop laptop;

}

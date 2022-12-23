package com.ecampus.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.minidev.json.annotate.JsonIgnore;
import org.springframework.hateoas.Link;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private int seasonNo;
    private String studentNo;
    private boolean studentType;
    @OneToOne
    private Faculty studentFaculty;
    @OneToOne
    private Department studentDepartment;
    @OneToOne
    private Institute institute;
    @JsonIgnore // get edildiğinde değil de çağırıldığında gelir herhalde
    @OneToMany(mappedBy = "student")
    private List<Lesson> studentLessons;

}

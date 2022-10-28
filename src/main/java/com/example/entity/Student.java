package com.example.entity;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.UUID;


@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "student")
public class Student {
    @Id
    @Builder.Default
    private String id= UUID.randomUUID().toString();

    @NotNull
    @Column
    private String firstName;

    @NotNull
    @Column
    private String lastName;

//    @OneToMany(fetch = FetchType.LAZY,mappedBy ="student",cascade = CascadeType.ALL)
//    private List<Subject> subject;






}

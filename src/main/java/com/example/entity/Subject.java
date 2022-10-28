package com.example.entity;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Subject {
    @Id
    @Builder.Default
    private String id= UUID.randomUUID().toString();

    @Column
    private String subjectName;

    @Column
    private int marks;

    @Column
    private String studentId;


}

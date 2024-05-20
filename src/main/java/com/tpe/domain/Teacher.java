package com.tpe.domain;

import javax.persistence.*;

@Entity
@Table (name = "tbl_teacher")
public class Teacher {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

}

package com.ITksiki.CourseObserver.models;

import lombok.Data;


import javax.persistence.*;


@MappedSuperclass
@Data
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

}

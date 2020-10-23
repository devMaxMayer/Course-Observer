package com.ITksiki.CourseObserver.models;

import lombok.Data;

import javax.persistence.*;


@MappedSuperclass
@Data
public class BaseRateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "value")
    private Float value;
}

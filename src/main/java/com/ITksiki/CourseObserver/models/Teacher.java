package com.ITksiki.CourseObserver.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "teachers")
@Data
public class Teacher extends BaseEntity {
    @ManyToMany(mappedBy = "teachers", fetch = FetchType.LAZY)
    private List<Cours> cours;
}

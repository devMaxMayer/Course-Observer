package com.ITksiki.CourseObserver.models;

import lombok.Data;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "companies")
@Data

public class Company extends BaseEntity {
    @OneToMany(mappedBy = "company", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Cours> cours = new HashSet<>();
}

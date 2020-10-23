package com.ITksiki.CourseObserver.models;

import lombok.Data;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categories")
@Data

public class Category extends BaseEntity {
    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Cours> cours = new HashSet<>();

    @OneToMany(mappedBy = "category", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Subcategory> subcategory = new HashSet<>();
}

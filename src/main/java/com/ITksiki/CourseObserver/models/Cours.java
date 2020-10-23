package com.ITksiki.CourseObserver.models;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "cours")
@Data
public class Cours extends BaseEntity{

    @Column(name = "description")
    private String username;

    @Column(name = "site")
    private String site;

    @Column(name = "price")
    private Integer price;

    @Column(name = "start")
    private Date start;

    @Column(name = "late")
    private String late;

    @OneToMany(mappedBy = "cours", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<UserRateCours> userRateCours = new HashSet<>();

    @OneToMany(mappedBy = "cours", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Review> reviews = new HashSet<>();

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "company_id")
    private Company company;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "cours_teachers",
            joinColumns = {@JoinColumn(name = "cours_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "teacher_id", referencedColumnName = "id")})
    private List<Teacher> teachers;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "cours_subcategories",
            joinColumns = {@JoinColumn(name = "cours_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "subcategories_id", referencedColumnName = "id")})
    private List<Subcategory> subcategories;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "cours_tags",
            joinColumns = {@JoinColumn(name = "cours_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "tags_id", referencedColumnName = "id")})
    private List<Tag> tags;
}

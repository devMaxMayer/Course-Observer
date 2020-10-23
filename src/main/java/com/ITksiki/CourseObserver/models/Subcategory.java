package com.ITksiki.CourseObserver.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "subcategories")
@Data
public class Subcategory extends BaseEntity{
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToMany(mappedBy = "subcategories", fetch = FetchType.LAZY)
    private List<Cours> cours;
}

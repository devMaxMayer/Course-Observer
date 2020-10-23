package com.ITksiki.CourseObserver.models;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "tags")
@Data

public class Tag extends BaseEntity {
    @ManyToMany(mappedBy = "tags", fetch = FetchType.LAZY)
    private List<Cours> cours;
}

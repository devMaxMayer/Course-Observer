package com.ITksiki.CourseObserver.models;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "reviews")
@Data

public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "review")
    private String review;

    @CreatedDate
    @Column(name = "date_review")
    private Date dateReview;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "cours_id"),
            @JoinColumn(name = "user_id")
    })
    private Review reviews;

}

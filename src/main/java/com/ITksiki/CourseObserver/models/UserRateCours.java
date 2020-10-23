package com.ITksiki.CourseObserver.models;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_rate_cours")
@Data
public class UserRateCours extends BaseRateEntity{
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "cours_id"),
            @JoinColumn(name = "user_id")
    })
    private UserRateCours userRateCours;
}

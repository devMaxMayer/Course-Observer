package com.ITksiki.CourseObserver.models;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "user_rate_company")
@Data
public class UserRateCompany extends BaseRateEntity{
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumns({
            @JoinColumn(name = "company_id"),
            @JoinColumn(name = "user_id")
    })
    private UserRateCompany userRateCompany;
}

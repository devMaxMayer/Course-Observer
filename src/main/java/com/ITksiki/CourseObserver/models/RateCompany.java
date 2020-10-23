package com.ITksiki.CourseObserver.models;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "rate_company")
@Data

public class RateCompany extends BaseRateEntity{
    @Column(name = "name")
    private String name;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "company_id")
    private RateCompany rateCompany;


}

package com.office.swedish.leads.dao;

import com.office.swedish.leads.enums.*;

import java.io.Serializable;

public class FeedbackDAO implements Serializable {
    private static final long serialVersionUID = 1L;

    private VisitFrequency visitFrequency;
    private HowHeard howHeard;
    private Quality overallExperience;
    private Quality foodQuality;
    private Quality serviceQuality;
    private Quality atmosphere;
    private Value valueMoney;
    private String enjoyedMost;
    private String improvements;
    private Recommend recommend;
    private String customerName;
    private String customerEmail;

    public FeedbackDAO() {}

    public FeedbackDAO(final VisitFrequency visitFrequency,
                       final HowHeard howHeard,
                       final Quality overallExperience,
                       final Quality foodQuality,
                       final Quality serviceQuality,
                       final Quality atmosphere,
                       final Value valueMoney,
                       final String enjoyedMost,
                       final String improvements,
                       final Recommend recommend,
                       final String customerName,
                       final String customerEmail) {
        this.visitFrequency = visitFrequency;
        this.howHeard = howHeard;
        this.overallExperience = overallExperience;
        this.foodQuality = foodQuality;
        this.serviceQuality = serviceQuality;
        this.atmosphere = atmosphere;
        this.valueMoney = valueMoney;
        this.enjoyedMost = enjoyedMost;
        this.improvements = improvements;
        this.recommend = recommend;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
    }

    public VisitFrequency getVisitFrequency() {
        return this.visitFrequency;
    }

    public HowHeard getHowHeard() {
        return this.howHeard;
    }

    public Quality getOverallExperience() {
        return this.overallExperience;
    }

    public Quality getFoodQuality() {
        return this.foodQuality;
    }

    public Quality getServiceQuality() {
        return this.serviceQuality;
    }

    public Quality getAtmosphere() {
        return this.atmosphere;
    }

    public Value getValueMoney() {
        return this.valueMoney;
    }

    public String getEnjoyedMost() {
        return this.enjoyedMost;
    }

    public String getImprovements() {
        return this.improvements;
    }

    public Recommend getRecommend() {
        return this.recommend;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }
}

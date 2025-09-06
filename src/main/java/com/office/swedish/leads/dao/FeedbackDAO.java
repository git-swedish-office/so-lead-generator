package com.office.swedish.leads.dao;

import com.office.swedish.leads.enums.*;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "feedback")
public class FeedbackDAO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FEEDBACK_ID")
    private Integer feedbackId;
    @Column(name = "FEEDBACK_VISIT_FREQUENCY", nullable = false)
    private VisitFrequency visitFrequency;
    @Column(name = "FEEDBACK_HOW_HEARD", nullable = false)
    private HowHeard howHeard;
    @Column(name = "FEEDBACK_OVERALL_EXPERIENCE", nullable = false)
    private Quality overallExperience;
    @Column(name = "FEEDBACK_FOOD_QUALITY", nullable = false)
    private Quality foodQuality;
    @Column(name = "FEEDBACK_SERVICE_QUALITY", nullable = false)
    private Quality serviceQuality;
    @Column(name = "FEEDBACK_ATMOSPHERE", nullable = false)
    private Quality atmosphere;
    @Column(name = "FEEDBACK_VALUE_MONEY", nullable = false)
    private Value valueMoney;
    @Column(name = "FEEDBACK_ENJOYED_MOST", nullable = false)
    private String enjoyedMost;
    @Column(name = "FEEDBACK_IMPROVEMENTS", nullable = false)
    private String improvements;
    @Column(name = "FEEDBACK_RECOMMEND", nullable = false)
    private Recommend recommend;
    @Column(name = "FEEDBACK_CUSTOMER_NAME")
    private String customerName;
    @Column(name = "FEEDBACK_CUSTOMER_EMAIL", nullable = false)
    private String customerEmail;

    public FeedbackDAO() {}

    public FeedbackDAO(final Integer feedbackId,
                       final VisitFrequency visitFrequency,
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

    public Integer getFeedbackId() {
        return this.feedbackId;
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

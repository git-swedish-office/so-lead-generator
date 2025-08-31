package com.office.swedish.leads.dto.forms;

import java.io.Serializable;

public final class Feedback implements Serializable {
    public static final long serialVersionUID = 1L;

    private String visitFrequency;
    private String howHeard;
    private String overallExperience;
    private String foodQuality;
    private String serviceQuality;
    private String atmosphere;
    private String valueMoney;
    private String enjoyedMost;
    private String improvements;
    private String recommend;
    private String customerName;
    private String customerEmail;

    public Feedback() {}

    public String getVisitFrequency() {
        return this.visitFrequency;
    }

    public void setVisitFrequency(final String visitFrequency) {
        this.visitFrequency = visitFrequency;
    }

    public String getHowHeard() {
        return this.howHeard;
    }

    public void setHowHeard(final String howHeard) {
        this.howHeard = howHeard;
    }

    public String getOverallExperience() {
        return this.overallExperience;
    }

    public void setOverallExperience(final String overallExperience) {
        this.overallExperience = overallExperience;
    }

    public String getFoodQuality() {
        return this.foodQuality;
    }

    public void setFoodQuality(final String foodQuality) {
        this.foodQuality = foodQuality;
    }

    public String getServiceQuality() {
        return this.serviceQuality;
    }

    public void setServiceQuality(final String serviceQuality) {
        this.serviceQuality = serviceQuality;
    }

    public String getAtmosphere() {
        return this.atmosphere;
    }

    public void setAtmosphere(final String atmosphere) {
        this.atmosphere = atmosphere;
    }

    public String getValueMoney() {
        return this.valueMoney;
    }

    public void setValueMoney(final String valueMoney) {
        this.valueMoney = valueMoney;
    }

    public String getEnjoyedMost() {
        return this.enjoyedMost;
    }

    public void setEnjoyedMost(final String enjoyedMost) {
        this.enjoyedMost = enjoyedMost;
    }

    public String getImprovements() {
        return this.improvements;
    }

    public void setImprovements(final String improvements) {
        this.improvements = improvements;
    }

    public String getRecommend() {
        return this.recommend;
    }

    public void setRecommend(final String recommend) {
        this.recommend = recommend;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public void setCustomerName(final String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return this.customerEmail;
    }

    public void setCustomerEmail(final String customerEmail) {
        this.customerEmail = customerEmail;
    }
}

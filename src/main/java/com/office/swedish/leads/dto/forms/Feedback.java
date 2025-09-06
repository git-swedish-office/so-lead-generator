package com.office.swedish.leads.dto.forms;

import com.office.swedish.leads.enums.*;

import java.io.Serializable;

public final class Feedback implements Serializable {
    public static final long serialVersionUID = 1L;

    private Integer id;
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

    public Feedback() {}

    public Feedback(final Integer id,
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
        this.id = id;
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

    public static Builder create() {
        return new Builder();
    }

    public Integer getId() {
        return this.id;
    }

    public VisitFrequency getVisitFrequency() {
        return this.visitFrequency;
    }

    public void setVisitFrequency(final VisitFrequency visitFrequency) {
        this.visitFrequency = visitFrequency;
    }

    public HowHeard getHowHeard() {
        return this.howHeard;
    }

    public void setHowHeard(final HowHeard howHeard) {
        this.howHeard = howHeard;
    }

    public Quality getOverallExperience() {
        return this.overallExperience;
    }

    public void setOverallExperience(final Quality overallExperience) {
        this.overallExperience = overallExperience;
    }

    public Quality getFoodQuality() {
        return this.foodQuality;
    }

    public void setFoodQuality(final Quality foodQuality) {
        this.foodQuality = foodQuality;
    }

    public Quality getServiceQuality() {
        return this.serviceQuality;
    }

    public void setServiceQuality(final Quality serviceQuality) {
        this.serviceQuality = serviceQuality;
    }

    public Quality getAtmosphere() {
        return this.atmosphere;
    }

    public void setAtmosphere(final Quality atmosphere) {
        this.atmosphere = atmosphere;
    }

    public Value getValueMoney() {
        return this.valueMoney;
    }

    public void setValueMoney(final Value valueMoney) {
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

    public Recommend getRecommend() {
        return this.recommend;
    }

    public void setRecommend(final Recommend recommend) {
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

    public static class Builder {
        private Integer feedbackId;
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

        public Builder withFeedbackId(final Integer feedbackId) {
            this.feedbackId = feedbackId;
            return this;
        }

        public Builder withVisitFrequency(final VisitFrequency visitFrequency) {
            this.visitFrequency = visitFrequency;
            return this;
        }

        public Builder withHowHeard(final HowHeard howHeard) {
            this.howHeard = howHeard;
            return this;
        }

        public Builder withOverallExperience(final Quality overallExperience) {
            this.overallExperience = overallExperience;
            return this;
        }

        public Builder withFoodQuality(final Quality foodQuality) {
            this.foodQuality = foodQuality;
            return this;
        }

        public Builder withServiceQuality(final Quality serviceQuality) {
            this.serviceQuality = serviceQuality;
            return this;
        }

        public Builder withAtmosphere(final Quality atmosphere) {
            this.atmosphere = atmosphere;
            return this;
        }

        public Builder withValueMoney(final Value valueMoney) {
            this.valueMoney = valueMoney;
            return this;
        }

        public Builder withEnjoyedMost(final String enjoyedMost) {
            this.enjoyedMost = enjoyedMost;
            return this;
        }

        public Builder withImprovements(final String improvements) {
            this.improvements = improvements;
            return this;
        }

        public Builder withRecommend(final Recommend recommend) {
            this.recommend = recommend;
            return this;
        }

        public Builder withCustomerName(final String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder withCustomerEmail(final String customerEmail) {
            this.customerEmail = customerEmail;
            return this;
        }

        public Feedback build() {
            return new Feedback(this.feedbackId, this.visitFrequency, this.howHeard, this.overallExperience, this.foodQuality,
                    this.serviceQuality, this.atmosphere, this.valueMoney, this.enjoyedMost, this.improvements,
                    this.recommend, this.customerName, this.customerEmail);
        }
    }
}

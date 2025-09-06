package com.office.swedish.leads.service.impl;

import com.office.swedish.leads.dao.FeedbackDAO;
import com.office.swedish.leads.dto.forms.Feedback;
import com.office.swedish.leads.repository.IFeedbackRepository;
import com.office.swedish.leads.service.ILeadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LeadService implements ILeadService {
    private IFeedbackRepository feedbackRepository;

    @Autowired
    public LeadService(final IFeedbackRepository feedbackRepository) {
        this.feedbackRepository = feedbackRepository;
    }

    public Feedback addFeedback(final Feedback feedback) {
        final FeedbackDAO feedbackDAO = this.feedbackRepository.save(
                new FeedbackDAO(null, feedback.getVisitFrequency(), feedback.getHowHeard(),
                        feedback.getOverallExperience(), feedback.getFoodQuality(), feedback.getServiceQuality(),
                        feedback.getAtmosphere(), feedback.getValueMoney(), feedback.getEnjoyedMost(),
                        feedback.getImprovements(), feedback.getRecommend(), feedback.getCustomerName(), feedback.getCustomerEmail()));

        return Feedback.create().withFeedbackId(feedbackDAO.getFeedbackId()).withVisitFrequency(
                feedbackDAO.getVisitFrequency()).withHowHeard(feedbackDAO.getHowHeard()).withOverallExperience(
                feedbackDAO.getOverallExperience()).withFoodQuality(feedbackDAO.getFoodQuality()).withServiceQuality(
                feedbackDAO.getServiceQuality()).withAtmosphere(feedbackDAO.getAtmosphere()).withValueMoney(
                feedbackDAO.getValueMoney()).withEnjoyedMost(feedbackDAO.getEnjoyedMost()).withImprovements(
                feedbackDAO.getImprovements()).withRecommend(feedbackDAO.getRecommend()).withCustomerName(
                feedbackDAO.getCustomerName()).withCustomerEmail(feedbackDAO.getCustomerEmail()).build();
    }
}

package com.office.swedish.leads.service;

import com.office.swedish.leads.dto.forms.Feedback;
import com.office.swedish.leads.exception.LeadServiceException;

public interface ILeadService {
    Feedback addFeedback(final Feedback feedback) throws LeadServiceException;
}

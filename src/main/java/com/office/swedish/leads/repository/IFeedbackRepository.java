package com.office.swedish.leads.repository;

import com.office.swedish.leads.dao.FeedbackDAO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFeedbackRepository extends JpaRepository<FeedbackDAO, Long> {
}

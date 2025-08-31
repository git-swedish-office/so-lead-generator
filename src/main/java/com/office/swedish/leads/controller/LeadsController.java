package com.office.swedish.leads.controller;

import com.office.swedish.clients.exceptions.SOSecurityException;
import com.office.swedish.clients.registration.IDynamicOAuth2ClientRegistrationRepository;
import com.office.swedish.leads.dto.forms.Feedback;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;

@RestController
public class LeadsController {
    private final IDynamicOAuth2ClientRegistrationRepository dynamicOAuth2ClientRegistrationRepository;

    @Autowired
    public LeadsController(final IDynamicOAuth2ClientRegistrationRepository dynamicOAuth2ClientRegistrationRepository) {
        this.dynamicOAuth2ClientRegistrationRepository = dynamicOAuth2ClientRegistrationRepository;
    }

    @PostMapping("/feedback")
    public ResponseEntity<String> register(@RequestBody final Feedback feedback, final HttpServletRequest request) {
        String clientRegistrationId = request.getHeader("referer");
        try {
            clientRegistrationId = new URL(clientRegistrationId).getHost();
        } catch (MalformedURLException e) {
            // Swallow
        }

        if (!this.dynamicOAuth2ClientRegistrationRepository.isAllowed(
                clientRegistrationId)) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.created(URI.create("/feedback-success")).build();
    }
}

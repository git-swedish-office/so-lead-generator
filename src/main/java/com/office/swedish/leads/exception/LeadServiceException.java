package com.office.swedish.leads.exception;

public class LeadServiceException extends Exception {
    public LeadServiceException() {
        super();
    }

    public LeadServiceException(final String message) {
        super(message);
    }

    public LeadServiceException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public LeadServiceException(final Throwable cause) {
        super(cause);
    }

    public LeadServiceException(final String message,
                                final Throwable cause,
                                final boolean enableSuppression,
                                final boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

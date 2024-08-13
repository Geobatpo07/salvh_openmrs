package com.salvhopenmrs.salvhopenmrs.salvhopenmrs.web.exception;

import com.salvhopenmrs.salvhopenmrs.salvhopenmrs.web.ApiStatus;

/**
 * @author ock
 */
public class ForbiddenException extends ApiException {
    /**
     *
     */
    public ForbiddenException() {
        super(ApiStatus.FORBIDDEN, "");
    }

    /**
     * @param message
     */
    public ForbiddenException(String message) {
        super(ApiStatus.FORBIDDEN, message);
    }
}

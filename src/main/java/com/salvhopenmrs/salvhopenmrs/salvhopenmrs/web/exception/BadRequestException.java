package com.salvhopenmrs.salvhopenmrs.salvhopenmrs.web.exception;

import com.salvhopenmrs.salvhopenmrs.salvhopenmrs.web.ApiStatus;

/**
 * @author ock
 */
public class BadRequestException extends ApiException {
    /**
     *
     */
    public BadRequestException() {
        super(ApiStatus.BAD_REQUEST, "");
    }

    /**
     * @param message
     */
    public BadRequestException(String message) {
        super(ApiStatus.BAD_REQUEST, message);
    }
}

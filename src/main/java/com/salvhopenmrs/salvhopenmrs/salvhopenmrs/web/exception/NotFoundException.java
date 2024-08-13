package com.salvhopenmrs.salvhopenmrs.salvhopenmrs.web.exception;


import com.salvhopenmrs.salvhopenmrs.salvhopenmrs.web.ApiStatus;

/**
 * @author ock
 */
public class NotFoundException extends ApiException {
    /**
     *
     */
    public NotFoundException() {
        super(ApiStatus.NOT_FOUND, "");
    }

    /**
     * @param message
     */
    public NotFoundException(String message) {
        super(ApiStatus.NOT_FOUND, message);
    }
}

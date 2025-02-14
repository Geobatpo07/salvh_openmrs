package com.salvhopenmrs.salvhopenmrs.salvhopenmrs.web.config;

import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.DefaultErrorAttributes;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.WebRequest;

import java.util.Map;

@Component
public class WebErrorAttributes extends DefaultErrorAttributes {

    @Override
    public Map<String, Object> getErrorAttributes(WebRequest webRequest, ErrorAttributeOptions options) {
        Map<String, Object> result = super.getErrorAttributes(webRequest, options);

        //  code, message 추가해서 ApiResponse 구조를 만들자
        result.put("code", result.get("status"));
        result.put("message", result.get("message"));
        return result;
    }


}

package org.tiaa.sma.registrationservice.constant;

public class ResponseCodeConstant {
    private ResponseCodeConstant(){
        throw new IllegalArgumentException("This class only contains constants. Can't initiate it.");
    }

    public static final String ERROR_500 = "500";
    public static final String ERROR_400 = "400";
    public static final String ERROR_404 = "404";
    public static final String SUCCESS_200 = "200";
    public static final String SUCCESS_201 = "201";
}

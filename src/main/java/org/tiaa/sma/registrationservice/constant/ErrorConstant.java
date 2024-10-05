package org.tiaa.sma.registrationservice.constant;

public class ErrorConstant {
    private ErrorConstant(){
        throw new IllegalArgumentException("This class only contains constants. Can't initiate it.");
    }
    public static final String INTERNAL_SERVER_ERROR = "Internal Servr Error";

    public static final String RESOURCE_NOT_FOUND = "Resource Not Found";

    public static final String BAD_REQUEST = "Bad Request";

    public static final String NO_DATA_FOUND = "No Data Found";

    public static final String REQUEST_NOT_FOUND = "Request does not exist";
}

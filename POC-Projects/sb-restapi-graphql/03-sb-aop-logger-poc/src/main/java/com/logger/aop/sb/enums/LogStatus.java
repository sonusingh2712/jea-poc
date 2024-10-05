package com.logger.aop.sb.enums;

import lombok.Getter;

@Getter
public enum LogStatus {
    SUCCESS("Success"), FAILED("Failed");

    private final String logStatus;

    LogStatus(String logStatus){
        this.logStatus = logStatus;
    }

}

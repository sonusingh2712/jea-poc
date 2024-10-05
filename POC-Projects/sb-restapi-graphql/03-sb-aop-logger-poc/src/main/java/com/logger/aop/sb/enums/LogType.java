package com.logger.aop.sb.enums;

import lombok.Getter;

@Getter
public enum LogType {
    TRACE("Trace"), DEBUG("Debug"), INFO("Info"), WARN("Warn"), ERROR("Error");

    private final String logType;

    LogType(String logType){
        this.logType = logType;
    }

}

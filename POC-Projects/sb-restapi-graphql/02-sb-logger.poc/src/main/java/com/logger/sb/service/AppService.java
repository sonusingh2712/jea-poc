package com.logger.sb.service;

public interface AppService {

    void getTraceLogger(String traceMessage);
    void getDebugLogger(String debugMessage);
    void getInfoLogger(String infoMessage);
    void getWarnLogger(String warningMessage);
    void getErrorLogger(String errorMessage);
}

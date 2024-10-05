package com.logger.aop.sb.service.impl;

import com.logger.aop.sb.service.AppService;
import com.logger.aop.sb.util.AppUtils;
import org.springframework.stereotype.Service;

import static com.logger.aop.sb.util.AppConstants.*;

@Service
public class AppServiceImpl implements AppService {

    @Override
    public String getLoggerCheck(String loggerType, String loggingStatus) {
        String loggerMessage = String.format("Logger Id : %d, Logger Type : %s , Status: %s",
                AppUtils.getNewId(ORIGIN,BOUND), loggerType,loggingStatus);
        if (loggingStatus.equals("Failed"))
            throw new RuntimeException(loggerMessage);
        else return loggerMessage;
    }
}

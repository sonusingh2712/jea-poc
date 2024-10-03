package com.logger.sb.service.impl;

import com.logger.sb.service.AppService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class AppServiceImpl implements AppService {

    private static final Logger logger = LogManager.getLogger(AppServiceImpl.class);

    @Override
    public void getTraceLogger(String traceMessage) {
        logger.trace("Level : Trace Logger Message ::: {}",traceMessage);
    }

    @Override
    public void getDebugLogger(String debugMessage) {
        logger.debug("Level : Debug Logger Message ::: {}",debugMessage);
    }

    @Override
    public void getInfoLogger(String infoMessage) {
        logger.info("Level : Info Logger Message ::: {}",infoMessage);
    }

    @Override
    public void getWarnLogger(String warningMessage) {
        logger.warn("Level : Warning Logger Message ::: {}",warningMessage);
    }

    @Override
    public void getErrorLogger(String errorMessage) {
        logger.error("Level : Error Logger Message ::: {}",errorMessage);
    }
}

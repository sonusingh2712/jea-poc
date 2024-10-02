package com.logger.sb.controller;

import com.logger.sb.service.AppService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/logger-poc")
public class LoggerController {

    private static final Logger log = LogManager.getLogger(LoggerController.class);

    @Autowired
    private AppService appService;

    @GetMapping("/logs")
    public String getLoggerDetails(){
        log.info("Info Logging started...");
        log.debug("Debug Logging started...");
        log.warn("Warn Logging started...");
        log.error("Error Logging started...");
        log.trace("Trace Log started...");
        return "Application Logging is successful.";
    }

}

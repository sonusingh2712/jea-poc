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
        appService.getTraceLogger("Severity : 1 == Trace [By default disabled] ");
        appService.getDebugLogger("Severity : 2 == Debug [By default disabled] ");
        appService.getInfoLogger("Severity : 3 == Info [By default enabled] ");
        appService.getWarnLogger("Severity : 4 == Warning [By default enabled] ");
        appService.getErrorLogger("Severity : 5 == Error [By default enabled] ");
        log.info("::::::::::::::::Logger in Controller:::::::::::::::::");
        return "Application Logging is successful.";
    }

}

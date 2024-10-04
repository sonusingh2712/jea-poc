package com.logger.aop.sb.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop-logs-poc")
public class AppController {

    private static final Logger log = LogManager.getLogger(AppController.class);

    @GetMapping("/logs")
    public String getAopLogsDetails(){
        log.trace("TRACE-Logger started");
        log.debug("DEBUG-Logger started");
        log.info("INFO-Logger started");
        log.warn("WARN-Logger started");
        log.error("ERROR-Logger started");
        return "AOP-Logs-Controller Running Successfully.";
    }
}

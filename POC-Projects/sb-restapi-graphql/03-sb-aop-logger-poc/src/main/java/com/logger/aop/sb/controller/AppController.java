package com.logger.aop.sb.controller;

import com.logger.aop.sb.enums.LogStatus;
import com.logger.aop.sb.enums.LogType;
import com.logger.aop.sb.service.AppService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aop-logs-poc")
public class AppController {

    private static final Logger log = LogManager.getLogger(AppController.class);

    @Autowired
    private AppService appService;

    @GetMapping("/trace")
    public String getTraceLoggers(){
        return appService.getLoggerCheck(LogType.TRACE.getLogType(), LogStatus.SUCCESS.getLogStatus());
    }

    @GetMapping("/debug")
    public String getDebugLoggers(){
        return appService.getLoggerCheck(LogType.DEBUG.getLogType(), LogStatus.SUCCESS.getLogStatus());
    }

    @GetMapping("/info")
    public String getInfoLoggers(){
        return appService.getLoggerCheck(LogType.INFO.getLogType(), LogStatus.SUCCESS.getLogStatus());
    }

    @GetMapping("/warn")
    public String getWarnLoggers(){
        return appService.getLoggerCheck(LogType.WARN.getLogType(), LogStatus.SUCCESS.getLogStatus());
    }

    @GetMapping("/error")
    public String getErrorLoggers(){
        return appService.getLoggerCheck(LogType.ERROR.getLogType(), LogStatus.FAILED.getLogStatus());
    }
}

package com.project.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResultController {
    private static Logger logger = LoggerFactory.getLogger(ResultController.class);
    @RequestMapping(value = "/adminResult",method = RequestMethod.GET)
    private String adminResult(){
        logger.info("123123123");
        return "12345";
    }
}

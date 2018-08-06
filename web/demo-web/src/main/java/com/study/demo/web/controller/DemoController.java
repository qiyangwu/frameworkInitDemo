package com.study.demo.web.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.study.demo.dao.DemoDao;
import com.study.demo.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/")
public class DemoController {

    private static final Logger log = LoggerFactory.getLogger(DemoController.class);
    @Reference(version = "1.0.0")
    private DemoService demoService;

    @Reference(version = "1.0.0")
    private DemoDao demoDao;

    @RequestMapping(value = "query", method = RequestMethod.GET)
    @ResponseBody
    public String view(HttpServletRequest request, HttpServletResponse response) {
        log.info("6666666666666666");
        demoService.query();
        log.info("%%%%%%%%#############");
        return "success";
    }

}

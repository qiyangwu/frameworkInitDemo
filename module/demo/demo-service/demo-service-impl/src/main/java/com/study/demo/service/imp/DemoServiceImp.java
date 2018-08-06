package com.study.demo.service.imp;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.study.demo.dao.DemoDao;
import com.study.demo.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wuqiyang 。
 * 2018/8/6。
 */
@Service(version = "1.0.0")
public class DemoServiceImp implements DemoService {
    private Logger logger = LoggerFactory.getLogger(DemoServiceImp.class);

    @Reference(version = "1.0.0")
    private DemoDao demoDao;


    @Override
    public void query() {
        demoDao.query();
    }
}

package com.study.demo.dao.imp;

import com.alibaba.dubbo.config.annotation.Service;
import com.study.demo.dao.DemoDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wuqiyang 。
 * 2018/8/6。
 */
@Service(version = "1.0.0")
public class DemoDaoImp implements DemoDao {
    private Logger logger = LoggerFactory.getLogger(DemoDaoImp.class);

    @Override
    public void query() {
        System.out.println("logger 开始dao");
        logger.info("@@$$^^###query dao : {}", DemoDaoImp.class);
    }
}

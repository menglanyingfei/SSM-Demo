package com.wtu;

import com.alibaba.fastjson.JSON;
import com.wtu.model.User;
import com.wtu.service.UserService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * 测试MyBatis
 * menglanyingfei
 * on 2017.11.02 14:56
 */
// 表示继承了SpringJUnit4ClassRunner类
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring/spring-mapper.xml",
        "classpath:spring/spring-service.xml"})
public class TestMyBatis {

    private static Logger logger = Logger.getLogger(TestMyBatis.class);

    @Resource
    private UserService userService;

    @Test
    public void test() {
        User user = userService.getUserById(1);
        System.out.println(user.getUserName());
        logger.info("值：" + user.getUserName());

        logger.info(JSON.toJSONString(user));
    }
}

package com.example.demo;

import com.example.demo.bean.Person;
import com.example.demo.model.UserDomain;
import com.example.demo.service.impl.UserServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    private static Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

    @Autowired
    Person person;

    @Autowired
    UserDomain user;
    @Test
    public void contextLoads() {
        logger.info(""+person);
        logger.info(""+user);
    }


}

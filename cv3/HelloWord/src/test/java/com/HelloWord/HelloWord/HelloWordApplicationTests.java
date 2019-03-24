package com.HelloWord.HelloWord;

import com.HelloWord.HelloWord.controllers.HelloWordControler;
import javafx.application.Application;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = {HelloWordApplication.class})
public class HelloWordApplicationTests {

    @Autowired
    HelloWordControler helloWordControler;

    @Test
    public void contextLoads() {
        Assert.assertNotNull(helloWordControler);
    }


}

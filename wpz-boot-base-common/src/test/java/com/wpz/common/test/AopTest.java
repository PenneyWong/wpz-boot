package com.wpz.common.test;

import com.wpz.common.aop.Boy;
import com.wpz.common.aop.Girl;
import javafx.application.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT, classes = Application.class)
public class AopTest {

    @Test
    public void test() {
    }
}

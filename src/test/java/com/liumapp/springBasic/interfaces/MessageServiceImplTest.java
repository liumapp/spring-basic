package com.liumapp.springBasic.interfaces;

import junit.framework.TestCase;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.springframework.test.context.ContextConfiguration;

/**
 * Created by liumapp on 7/7/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */

@RunWith(BlockJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:spring-ioc.xml")
public class MessageServiceImplTest extends TestCase {


    public void testGetMessage () {
        
//        MessageService messageService =
//        MessageService messageService = super.getB
//        MessageServiceImpl msl = new MessageServiceImpl();
//        System.out.println(msl.getMessage("world"));
    }

}


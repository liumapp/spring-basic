package com.liumapp.springBasic.hello;

import org.springframework.stereotype.Component;

/**
 * Created by liumapp on 7/8/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 * Component注解相当于 <bean id="" class=""></bean>这一段内容
 */
@Component
public class MessagePrinter {

    final private MessageService messageService;

    public MessagePrinter(MessageService messageService) {
        this.messageService = messageService;
    }

    public void printMessage() {
        System.out.println(this.messageService.getMessage());
    }

}

package sample3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp
{
    public static void main(String[] args)
    {
        GenericXmlApplicationContext ctx = new
                GenericXmlApplicationContext("classpath*:applicationContext.xml");
        MessageBean bean1 = (MessageBean) ctx.getBean("messageBean");
        bean1.sayHello("Hello  Spring");
        ctx.close();
    }
}
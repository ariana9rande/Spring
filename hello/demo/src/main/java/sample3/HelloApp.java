package sample3;

import org.springframework.context.support.GenericXmlApplicationContext;
import sample2.MessageBean;

public class HelloApp
{
    public static void main(String[] args)
    {
        GenericXmlApplicationContext ctx = new
                GenericXmlApplicationContext("classpath*:applicationContext.xml");
        MessageBean bean = (MessageBean) ctx.getBean("messageBean");
        bean.sayHello("Spring");
        ctx.close();
    }
}
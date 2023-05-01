package sample3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloApp
{
    public static void main(String[] args)
    {
        GenericXmlApplicationContext ctx = new
                GenericXmlApplicationContext("classpath*:appctx.xml");
        MessageBean bean1 = (MessageBean) ctx.getBean("proxy");
        bean1.sayHello(" Spring");
        ctx.close();
    }
}
package sample3;

public class MessageBeanEn implements MessageBean
{
    String _msg;

    public void sayHello(String name)
    {
        System.out.println("Hello," + name);
    }

    public void setMsg(String msg)
    {
        _msg = msg;
    }

    @Override
    public void afterPropertiesSet() throws Exception{
        System.out.println("afterPropertiesSet() 실행");
    }

    @Override
    public void destroy() throws Exception
    {
        System.out.println("destroy() 실행");
    }
}
package sample3;

public class MessageBeanEn implements MessageBean
{
    String _msg;

    public void sayHello(String name)
    {
        System.out.println("Hello," + name);
    }

    public void setName(String msg)
    {
        _msg = msg;
    }

    public void initMessage() throws Exception
    {
        System.out.println("initMessage() 실행");
    }

    public void finishMessage() throws Exception
    {
        System.out.println("finishMessage() 실행");
    }
}
package sample3;

public class MessageBeanImpl implements MessageBean
{
    String _msg;

    public void sayHello(String name)
    {
        System.out.println("Hello," + name);
    }

    @Override
    public void setName(String msg)
    {
        _msg = msg;
    }
}

package sample3;

public class MessageBeanImpl implements MessageBean
{
    String _msg;

    public void waitAMoment(int msec)
    {
        try
        {
            Thread.sleep(msec);
        }
        catch(InterruptedException e)
        {
            e.printStackTrace();
        }
    }

    public void sayHello(String name)
    {
        waitAMoment(5000);
        System.out.println(_msg + name + "!");
    }

    @Override
    public void setName(String msg)
    {
        _msg = msg;
    }
}

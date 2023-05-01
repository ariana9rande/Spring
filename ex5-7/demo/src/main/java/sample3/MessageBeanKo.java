package sample3;

public class MessageBeanKo implements MessageBean
{
    String _msg;

    public void sayHello(String name)
    {
        System.out.println("안녕하세요, " + name);
    }

    public String getMsg()
    {
        return _msg;
    }

    public void setMsg(String msg)
    {
        this._msg = msg;
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
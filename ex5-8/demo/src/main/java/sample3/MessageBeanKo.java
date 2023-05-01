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

    public void initMessage() throws Exception
    {
        System.out.println("initMessage() 실행");
    }

    public void finishMessage() throws Exception
    {
        System.out.println("finishMessage() 실행");
    }
}
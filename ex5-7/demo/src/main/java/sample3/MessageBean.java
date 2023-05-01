package sample3;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public interface MessageBean extends InitializingBean, DisposableBean
{
    void sayHello(String name);
    void setMsg(String msg);
}

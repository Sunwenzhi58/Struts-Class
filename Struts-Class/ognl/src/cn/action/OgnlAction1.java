package cn.action;

import com.opensymphony.xwork2.ActionSupport;

public class OgnlAction1 extends ActionSupport {

    //定义普通的属性
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //定义一个普通的方法
    public String method1(){
        return "action method";
    }

    //无参构造方法，每请求一次action,就会创建一次Action实例
    public OgnlAction1(){
        super();
        password="8888";
    }

    @Override
    public String execute() throws Exception {
        name = "ognltester";
        return "success";
    }
}

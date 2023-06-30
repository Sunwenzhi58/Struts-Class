package cn.action;

import cn.domain.Cat;
import cn.domain.Dog;
import cn.domain.User;
import com.opensymphony.xwork2.ActionSupport;

public class OgnlAction2 extends ActionSupport{
    private User user;
    private Cat cat;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }
    //定义一个普通的方法
    public String method2(){
        return "action method";
    }
    //无参构造方法，每请求一次action，就会创建一次Action实例
    //处理过程可写在无参构造
    public OgnlAction2(){
        super();

        user = new User(18);
    }
    @Override
    public String execute() throws Exception{
        cat = new Cat();
        cat.setFriend(new Dog("dog0"));
        System.out.println("master test");
        return "success222333-hotfix";
    }
}

package test;

import org.junit.Test;
import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;
/*
 * OGNL 在Java环境下的使用
 */
public class demo1 {
    @Test
    /*
     * OGNL如何调用对象的方法
     */
    public void testdemo1() throws OgnlException {
        // 获得context
        OgnlContext context = new OgnlContext();
        // 获得根对象
        Object root = context.getRoot();
        // 执行表达式：
        Object obj = Ognl.getValue("'hello'.length()", context, root);
        System.out.println(obj);
    }

    @Test
    public void testdemo2() throws OgnlException{
        OgnlContext context = new OgnlContext();
        Object root = context.getRoot();
        Object obj = Ognl.getValue("@java.lang.Math@random()", context, root);
        System.out.println(obj);
    }

    @Test
    public void testdemo3() throws OgnlException{
        User user = new User("zhangsan", 18);
        OgnlContext context = new OgnlContext();
        context.setRoot(user);
        Object root = context.getRoot();
        Object username = Ognl.getValue("username", context, root);
        Object age = Ognl.getValue("age", context, root);
        System.out.println(username+" "+age);
    }

    @Test
    public void testdemo4() throws OgnlException{
        OgnlContext context = new OgnlContext();
        Object root = context.getRoot();
        context.put("name","lisi");
        Object obj = Ognl.getValue("#name",context,root);
        System.out.println(obj);


    }
}
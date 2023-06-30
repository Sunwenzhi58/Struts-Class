package example.struts2;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;

public class PushTagAction extends ActionSupport implements SessionAware {
    private Map mySession;
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.mySession = session;
    }

    @Override
    public String execute() throws Exception{
        Student student = new Student(firstName, lastName);
        mySession.put("student",student);
        return SUCCESS;
    }


}

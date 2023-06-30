package example.struts2;

import com.opensymphony.xwork2.ActionSupport;

public class SetAction extends ActionSupport {
    private String firstName;
    private String lastName;
    private Student student;

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

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String execute() throws Exception {
        student = new Student(firstName,lastName);
        return SUCCESS;
    }
}

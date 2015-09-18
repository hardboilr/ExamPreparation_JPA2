package entity;

import javax.persistence.*;

/**
 * @author Tobias Jacobsen
 */
@Entity
public class PhDStudent extends Employee {
    private String dissSubject;
    
    public PhDStudent() {
    }
    
    public PhDStudent(String dissSubject) {
        this.dissSubject = dissSubject;
    }

    public String getDissSubject() {
        return dissSubject;
    }

    public void setDissSubject(String dissSubject) {
        this.dissSubject = dissSubject;
    }
}

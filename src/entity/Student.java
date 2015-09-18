package entity;

import java.sql.Date;
import javax.persistence.*;

/**
 * @author Tobias Jacobsen
 */
@Entity
public class Student extends Person {
    private int MatNr;
    private Date matDate;
    
    public Student() {
    }
    
    public Student(int MatNr, Date matDate) {
        this.MatNr = MatNr;
        this.matDate = matDate;
    }

    public int getMatNr() {
        return MatNr;
    }

    public void setMatNr(int MatNr) {
        this.MatNr = MatNr;
    }

    public Date getMatDate() {
        return matDate;
    }

    public void setMatDate(Date matDate) {
        this.matDate = matDate;
    }
}

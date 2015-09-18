package entity;

import javax.persistence.*;

/**
 * @author Tobias Jacobsen
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Employee extends Person {

    private int soSecNr;
    private float wage;
    private String taxClass;
    
    public Employee() {
    }
    
    public int getSoSecNr() {
        return soSecNr;
    }

    public void setSoSecNr(int soSecNr) {
        this.soSecNr = soSecNr;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

    public String getTaxClass() {
        return taxClass;
    }

    public void setTaxClass(String taxClass) {
        this.taxClass = taxClass;
    }
}

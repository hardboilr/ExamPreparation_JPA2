package entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

/**
 *
 * @author Tobias Jacobsen
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int age;
    private boolean isMarried;
    
    private long supervisor;
    private List <Long> supervisesList;
    
    @OneToMany(mappedBy = "person")
    private List<Grade> gradeList = new ArrayList();
    
    public Person() {
    }
    
    public Person(String firstName, String lastName, Date birthDate, int age, boolean isMarried) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.age = age;
        this.isMarried = isMarried;
    }

    public long getId() {
        return id;
    }

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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int dage) {
        this.age = dage;
    }

    public boolean isIsMarried() {
        return isMarried;
    }

    public void setIsMarried(boolean isMarried) {
        this.isMarried = isMarried;
    }

    public long getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(long supervisor) {
        this.supervisor = supervisor;
    }

    public List<Long> getSupervisesList() {
        return supervisesList;
    }

    public void addToSupervises(long id) {
        supervisesList.add(id);
    }

    public List<Grade> getGradeList() {
        return gradeList;
    }

    public void addToGradeList(Grade grade) {
        gradeList.add(grade);
    }
}

package entity;

import javax.persistence.*;

/**
 * @author Tobias Jacobsen
 */
@Entity
public class Grade {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String name;
    private int value;
    
    @ManyToOne
    private Person person;
    
    
    public Grade() {
    }
    
    public Grade(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Long getId() {
        return id;
    }
}

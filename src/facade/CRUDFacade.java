package facade;

import entity.Employee;
import entity.Person;
import entity.PhDStudent;
import entity.Student;
import java.sql.Date;
import java.util.List;

/**
 * @author Tobias Jacobsen
 */
public interface CRUDFacade {

    /*
     add, edit, find and delete Persons, Students, Employees and PhDStudients 
     Provide necessary getters and setters to the Person hierarchy so all information is available, 
     for example who is a Persons supervisor and the list of who a Person supervises.
     */
    
    /*
    private String firstName;
    private String lastName;
    private Date birthDate;
    private int age;
    private boolean isMarried;
    */
    
    public void createStudent(String firstName, String lastName, Date birthDate, int age, boolean isMarried, int MatNr, Date matDate);
    public void createEmployee(String firstName, String lastName, Date birthDate, int age, boolean isMarried, int soSecNr, float wage, String taxClass);
    public void createPhDStudent(String firstName, String lastName, Date birthDate, int age, boolean isMarried, String dissSubject);
    public void createGrade(long id, String name, int value);
    
    public void editPerson(long id, Person person);
    public void deletePerson(long id);
    public Person getPerson(long id);
    
    public List<Person> getAllPersons();
    public List<Student> getAllStudents();
    public List<Employee> getAllEmployees();
    public List<PhDStudent> getAllPhDStudents();
    
    
    
    
    
    
    
    
}

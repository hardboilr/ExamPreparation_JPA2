package control;

import entity.Employee;
import entity.Grade;
import entity.Person;
import entity.PhDStudent;
import entity.Student;
import facade.CRUDFacade;
import java.sql.Date;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author Tobias Jacobsen
 */
public class CRUD implements CRUDFacade {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
    EntityManager em = emf.createEntityManager();

    @Override
    public void createStudent(String firstName, String lastName, Date birthDate, int age, boolean isMarried, int MatNr, Date matDate) {
        Student stu = new Student();
        stu.setFirstName(firstName);
        stu.setLastName(lastName);
        stu.setBirthDate(birthDate);
        stu.setAge(age);
        stu.setIsMarried(isMarried);
        stu.setMatNr(MatNr);
        stu.setMatDate(matDate);
        em.getTransaction().begin();
        em.persist(stu);
        em.getTransaction().commit();
    }

    @Override
    public void createEmployee(String firstName, String lastName, Date birthDate, int age, boolean isMarried, int soSecNr, float wage, String taxClass) {
        Employee emp = new Employee();
        emp.setFirstName(firstName);
        emp.setLastName(lastName);
        emp.setBirthDate(birthDate);
        emp.setAge(age);
        emp.setIsMarried(isMarried);
        emp.setSoSecNr(soSecNr);
        emp.setWage(wage);
        emp.setTaxClass(taxClass);
        em.getTransaction().begin();
        em.persist(emp);
        em.getTransaction().commit();
    }

    @Override
    public void createPhDStudent(String firstName, String lastName, Date birthDate, int age, boolean isMarried, String dissSubject) {
        PhDStudent stu = new PhDStudent();
        stu.setFirstName(firstName);
        stu.setLastName(lastName);
        stu.setBirthDate(birthDate);
        stu.setAge(age);
        stu.setIsMarried(isMarried);
        stu.setDissSubject(dissSubject);
        em.getTransaction().begin();
        em.persist(stu);
        em.getTransaction().commit();
    }
    
    @Override
    public void createGrade(long id, String name, int value) {
        Person person = em.find(Person.class, id);
        Grade grade = new Grade();
        grade.setName(name);
        grade.setValue(value);
        em.getTransaction().begin();
        person.addToGradeList(grade);
        em.getTransaction().commit();
    }
    

    @Override
    public void editPerson(long id, Person person) {
        Person p = em.find(Person.class, id);
        em.getTransaction().begin();
        p = person;
        em.getTransaction().commit();
    }

    @Override
    public void deletePerson(long id) {
        Person p = em.find(Person.class, id);
        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }

    @Override
    public Person getPerson(long id) {
        Person p = em.find(Person.class, id);
        return p;
    }

    @Override
    public List<Person> getAllPersons() {
        List<Person> list = (List<Person>) em.createNativeQuery("SELECT s FROM student s", Person.class);
        return list;
    }
    
    
    @Override
    public List<Student> getAllStudents() {
        List<Student> list = (List<Student>) em.createNativeQuery("SELECT s FROM student s", Student.class);
        return list;
    }

    @Override
    public List<Employee> getAllEmployees() {
        List<Employee> list = (List<Employee>) em.createNativeQuery("SELECT s FROM employee e", Employee.class);
        return list;
    }

    @Override
    public List<PhDStudent> getAllPhDStudents() {
        List<PhDStudent> list = (List<PhDStudent>) em.createNativeQuery("SELECT p FROM PhDStudent p", PhDStudent.class);
        return list;
    }

}

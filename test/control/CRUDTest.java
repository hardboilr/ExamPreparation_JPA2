package control;

import entity.Employee;
import entity.Person;
import entity.PhDStudent;
import entity.Student;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.BeforeClass;
import util.Clean;

/**
 * @author Tobias Jacobsen
 */
public class CRUDTest {

    @After
    public void after() {
        Clean.cleanAllTables();
    }

    /**
     * Test of createStudent method, of class CRUD.
     */
//    @Test
    public void testCreateStudent() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();
        String firstName = "Tobias";
        String lastName = "Jacobsen";
        Date birthDate = java.sql.Date.valueOf("1985-02-08");
        int age = 30;
        boolean isMarried = true;
        int MatNr = 3;
        Date matDate = java.sql.Date.valueOf("2015-02-08");
        CRUD instance = new CRUD();
        instance.createStudent(firstName, lastName, birthDate, age, isMarried, MatNr, matDate);
        Student stu = em.find(Student.class, 1l);
        assertEquals(firstName, stu.getFirstName());
        assertEquals(lastName, stu.getLastName());
        assertEquals(birthDate, stu.getBirthDate());
        assertEquals(age, stu.getAge());
        assertEquals(isMarried, stu.isIsMarried());
        assertEquals(MatNr, stu.getMatNr());
        assertEquals(matDate, stu.getMatDate());
        
        
    }

    /**
     * Test of createEmployee method, of class CRUD.
     */
//    @Test
    public void testCreateEmployee() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();
        System.out.println("createEmployee");
        String firstName = "Niels";
        String lastName = "Nielsen";
        Date birthDate = java.sql.Date.valueOf("1940-08-24");
        int age = 70;
        boolean isMarried = true;
        int soSecNr = 123233;
        float wage = 50003.0F;
        String taxClass = "Some random tax class";
        CRUD instance = new CRUD();
        instance.createEmployee(firstName, lastName, birthDate, age, isMarried, soSecNr, wage, taxClass);
        Employee emp = em.find(Employee.class, 1l);
        assertEquals(firstName, emp.getFirstName());
        assertEquals(lastName, emp.getLastName());
        assertEquals(birthDate, emp.getBirthDate());
        assertEquals(age, emp.getAge());
        assertEquals(isMarried, emp.isIsMarried());
        assertEquals(soSecNr, emp.getSoSecNr());
        assertEquals((int) wage, (int) emp.getWage());
        assertEquals(taxClass, emp.getTaxClass());
    }

    /**
     * Test of createPhDStudent method, of class CRUD.
     */
//    @Test
    public void testCreatePhDStudent() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();
        System.out.println("createPhDStudent");
        String firstName = "Lars";
        String lastName = "Larsen";
        Date birthDate = java.sql.Date.valueOf("1930-04-13");
        int age = 76;
        boolean isMarried = true;
        String dissSubject = "Something";
        CRUD instance = new CRUD();
        instance.createPhDStudent(firstName, lastName, birthDate, age, isMarried, dissSubject);
        PhDStudent emp = em.find(PhDStudent.class, 1l);
        assertEquals(firstName, emp.getFirstName());
        assertEquals(lastName, emp.getLastName());
        assertEquals(birthDate, emp.getBirthDate());
        assertEquals(age, emp.getAge());
        assertEquals(isMarried, emp.isIsMarried());
        assertEquals(dissSubject, emp.getDissSubject());
    }

    /**
     * Test of createGrade method, of class CRUD.
     */
//    @Test
    public void testCreateGrade() {
        System.out.println("createGrade");
        long id = 0L;
        String name = "";
        int value = 0;
        CRUD instance = new CRUD();
        instance.createGrade(id, name, value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editPerson method, of class CRUD.
     */
//    @Test
    public void testEditPerson() {
        System.out.println("editPerson");
        long id = 0L;
        Person person = null;
        CRUD instance = new CRUD();
        instance.editPerson(id, person);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deletePerson method, of class CRUD.
     */
//    @Test
    public void testDeletePerson() {
        System.out.println("deletePerson");
        long id = 0L;
        CRUD instance = new CRUD();
        instance.deletePerson(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPerson method, of class CRUD.
     */
//    @Test
    public void testGetPerson() {
        System.out.println("getPerson");
        long id = 0L;
        CRUD instance = new CRUD();
        Person expResult = null;
        Person result = instance.getPerson(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPersons method, of class CRUD.
     */
//    @Test
    public void testGetAllPersons() {
        System.out.println("getAllPersons");
        CRUD instance = new CRUD();
        List<Person> expResult = null;
        List<Person> result = instance.getAllPersons();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllStudents method, of class CRUD.
     */
//    @Test
    public void testGetAllStudents() {
        System.out.println("getAllStudents");
        CRUD instance = new CRUD();
        List<Student> expResult = null;
        List<Student> result = instance.getAllStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllEmployees method, of class CRUD.
     */
//    @Test
    public void testGetAllEmployees() {
        System.out.println("getAllEmployees");
        CRUD instance = new CRUD();
        List<Employee> expResult = null;
        List<Employee> result = instance.getAllEmployees();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllPhDStudents method, of class CRUD.
     */
//    @Test
    public void testGetAllPhDStudents() {
        System.out.println("getAllPhDStudents");
        CRUD instance = new CRUD();
        List<PhDStudent> expResult = null;
        List<PhDStudent> result = instance.getAllPhDStudents();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}

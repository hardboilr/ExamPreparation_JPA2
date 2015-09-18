package control;

import entity.Employee;
import entity.Grade;
import entity.Person;
import entity.PhDStudent;
import entity.Student;
import java.sql.Date;
import javax.persistence.*;
import util.Clean;

/**
 * @author Tobias Jacobsen
 */
public class Run {

    public static void main(String[] args) {
        Clean.cleanAllTables();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PU");
        EntityManager em = emf.createEntityManager();
        

        Student stud1 = new Student();
        stud1.setFirstName("Tobias");
        stud1.setLastName("Jacobsen");
        stud1.setBirthDate(new Date(1985, 8, 2));
        stud1.setAge(30);
        stud1.setIsMarried(true);
        stud1.setMatDate(new Date(2017, 1, 1));
        stud1.setMatNr(1);

        Student stud2 = new Student();
        stud2.setFirstName("Niels");
        stud2.setLastName("Nielsen");
        stud2.setBirthDate(new Date(1989, 10, 14));
        stud2.setAge(26);
        stud2.setIsMarried(false);
        stud2.setMatDate(new Date(2017, 1, 1));
        stud2.setMatNr(1);

        Student stud3 = new Student();
        stud2.setFirstName("Jens");
        stud2.setLastName("Jensen");
        stud2.setBirthDate(new Date(1946, 5, 30));
        stud2.setAge(82);
        stud2.setIsMarried(true);
        stud2.setMatDate(new Date(2034, 1, 1));
        stud2.setMatNr(4);

        Employee emp1 = new Employee();
        emp1.setFirstName("Torben");
        emp1.setLastName("Torbensen");
        emp1.setBirthDate(new Date(1830, 4, 12));
        emp1.setAge(135);
        emp1.setIsMarried(false);
        emp1.setSoSecNr(1243120455);
        emp1.setTaxClass("Some tax class");
        emp1.setWage(1200.0f);

        Employee emp2 = new Employee();
        emp1.setFirstName("Dick");
        emp1.setLastName("Dickersen");
        emp1.setBirthDate(new Date(1830, 4, 12));
        emp1.setAge(35);
        emp1.setIsMarried(true);
        emp1.setSoSecNr(1243120455);
        emp1.setTaxClass("Another tax class");
        emp1.setWage(1500.0f);

        PhDStudent phd1 = new PhDStudent();
        phd1.setFirstName("Kalle");
        phd1.setLastName("Kallesen");
        phd1.setBirthDate(new Date(1312, 1, 5));
        phd1.setAge(40);
        phd1.setIsMarried(false);
        phd1.setSoSecNr(1231234329);
        phd1.setTaxClass("A third tax class");
        phd1.setWage(4134f);
        phd1.setDissSubject("some dis subject");

        PhDStudent phd2 = new PhDStudent();
        phd2.setFirstName("Lasse");
        phd2.setLastName("Lassen");
        phd2.setBirthDate(new Date(1323, 4, 11));
        phd2.setAge(12);
        phd2.setIsMarried(true);
        phd2.setSoSecNr(234098232);
        phd2.setTaxClass("The first tax class");
        phd2.setWage(123f);
        phd2.setDissSubject("dis subject new 2");
        
        Grade grade1 = new Grade();
        grade1.setName("Programming");
        grade1.setValue(12);
        
        Grade grade2 = new Grade();
        grade2.setName("Running");
        grade2.setValue(4);

        Grade grade3 = new Grade();
        grade3.setName("Walking");
        grade3.setValue(10);
        
        em.getTransaction().begin();
        em.persist(stud1);
        em.persist(stud2);
        em.persist(stud3);
        em.persist(emp1);
        em.persist(emp2);
        em.persist(phd1);
        em.persist(phd2);
        em.persist(grade1);
        em.persist(grade2);
        em.persist(grade3);
        em.getTransaction().commit();

    }

}

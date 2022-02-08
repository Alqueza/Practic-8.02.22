import groovy.json.JsonOutput;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Adilet", LocalDate.of(2003,11,11));
        System.out.println(person);
        person.talk();
        person.run();
        System.out.println();

        Student student = new Student("Adilet","Otorbaev");
        System.out.println(student);
        student.eat();
        System.out.println();

        Instructor instructor = new Instructor("Abai","Second");
        System.out.println(instructor);
        instructor.learn();
        System.out.println();

        Mentor mentor = new Mentor("Rasul","Everyday");
        System.out.println(mentor);
        mentor.work();
    }
}
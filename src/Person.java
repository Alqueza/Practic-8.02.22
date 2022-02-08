
import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate dateOfBirth;
    private byte age;

    public Person(String name, LocalDate dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public Person(String name) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public byte getAge() {
        return age;
    }


    public void talk() {
        System.out.println("Talk");
    }

    public void run() {
        System.out.println("Run");
    }

    @Override
    public String toString() {
        int i = LocalDate.now().getYear() - dateOfBirth.getYear();
        i = LocalDate.now().getMonthValue() < dateOfBirth.getMonthValue() ? i - 1 : i;
        return "Person{" +
                "name='" + name + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", age=" + i +
                '}';
    }
}
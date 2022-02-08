import java.time.LocalDate;

public class Student extends Person{
    private String Lastname;
    private String name;
    public void eat(){
        System.out.println(name+" кушает блюдо.");
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public Student(String name, String Lastname){
        super(name, LocalDate.of(2003,11,11));
        this.name = name;
        this.Lastname=Lastname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Lastname='" + Lastname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

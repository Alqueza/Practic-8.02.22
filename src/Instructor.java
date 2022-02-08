import java.time.LocalDate;

public class Instructor extends Person{
    private String name;
    private String group;

    public Instructor(String name,String group) {
        super(name,LocalDate.of(1978,11,11));
        this.name = name;
        this.group = group;
    }
    public void learn(){
        System.out.println(name+" учит группу:"+group);
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                '}';
    }

    public Instructor(String name){
        super(name);
    }
}

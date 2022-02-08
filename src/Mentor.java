import java.time.LocalDate;

public class Mentor extends Person {
    private String name;
    private String worktime;

    public Mentor(String name,String worktime) {
        super(name, LocalDate.of(1978,9,3));
        this.name = name;
        this.worktime = worktime;
    }
    public void work(){
        System.out.println(name+" работает:"+worktime);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getWorktime() {
        return worktime;
    }

    public void setWorktime(String worktime) {
        this.worktime = worktime;
    }

    @Override
    public String toString() {
        return "Mentor{" +
                "name='" + name + '\'' +
                ", worktime='" + worktime + '\'' +
                '}';
    }
}
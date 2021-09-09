package Entity;

public class eq1_Student{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public eq1_Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public eq1_Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                " id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}

package Entity;

public class Question7 {
    private int msv;
    private String name;

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Question7(int msv, String name) {
        this.msv = msv;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Question7{" +
                "msv=" + msv +
                ", name='" + name + '\'' +
                '}';
    }
}

package Entity_Exercise2;

import java.util.Arrays;

public class Question10_Group {
    private int id;
    private String name;
    private Question10[] account;

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

    public Question10[] getAccount() {
        return account;
    }

    public void setAccount(Question10[] account) {
        this.account = account;
    }

    public Question10_Group(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Question9_Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", account=" + Arrays.toString(account) +
                '}';
    }
}

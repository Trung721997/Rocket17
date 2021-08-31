package Entity_Exercise2;

import java.util.Scanner;

public class Question12 {
    public static int COUNT = 0;
    private int id;
    private String email;
    private String userName;
    private int age;
    Scanner scanner = new Scanner(System.in);
    @Override
    public String toString() {
        return "AccountQues11 [id=" + id + ", email=" + email + ", " +
                "userName=" + userName + ", age=" + age + "]";
    }
    public Question12() throws Question11.InvalidAgeInputingException {
        super();
        System.out.println("Mời bạn nhập thông tin account cần tạo mới");
        this.id = COUNT++;
        System.out.println("Email: ");
        this.email = scanner.nextLine();
        System.out.println("UserName: ");
        this.userName = scanner.nextLine();
        this.age = inputAccountAge();
    }
    private int inputAccountAge() throws Question11.InvalidAgeInputingException {
        System.out.println("Age: ");
        while (true) {
            int ageInput = scanner.nextInt();
            if (ageInput <= 0) {
                throw new Question11.InvalidAgeInputingException("Tuổi phải lớn hơn 0");
            } else {
                if (ageInput < 18) {
                    System.err.println("Your age must be greater than 18, input again: ");
                } else {
                    return ageInput;
                }
            }
        }
    }
}



package Back_end;

import Entity.Student;

public class Exercise3 {
    public static void main(String[] args) {
        Student<Integer> stu = new Student<Integer>(1, "Nguyễn Văn A");
        Student<Float> stu1 = new Student<Float>(2f, "Nguyễn Văn B");
        Student<Double> stu2 = new Student<Double>(3d, "Nguyễn Văn C");

        System.out.println(stu);
        System.out.println(stu1);
        System.out.println(stu2);


    }
}

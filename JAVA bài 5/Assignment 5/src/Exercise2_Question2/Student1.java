package Exercise2_Question2;

public class Student1 extends Person{
    private int i = 1;
    private int msv;
    private float diemTrungBinh;
    private String email;

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Student1(String name, GioiTinh gioiTinh, String ngaySinh, String diaChi, float diemTrungBinh, String email) {
        super(name, gioiTinh, ngaySinh, diaChi);
        this.msv = i++;
        this.diemTrungBinh = diemTrungBinh;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "msv=" + msv +
                ", diemTrungBinh=" + diemTrungBinh +
                ", email='" + email + '\'' +
                '}';
    }
}

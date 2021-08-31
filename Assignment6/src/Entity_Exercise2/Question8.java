package Entity_Exercise2;

public class Question8 {
    public void  inputFloat(String diem) throws Exception {
        String diem1 = diem.trim();
        int diem2 = Integer.parseInt(diem1);
        if (diem2 > 0) {
            System.out.println("Điểm vừa nhập: " + diem2);
            return;
        } else if (diem2 == 0){
            System.out.println("Lỗi cú pháp nhập lại");
        }
        throw new ChuyenXuLyLoiString("Lỗi cú pháp, nhập lại");
    }
    public void  inputDouble(String diem) throws Exception {
        String diem1 = diem.trim();
        int diem2 = Integer.parseInt(diem1);
        if (diem2 > 0) {
            System.out.println("Điểm vừa nhập: " + diem2);
            return;
        } else if (diem2 == 0){
            System.out.println("Lỗi cú pháp nhập lại");
        }
        throw new ChuyenXuLyLoiString("Lỗi cú pháp, nhập lại");
    }


}

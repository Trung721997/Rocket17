package Entity;

    public class eq2_Student implements Comparable<eq2_Student> {
    private int id;
    private String lastName;
    private String name;
    private String fullName;
    private String ngaySinh;
    private float diem;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getNgaySinh() {
            return ngaySinh;
        }

        public void setNgaySinh(String ngaySinh) {
            this.ngaySinh = ngaySinh;
        }

        public float getDiem() {
            return diem;
        }

        public void setDiem(float diem) {
            this.diem = diem;
        }

        public eq2_Student(int id, String lastName, String name, String fullName, String ngaySinh, float diem) {
        this.id = id;
        this.lastName = lastName;
        this.name = name;
        this.fullName = fullName;
        this.ngaySinh = ngaySinh;
        this.diem = diem;
    }

        @Override
        public String toString() {
            return "eq2_Student{" +
                    "ID ='" + id + '\'' +
                    ", FullName ='" + fullName + '\'' +
                    ", NGày Sinh ='" + ngaySinh + '\'' +
                    ", Điểm =" + diem +
                    '}';
        }

        @Override
        public int compareTo(eq2_Student o) {
            if (this.name.equals(o.name)){
                if (this.ngaySinh.equals(o.ngaySinh)){
                    if (this.diem == o.diem){
                        return 0;
                    } else {
                        return this.diem > o.diem ?-1:1;
                    }
                } else {
                 return this.ngaySinh.compareTo(o.ngaySinh);
                }
            }
            return this.name.compareTo(o.name);
        }


//        @Override
//        public int compareTo(eq2_Student o) {
//            if (this.name.equals(o.name)){
//                if (this.fullName.equals(o.fullName)) {
//                    return this.id > o.id ? 1: -1;
//                } else {
//                    return this.fullName.compareTo(o.fullName);
//                }
//            }
//            return this.name.compareTo(o.name);
//        }


    }

package Font_end;

import Entity.eq2_Student;

import java.util.Comparator;

public class comparator implements Comparator<eq2_Student> {
    @Override
    public int compare(eq2_Student o1, eq2_Student o2) {
        if (o1.getName().equals(o2.getName())) {
            if (o1.getLastName().equals(o2.getLastName())) {
                return o1.getId() > o2.getId() ? 1 : -1;
            } else {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        }
        return o1.getName().compareTo(o2.getName());
    }
}

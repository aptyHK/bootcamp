import java.util.ArrayList;
import java.util.List;

public class Company2 {
    Staff[] staffs;

    
    public Company2() {
        staffs = new Staff[0];
    }

    public Company2(Staff[] staffs) {
        this.staffs = staffs;
    }

    public void add(Staff staff) {
        Staff[] original = this.staffs; // copy the reference of the existing array
        this.staffs = new Staff[this.staffs.length + 1]; // turn the existing array to a new array with length+1
        for (int i = 0; i < original.length; i++) { // loop all the element on the copied orignial array to the exisiting array
            this.staffs[i] = original[i];
        }
        this.staffs[this.staffs.length] = staff; // add the new staff to the last index of the existing length+1 array
        Company.counter++;
    }
    
}

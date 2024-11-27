class Students {
    String name;
    int roll_no;
    String phone_no;
    String address;

    public Students(String name, int roll_no, String phone_no, String address) {
        this.name = name;
        this.roll_no = roll_no;
        this.phone_no = phone_no;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Phone No: " + phone_no);
        System.out.println("Address: " + address);
        System.out.println();
    }
}

public class Prob4 {
    public static void main(String[] args) {
        Students student1 = new Students("Gayathri", 1, "9654916953", "Delhi");
        Students student2 = new Students("Garvit", 2, "8630521524", "Agra");

        student1.displayInfo();
        student2.displayInfo();
    }
}

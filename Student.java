public class Student {
    String name;
    int id;
    String course;
    int phoneno;
    String address;

    public Student(String name, int id, String course,int phoneno,String address) {
        this.name = name;
        this.id = id;
        this.course = course;
        this.phoneno = phoneno;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("course: " + course);
        System.out.println("phoneno: " + phoneno);
        System.out.println("address: " + address);
    }

    public static void main(String[] args) {
        Student s = new Student("Anushka", 12345, "Devops", 1234567890, "123 Main St, City, Country");
        s.displayInfo();
    }
    
}

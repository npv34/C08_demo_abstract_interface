package src;

import src.abtract.UserAbstract;

public class Student extends UserAbstract {
    private String group;
    private double GPA;
    public Student(String name,
                   String email,
                   String phone,
                   String address,
                   String group,
                   double GPA) {
        super(name, email, phone, address);
        this.group = group;
        this.GPA = GPA;
    }

    public String getGroup() {
        return group;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String getInfo() {
        return "Student Information: " + this.getName() + "-" + this.getEmail() + "-" + this.getGroup() + "- GPA:" + this.getGPA();
    }
}

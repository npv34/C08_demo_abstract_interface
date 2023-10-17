package src;

import src.Interface.IStaff;
import src.abtract.UserAbstract;
import src.constant.RoleConst;

import java.util.Objects;

public class Staff extends UserAbstract implements IStaff {

    private String role;

    public Staff(String name,
                 String email,
                 String phone,
                 String address,
                 String role) {
        super(name, email, phone, address);
        this.role = role;
    }

    public String getRole() {
        return this.role;
    }

    @Override
    public String getInfo() {
        return "Staff Information: " + this.getName() + "-" + this.getRole();
    }

    @Override
    public boolean isAdmin() {
        return Objects.equals(this.getRole(), RoleConst.ROLE_ADMIN);
    }

    @Override
    public double getSalary() {
        return this.isAdmin() ? 1200000.0 : 5000000.0;
    }
}

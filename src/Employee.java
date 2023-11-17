import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private List<String> skills;
    private Map<String, String> contactInfo;
    private Date hireDate;
    private boolean isActive;

    // Constructors
    public Employee() {
    }

    public Employee(String name, int age, double salary
            , List<String> skills, Map<String, String> contactInfo,
                    Date hireDate, boolean isActive) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.skills = skills;
        this.contactInfo = contactInfo;
        this.hireDate = hireDate;
        this.isActive = isActive;
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public List<String> getSkills() {
        return skills;
    }

    public void setSkills(List<String> skills) {
        this.skills = skills;
    }

    public Map<String, String> getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(Map<String, String> contactInfo) {
        this.contactInfo = contactInfo;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    // toString() method to display the employee details
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", skills=" + skills +
                ", contactInfo=" + contactInfo +
                ", hireDate=" + hireDate +
                ", isActive=" + isActive +
                '}';
    }
}
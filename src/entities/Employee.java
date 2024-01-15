package entities;

public class Employee {
    private Integer Id;
    private String Name;
    private Double Salary;

    public Employee() {}

    public Employee(Integer id, String name, Double salary) {
        Id = id;
        Name = name;
        Salary = salary;
    }

    public void increaseSalary(double percent) {
       Salary += Salary * percent / 100;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getSalary() {
        return Salary;
    }

    private void setSalary(Double salary) {
        this.Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id= " + Id +
                ", Name= " + Name + '\'' +
                ", Salary= " + String.format("%.2f", Salary) +
                '}';
    }
}

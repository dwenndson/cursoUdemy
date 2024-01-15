import entities.Employee;

import java.util.*;

public class Program {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionarios você quer registrar? ");
        int employers = sc.nextInt();

        List<Employee> employeeList = new ArrayList<>();

        for (int i = 0; i < employers; i++) {
            System.out.println("Employee #" + (i+1) + ":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            while (hasId(employeeList, id)){
                System.out.println("Id already taken! Try again: ");
                id = sc.nextInt();
            }

            Employee employee = new Employee(id, name, salary);
            employeeList.add(employee);
        }

        System.out.print("Enter the employee id that will have salary increase: ");
        int id = sc.nextInt();
       Integer pos = position(employeeList, id);
        if( Objects.isNull(pos)) {
            System.out.println("This employee does not exist!\r\n");
        } else {
            System.out.print("Enter the percentage: ");
            double percenty = sc.nextDouble();
            employeeList.get(pos).increaseSalary(percenty);
        }
        for (Employee emp :
                employeeList) {
            System.out.println(emp);
        }
        
        sc.close();
    }

    public static Integer position(List<Employee> list, int idSalary) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(idSalary)) {
                return i;
            }
        }
        return null;
    }

    private static boolean hasId(List<Employee> list, int id) {
        Employee employee =  list.stream()
                .filter(emp -> emp.getId().equals(id))
                .findFirst()
                .orElse(null);
        return employee != null;
    }
}

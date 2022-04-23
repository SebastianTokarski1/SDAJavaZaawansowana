import company.Employee;
import company.Manager;
import company.Secretary;

public class CompanyMain {

    public static void main(String[] args) {
        Employee employeeOne = new Employee("Jan", 200, 11);
        Manager employeeTwo = new Manager("Bogdan", 250, 50, 22);
        Secretary employeeThree = new Secretary("Ala", 230, 33);

        employeeTwo.show();
    }
}

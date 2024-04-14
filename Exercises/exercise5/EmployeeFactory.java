// Factory Method Pattern

public class EmployeeFactory {
    public static Employee createEmployee(String type) {
        switch (type) {
            case "Developer":
                return new Developer();
            case "Manager":
                return new Manager();
            case "Tester":
                return new Tester();
            default:
                throw new IllegalArgumentException("Invalid employee type: " + type);
        }
    }
}

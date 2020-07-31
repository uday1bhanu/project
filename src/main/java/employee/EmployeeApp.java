package employee;

public class EmployeeApp {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {  
        System.out.println(new EmployeeApp().getGreeting());
    }
}
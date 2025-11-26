public class Company {
    //atributes
    private String name;
    private Employee[] employees;
    private Customer[] customers;

    //constructor
    public Company(String name, int numberOfEmployees, Customer[] customers) {
        this.name = name;
        this.employees = new Employee[numberOfEmployees];
        this.customers = customers;
    }

    //getter
    public String getName() {
        return name;
    }

    public void contrateEmployee(Employee[] employees) {
        if (employees.length <= this.employees.length) {
            this.employees = employees;
        } else {
            System.err.println("No es posible agregar ese numero de empleados");
        }
    }
}

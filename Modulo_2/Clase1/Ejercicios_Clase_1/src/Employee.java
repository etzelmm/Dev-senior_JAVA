public class Employee {
    //Atributes
    private String fullName;
    private String employeeId;
    private Double salary;
    private String departament;

    //Constructors
    public Employee(String fullName, String employeeId, String departament) {
        this(fullName, employeeId, 0.0, departament);
    }

    public Employee(String fullName, String employeeId, Double salary, String departament) {
        this.fullName = fullName;
        this.employeeId = employeeId;
        this.salary = salary;
        this.departament = departament;
    }

    //getters
    public String getFullName() {
        return fullName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public Double getSalary() {
        return salary;
    }

    public String getDepartament() {
        return departament;
    }

    //setters
    public void setSalary(Double salary) {
        if (salary > 0){
            this.salary = salary;
        } else {
            System.err.println("El salario no puede ser un negativo");
            this.salary = 0.0;
        }
    }

    public void setDepartament(String departament) {
        this.departament = departament;
    }
    
    //Metodos
    public void seeInfomation() {
        System.out.println(String.format("Empleado: [nombre= %s, id= %s, salario= %s, departamento= %s]", fullName, employeeId, salary.toString(), departament));
    }

    public Double anualSalary() {
        return this.salary * 12;
    }
}

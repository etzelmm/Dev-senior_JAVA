public class Manager extends Employee {
    //atributes
    private String category;

    //constructor
    public Manager(String name, Integer age, Double salsary, String category) {
        super(name, age, salsary);
        this.category = category;
    }

    //getter
    public String getCategory() {
        return category;
    }

    //show sub employees
    public void showSubEmployees(Employee[] subEmployees) {
        for (int i = 0; i < subEmployees.length; i++) {
            System.out.printf("Los subempleados del gerente %s con categoria %s son: %n%s", 
            getName(), getCategory(), subEmployees[i].toString());
        }
    }

    
}

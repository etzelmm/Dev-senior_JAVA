// TODO MAL, LAS RELACIONES SON CONCEOTTUALES, SIEMPRE DEBEN IR LOS ARRAY U OBJETOS MCOMO ATRIBUTO DE LAS CLASES SIN IMPORTAR LA RELACION

public class App {
    public static void main(String[] args) throws Exception {
        var customer1 = new Customer("Etzel", 20, "32044444");
        var customer2 = new Customer("Alberto", 25, "32514564");

        Customer[] customers = new Customer[] {customer1,customer2};

        customers[0].showInfomation();

        var employe1 = new Employee("Angel", 23, 250000.0);
        var employe2 = new Employee("Maria", 19, 15000.0);
        var employe3 = new Employee("Daivid", 30, 500000.0);

        Employee[] employees = new Employee[] {employe1,employe2};

        employees[0].showInfomation();

        var enterprise1 = new Company("DXC", 2, customers);

        enterprise1.contrateEmployee(employees);

    


    }
}

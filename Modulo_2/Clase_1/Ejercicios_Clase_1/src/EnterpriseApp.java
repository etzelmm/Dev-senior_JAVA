public class EnterpriseApp {
    public static void main(String[] args) throws Exception {
        var employee1 = new Employee("Etzel Molina", "ID1234567a", 248532.5, "Tolima");
        var employee2 = new Employee("Alberto Murillo", "ID09843b", "Cundinamarca");
        var employee3 = new Employee("Tatiana Molina", "ID6789456c", "Antioquia");

        employee1.seeInfomation();
        employee2.seeInfomation();
        employee3.seeInfomation();

        employee1.setSalary(-453.3);
        employee2.setSalary(874384152.5);
        employee3.setDepartament("Cundinamarca");

        employee1.seeInfomation();
        employee2.seeInfomation();
        employee3.seeInfomation();

        employee1.employeeId = "IDfasdsad";
    }
}

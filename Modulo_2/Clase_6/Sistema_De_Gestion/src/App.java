public class App {
    public static void main(String[] args) throws Exception {
        var task1 = new Task("crear", false);
        var task2 = new Task("eliminar", false);

        var project = new Project("projectico", "hacer esto ya", 2);

        project.addTasks(task1);
        project.addTasks(task2);

        project.displayTasks();

        project.chageStatusTasks();
        project.displayTasks();

    }
}

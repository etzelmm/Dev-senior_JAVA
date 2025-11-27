import java.util.Scanner;

public class Project {
    private String name;
    private String decription;
    private Task[] tasks;
    private Integer maxTask;
    private Integer currencyTask;

    public Project(String name, String decription, Integer maxTask) {
        this.name = name;
        this.decription = decription;
        this.tasks = new Task[maxTask];
        this.maxTask = maxTask;
        this.currencyTask = 0;
    }

    public String getName() {
        return name;
    }

    public String getDecription() {
        return decription;
    }

    public Task[] getTasks() {
        return tasks;
    }

    public Integer getMaxTask() {
        return maxTask;
    }

    public Integer getCurrencyTask() {
        return currencyTask;
    }

    //add taks to project
    public void addTasks(Task task) {
        if (getCurrencyTask() < getMaxTask()) {
            this.tasks[currencyTask] = task;
            System.out.printf("La tarea %s se aniadio al projecto %s%n", task.getDescrption(), getName());
            this.currencyTask ++;
        } else {
            System.err.println("El projecto ya tiene el maximo de tareas asignadas%n");
        }
    }

    //display taks
    public void displayTasks() {
        System.out.printf("%n%n=== tareas del projecto: %s ===%n%n", getName());
        for(int i = 0; i < currencyTask; i++) {
            System.out.printf("%d. ", i+1);
            tasks[i].displayTask();
        }
    }

    //change status of tasks
    public void chageStatusTasks() {
        System.out.println("Elija la tarea a cambiar status:");
        displayTasks();
        Scanner teclado = new Scanner(System.in);
        var task = teclado.nextInt();
        teclado.close();

        var currencyStatus = tasks[task-1].getStatus();
        tasks[task-1].setStatus(!currencyStatus);
        System.out.println("Se ha cambiado el estatus de la tarea");
    }
    
}

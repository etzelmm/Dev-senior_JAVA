public class Task {
    //atributes
    private String description;
    private Integer priority;
    private Boolean complete;

    //constructors
    public Task(String description, Integer priority) {
        this.description = description;
        if (priority >= 1 && priority <= 3) {
            this.priority = priority;
        } else {
            this.priority = 2;
        }
        this.complete = false;
    }

    public Task(String description) {
        this(description, 2);
    }

    // getters
    public String getDescription() {
        return this.description;
    }

    public Integer getPriority() {
        return this.priority;
    }

    public Boolean isComplete() {
        return this.complete;
    }

    //methods
    public void setPriority(Integer priority) {
        if (priority >= 1 && priority <= 3) {
            this.priority = priority;
        } else {
            System.out.println("No fue posible asignar una prioridad");
        }
    }

    public void markComplete() {
        this.complete = true;
    }

    public void seeState() {
        System.out.println(String.format("Tarea= [descricion: %s, prioridad: %s, completada: %s]", description, priority.toString(), complete.toString()));
    }
}

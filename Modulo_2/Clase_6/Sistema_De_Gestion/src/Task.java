public class Task {
    private String descrption;
    private Boolean status;
    
    public Task(String descrption, Boolean status) {
        this.descrption = descrption;
        this.status = status;
    }

    public String getDescrption() {
        return descrption;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public void displayTask() {
        String status;
        if (getStatus()) {
            status = "completada";
        } else {
            status = "incompleto";
        }
        System.out.printf("Tarea: %s en estado %s%n ", getDescrption(), status);
    }
    
}
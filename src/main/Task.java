public class Task {

    private int id;
    private String description;
    private String done;
    private boolean status;

    @Override
    public String toString(){
        return "[id = " + id + ", description = " + description + ", done = " + done + ", status = " + status + "]";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDone() {
        return done;
    }

    public void setDone(String done) {
        this.done = done;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;

    }
}
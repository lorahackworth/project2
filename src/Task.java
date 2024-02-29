public class Task {
    private String name;
    private String description;
    private int priority;

    public static int numOfTasks = 0;

    public Task(String name, String description, int priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;

        numOfTasks++;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getPriority() {
        return priority;
    }
    public void setPriority(int priority) {
        this.priority = priority;
    }
    public void display(Task a){
        System.out.println(a.getName());
    }


}

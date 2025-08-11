import java.util.ArrayList;

public class ListTask extends ToDo {
    public void listTasks(){
        // This method will list all tasks
        ArrayList<String> list = AddTask.getTasks(); // Assuming AddTask has a method to retrieve tasks
        System.out.println("Listing all tasks..." + list);
        // Logic to retrieve and display tasks would go here
    }
}

import java.util.Scanner;

public class MarkAsComplete {
    public void markTaskAsComplete(){
        Scanner sc = new Scanner(System.in);
        int taskNumber = sc.nextInt();
        if(AddTask.getTasks().isEmpty()){
            System.out.println("No tasks to delete.");
            return;
        }
        if(taskNumber < 1 || taskNumber > AddTask.getTasks().size()) {
            System.out.println("Invalid task number.");
            return;
        }
        else{
        String completedTask = AddTask.getTasks().get(taskNumber - 1);
        System.out.println("Task '" + completedTask + "' completed successfully.");
        AddTask.getTasks().remove(taskNumber - 1);
        AddTask.AddTask("Completed: "+ completedTask);
        }
    }
}

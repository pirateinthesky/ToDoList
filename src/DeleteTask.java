import java.util.Scanner;

public class DeleteTask extends ToDo{

    public void DeleteTask() {
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
        String removedTask = AddTask.getTasks().remove(taskNumber - 1);
        System.out.println("Task '" + removedTask + "' deleted successfully.");
        }
    }
}


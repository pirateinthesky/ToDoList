import java.util.Scanner;

public class ToDo {
    public static void main(String[] args) {
        while(true){
        Scanner sc = new Scanner(System.in);
        System.out.printf("Select an option: \n 1. Add Task \n 2. Delete a Task \n 3. Mark as Complete \n 4. List Tasks \n 5. Exit\n");
        switch(sc.nextInt()){
            case 1:
                AddTask addTask = new AddTask();
                addTask.AddTask();
                break;
            case 2:
                System.out.println("Enter the task number to delete:");
                DeleteTask deleteTask = new DeleteTask();
                deleteTask.DeleteTask();
                break;
            case 3:
                System.out.println("Enter the task number to mark as completed:");
                MarkAsComplete markAsComplete = new MarkAsComplete();
                markAsComplete.markTaskAsComplete();
                break;
            case 4:
                ListTask listTask = new ListTask();
                System.out.println(AddTask.getTasks());
                break;
            case 5:
                return;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
            }

        }
    }
}

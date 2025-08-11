import java.util.ArrayList;
import java.util.Scanner;

public class AddTask extends ToDo{
    private static ArrayList<String> list = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void AddTask(){
        System.out.println("Enter task to add:");
        String tasks = sc.nextLine();
        list.add(tasks);
        System.out.println("Task added. ");
    }
    public static void AddTask(String task) {
        list.add(task);
    }
    public static ArrayList<String> getTasks() {
        return list;
    }
}

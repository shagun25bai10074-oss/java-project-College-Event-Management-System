import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EventManager manager = new EventManager();

        int choice = 0;

        while (choice != 4) {
                                                                                                              

            System.out.println("\nCollege Event Management");
            System.out.println("1. Add Event");
            System.out.println("2. View Events");
            System.out.println("3. Search Event");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter event ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter event name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter venue: ");
                    String venue = sc.nextLine();

                    System.out.print("Enter date: ");
                    String date = sc.nextLine();

                    System.out.print("Enter capacity: ");
                    int capacity = sc.nextInt();
                    sc.nextLine();

                    Event event = new Event(
                            id, name, venue, date, capacity
                    );

                    manager.addEvent(event);
                    break;

                case 2:
                    manager.showEvents();
                    break;

                case 3:
                    System.out.print("Enter event name");

                    String searchName = sc.nextLine();

                    manager.searchEvent(searchName);
                    break;

                case 4:
                    System.out.println("Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}

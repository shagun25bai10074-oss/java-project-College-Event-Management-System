import java.util.ArrayList;

public class EventManager {

    ArrayList<Event> events = new ArrayList<>();

    void addEvent(Event event) {
        events.add(event);
        System.out.println("Event added.");
    }

    void showEvents() {
        if (events.isEmpty()) {
            System.out.println("No events found.");
        } else {
            for (Event event : events) {
                event.display();
            }
        }
    }

    void searchEvent(String name) {
        boolean found = false;

        for (Event event : events) {
            if (event.name.equalsIgnoreCase(name)) {
                event.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Event not found.");
        }
    }
}

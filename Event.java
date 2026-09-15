public class Event {

    private int id;
    private String name;
    private String venue;
    private String date;
    private int capacity;

    public Event(int id, String name, String venue, String date, int capacity) {
        this.id = id;
        this.name = name;
        this.venue = venue;
        this.date = date;
        this.capacity = capacity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

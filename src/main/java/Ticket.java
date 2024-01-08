import java.time.LocalDate;

public class Ticket {
    private String eventName;
    private LocalDate date;
    private boolean isUsed;

    public Ticket(String eventName, LocalDate date) {
        this.eventName = eventName;
        this.date = date;
        this.isUsed = false;
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void use() {
        if (isUsed) {
            throw new RuntimeException("Allerede brugt!");
        } else {
            isUsed = true;
        }
    }
}
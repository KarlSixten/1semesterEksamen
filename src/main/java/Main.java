import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ticket> billetListe = new ArrayList<>(List.of(
                new Ticket("Roskilde Festival", LocalDate.of(1999, 6, 29)),
                new Ticket("Vejle Festival", LocalDate.of(2004, 7, 19)),
                new Ticket("Viborg Festival", LocalDate.of(1986, 4, 28)),
                new Ticket("Aarhus Festival", LocalDate.of(1905, 3, 3))
        ));

        billetListe.get(1).use();
        billetListe.get(0).use();

        int usedTickets = 0;
        for (Ticket ticket : billetListe) {
            if (ticket.isUsed()) {
                usedTickets++;
            }
        }

        System.out.println("Brugte billetter: " + usedTickets);
    }
}
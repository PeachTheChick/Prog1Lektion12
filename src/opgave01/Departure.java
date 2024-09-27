package opgave01;

import java.time.LocalTime;

public class Departure {
    int perron;
    String destination;
//    String arrival;
    LocalTime arrival;
//    String departure;
    LocalTime departure;

    public Departure(int perron, String destination, LocalTime arrival, LocalTime departure) {
        this.perron = perron;
        this.destination = destination;
        this.arrival = arrival;
        this.departure = departure;
    }
}

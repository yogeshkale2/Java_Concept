class MovieTicket {
    String MovieName;
    String SeatNo;
    int price;

    public MovieTicket(String MovieName, String SeatNo, int price) {
        this.MovieName = MovieName;
        this.SeatNo = SeatNo;
        this.price = price;

    }

    public void printTicket() {
        System.out.println("--- TICKET CONFIRMED ---");
        System.out.println("Movie : " + this.MovieName);
        System.out.println("Seat  : " + this.SeatNo);
        System.out.println("Price : " + this.price);
        System.out.println("------------------------\n");
    }
}

public class Movie_TicketEx {
    public static void main(String[] args) {
        MovieTicket Movie = new MovieTicket("Mirzapur", "A12", 560);
        Movie.printTicket();

        MovieTicket Movie2 = new MovieTicket("The Last Sunrise", "AB23", 750);
        Movie2.printTicket();

    }

}

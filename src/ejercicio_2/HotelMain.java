package ejercicio_2;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import ejercicio_2.HotelDTO;
import ejercicio_2.HotelInterface;
import ejercicio_2.HotelSI;
public class HotelMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        String opc = "1";
        HotelInterface repo = new HotelSI();
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Que quiere hacer? \n 1.Reservar \n 2.Contar.");
            switch (s.next()){
                case "1" -> {
                    System.out.println("Individual, doble o familiar?");
                    String habitacion = s.next();
                    System.out.println("Cuantas personas?");
                    Integer personas = Integer.parseInt(s.next());
                    System.out.println("Habitacion para fumadores? (si/no)");
                    String fumador = s.next();
                    System.out.println("Va a traer mascota?");
                    String mascota = s.next();
                    System.out.println("Pais de origen?");
                    String pais = s.next();
                    System.out.println("Cuanto tiempo se va a quedar?");
                    String estadia = s.next();
                    repo.save(new HotelDTO(habitacion, personas, fumador, mascota, pais, estadia));
                }
                case "2" -> {
                    repo.contar();
                }
        }} while(true);
    }
}

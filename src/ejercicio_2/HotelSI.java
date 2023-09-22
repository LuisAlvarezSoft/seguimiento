package ejercicio_2;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.List;
import java.util.ArrayList;
import ejercicio_2.HotelDTO;
import ejercicio_2.HotelInterface;
public class HotelSI implements HotelInterface{
    private List<HotelDTO> hotel;

    public HotelSI() throws IOException, ClassNotFoundException {
        hotel = new ArrayList<>();
    }

    @Override
    public HotelDTO findById(int id) {
        return hotel.stream()
                .filter(reserva -> reserva.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<HotelDTO> findAll() throws IOException, ClassNotFoundException {
        hotel = (List<HotelDTO>) ObjectSerializer.readObjectFromFile("reservaciones.ax");
        return hotel;
    }

    @Override
    public void save(HotelDTO reserva) throws IOException {
    hotel.add(reserva);
    ObjectSerializer.writeObjectToFile(hotel, "reservaciones.ax");
    }

    @Override
    public void update(HotelDTO reserva) throws IOException {

    }

    @Override
    public void delete(HotelDTO reserva) throws IOException {
    hotel.remove(reserva);
    ObjectSerializer.writeObjectToFile(hotel, "reservaciones.ax");
    }

    @Override
    public void contar() throws IOException {
        System.out.println("Reservas totales: " + hotel.size());
    }
}
package ejercicio_2;
import java.io.IOException;
import java.util.List;
public interface HotelInterface {
    HotelDTO findById(int id);
    List<HotelDTO> findAll() throws IOException, ClassNotFoundException;
    void save(HotelDTO reserva) throws IOException;
    void update(HotelDTO reserva) throws IOException;
    void delete(HotelDTO reserva) throws IOException;
    void contar() throws IOException;
}

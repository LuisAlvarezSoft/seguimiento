package ejercicio_1;

import ejercicio_1.CajeroDTO;

import java.io.IOException;
import java.util.List;

public interface InterfazCajero {
    CajeroDTO findById(int id);
    List<CajeroDTO> findAll() throws IOException, ClassNotFoundException;
    void save(CajeroDTO accion) throws IOException;
    void update(CajeroDTO accion) throws IOException;
    void delete(CajeroDTO accion) throws IOException;
}
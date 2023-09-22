package ejercicio_1;

import ejercicio_1.CajeroDTO;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class CajeroServImpl implements InterfazCajero {
    private List<CajeroDTO> cajero;
    public CajeroServImpl() throws IOException,ClassNotFoundException{
       cajero = new ArrayList<>();
    }

    @Override
    public CajeroDTO findById(int id) {
        return cajero.stream()
                .filter(accion -> accion.cedula==id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<CajeroDTO> findAll() throws IOException, ClassNotFoundException {
        cajero = (List<CajeroDTO>) ObjectSerializer.readObjectFromFile("clientes.ax");
        return cajero;
    }

    @Override
    public void save(CajeroDTO accion) throws IOException {
        cajero.add(accion);
        ObjectSerializer.writeObjectToFile(cajero,"clientes.ax");
    }

    @Override
    public void update(CajeroDTO accion) throws IOException {
        CajeroDTO exsaldo = findById(accion.cedula);
        do {
            cajero.remove(exsaldo);
            cajero.add(accion);
            ObjectSerializer.writeObjectToFile(cajero,"clientes.ax");
        } while(true);
    }

    @Override
    public void delete(CajeroDTO accion) throws IOException {
        cajero.remove(accion);
        ObjectSerializer.writeObjectToFile(cajero,"clientes.ax");
    }
}
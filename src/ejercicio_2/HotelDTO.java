package ejercicio_2;

public class HotelDTO {
    public Integer id;
    public String habitacion;
    public Integer personas;
    public String fumador;
    public String mascota;
    public String pais;
    public String estadia;

    public HotelDTO(String habitacion, Integer personas, String fumador, String mascota, String pais, String estadia) {
        this.habitacion = habitacion;
        this.personas = personas;
        this.fumador = fumador;
        this.mascota = mascota;
        this.pais = pais;
        this.estadia = estadia;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "HotelDTO{" +
                "habitacion='" + habitacion + '\'' +
                ", personas=" + personas +
                ", fumador='" + fumador + '\'' +
                ", mascota='" + mascota + '\'' +
                ", pais='" + pais + '\'' +
                ", estadia='" + estadia + '\'' +
                '}';
    }
}

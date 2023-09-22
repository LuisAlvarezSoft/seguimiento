package ejercicio_1;

import java.io.Serializable;

public class CajeroDTO implements Serializable {
    public Integer cedula;
    public String pin;
    public Boolean aprobacion;
    public Integer saldo;

    public CajeroDTO(Integer cedula, String pin, Boolean aprobacion, Integer saldo) {
        this.cedula = cedula;
        this.pin = pin;
        this.aprobacion = aprobacion;
        this.saldo = saldo;
    }

    public CajeroDTO(Integer cedula, String pin) {
        this.cedula = cedula;
        this.pin = pin;
    }

    public CajeroDTO(Integer saldo) {
        this.saldo = saldo;
    }

    public CajeroDTO(Integer cedula, String pin, Integer saldo) {
        this.cedula = cedula;
        this.pin = pin;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ejercicio_1.CajeroDTO{" +
                "cedula=" + cedula +
                ", pin='" + pin + '\'' +
                ", aprobacion=" + aprobacion +
                ", saldo=" + saldo +
                '}';
    }
}



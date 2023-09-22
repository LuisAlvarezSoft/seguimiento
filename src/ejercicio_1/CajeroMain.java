package ejercicio_1;

import ejercicio_1.CajeroDTO;

import java.io.IOException;
import java.util.Scanner;
import java.util.List;
public class CajeroMain {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Boolean bank2;
        String bank = "0000";
        String opc = "1";
        InterfazCajero repo = new CajeroServImpl();
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Bienvenido");
            System.out.println("Ingrese su cedula:");
            Integer cedula = Integer.valueOf(s.next());
            System.out.println("Ingrese su pin");
            String pin = s.next();
            System.out.println("¿Que va a hacer? \n 1. Depositar \n 2. Retirar  \n 3.Transferir \n 4. Consultar \n 5.Salir");
            String elect = s.next();

            switch (elect) {

                case "1" -> {
                    System.out.println("Ingrese la cantidad a depositar:");
                    Integer saldo = Integer.parseInt(s.next());
                    System.out.println("El banco le enviara un SMS de confirmacion (Por temas solo ingrese 0000 xd)");
                    if(s.next().equals(bank)){bank2=true;}else {bank2=false;}
                    Boolean aprobacion=bank2;
                    if(aprobacion=false){saldo=0;}
                    repo.save(new CajeroDTO(cedula, pin, saldo));
                    System.out.println("Hecho.");
                    break;
                }
                case "2" -> {
                    System.out.println("Ingrese la cantidad a retirar");
                    Integer retiro = Integer.parseInt(s.next());
                    Integer saldo = retiro;
                    repo.save(new CajeroDTO(cedula, pin, saldo));
                }

                case "4" -> {
                    List<CajeroDTO> datos = repo.findAll();
                    if (!datos.isEmpty()) {
                        datos.forEach(System.out::println);
                    } else {
                        System.out.println("No hay registros");
                        break;
                    }
                }

                case "5" -> {
                    opc = "5";
                    break;
                }
            }
        }
        while (!opc.equals("5")) ;
    }
}

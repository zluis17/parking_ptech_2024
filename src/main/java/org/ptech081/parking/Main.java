package org.ptech081.parking;
import org.ptech081.parking.entities.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;




public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
      
        //crear carros con los constructores:
        carro carrito1 = new carro("HUG 789",TipoVehiculo.MOTO);
        carro carrito2 = new carro ();
        carrito2.placa = "YUU 564";
        carrito2.tipoVehiculo = TipoVehiculo.CAMIONETA;
    
        //crear clientes
        cliente cliente1 = new cliente ("Alejandro", "Quintero",121324345);
        cliente cliente2 = new cliente ("Luis", "Quintero",1213246768);

        //crer empleado 
        Empleado empleado1 = new Empleado ( "Mario", 54321L);
        Empleado empleado2 = new Empleado ( "luis", 54371L);


        //invocar el metodo addCar
        cliente1.addCar(carrito1);
        cliente1.addCar("LOL 987" ,TipoVehiculo.BUS);
        cliente2.addCar("SSJ 986" ,TipoVehiculo.CAMIONETA);


        //crear dos cupos 
        cupo cupo1 = new cupo('A');
        cupo cupo2 = new cupo('B');

        //crear dos registros E/S
        LocalDate fechaInicio = LocalDate.now();
        LocalTime horaInicio = LocalTime.now();
        LocalDate fechaFin = LocalDate.of(2024, Month.MARCH, 24);
        LocalTime horaFin = LocalTime.of(11,30,0);

        LocalDate fechaInicio2 = LocalDate.of(2025, Month.APRIL, 23);
        LocalTime horaInicio2 = LocalTime.of (13,25,2);
        LocalDate fechaFin2 = LocalDate.of(2025, Month.AUGUST, 25);
        LocalTime horaFin2 = LocalTime.of(12,20,3);
        
        
        List<Registro> misRegistros = new ArrayList <Registro>();

        //crear registro
        Registro registro1 = new Registro(fechaInicio , horaInicio , fechaFin, horaFin , 6000L ,cupo1 , cliente1.misCarros.get(0) , cliente1, empleado1  );

        


        Registro registro2 = new Registro(fechaInicio2 , horaInicio2 , fechaFin2 , horaFin2 , 8000L ,cupo2 , cliente2.misCarros.get(0) , cliente2 , empleado2 );

        //añadir registro a la lista
        misRegistros.add (registro1);
        System.out.println("Registros de E/S parking");
        for(Registro r : misRegistros){
        System.out.println("cliente:" + r.cliente.nombre + " " + r.cliente.apellido + "|" + r.carro.placa + " " + r.carro.tipoVehiculo + " |" + r.valor + " |" + r.fechaInicio + " |" + r.horaInicio + " |" + r.empleado + " |");
        
        }


    }

}

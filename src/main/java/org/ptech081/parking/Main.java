package org.ptech081.parking;
import org.ptech081.parking.entities.*;



public class Main {
    public static void main(String[] args) {
      
        //crear carros con los constructores:
        carro carrito1 = new carro("HUG 789",TipoVehiculo.MOTO);
        carro carrito2 = new carro ();
        carrito2.placa = "YUU 564";
        carrito2.tipoVehiculo = TipoVehiculo.CAMIONETA;
    
        //crear clientes
        cliente cliente1 = new cliente ("Alejandro", "Quintero",121324345);

        //invocar el metodo addCar
        cliente1.addCar(carrito1);
        cliente1.addCar("LOL 987" ,TipoVehiculo.BUS);


        //recorrer los carros del cliente
        
        for(carro c: cliente1.misCarros){
        System.out.println(c.placa +""+c.tipoVehiculo);
        System.out.println( "-----------------");        

        }


    }
}
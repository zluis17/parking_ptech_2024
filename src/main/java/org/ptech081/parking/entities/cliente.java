package org.ptech081.parking.entities;

import java.util.ArrayList;
import java.util.List;

public class cliente {

public String nombre;
public String apellido;
public long identificacion;
public List<carro> misCarros;

public cliente() {
    this.misCarros = new ArrayList<carro>();
}

public cliente(String nombre, String apellido, long identificacion) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.identificacion = identificacion;
    this.misCarros = new ArrayList<carro>();

}

//primera sobrecarga de addCar

public void addCar (carro car) {
    this.misCarros.add(car);


}

// Segunda sobrecarga de addCar

public void addCar (String placa,TipoVehiculo tv){

    carro car = new carro(placa, tv);
    this.misCarros.add(car);
    
}




}

package org.ptech081.parking.entities;
import java.time.LocalDate;
import java.time.LocalTime;

public class Registro {

    //atributos intrinsecos
    public LocalDate fechaInicio;
    public LocalTime horaInicio;
    public LocalDate fechaFin;
    public LocalTime horaFin;
    public Long valor;


    //atributos de relacion
    public cupo cupo; 
    public carro carro;
    public cliente cliente;
    public Empleado empleado;

    

    //constructores
    public Registro() {
    }



    public Registro(LocalDate fechaInicio, LocalTime horaInicio, LocalDate fechaFin, LocalTime horaFin, Long valor,
            org.ptech081.parking.entities.cupo cupo, org.ptech081.parking.entities.carro carro,
            org.ptech081.parking.entities.cliente cliente, Empleado empleado) {
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaFin = fechaFin;
        this.horaFin = horaFin;
        this.valor = valor;
        this.cupo = cupo;
        this.carro = carro;
        this.cliente = cliente;
        this.empleado = empleado;
    }



   
    
    




}

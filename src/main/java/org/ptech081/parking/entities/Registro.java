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
    

    //constructores
    public Registro() {
    }


    public Registro(LocalDate fechaInicio, LocalTime horaInicio, LocalDate fechaFin, LocalTime horaFin, Long valor,
            cupo cupo, carro carro, cliente cliente) {
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaFin = fechaFin;
        this.horaFin = horaFin;
        this.valor = valor;
        this.cupo = cupo;
        this.carro = carro;
        this.cliente = cliente;
    } 
    
    




}

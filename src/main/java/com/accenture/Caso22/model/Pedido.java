package com.accenture.Caso22.model;

import java.util.ArrayList;

public class Pedido {
    
    private ArrayList<String> producto = new ArrayList<String>();
    private int valor;
    private int hora;
    private int costoDomicilio; 

    public Pedido (ArrayList<String> producto,int valor, int hora, int costoDomicilio){

        this.producto = producto;
        this.valor = valor;
        this.hora = hora;
        this.costoDomicilio = costoDomicilio;
    }

    public ArrayList<String> getProducto() {
        return producto;
    }
    
    public void setProducto(ArrayList<String> producto) {
        this.producto = producto;
    }

    public int getValor() {
        return valor;
    }
    
    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getCostoDomicilio() {
        return costoDomicilio;
    }
    
    public void setCostoDomicilio(int costoDomicilio) {
        this.costoDomicilio = costoDomicilio;
    }

    public int getHora() {
        return hora;
    }
    
    public void setHora(int hora) {
        this.hora = hora;
    }
    


}

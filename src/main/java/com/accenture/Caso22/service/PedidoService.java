package com.accenture.Caso22.service;

import java.util.ArrayList;

import com.accenture.Caso22.model.Pedido;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PedidoService {

    ArrayList<String> productos = new ArrayList<String>();
    
    @PutMapping("/pedido")
    public Pedido updatePedido(@RequestBody Pedido pedidoData) {

        Pedido pedido1 = null;

        productos.clear();
        productos.add("Licuadora");
        productos.add("Audifonos");
        
        pedido1 = new Pedido(productos, 80000, 8, 1000);
        
        int horas =  pedidoData.getHora() - pedido1.getHora();
        
        if(horas < 0){
            System.out.println("No se puede editar");
        }else{
            if(horas <= 5 && pedidoData.getValor() >= pedido1.getValor()){
                for(int i=0;i<pedidoData.getProducto().size();i++){
                    productos.add(pedidoData.getProducto().get(i));
                }
                pedido1.setProducto(productos);
                pedido1.setValor(pedido1.getValor() + pedidoData.getValor());
                pedido1.setHora(pedidoData.getHora());
                if(pedido1.getValor()>100000){
                    pedido1.setCostoDomicilio(0);
                }
            }
        }
        return pedido1;
    }
}

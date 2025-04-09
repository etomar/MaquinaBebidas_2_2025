/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinabebidas_2_2025;

/**
 *
 * @author Jorge Quetglas
 */
public class ContadorDeMonedas {
    private float cantidad;//Dinero introducido por el usuario
    private float disponible;//Dinero almacenado en la maquina,
 

/* Inicializa el objeto y fija el cambio inicialmente
disponible. */
/* Entradas: float i, saldo inicialmente disponible para
cambios */
/* Salidas: Ninguna*/
    

public ContadorDeMonedas (float i){

    disponible = i;
    cantidad=0;
}
/* Informa sobre el saldo actual del cliente
       Entradas: Ninguna
       Salidas: float, el saldo del cliente */
public float saldo (){
return cantidad;
}

/* Insertar la moneda m
       Entrada: float m, la cantidad de dinero introducida
       Salidas: Ninguna */
public void insertarMoneda (float m){
    
    cantidad += m;



}
/* Devuelve el cambio, si es posible */
/* Una vez entregado el cambio, el dinero introducido por el
cliente */
/* pasa a engrosar el disponible de la maquina
/* Entradas: float c, el precio del producto*/
/* Salidas: el cambio, negativo si falta dinero */
public float darCambioDe (float c){
    float cambio = cantidad - c;

    if (cambio<0){
        return cambio; //falta dinero
  
    }
    
    if (cambio > disponible){
        return -999; // No hay suficiente cambio
        
    }

    disponible +=c;
    cantidad=0;
    disponible -= cambio;
    return cambio;
}
    

/* El cliente recupera el dinero introducido si todavia */
/* no se ha realizado la venta */
/* Entradas: Ninguna */
/* Salidas: float, la cantidad devuelta */
public float retornar (){
float devolver = cantidad;
cantidad = 0;
return devolver;
}
    
}
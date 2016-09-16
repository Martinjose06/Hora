/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author mzuleta4
 */
public class Hora {
    private int hora;
    private int minuto;
    private int segundo;
    
    public Hora(){
        hora = 00;
        minuto = 00;
        segundo = 00;
    }

    public Hora(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
   public void validar(Hora h2){
       int sw = 1;
       if (this.getHora() > 23 || this.getHora() < 0 ) {
           Helper.mensaje(null, "La hora No.1 está incorrecta","Error",2);
           sw = 0;
       }
       else{
       }
       if ( h2.getHora() > 23 || h2.getHora() < 0) {
           Helper.mensaje(null, "La hora No. 2 está incorrecta","Error",2);
           sw = 0;
       }
       else {
       }
       if (this.getMinuto() > 59 || this.getMinuto() < 0 ) {
           Helper.mensaje(null, "Los minutos No.1 están incorrectos","Error",2);
           sw = 0;
       }
       else{
       }
       if (h2.getMinuto() > 59 || h2.getMinuto() < 0) {
           Helper.mensaje(null, "Los minutos No.2 están incorrectos","Error",2);
           sw = 0;
       }
       else{
       }
       if (this.getSegundo() > 59 || this.getSegundo() < 0) {
            Helper.mensaje(null, "Los segundos No.1 están incorrectos","Error",2);
            sw = 0;
       }
       else{
       }
       if (h2.getSegundo() > 59 || h2.getSegundo() < 0 ) {
           Helper.mensaje(null, "Los segundos No.2 están incorrectos","Error",2);
           sw = 0;
       }
       else{
       }
       
       if (sw == 1) {
           Helper.mensaje(null, "La hora es correcta","Correcta",1);
       }
   }
    
    public String mostrar(Hora h2){
        String res,res2;
        res ="La hora No. 1 es: " +this.getHora()+" Hora(as) "+this.getMinuto() +" Minuto(os) "+ this.getSegundo()+" Segundo(os)"
                +"\nLa hora No. 2 es: " +h2.getHora()+ " Hora(as) " +h2.minuto+ " Minuto(os) " + h2.segundo+ " Segundo(os) ";
        return res;
    }
   
    public void igual(Hora h2){
        if (this.getHora() == h2.hora && this.getMinuto() == h2.minuto && this.getSegundo() == h2.segundo) {
            Helper.mensaje(null, "La hora es la misma que se proporciona","Hora",1);
        }
        else{
            Helper.mensaje(null, "La hora no es la misma que se proporciona","Hora",1);
        }
    }
    
    public void MayorQue(Hora h2){
        if (this.getHora() == h2.hora && this.getMinuto() == h2.minuto && this.getSegundo() == h2.segundo) {
            Helper.mensaje(null, "La hora es la misma que se proporciona","Hora",1);
        }
        if (this.getHora() > h2.hora && this.getMinuto() > h2.minuto && this.getSegundo() > h2.segundo) {
            Helper.mensaje(null, "La hora es mayor que la que se proporciona","Hora",1);
        }
        else{
            Helper.mensaje(null, "La hora es menor que la que se proporciona","Hora",1);
        }
    }
    
    
    
    
   
}

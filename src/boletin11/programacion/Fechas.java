/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11.programacion;

import java.time.LocalDate;
import java.time.Period;
import javax.swing.JOptionPane;

/**
 *
 * @author Brais Núñez
 */
public class Fechas {
    
    public void calcularFechas(){
    //declaro las variables ano, numMes y dia y pido que se introduzca su valor por teclado
       
       int ano = Integer.parseInt(JOptionPane.showInputDialog("Introducir ano"));
       int numMes = Integer.parseInt(JOptionPane.showInputDialog("Introducir mes"));
       int dia = Integer.parseInt(JOptionPane.showInputDialog("Introducir dia"));
        
       //con la función LocalDate.now() recojo la fecha actual en ahora.
       /*con la función LocalDate.of se guarda la fecha de las variables introducidas
       por teclado.*/
       
       LocalDate ahora = LocalDate.now();
       LocalDate of = LocalDate.of(ano, numMes, dia);
       
       //con la función Period.between se compara la fecha actual con la fecha introducida
       
       Period fechas = Period.between(ahora, of);
       
       //se visualizan por consola el nº de años, de meses y de días que 
       
       System.out.println(fechas.getYears()+" años " + fechas.getMonths() + " meses " + fechas.getDays()+ " días ");
       System.out.println("---> En comparación con el " + dia + " de " + numMes + " del año " + ano);
        
   }
}


import javax.swing.*;
import java.sql.SQLOutput;

public class Funciones {
    public void mostrarMenu(){
        System.out.println("Mostrar manú");
    }

    public int introducirOpcion(){
        //pide opcion al usuario
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduce la opción"));
        return opcion;
        
    }
    
    public int introducirNumero(){
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número"));
        return numero;
    }
    
    public int calcularAreaCuadrado(int lado){
        int area = lado * lado;
        return area;
    }

    public void mostrarArea(int area) {
        System.out.println(area);
    }

    public int calcularAreaTriangulo(int base, int altura){
        int area = (base * altura)/2;
        return area;
    }

    public double calcularAreaCircunferencia(int radio){
        double area = 3.14 * Math.pow(radio,2);
        return area;
    }


    public void mostrarMensaje() {
        System.out.println();
    }
}

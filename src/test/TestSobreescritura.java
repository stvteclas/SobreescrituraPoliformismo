package test;

import domain.Empleado;
import domain.Gerente;

public class TestSobreescritura {
    public static void main(String[] args) {
       // Gerente gerente1= new Gerente("juan", 5000, "Sistemas");
        //System.out.println("Gerente= " + gerente1.obtenerDetalles());

        Empleado empleado = new Empleado("Juan", 5000);
        System.out.println("empleado = " + empleado.obtenerDetalles());
        
        Gerente gerente= new Gerente("karla", 5000, "contabilidad");
        System.out.println("gerente = " + gerente.obtenerDetalles());
        imprimir(empleado);
        imprimir(gerente);
    }

    public static void imprimir(Empleado empleado){
        System.out.println("empleado= " + empleado.obtenerDetalles());
    }
}

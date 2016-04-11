package cuartel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    private static  Scanner s;
    public static void main(String[] args) {
       s = new Scanner(System.in);
        int opcion = 0;
        String nombre, cedula;
        String policia;
        int idDelito;
        Criminal ctemp = new Criminal();
        ArrayList<Criminal> celda = new ArrayList<Criminal>();
        ArrayList<Policia> escuadron  = new ArrayList<Policia>();
        //Declara objeto de policia
        Policia p1 = new Policia();
        Policia p2 = new Policia();
        Policia p3 = new Policia();
        p1.setNombre("Juan Perez");
        p2.setNombre(" Pedro Cruz");
        p3.setNombre(" Jose Jose");
        p1.setRango("Sargento");
        p2.setRango(" Cabo");
        p3.setRango(" Capitan");
        escuadron.add(p1);
        escuadron.add(p2);
        escuadron.add(p3);


        while( opcion != 3) {
            System.out.println(" LA JOYA");
            System.out.println("--------");
            System.out.println(" 1. Ingresar Criminal ");
            System.out.println(" 2. Ver Criminales  ");
            System.out.println(" 3. Salir ");
            System.out.println(" \nOpcion");
            opcion = s.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("----------");
                    System.out.println("| Opcion 1: Ingresar Criminal");
                    System.out.println("-----------");
                    System.out.println("\n Datos del Criminales");
                    System.out.println("Nombre: ");
                    nombre = s.next();
                    System.out.println("Posibles Delitos: ");
                    cedula = s.next();
                    System.out.println("Que hizo?");
                    System.out.println("\t1. Robo\n\t2. Violacione\n\t3. Homicidio\n\t4. Desconocido");
                    idDelito = s.nextInt();
                    System.out.println(" Quien te capturo?");
                    Iterator<Policia> listaPolicia = escuadron.iterator();
                    while(listaPolicia.hasNext()){
                    Policia elemento = listaPolicia.next();
                    System.out.println("\t" + elemento.getNombre());
                }
                    System.out.println("Policia");
                    policia = s.next();

                    while( listaPolicia.hasNext()){
                        Policia elemento = listaPolicia.next();
                        if(elemento.getNombre().equals(policia)){
                            ctemp.setPolicia(elemento);
                        }
                    }

                    ctemp.setNombre(nombre);
                    ctemp.setCedula(cedula);
                    ctemp.setDelito(idDelito);
                    celda.add(ctemp);
                    System.out.println("Guardar con exito");

                    break;
                case 2:
                    System.out.println("opcion 2");
                    break;
                case 3:
                    System.out.println("opcion 3");
                    break;
                default:
                    System.out.println(" opcion no valida ");
                    break;
            }
        }

    }
}

package com.company;



import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Main {

    public static void main(String[] args) throws Exception {


        String Datos, ap, c, t, V;
        int L, j=0, m=0, n = 0;
        String w, s, q, k;
        String opcion = "s";

        while (opcion.equals("S") || opcion.equals("s")) {

            InputStreamReader flujo = new InputStreamReader(System.in);
            BufferedReader D = new BufferedReader(flujo);


            System.out.println(" introduzca su nombre: ");
            Datos = D.readLine();

            System.out.println(" introducir su apellido: ");
            ap = D.readLine();

            System.out.println(" introduzca su cedula: ");
            c = D.readLine();

            System.out.println(" introduzaca su telefono ");
            t = D.readLine();

            System.out.println(" escoger curso: ");
            V = D.readLine();

            System.out.println(" 1. Programacion en C++ \n 2.Progaramacion en PYTHON \n 3. Programacion en Java");
            L = Integer.parseInt(D.readLine());


            switch (L) {
                case 1:
                   j = j + 1;

                        System.out.println("Curso: Programacion en C++ \nmatriculas en el curso:" + j );

                    break;
                case 2:
                    m = m + 1;
                    System.out.println("Curso: Programacion en PYTHON \nmatriculas en el curso:" + m);
                    break;
                case 3:
                    n = n + 1;
                    System.out.println("Curso: Programacion en Java \nmatriculas en el curso:"+ j );
                    break;

                default:
                    System.out.println("opcion no valida");
                    break;

            }

            System.out.println(" Estudiante: " + Datos + " " + ap + "\n Cedula: " + c + "\n Telafono:  " + t);


            System.out.print("Desea continuar (S/N): ");
            opcion = D.readLine();
        }


    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        Singleton singleton_1 =  Singleton.getInstance();
        Singleton singleton_2 = Singleton.getInstance();

        singleton_1.setNess("!! HOLA ¡¡");
        System.out.println(singleton_2.getNess());

    }
}

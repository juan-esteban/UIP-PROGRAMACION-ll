package com.company;


public class Singleton {
    private static Singleton sin;
    private String ness;
    public  Singleton(){

    }
    public static synchronized Singleton getInstance(){
        if (sin == null){
            sin = new Singleton();
        }
        return  sin;
    }
    public void  sin(String XD){
        System.out.println(XD);
    }
    public  void setNess(String XD){
        ness = XD;
    }
    public  String getNess(){
        return ness;
    }
}

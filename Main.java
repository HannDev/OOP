package com.belajar;

public class Main {
    public static void main(String[] args) {

                //YANG TERPANGGIL

        //FUNGSI

        parameter objek = new parameter();
        int hitungKecepatan = objek.kecepatanMotor(500, 6);
        System.out.println("kecepatanya adalah :" + hitungKecepatan+" km/jam");

        parameter A = new parameter();
        int luas = objek.luasPersegi(20,10);
        System.out.println("luas persegi adalah :" +luas+" cm");

        parameter X = new parameter();
        int segitiga = objek.luasSegitiga(20, 30);
        System.out.println("Luas segitga adalah :"+segitiga+" cm");


        //PROCEDURE

        objek.namaPengendara("Rohman Abdul Hani");
        objek.umurPengendara(17);
        objek.tinggiPengendara(170);


    }
}

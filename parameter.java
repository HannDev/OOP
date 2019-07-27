package com.belajar;

public class parameter {

        //YANG DIPANGGIL

//FUNGSI

    int kecepatanMotor ( int jarak, int waktu){
        int kecepatanMotor = jarak / waktu;
        return kecepatanMotor;
    }

    int luasPersegi( int P,int L){
        int luasPersegi = P * L;
        return luasPersegi;
    }

    int luasSegitiga (int tinggi, int alas){
        int luasSegitiga = tinggi * alas ;
        return  luasSegitiga;
    }


    //PRCEDURE

    void namaPengendara(String namaPengendara){
        System.out.println("Nama pengendaranya adalah :"+namaPengendara);
    }

    void umurPengendara(int umurPengendara) {
        System.out.println("Umurnya adalah :" + umurPengendara + " tahun");
    }

        void tinggiPengendara(int tinggiPengendara) {
            System.out.println("Tinggi pengendara adalah :"+ tinggiPengendara+" cm");
        }

}


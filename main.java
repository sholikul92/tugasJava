package com.kuliah;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String nama;
        long npm;
        int deretBilangan, pilihan;
        boolean ulang = true;

        while (ulang) {
            //mengambil input user
            System.out.print("Nama: ");
            nama = keyboard.next();

            System.out.print("Npm : ");
            npm = keyboard.nextLong();

            // print nama dan npm
            System.out.println("Nama : " + nama);
            System.out.println("Npm : " + npm);

            System.out.println("Pilihan anda:");
            System.out.println("1. Buat deret bilangan 10 7 4 1");
            System.out.println("2. Keluar");
            System.out.println();

            System.out.print("Masukan pilihan anda: ");
            pilihan = keyboard.nextInt();

            //hitung deret bilangan
            deretBilangan = 4 / 2 * (2*10 + (4-1) * (-3));

            if(pilihan == 1){
                System.out.println("Deret Bilangan: 10 7 4 1");
                System.out.println("-------------------------");
                System.out.println("10 7 4 1 = " + deretBilangan);
            } else if(pilihan == 2){
                System.out.println("Anda telah keluar...");
            } else {
                System.out.println("Pilihan yang anda masukan salah!");
            }

            // logic apakah program akan di ulang kembali
            boolean ulangiInput = true;

            while(ulangiInput){
                if (ulang){
                    System.out.print("Ulang Lagi? [y/t] : ");
                    String ulangLagi = keyboard.next();

                        if (ulangLagi.equalsIgnoreCase("y")){
                            ulangiInput = false;
                            continue;
                        } else if (ulangLagi.equalsIgnoreCase("t")){
                            ulang = false;
                            ulangiInput = false;
                            System.out.println("Program Selesai...");
                            System.out.println("Terima Kasih");
                        } else {
                            System.out.println("Input yang anda masukan salah!");
                            ulangiInput = true;
                        }
                }

            }
        }

        keyboard.close();

    }
}

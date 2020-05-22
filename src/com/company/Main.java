package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {



        BigInteger p=GenerateRandomPrime.gRP();
        BigInteger q=GenerateRandomPrime.gRP();
        while (p.equals(q)){
            q=GenerateRandomPrime.gRP();
        }
        System.out.println(" p = " + p +"     q =" + q);
        ArrayList<BigInteger> keys=Keygenerator.keyGen(p,q);
        BigInteger n =keys.get(0);
        BigInteger e =keys.get(1);
        BigInteger d =keys.get(2);
        System.out.println( "n= " + n + "   e= " + e + "    d= "+ d);
        System.out.println("Irja be az üzenetet");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        BigInteger m=new BigInteger(String.valueOf(number));
        System.out.println("Irjon 1 est titkosításhoz,0-át visszafejtéshez");
        int number1 = scanner.nextInt();
        if(number1==1){
            System.out.println("titkosított üzenet " + Encryption.encryption(e,n,m));
        }else if (number1==0){
            System.out.println("visszafejtett üzenet " + Decryption.decryption(m,d,n));
        }else System.out.println("Vagy 1 est írjon vagy 0 át");


/*
        BigInteger n1 =new BigInteger("25345141");
        BigInteger e1 =new BigInteger("3");
        BigInteger d1 =new BigInteger("1");
        BigInteger m1 =new BigInteger("562");
        System.out.println("visszafejtett üzenet " + Decryption.decryption(m1,d1,n1));
        System.out.println("titkosított üzenet " + Encryption.encryption(e1,n1,m1));*/

     /*  BigInteger a = new BigInteger("2");
       BigInteger g = new BigInteger("78915497");
       System.out.println(MillerRabin.millerRabin(g, a));*/

        //System.out.println(ExtendedEuclidAlgorithm.EEA(new BigInteger("120"),new BigInteger("23")));
       // System.out.println(Keygenerator.keyGen(new BigInteger("17"),new BigInteger("23")));

    }
}

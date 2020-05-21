package com.company;

import java.math.BigInteger;

public class Main {

    public static void main(String[] args) {


        //BigInteger n1 = new BigInteger(String.valueOf(209));
       // BigInteger a = new BigInteger(String.valueOf(2));
       // System.out.println(MillerRabin.millerRabin(n1, a));
        //System.out.println(GenerateRandomPrime.generateRandomPrime());
        //BigInteger p=GenerateRandomPrime.generateRandomPrime();
        // BigInteger q=GenerateRandomPrime.generateRandomPrime();
        //System.out.println(""+ p + " " +q);

        //System.out.println(Encryption.encryption(3,253,117));
        System.out.println(Decryption.decryption(19,65,161));
        //System.out.println(Keygenerator.keyGen(GenerateRandomPrime.generateRandomPrime().intValue(),GenerateRandomPrime.generateRandomPrime().intValue()));

        //Moduláris hatványozásra
        //BigInteger n1=new BigInteger(String.valueOf(47));
        //BigInteger m1=new BigInteger(String.valueOf(352));


        //BigInteger c=m1.pow(51);
       // BigInteger a=c.mod(n1);
        //System.out.println(a);
      /*  int a=2;
        int n = 11;
        int d = 0;
        int s = 5;
        while (true) {
            d = (int) ((n - 1) / (Math.pow(2, s)));
            if (d % 2 == 1) {
                break;
            }
            s++;
        }
         Triple a=ExtendedEuclidAlgorithm.apply(n1,m1);
        System.out.println(a.gets());
        Math.floorMod((long) Math.pow(a,d),n);
        System.out.println(Math.floorMod((long) Math.pow(a,d),n));
        System.out.println(" n=" + n + "   d=" + d + "  S= " + s);*/
        /*BigInteger n1=new BigInteger(String.valueOf(124));
        BigInteger m1=new BigInteger(String.valueOf(84));
        System.out.println(ExtendedEuclidAlgorithm.apply(n1,m1).getd());
        System.out.println(Keygenerator.lnko(124,84));*/
        //System.out.println(Keygenerator.keyGen(23,29));



    }
}

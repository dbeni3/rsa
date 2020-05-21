package com.company;

import java.math.BigInteger;

public class Decryption {

    /*public static int decryption(int c,int d,int n){
        int m=Math.floorMod(((int) Math.pow(c,d)),n);
        return m;
    }*/
    public static BigInteger decryption(int c, int d, int n){
        BigInteger c1=new BigInteger(String.valueOf(c));
        BigInteger n1=new BigInteger(String.valueOf(n));
        BigInteger m=c1.pow(d);
        return m.mod(n1);
    }
}

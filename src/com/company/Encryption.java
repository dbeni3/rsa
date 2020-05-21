package com.company;

import java.math.BigInteger;

public class Encryption {

   /* public static int encryption(int e,int n,int m){
        int c=Math.floorMod((int) Math.pow(m,e),n);
        return c;
    }*/
    public static BigInteger encryption(int e, int n, int m){
        BigInteger n1=new BigInteger(String.valueOf(n));
        BigInteger m1=new BigInteger(String.valueOf(m));
        BigInteger c=m1.pow(e);
        return c.mod(n1);
    }

}

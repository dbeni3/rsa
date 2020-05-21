package com.company;

import java.math.BigInteger;

public class MillerRabin {
    public static boolean millerRabin(BigInteger n,BigInteger a){
        BigInteger a2=new BigInteger("2");
        BigInteger a3=new BigInteger("1");
        BigInteger d;
        BigInteger h1;
        BigInteger h2;

        int s=1;
        while (true){
             d=n.subtract(a3).divide(a2.pow(s));

            if(!d.mod(a2).equals(BigInteger.ZERO)){
                break;
            }
            s++;
        }

        System.out.println("S= " +s + "   d= " +d+ "    n= " + n +"  a   " +a);
        if (a.pow(d.intValue()).mod(n).equals(1)){
            return true;
        }

        for (int i=0;i<s;i++){
            h1=a2.pow(i);
            h2=d.multiply(h1);
            if (a.pow(h2.intValue()).mod(n).equals(n.subtract(new BigInteger("1")))){
               return true;
            }
            i++;
        }


        return false;
    }
}

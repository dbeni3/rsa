package com.company;

import java.math.BigInteger;
import java.util.Random;

public class GenerateRandomPrime {

    public static BigInteger generateRandomPrime(){
        BigInteger n;
            while (true){
                Random r = new Random();
                int a1=r.nextInt((50 - 2) + 1) + 2;
                BigInteger a=new BigInteger(""+a1);
                 n=generateUnevenBiginteger();
                if (n.signum()>0 && MillerRabin.millerRabin(n,a)){
                    break;
                }
            }
            return n;
    }
    private static BigInteger generateUnevenBiginteger(){
        BigInteger max = new BigInteger("5000000");
        BigInteger min = new BigInteger("250000");
        BigInteger bigInteger = max.subtract(min);
        Random randNum = new Random();
        int len = max.bitLength();
        BigInteger res = new BigInteger(len, randNum);
        if (res.compareTo(min) < 0)
            res = res.add(min);
        if (res.compareTo(bigInteger) >= 0)
            res = res.mod(bigInteger).add(min);

        if (res.getLowestSetBit() != 0){
            res=res.add(BigInteger.valueOf(1));
        }
        return res;
    }
}


package com.company;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.util.FormatFlagsConversionMismatchException;
import java.util.Random;

public class GenerateRandomPrime {

    public static BigInteger gRP(){
        BigInteger n=new BigInteger(16, new SecureRandom());
        BigInteger t=new BigInteger("2");
        BigInteger one=new BigInteger("1");
        int c=0;
        int a=2;
            while (true){
                c=0;
                 n=new BigInteger(9, new SecureRandom());
                if (isEven(n)){
                    n=n.add(one);
                }
               /*if (MillerRabin.millerRabin(n,t)){
                   break;
                }*/
                while (c<3 && n.isProbablePrime(a)){
                    a=(int) ((Math.random() * (100 - 2)) + 2);
                    c++;
                }

               if(c==3){
                   break;
               }
               /*if (n.isProbablePrime(a)){
                   a=(int) ((Math.random() * (100 - 2)) + 2);
                   while ()
                   c++;
               }*/
            }
            return n;
    }


    public static boolean isEven(BigInteger number)
    {
        return number.getLowestSetBit() != 0;
    }
}


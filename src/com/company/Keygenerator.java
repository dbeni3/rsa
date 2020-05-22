package com.company;

import java.math.BigInteger;
import java.util.ArrayList;

public class Keygenerator {

    public static ArrayList<BigInteger> keyGen(BigInteger p, BigInteger q){
        BigInteger n=p.multiply(q);
        BigInteger one=new BigInteger("1");
        BigInteger t=new BigInteger("2");
        BigInteger nul=new BigInteger("0");

        BigInteger en=(p.subtract(one)).multiply(q.subtract(one));
        BigInteger e=new BigInteger("3");
        while (true){
            if((e.gcd(en)).equals(one)){
                break;
            }
            e=e.add(t);
        }

        ExtendedEuclidAlgorithm ea=new ExtendedEuclidAlgorithm();
        BigInteger d=ea.EEA(e,en);
        while (true) {
            if (d.compareTo(nul) == -1) {
                d = d.add(en);
            } else {
                break;
            }
        }
        ArrayList<BigInteger> keys=new ArrayList<>();
        keys.add(n);
        keys.add(e);
        keys.add(d);
        return keys;

    }

}


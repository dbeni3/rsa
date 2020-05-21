package com.company;

import java.math.BigInteger;

public class Keygenerator {

    public static BigInteger keyGen(int p,int q){
        int n=p*q;
        int en1=(p-1)*(q-1);
        int e1=3;
        while (true){
            if(lnko(e1,en1)==1){
                break;
            }
            e1++;
            if (e1<en1){
                break;
            }
        }
        e1=73;
        BigInteger e=new BigInteger(String.valueOf(e1));
        BigInteger en=new BigInteger(String.valueOf(en1));
        Triple t =ExtendedEuclidAlgorithm.apply(e,en);
        BigInteger d=t.gets();
        while (true){
            if (d.intValue()<0){
                d=d.add(en);
            }else {
                break;}
        }
        return d;
    }
    public static int lnko(int x, int y){
        while(x != y){
            if(x > y) x -= y;
            else y -= x;
        }
        return x;
    }

}


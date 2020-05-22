package com.company;

import java.math.BigInteger;

public class Decryption {


    public static BigInteger decryption(BigInteger c, BigInteger d, BigInteger n){
        BigInteger m=c.pow(d.intValue());
        return m.mod(n);
    }
}

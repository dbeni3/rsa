package com.company;

import java.math.BigInteger;

public class Encryption {

    public static BigInteger encryption(BigInteger e, BigInteger n, BigInteger m){
        BigInteger c=m.pow(e.intValue());
        return c.mod(n);
    }

}

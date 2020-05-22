package com.company;

import java.math.BigInteger;

public class ExtendedEuclidAlgorithm {
    public static BigInteger EEA(BigInteger e, BigInteger en)
    {
        BigInteger nul = new BigInteger("0");
        BigInteger x = new BigInteger("0");
        BigInteger y= new BigInteger("1");
        BigInteger x2 = new BigInteger("1");
        BigInteger y2 = new BigInteger("0");
        BigInteger temp;
        while (!en.equals(nul))
        {
            BigInteger q =e.divide(en);
            BigInteger r =e.remainder(en);
            e = en;
            en = r;
            temp = x;
            x = x2.subtract((q.multiply(x)));
            x2 = temp;
            temp = y;
            y = y2.subtract((q.multiply(y)));
            y2 = temp;
        }
        return x2;
    }


}

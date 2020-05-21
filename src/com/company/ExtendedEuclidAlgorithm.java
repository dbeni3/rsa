package com.company;

import java.math.BigInteger;

public class ExtendedEuclidAlgorithm {

    public static Triple apply(final BigInteger a, final BigInteger b) {
        if (b.equals(BigInteger.ZERO)) {
            return new Triple(a, BigInteger.ONE, BigInteger.ZERO);
        } else {
            final Triple extension = apply(b, a.mod(b));
            return new Triple(extension.d, extension.t, extension.s.subtract(a.divide(b).multiply(extension.t)));
        }
    }


}

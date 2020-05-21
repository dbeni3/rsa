package com.company;

import java.math.BigInteger;

public class Triple {
    public final BigInteger d;
    public final BigInteger s;
    public final BigInteger t;
    Triple(final BigInteger d, final BigInteger s, final BigInteger t) {
        this.d = d;
        this.s = s;
        this.t = t;
    }
    public BigInteger getd(){return this.d;}
    public BigInteger gets(){return this.s;}
    public BigInteger gett(){return this.t;}
}

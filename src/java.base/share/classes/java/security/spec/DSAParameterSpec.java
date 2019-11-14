package java.security.spec;

import org.checkerframework.checker.interning.qual.UsesObjectEquals;
import org.checkerframework.framework.qual.AnnotatedFor;
import java.math.BigInteger;

@AnnotatedFor({ "interning" })
@UsesObjectEquals
public class DSAParameterSpec implements AlgorithmParameterSpec, java.security.interfaces.DSAParams {

    BigInteger p;

    BigInteger q;

    BigInteger g;

    public DSAParameterSpec(BigInteger p, BigInteger q, BigInteger g) {
        this.p = p;
        this.q = q;
        this.g = g;
    }

    public BigInteger getP();

    public BigInteger getQ();

    public BigInteger getG();
}
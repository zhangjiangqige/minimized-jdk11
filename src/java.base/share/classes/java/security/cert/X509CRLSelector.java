package java.security.cert;

import org.checkerframework.checker.interning.qual.UsesObjectEquals;
import org.checkerframework.framework.qual.AnnotatedFor;
import java.io.IOException;
import java.math.BigInteger;
import java.util.*;
import javax.security.auth.x500.X500Principal;
import sun.security.util.Debug;
import sun.security.util.DerInputStream;
import sun.security.x509.CRLNumberExtension;
import sun.security.x509.X500Name;

@AnnotatedFor({ "interning" })
@UsesObjectEquals
public class X509CRLSelector implements CRLSelector {

    static {
        CertPathHelperImpl.initialize();
    }

    private static final Debug debug = Debug.getInstance("certpath");

    private HashSet<Object> issuerNames;

    private HashSet<X500Principal> issuerX500Principals;

    private BigInteger minCRL;

    private BigInteger maxCRL;

    private Date dateAndTime;

    private X509Certificate certChecking;

    private long skew = 0;

    public X509CRLSelector() {
    }

    public void setIssuers(Collection<X500Principal> issuers);

    public void setIssuerNames(Collection<?> names) throws IOException;

    public void addIssuer(X500Principal issuer);

    public void addIssuerName(String name) throws IOException;

    public void addIssuerName(byte[] name) throws IOException;

    private void addIssuerNameInternal(Object name, X500Principal principal);

    private static HashSet<Object> cloneAndCheckIssuerNames(Collection<?> names) throws IOException;

    private static HashSet<Object> cloneIssuerNames(Collection<Object> names);

    private static HashSet<X500Principal> parseIssuerNames(Collection<Object> names) throws IOException;

    public void setMinCRLNumber(BigInteger minCRL);

    public void setMaxCRLNumber(BigInteger maxCRL);

    public void setDateAndTime(Date dateAndTime);

    void setDateAndTime(Date dateAndTime, long skew);

    public void setCertificateChecking(X509Certificate cert);

    public Collection<X500Principal> getIssuers();

    public Collection<Object> getIssuerNames();

    public BigInteger getMinCRL();

    public BigInteger getMaxCRL();

    public Date getDateAndTime();

    public X509Certificate getCertificateChecking();

    public String toString();

    public boolean match(CRL crl);

    public Object clone();
}
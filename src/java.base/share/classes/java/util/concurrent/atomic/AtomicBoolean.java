package java.util.concurrent.atomic;

import org.checkerframework.checker.interning.qual.UsesObjectEquals;
import org.checkerframework.framework.qual.AnnotatedFor;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;

@AnnotatedFor({ "interning" })
@UsesObjectEquals
public class AtomicBoolean implements java.io.Serializable {

    private static final long serialVersionUID = 4654671469794556979L;

    private static final VarHandle VALUE;

    static {
        try {
            MethodHandles.Lookup l = MethodHandles.lookup();
            VALUE = l.findVarHandle(AtomicBoolean.class, "value", int.class);
        } catch (ReflectiveOperationException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    private volatile int value;

    public AtomicBoolean(boolean initialValue) {
        value = initialValue ? 1 : 0;
    }

    public AtomicBoolean() {
    }

    public final boolean get();

    public final boolean compareAndSet(boolean expectedValue, boolean newValue);

    @Deprecated(since = "9")
    public boolean weakCompareAndSet(boolean expectedValue, boolean newValue);

    public boolean weakCompareAndSetPlain(boolean expectedValue, boolean newValue);

    public final void set(boolean newValue);

    public final void lazySet(boolean newValue);

    public final boolean getAndSet(boolean newValue);

    public String toString();

    public final boolean getPlain();

    public final void setPlain(boolean newValue);

    public final boolean getOpaque();

    public final void setOpaque(boolean newValue);

    public final boolean getAcquire();

    public final void setRelease(boolean newValue);

    public final boolean compareAndExchange(boolean expectedValue, boolean newValue);

    public final boolean compareAndExchangeAcquire(boolean expectedValue, boolean newValue);

    public final boolean compareAndExchangeRelease(boolean expectedValue, boolean newValue);

    public final boolean weakCompareAndSetVolatile(boolean expectedValue, boolean newValue);

    public final boolean weakCompareAndSetAcquire(boolean expectedValue, boolean newValue);

    public final boolean weakCompareAndSetRelease(boolean expectedValue, boolean newValue);
}

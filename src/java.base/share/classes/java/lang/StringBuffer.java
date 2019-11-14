package java.lang;

import org.checkerframework.checker.index.qual.GTENegativeOne;
import org.checkerframework.checker.index.qual.IndexOrHigh;
import org.checkerframework.checker.index.qual.NonNegative;
import org.checkerframework.checker.lock.qual.GuardSatisfied;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.checkerframework.dataflow.qual.Pure;
import org.checkerframework.dataflow.qual.SideEffectFree;
import org.checkerframework.framework.qual.AnnotatedFor;
import java.util.Arrays;
import jdk.internal.HotSpotIntrinsicCandidate;

@AnnotatedFor({ "lock", "nullness", "index" })
public final class StringBuffer extends AbstractStringBuilder implements java.io.Serializable, Comparable<StringBuffer>, CharSequence {

    private transient String toStringCache;

    static final long serialVersionUID = 3388685877147921107L;

    @HotSpotIntrinsicCandidate
    public StringBuffer() {
        super(16);
    }

    @HotSpotIntrinsicCandidate
    public StringBuffer(@NonNegative int capacity) {
        super(capacity);
    }

    @HotSpotIntrinsicCandidate
    public StringBuffer(String str) {
        super(str.length() + 16);
        append(str);
    }

    public StringBuffer(CharSequence seq) {
        this(seq.length() + 16);
        append(seq);
    }

    @Override
    public synchronized int compareTo(StringBuffer another);

    @Pure
    @Override
    @NonNegative
    public synchronized int length(@GuardSatisfied StringBuffer this);

    @Override
    @NonNegative
    public synchronized int capacity();

    @Override
    public synchronized void ensureCapacity(int minimumCapacity);

    @Override
    public synchronized void trimToSize();

    @Override
    public synchronized void setLength(@NonNegative int newLength);

    @Override
    public synchronized char charAt(int index);

    @Override
    public synchronized int codePointAt(int index);

    @Override
    public synchronized int codePointBefore(int index);

    @Override
    public synchronized int codePointCount(int beginIndex, int endIndex);

    @Override
    public synchronized int offsetByCodePoints(int index, int codePointOffset);

    @Override
    public synchronized void getChars(int srcBegin, int srcEnd, char[] dst, @IndexOrHigh({ "#3" }) int dstBegin);

    @Override
    public synchronized void setCharAt(int index, char ch);

    @Override
    public synchronized StringBuffer append(@Nullable Object obj);

    @Override
    @HotSpotIntrinsicCandidate
    public synchronized StringBuffer append(@Nullable String str);

    public synchronized StringBuffer append(@Nullable StringBuffer sb);

    @Override
    synchronized StringBuffer append(AbstractStringBuilder asb);

    @Override
    public synchronized StringBuffer append(@Nullable CharSequence s);

    @Override
    public synchronized StringBuffer append(@Nullable CharSequence s, @IndexOrHigh({ "#1" }) int start, @IndexOrHigh({ "#1" }) int end);

    @Override
    public synchronized StringBuffer append(char[] str);

    @Override
    public synchronized StringBuffer append(char[] str, @IndexOrHigh({ "#1" }) int offset, @IndexOrHigh({ "#1" }) int len);

    @Override
    public synchronized StringBuffer append(boolean b);

    @Override
    @HotSpotIntrinsicCandidate
    public synchronized StringBuffer append(char c);

    @Override
    @HotSpotIntrinsicCandidate
    public synchronized StringBuffer append(int i);

    @Override
    public synchronized StringBuffer appendCodePoint(int codePoint);

    @Override
    public synchronized StringBuffer append(long lng);

    @Override
    public synchronized StringBuffer append(float f);

    @Override
    public synchronized StringBuffer append(double d);

    @Override
    public synchronized StringBuffer delete(int start, int end);

    @Override
    public synchronized StringBuffer deleteCharAt(int index);

    @Override
    public synchronized StringBuffer replace(int start, int end, String str);

    @Override
    public synchronized String substring(int start);

    @Override
    public synchronized CharSequence subSequence(int start, int end);

    @Override
    public synchronized String substring(int start, int end);

    @Override
    public synchronized StringBuffer insert(int index, char[] str, @IndexOrHigh({ "#2" }) int offset, @IndexOrHigh({ "#2" }) int len);

    @Override
    public synchronized StringBuffer insert(int offset, @Nullable Object obj);

    @Override
    public synchronized StringBuffer insert(int offset, @Nullable String str);

    @Override
    public synchronized StringBuffer insert(int offset, char[] str);

    @Override
    public StringBuffer insert(int dstOffset, @Nullable CharSequence s);

    @Override
    public synchronized StringBuffer insert(int dstOffset, @Nullable CharSequence s, @IndexOrHigh({ "#2" }) int start, @IndexOrHigh({ "#2" }) int end);

    @Override
    public StringBuffer insert(int offset, boolean b);

    @Override
    public synchronized StringBuffer insert(int offset, char c);

    @Override
    public StringBuffer insert(int offset, int i);

    @Override
    public StringBuffer insert(int offset, long l);

    @Override
    public StringBuffer insert(int offset, float f);

    @Override
    public StringBuffer insert(int offset, double d);

    @Pure
    @Override
    @GTENegativeOne
    public int indexOf(@GuardSatisfied StringBuffer this, String str);

    @Pure
    @Override
    @GTENegativeOne
    public synchronized int indexOf(@GuardSatisfied StringBuffer this, String str, int fromIndex);

    @Pure
    @Override
    @GTENegativeOne
    public int lastIndexOf(@GuardSatisfied StringBuffer this, String str);

    @Pure
    @Override
    @GTENegativeOne
    public synchronized int lastIndexOf(@GuardSatisfied StringBuffer this, String str, int fromIndex);

    @Override
    public synchronized StringBuffer reverse();

    @SideEffectFree
    @Override
    @HotSpotIntrinsicCandidate
    public synchronized String toString(@GuardSatisfied StringBuffer this);

    private static final java.io.ObjectStreamField[] serialPersistentFields = { new java.io.ObjectStreamField("value", char[].class), new java.io.ObjectStreamField("count", Integer.TYPE), new java.io.ObjectStreamField("shared", Boolean.TYPE) };

    private synchronized void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException;

    private void readObject(java.io.ObjectInputStream s) throws java.io.IOException, ClassNotFoundException;

    synchronized void getBytes(byte[] dst, int dstBegin, byte coder);
}
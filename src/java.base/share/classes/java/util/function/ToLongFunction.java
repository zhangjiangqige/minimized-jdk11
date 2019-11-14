package java.util.function;

import org.checkerframework.framework.qual.AnnotatedFor;

@AnnotatedFor({ "lock", "nullness" })
@FunctionalInterface
public interface ToLongFunction<T> {

    long applyAsLong(T value);
}
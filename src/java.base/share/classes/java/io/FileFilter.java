package java.io;

import org.checkerframework.framework.qual.AnnotatedFor;

@AnnotatedFor({ "nullness" })
@FunctionalInterface
public interface FileFilter {

    boolean accept(File pathname);
}
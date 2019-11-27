/*
 * Copyright (c) 1994, 2016, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package java.io;

import org.checkerframework.checker.index.qual.GTENegativeOne;
import org.checkerframework.checker.index.qual.IndexOrHigh;
import org.checkerframework.checker.index.qual.LTEqLengthOf;
import org.checkerframework.checker.index.qual.LTLengthOf;
import org.checkerframework.checker.index.qual.NonNegative;
import org.checkerframework.checker.index.qual.Positive;
import org.checkerframework.framework.qual.AnnotatedFor;
import jdk.internal.misc.Unsafe;

@AnnotatedFor({ "nullness", "index" })
public class BufferedInputStream extends FilterInputStream {

    protected volatile byte[] buf;

    protected int count;

    protected int pos;

    protected int markpos;

    protected int marklimit;

    public BufferedInputStream(InputStream in) {
    }

    public BufferedInputStream(InputStream in, @Positive int size) {
    }

    @GTENegativeOne
    public synchronized int read() throws IOException;

    @GTENegativeOne
    @LTEqLengthOf({ "#1" })
    public synchronized int read(byte[] b, @IndexOrHigh({ "#1" }) int off, @LTLengthOf(value = { "#1" }, offset = { "#2 - 1" }) @NonNegative int len) throws IOException;

    @NonNegative
    public synchronized long skip(long n) throws IOException;

    @NonNegative
    public synchronized int available() throws IOException;

    public synchronized void mark(int readlimit);

    public synchronized void reset() throws IOException;

    public boolean markSupported();

    public void close() throws IOException;
}

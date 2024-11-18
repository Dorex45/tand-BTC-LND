/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.crypto.tink.shaded.protobuf.O
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.util.List
 */
package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.A;
import com.google.crypto.tink.shaded.protobuf.O;
import java.util.List;

public class j0
extends RuntimeException {
    private final List d = null;

    public j0(O o2) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public A a() {
        return new A(this.getMessage());
    }
}


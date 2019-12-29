package com.jvm;

import java.nio.ByteBuffer;

public class DirectBufferMemory {
    public static void main(String[] args) {
        ByteBuffer allocate = ByteBuffer.allocate(1024);

        ByteBuffer.allocateDirect(1024 * 1024 * 6);
    }
}

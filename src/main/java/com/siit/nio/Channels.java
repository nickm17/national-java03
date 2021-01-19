package com.siit.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Channels {
    public static void main(String[] args) throws IOException {
        String first = "src/main/resources/text.txt";
        Path path = Paths.get(first);

        FileChannel channel = FileChannel.open(path);
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int bytesRead;

        while ((bytesRead = channel.read(buffer)) != -1) { // Reads a sequence of bytes from this channel into the given buffer
            System.out.println("bytes read: " + bytesRead);

            buffer.flip(); //make buffer ready to read
            byte[] bytesFromBuffer = new byte[bytesRead];
            buffer.get(bytesFromBuffer); //transfers bytes from this buffer into the given destination array

            System.out.println(new String(bytesFromBuffer, "UTF-8"));
            buffer.clear(); //make buffer ready for writing
        }
    }
}

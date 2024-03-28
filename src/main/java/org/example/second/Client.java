package org.example.second;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

// implement ServerSocket class
// Client side
public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6666);

            DataOutputStream d = new DataOutputStream(
                    socket.getOutputStream()
            );

            // Message to be displayed
            d.writeUTF("Hello world!");

            // Flushing out internal buffers
            // optimizing for better performance
            d.flush();

            // Closing the connections

            // Closing DataOutputStream
            d.close();
            // Closing socket
            socket.close();

        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}

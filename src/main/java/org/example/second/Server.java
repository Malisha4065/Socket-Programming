package org.example.second;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

// implement ServerSocket class
// Server side
public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);

            // establishing a connection
            Socket socket = ss.accept();

            // Invoking input stream via getInputStream()
            // method by creating DataInputStream class object
            DataInputStream dis = new DataInputStream(socket.getInputStream());

            String str = (String)dis.readUTF();

            // Display the string on the console
            System.out.println("message= " + str);

            // Lastly close the socket using standard close
            // method to release memory resources
            ss.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

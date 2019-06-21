// package l10;

import java.io.IOException;
import java.net.*;
import java.net.DatagramSocket;
import java.net.SocketException;

public class UDPServer {
    public static void main(String[] argv) {
        try {
            DatagramSocket socket = new DatagramSocket(2345);
            byte[] data = new byte[100];

            DatagramPacket packet = new DatagramPacket(data, data.length);

            System.out.println("Waiting for client messages...");
            socket.receive(packet);

            System.out.println("Message received from: " +
            packet.getAddress() + ":" + packet.getPort() +
                    ", length: " + packet.getLength());

            String msgFromClient = new String(packet.getData(), 0, packet.getLength());
            System.out.println("Message text from the client: " + msgFromClient);

        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

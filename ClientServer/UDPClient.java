// package l10;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class UDPClient {

    public static void main(String[] argv) {
        String clientMsg = "Hello from the client...";

        Scanner myObj = new Scanner(System.in);

        String fromClient = myObj.nextLine();

        byte[] data = fromClient.getBytes();

        try {
            DatagramPacket packet =
                new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 2345);

            DatagramSocket socket = new DatagramSocket();
            socket.send(packet);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

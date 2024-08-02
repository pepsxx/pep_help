package Example.T32_UDP_Client_Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class MainClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        String f1 = "%20s%s%n";
        String host = "localhost";
        int port = 4080;
        String stopCode = "End";

        InetAddress address = Inet4Address.getByName(host);
        System.out.printf(f1, "address = ", address);
        System.out.printf(f1, "port = ", port);

        try (DatagramSocket datagramSocket = new DatagramSocket()) {

            Scanner scanner = new Scanner(System.in);
            boolean asRun = true;
            while (asRun) {
                String request = scanner.nextLine();
                System.out.printf(f1, "request = ", request);

                byte[] bytes = request.getBytes();
                DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length, address, port);
                datagramSocket.send(datagramPacket);

                if (request.startsWith("stop")) {
                    System.out.printf(f1, "stopCode = ", stopCode);
                    asRun = false;
                }
            }
        }
    }
}

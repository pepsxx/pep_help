package Example.T32_UDP_Client_Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        String f1 = "%20s%s%n";
        int port = 4080;
        String stopCode = "End";

        try (DatagramSocket datagramSocket = new DatagramSocket(port)) {

            boolean asRun = true;
            while (asRun) {

                byte[] bytes = new byte[32];
                DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length);
                datagramSocket.receive(datagramPacket);
                String request = new String(datagramPacket.getData());
                System.out.printf(f1, "request = ", request);

                if (request.startsWith("stop")) {
                    System.out.printf(f1, "stopCode = ", stopCode);
                    asRun = false;
                }
            }

        }
    }
}

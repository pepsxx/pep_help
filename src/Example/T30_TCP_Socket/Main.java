package Example.T30_TCP_Socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        String f1 = "%20s%s%n";
        String host = "www.ya.ru";

        InetAddress[] addresses = Inet4Address.getAllByName(host);
        System.out.printf(f1, "addresses = ", Arrays.toString(addresses));

        InetAddress address = Inet4Address.getByName(host);
        System.out.printf(f1, "address = ", address);


        try (Socket socket = new Socket(address, 80);
             DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
             DataInputStream dataInputStream = new DataInputStream(socket.getInputStream())) {

            dataOutputStream.writeUTF("Test");
            byte[] response = dataInputStream.readAllBytes();
            System.out.printf(f1, "response.length = ", response.length);
            System.out.printf(f1, "response = ", Arrays.toString(response));
        }
    }
}

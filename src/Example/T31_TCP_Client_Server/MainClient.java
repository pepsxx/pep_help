package Example.T31_TCP_Client_Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class MainClient {
    public static void main(String[] args) throws IOException, InterruptedException {
        String f1 = "%20s%s%n";
        String host = "localhost";
        int port = 4080;
        String stopCode = "Server: Disconnected";

        InetAddress address = Inet4Address.getByName(host);
        System.out.printf(f1, "address = ", address);
        System.out.printf(f1, "port = ", port);

        try (Socket socket = new Socket(address, port);
             DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
             DataInputStream dataInputStream = new DataInputStream(socket.getInputStream())) {

            Scanner scanner = new Scanner(System.in);
            boolean asRun = true;
            while (asRun) {
                String request = scanner.nextLine();
                System.out.printf(f1, "request = ", request);
                dataOutputStream.writeUTF(request);

                String response = dataInputStream.readUTF();
                System.out.printf(f1, "response = ", response);

                if (response.equals(stopCode)) {
                    asRun = false;
                }
            }
        }
    }
}

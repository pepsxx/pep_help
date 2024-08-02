package Example.T31_TCP_Client_Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        String f1 = "%20s%s%n";
        int port = 4080;
        String stopCode = "Server: Disconnected";

        try (ServerSocket serverSocket = new ServerSocket(port);
             Socket accept = serverSocket.accept();
             DataOutputStream dataOutputStream = new DataOutputStream(accept.getOutputStream());
             DataInputStream dataInputStream = new DataInputStream(accept.getInputStream())) {

            boolean asRun = true;
            while (asRun) {
                String request = dataInputStream.readUTF();
                System.out.printf(f1, "request = ", request);

                String response = request + " Ok";
                if (request.equals("stop") || request.equals("s")) {
                    response = stopCode;
                    asRun = false;
                }

                dataOutputStream.writeUTF(response);
                System.out.printf(f1, "response = ", response);
            }

        }
    }
}

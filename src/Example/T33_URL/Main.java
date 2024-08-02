package Example.T33_URL;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        String f1 = "%30s: %s%n";
//        String host = "http://www.ya.ru";
        String host = "http://www.google.com";
        int port = 4080;
        String stopCode = "End";
        URL url = new URL(host);
        URLConnection urlConnection = url.openConnection();

        Map<String, List<String>> headerFields = urlConnection.getHeaderFields();
        for (Map.Entry<String, List<String>> entry : headerFields.entrySet()) {
            System.out.printf(f1, entry.getKey(), entry.getValue());
        }

        System.out.printf(f1, "----------", "----------");
//v1
//        InputStream inputStream1 = urlConnection.getInputStream();
//        byte[] bytes1 = inputStream1.readAllBytes();
//        System.out.printf(f1, "bytes1 = ", new String(bytes1));

//v2
        InputStream inputStream2 = (InputStream) urlConnection.getContent();
        byte[] bytes2 = inputStream2.readAllBytes();
        System.out.printf(f1, "bytes2 = ", new String(bytes2));

        System.out.printf(f1, "----------", "----------");

        System.out.println("urlConnection.getContentType() = " + urlConnection.getContentType());

    }
}

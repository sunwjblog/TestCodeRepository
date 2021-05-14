package netty20200803.httpurlconnection;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class HttpUrlConnectionTest {

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            new Thread(() -> {
               createConnection();
            });
        }
    }

    private static void createConnection() {
        URL url = null;
        try{
            url = new URL("192.168.27.38");
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.connect();
            TimeUnit.MINUTES.sleep(1);
            conn.disconnect();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

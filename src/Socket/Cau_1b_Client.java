package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Cau_1b_Client {
    public static class EchoChatClient {
        public final static String SERVER_IP = "127.0.0.1";
        public final static int SERVER_PORT = 7;

        public static void main(String[] args) throws IOException, InterruptedException {
            Socket socket = null;
            try {
                socket = new Socket(SERVER_IP, SERVER_PORT);
                System.out.println("Kết nối : " + socket);

                InputStream is = socket.getInputStream();
                OutputStream os = socket.getOutputStream();
                for (int i = '0'; i <= '9'; i++) {
                    os.write(i);
                    int ch = is.read();
                    System.out.print((char) ch + " ");
                    Thread.sleep(200);
                }
            } catch (IOException ie) {
                System.out.println("Không thể kết nôí đến server");
            } finally {
                if (socket != null) {
                    socket.close();
                }
            }
        }
    }
}

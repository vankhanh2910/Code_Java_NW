package Socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Cau_1a_Server {

    public final static int SERVER_PORT = 7;

    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = null;
        try {
            System.out.println("Vào cổng " + SERVER_PORT + ", vui lòng chờ ...");
            serverSocket = new ServerSocket(SERVER_PORT);
            System.out.println("Bắt đầu server : " + serverSocket);
            System.out.println("Đang đợi Client phản hồi ...");
            while (true) {
                try {
                    Socket socket = serverSocket.accept();
                    System.out.println("Client chấp nhận kết nối: " + socket);

                    OutputStream os = socket.getOutputStream();
                    InputStream is = socket.getInputStream();
                    int ch = 0;
                    while (true) {
                        ch = is.read();
                        if (ch == -1) {
                            break;
                        }
                        os.write(ch);
                    }
                    socket.close();
                } catch (IOException e) {
                    System.err.println(" Lỗi: " + e);
                }
            }
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            if (serverSocket != null) {
                serverSocket.close();
            }
        }
    }
}

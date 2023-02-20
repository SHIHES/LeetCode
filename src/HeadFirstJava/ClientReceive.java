package HeadFirstJava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class ClientReceive {

    public static void main(String[] args) {
        ClientReceive ss = new ClientReceive();
        ss.receive();
    }

    public void receive() {
        try {
            SocketAddress sa = new InetSocketAddress("127.0.0.1", 5000);
            SocketChannel socketChannel = SocketChannel.open(sa);

            Reader reader = Channels.newReader(socketChannel, StandardCharsets.UTF_8);

            BufferedReader bufferedReader = new BufferedReader(reader);

            while (bufferedReader.readLine() != null) {
                System.out.println(bufferedReader.readLine());
            }
        } catch (IOException ignored) {
            System.out.println(ignored);
        }
    }
}

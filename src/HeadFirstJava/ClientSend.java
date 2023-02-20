package HeadFirstJava;

import java.io.*;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.nio.channels.Channels;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;

public class ClientSend {

    public static void main(String[] args) {
        ClientSend cs = new ClientSend();
        cs.send();
    }
    public void send() {
        try {
            SocketAddress sa = new InetSocketAddress("127.0.0.1", 5000);
            SocketChannel socketChannel = SocketChannel.open(sa);

            Writer writer = Channels.newWriter(socketChannel, StandardCharsets.UTF_8);

            PrintWriter printWriter = new PrintWriter(writer);
            printWriter.println("message to send");
            printWriter.print("another message");

        } catch (IOException ignored) {
            System.out.println(ignored);
        }
    }



}

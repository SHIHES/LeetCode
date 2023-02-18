package HeadFirstJava;

import java.io.*;

public class Input {
    public Input() {

    }

    public static void main(String[] args) {
        try {
            File file = new File("headFirstJava");
            System.out.println(file.mkdir());
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.getCanonicalFile());

            FileInputStream fis = new FileInputStream("headFirstJava");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Output o1 = (Output) ois.readObject();
            Output o2 = (Output) ois.readObject();

            System.out.println(o1.toString());
            System.out.println(o2.toString());

            ois.close();

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

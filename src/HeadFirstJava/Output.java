package HeadFirstJava;

import java.io.*;

public class Output implements Serializable {
    int _random;

    public Output(int random) {
        _random = random;
    }

    @Override
    public String toString() {
        return String.format("%s %s",this.getClass().toString(),this._random);
    }

    public static void main(String[] args) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("headFirstJava");

            ObjectOutputStream oo = new ObjectOutputStream(fileOutputStream);

            Output d1 = new Output(10);
            Output d2 = new Output(20);

            oo.writeObject(d1);
            oo.writeObject(d2);

            oo.close();

        } catch (FileNotFoundException fe) {
            System.out.println("FileNotFoundException");
        } catch (IOException io) {
            System.out.println("IOException");
        }
    }
}

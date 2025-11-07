package LabSheet10;
import java.io.*;

public class code08 {
    public static void main(String[] args) {
        File bin = new File("data.bin");
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(bin))) {
            dos.writeInt(12345);
            dos.writeDouble(3.14159);
            dos.writeUTF("Hello");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (DataInputStream dis = new DataInputStream(new FileInputStream(bin))) {
            int i = dis.readInt();
            double d = dis.readDouble();
            String s = dis.readUTF();
            System.out.println("Read: " + i + ", " + d + ", " + s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

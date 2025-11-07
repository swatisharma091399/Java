package LabSheet10;
import java.io.*;

public class code15 {
    public static void main(String[] args) throws IOException {
        final PipedOutputStream pos = new PipedOutputStream();
        final PipedInputStream pis = new PipedInputStream(pos);

        Thread producer = new Thread(() -> {
            try (DataOutputStream dos = new DataOutputStream(pos)) {
                for (int i = 1; i <= 5; i++) {
                    dos.writeUTF("Msg-" + i);
                    Thread.sleep(100);
                }
            } catch (Exception e) { e.printStackTrace(); }
        });

        Thread consumer = new Thread(() -> {
            try (DataInputStream dis = new DataInputStream(pis)) {
                for (int i = 1; i <= 5; i++) {
                    String s = dis.readUTF();
                    System.out.println("Consumed: " + s);
                }
            } catch (IOException e) { e.printStackTrace(); }
        });

        producer.start();
        consumer.start();
    }
}

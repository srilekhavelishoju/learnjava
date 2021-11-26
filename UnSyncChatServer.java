package EdyodaPractice.Threads.ChatApplication;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UnSyncChatServer
{
    public static void main(String[] args)throws IOException,InterruptedException
    {
        DatagramSocket ss=new DatagramSocket(1234);
        InetAddress ip=InetAddress.getLocalHost();
        System.out.println("Running UnsynchronizedChatServer.java");
        System.out.println("Server is up.......");

        //create a sender thread
        Thread ssend;
        ssend = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Scanner sc = new Scanner(System.in);
                    while (true) {
                        synchronized (this) {
                            byte[] sd = new byte[1000];
                            //scan new msg to send
                            sd = sc.nextLine().getBytes();
                            DatagramPacket sp = new DatagramPacket(sd, sd.length, ip, 5334);
                            //send the new packet
                            ss.send(sp);
                            String msg = new String(sd);
                            System.out.println("Server says:" + msg);
                            //exit condition
                            if ((msg).equals("bye")) {
                                System.out.println("Server" + "Exiting");
                                break;
                            }
                            System.out.println("Waiting for" + "Client response");
                        }
                    }
                }catch (Exception e)
                {
                    System.out.println("Exception Occured");
                }
            }

        });

        //create a receiver thread
        Thread sreceive;
        sreceive=new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    while (true)
                    {
                        synchronized (this) {
                            byte[] rd = new byte[1000];
                            //receive new msg
                            DatagramPacket sp1 = new DatagramPacket(rd, rd.length);
                            ss.receive(sp1);
                            //convert byte data to string
                            String msg = (new String(rd)).trim();
                            System.out.println("Client (" + sp1.getPort() + "):" + " " + msg);
                            //exit condition
                            if (msg.equals("bye")) {
                                System.out.println("Client" + "Connection Closed");
                                break;
                            }
                        }
                    }
                }catch(Exception e)
                {
                    System.out.println("Exception Occured");
                }
            }
        });
        ssend.start();
        sreceive.start();
        ssend.join();
        sreceive.join();
    }
}

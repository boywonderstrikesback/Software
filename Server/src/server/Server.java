/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server;
import java.io.*;
import java.net.*;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
/**
 *
 * @author mikeross
 */
public class Server {
    /**
     * @param args the command line arguments
     */
 public static void main(String[] argv) throws Exception{
    // Create an unbound server socket
    ServerSocket serverSocket = new ServerSocket();
    // Create a socket address object
    InetSocketAddress endPoint = new InetSocketAddress("localhost", 12900);
    // Set the wait queue size to 100
    int waitQueueSize = 100;
    // Bind the server socket to localhost and at port 12900 with
    // a wait queue size of 100
    serverSocket.bind(endPoint, waitQueueSize);
    }
public static void handleClientRequest(Socket socket){
    try{
      BufferedReader socketReader = null;
      BufferedWriter socketWriter = null;
      socketReader = new BufferedReader(new InputStreamReader(
          socket.getInputStream()));
      socketWriter = new BufferedWriter(new OutputStreamWriter(
          socket.getOutputStream()));

      String inMsg = null;
      while ((inMsg = socketReader.readLine()) != null) {
        System.out.println("Received from  client: " + inMsg);

        String outMsg = inMsg;
        socketWriter.write(outMsg);
        socketWriter.write("\n");
        socketWriter.flush();
      }
      socket.close();
    }catch(Exception e){
      e.printStackTrace();
    }

  }
}

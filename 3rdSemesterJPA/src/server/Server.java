package server;

import com.sun.net.httpserver.HttpServer;
import handlers.CryptHandler;
import java.io.IOException;
import java.net.InetSocketAddress;


public class Server {
static int PORT = 4040;
static String ip = "localhost";

public void run() throws IOException{

   HttpServer server = HttpServer.create(new InetSocketAddress(ip, PORT), 0);
   server.createContext("/", new CryptHandler());
   server.start();
    System.out.println("Server started on port " + PORT);
}
   
    public static void main(String[] args) {
       if(args.length >= 2){
       PORT = Integer.parseInt(args[0]);
       ip = args[1];
       }
    }
    
}

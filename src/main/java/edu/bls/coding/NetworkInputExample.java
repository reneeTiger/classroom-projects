package edu.bls.coding;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NetworkInputExample {
    
    public static void main(String[] args) throws Exception {
    
        ExecutorService executor = Executors.newFixedThreadPool(5);
        
        ServerSocket socket = new ServerSocket(9999);
        while (true) {
            Socket session = socket.accept();
            executor.submit(new SessionHandler(session));
        }
        
    }
    
    
    private static class SessionHandler implements Runnable {
        
        private Socket session;
        
        public SessionHandler(Socket session) {
            
            this.session = session;
            
        }

        @Override
        public void run() {
            
            try {
                BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(session.getOutputStream()));
                writer.write("You are in a terrible scary dungeon.  A red and blue potion sit on a table.  Which one do you drink? \n> ");
                writer.flush();
                
                BufferedReader reader = new BufferedReader(new InputStreamReader(session.getInputStream()));
                
                String choice = reader.readLine();
                
                switch (choice.toLowerCase()) {
                    case "red":
                        writer.write("You are destroyed by your folly.\n");
                        break;
                    case "blue":
                        writer.write("You turn into a majestic dragon, to be feared and admired by all.\n");
                        break;
                    default:
                        writer.write("You've wasted your turn with jokes or indecision.\n");
                }
                writer.flush();
                
                session.close();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        
        
        
    }

}

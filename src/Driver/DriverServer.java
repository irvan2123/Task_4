/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Driver;

import java.io.IOException;
import consoleApp.ConnectionThread;
import javaChat.ServerConnection;

/**
 *
 * @author IRFAN
 */
public class DriverServer {
    public static void main(String[] args) {
        try {
            ServerConnection server = new ServerConnection();
            System.out.println("Server information : ");
            System.out.println(server.getServerInformation());
            while(true){
                ConnectionThread connection = new ConnectionThread(server.getClient());
                connection.run();
            }
        } catch (IOException e) {
            System.out.println("error");
        }
    }
}
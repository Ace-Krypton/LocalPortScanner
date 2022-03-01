import java.io.IOException;
import java.net.ServerSocket;

public class LocalPortScanner {
    public static void main(String[] args) throws IOException {
        int port = 1;   //Starts with 1

        while (port <= 65535) { //Ends with 65535
            //Checks if it is used or not
            try {
                ServerSocket server = new ServerSocket(port);
            } catch (IOException e) {   //For the used ports it gives us this message
                System.out.println("Port is already been used for other application");
                e.printStackTrace();
            }
            port++; //Everytime we are increasing the value of the port by 1
        }
    }
}

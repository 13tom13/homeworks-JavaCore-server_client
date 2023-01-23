import java.io.*;
import java.lang.reflect.WildcardType;
import java.net.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String host = "netology.homework";
        int port = 8950;

        try (Socket clientSocket = new Socket(host, port);
             PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
             BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()))) {
            String message;
            String question;
            while (true){
                question = in.readLine();
                System.out.println(question);
                if (question.startsWith("Congratulations!")) {
                    break;
                }
                message = scanner.nextLine();;
                out.println(message);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}

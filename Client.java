import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;
import java.net.Socket;


class Client{
    public static void main(String[] args) {
        try{
            //make a socket connection
            Socket s = new Socket("127.0.0.1", 4242);
            //make a stream reader with the socket
            InputStreamReader streamReader = new InputStreamReader(s.getInputStream());
            //make a buffered reader with the stream reader
            BufferedReader reader = new BufferedReader(streamReader);
            //read a line from the buffered reader
            String advice = reader.readLine();
            System.out.println("Today you should: " + advice);
            //close the reader
            reader.close();
            } catch (IOException ex){
                System.out.println(ex);
            }
    }
    
}
    
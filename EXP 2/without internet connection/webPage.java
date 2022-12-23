import javax.swing.JEditorPane;
import java.net.URL;
import javax.swing.JFrame;
import java.util.Scanner;

public class webPage extends JFrame {
    void fetch(){
        try{
            String html = "<html><head><title>Web Page</title></head>";

            html = html + "<body align='center'><h1>Hellow @ AJP Lab</h1></body>";

            html = html + "</html>";

            JEditorPane jep = new JEditorPane("text/html",html);

            add(jep); setVisible(true); setSize(500,500);
            setDefaultCloseOperation(EXIT_ON_CLOSE);

        }
        catch(Exception e){
            System.out.println("Exception Occured!");
        }
    }

    public static void main(String... args) throws Exception{
        new webPage().fetch();
    }
}

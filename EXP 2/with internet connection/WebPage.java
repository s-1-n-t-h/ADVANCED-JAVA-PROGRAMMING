import javax.swing.JEditorPane;
import java.net.URL;
import javax.swing.JFrame;
import java.util.Scanner;

public class WebPage extends JFrame{

    void fetch(String webSite){

        try{

            URL url = new URL(webSite);
            JEditorPane jep = new JEditorPane(url);
            add(jep);
            setVisible(true);
            setSize(600,600);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
        }
        catch(Exception e){
            System.out.println("Exception Occured");
        }

    }
    public static void main(String... args) throws Exception{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a webiste URL: ");
        String webSite = sc.nextLine();
        new WebPage().fetch(webSite);
    }
}

import java.io.File;
import java.util.Date;

/**
 * Created by KPS on 7/22/2020.
 */
public class Main {
    public static void main(String[] args) {
        File path = new File("d:\\emlpoyee.txt");
        Date date=new Date(path.lastModified());
        System.out.println("\nThe file was last modified on: "+date+"\n");
    }    
}

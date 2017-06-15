import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.SAXException;

/**
 * Class of ${CLASS}.
 *
 * @author Siarhei Tuzhyk.
 * @version 1.0
 * @since 01.06.2017.
 */
public class Main {

    public static void main(String[] args)
        throws ParserConfigurationException, SAXException, IOException {
       /* SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        SAXParser parser = saxParserFactory.newSAXParser();
        MySaxParser mySaxParser = new MySaxParser();
        parser.parse(new File("/test.xml"), mySaxParser);
        List<Car> cars = mySaxParser.getCarList();
        System.out.println("Cars: ");
        for (Car car : cars) {
            System.out.println(car.toString());
        }
        */
        /*
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            Object objectSave = new Integer(1);
            ObjectOutputStream oos = new ObjectOutputStream(os);
            oos.writeObject(objectSave);
            byte[] bytes = os.toByteArray();
            for (byte aByte : bytes) {
                System.out.println((char)aByte);
            }
            System.out.println();

            ByteArrayInputStream is = new ByteArrayInputStream(bytes);
            ObjectInputStream ois = new ObjectInputStream(is);
            Object objectRead = ois.readObject();
            System.out.println(objectRead.toString());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        */
        String string = new String("hello my friend and m mother");
        String[] strings = string.split(" ");
        String buff="";
        for (int i=0;i<strings.length;i++){
            for(int j=i+1;j<strings.length;j++){
                if(strings[i].length()<strings[j].length()){
                    buff = strings[j];
                    strings[j]=strings[i];
                    strings[i]=buff;
                }
            }
        }
        for (String s : strings) {
            System.out.println(s);
        }

        Arrays.sort(strings, new Comparator<String>(){
            public int compare(String s1, String s2){
                return s1.length()-s2.length();
            }
        });
        for (String s : strings) {
            System.out.println(s);
        }
    }
}

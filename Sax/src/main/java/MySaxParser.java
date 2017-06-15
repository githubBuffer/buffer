import java.util.ArrayList;
import java.util.List;
import org.xml.sax.helpers.DefaultHandler;
import org.xml.sax.*;

/**
 * Class of ${CLASS}.
 *
 * @author Siarhei Tuzhyk.
 * @version 1.0
 * @since 01.06.2017.
 */
public class MySaxParser extends DefaultHandler {

    private List<Car> carList = new ArrayList<Car>();
    private Car car;
    private boolean name = false;
    private boolean model = false;
    private boolean description = false;
    private boolean price = false;

    public List<Car> getCarList(){
        return this.carList;
    }

    public void startDocument() throws SAXException {
        System.out.println("Start to read XML-file!");
    }

    public void endDocument() throws SAXException {
        System.out.println("End to read XML-file!");
    }

    public void startElement(String uri, String localName,
        String qName, Attributes attributes) throws SAXException {
        System.out.println("Start to read element!");
        if (qName.equals("Car")) {
            String id = attributes.getValue("id");
            car = new Car();
            car.setId(id);
        } else if (qName.equals("name")) {
            name = true;
        } else if (qName.equals("model")) {
            model = true;
        } else if (qName.equals("description")) {
            description = true;
        } else if (qName.equals("price")) {
            price = true;
        }
    }

    public void endElement(String uri, String localName, String qName)
        throws SAXException {
        if (qName.equals("Car")) {
            carList.add(car);
        }
        System.out.println("End to read element!");
    }

    public void characters(char ch[], int start, int length) throws SAXException {
        System.out.println("Start to read attribute!");
        if (name) {
            car.setName(new String(ch, start, length));
            name = false;
        } else if (model) {
            car.setModel(new String(ch, start, length));
            model = false;
        } else if (description) {
            car.setDescription(new String(ch, start, length));
            description = false;
        } else if (price) {
            car.setPrice(Integer.parseInt(new String(ch, start, length)));
            price = false;
        }
        System.out.println("End to read attribute!");
    }
}

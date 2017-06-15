/**
 * Class of ${CLASS}.
 *
 * @author Siarhei Tuzhyk.
 * @version 1.0
 * @since 01.06.2017.
 */
public class Car {

    private String id;
    private String name;
    private String model;
    private String description;
    private Integer price;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String toString() {
        return "Car " + this.getName() + ";\n"
            + "Model " + this.getModel() + ";\n"
            + "Price " + this.getPrice() + ";\n"
            + "Description " + this.getDescription() + ";";
    }
}

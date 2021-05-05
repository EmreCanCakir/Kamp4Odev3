package Entity;

public class Game{
    private int id;
    private int price;
    private String name;
    private String catagory;

    public Game (int id, int price, String name, String catagory){
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.setCatagory(catagory);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCatagory() {
        return catagory;
    }

    public void setCatagory(String catagory) {
        this.catagory = catagory;
    }
}

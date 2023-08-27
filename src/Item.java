public class Item {
    private int id = 0;
    private String title = "";
    private  int quantity = 0;
    private Type type;
    private double price = 0;
    private String authorName = "";
    private String language = "";
    private String style = "";
    private int size = 0;
    private String color = "";
    private String releaseDate = "";
    private String companyName = "";

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    private double rating = 0;


    void setId(int value){
        id = value;
    }

    int getId(){
        return id;
    }

    void setTitle(String value){
        title = value;
    }
    String getTitle(){
        return  title;
    }
    void setType(Type value){
        type = value;
    }
    Type getType(){
        return  type;
    }
    void setQuantity(int value){
        quantity = value;
    }
    int getQuantity(){
        return  quantity;
    }
    void setPrice(double value){
        price = value;
    }
    double getPrice(){
        return  price;
    }

}

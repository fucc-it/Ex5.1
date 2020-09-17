public abstract class Dish {

    protected String color;
    protected String stuff;


    public void setStuff(String stuff) {this.stuff = stuff;}
    public void setColor(String color) {this.color = color;}


    public String getStuff() {return stuff;}
    public String getColor() {return color;}

    @Override
    public String toString() {
        return "Dish{color='" + color + '\'' +
                ", stuff='" + stuff + '\'' +
                '}';
    }
}

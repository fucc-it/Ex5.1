public class someDish extends Dish {
    //вилка
    private int num;

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    //тарелки, кружки
    private String draw;

    public void setDraw(String draw) {
        this.draw = draw;
    }
    public String getDraw() {
        return draw;
    }
}

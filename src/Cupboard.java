import java.util.Scanner;

public class Cupboard{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        someDish dish1 = new someDish();

        System.out.println("Опишите тарелку:");
        System.out.println("Материал:");
        dish1.setStuff(in.nextLine());
        System.out.println("Цвет:");
        dish1.setColor(in.nextLine());
        System.out.println("Рисунок:");
        dish1.setDraw(in.nextLine());

        System.out.println("Ваше описание тарелки: ");
        System.out.println(dish1.getStuff() + " " + dish1.getColor() + " " + dish1.getDraw());

        someDish dish2 = new someDish();

        System.out.println("Опишите вилку:");
        System.out.println("Материал:");
        dish2.setStuff(in.nextLine());
        System.out.println("Цвет:");
        dish2.setColor(in.nextLine());
        System.out.println("Зубцы:");
        dish2.setNum(in.nextInt());

        System.out.println("Ваше описание вилки: ");
        System.out.println(dish2.getStuff() + " " + dish2.getColor() + " " + dish2.getNum());
         }
         // и т.д
    }


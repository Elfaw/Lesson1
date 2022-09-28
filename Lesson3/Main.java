package Lesson3;

public class Main {
    public static void main(String[] args) {
        Apple[] apples=new Apple[5];
        apples[0]= new Apple();
        apples[1]= new Apple();
        apples[2]= new Apple();
        apples[3]= new Apple();
        apples[4]= new Apple();
        Box<Apple> boxApple = new Box<>(apples);
        System.out.println(boxApple.getWeight());
        Orange[] oranges= new Orange[5];
        oranges[0]= new Orange();
        oranges[1]= new Orange();
        oranges[2]= new Orange();
        oranges[3]= new Orange();
        oranges[4]= new Orange();
        Box<Orange> boxOrange= new Box<>(oranges);
        System.out.println(boxOrange.getWeight());
        System.out.println(boxOrange.compare(boxApple));
        Apple[] apples2=new Apple[5];
        Box<Apple> boxApple2 = new Box<>(apples2);
        boxApple2.toEmptyArray(boxApple);
    }
}

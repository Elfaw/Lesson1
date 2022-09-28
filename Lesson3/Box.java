package Lesson3;

public class Box<T extends Fruit> {
    T[] fruitArray;
    public Box(T[]fruitArray){
        this.fruitArray=fruitArray;
    }
    public Float getWeight(){
        Float result =0.0f;
        for (T t: fruitArray)
            if(t!=null){
                Float value= t.getWeight();
                result+=value;
            }
        return result;
    }
    public boolean compare(Box<? extends Fruit> another){
        return (this.getWeight() == another.getWeight());
    }
    public void toEmptyArray(Box<T> tBox){
        System.out.println("В новой коробке: "+ this.getWeight());
        System.out.println("В старой коробке: "+ tBox.getWeight());
        for(int i = 0; i<tBox.fruitArray.length;i++){
            if(tBox.fruitArray[i]!=null) {
                this.fruitArray[getSize()] = tBox.fruitArray[i];
                tBox.fruitArray[i] = null;
            }
        }
        System.out.println("В новой коробке: "+ this.getWeight());
        System.out.println("В старой коробке: "+ tBox.getWeight());
    }
    private int getSize(){
        int result = 0;
        for(T t: fruitArray){
            if(t!=null)result++;
        }
        return result;
    }
}

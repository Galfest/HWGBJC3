package HW1;

import java.util.ArrayList;
import java.util.List;

public class Box<B extends Fruit> {
    private List<B> fruits;


    public Box(List<B> fruits){
        this.fruits = new ArrayList<>(fruits);
   }

   public void adding(B fruits){
        this.fruits.add(fruits);
   }

   public float getWeight(){
        float weight = 0f;
        for (B fruit : fruits){
            weight += fruit.getWeight();
        }
        return weight;
   }

   public boolean Weight(Box<?> another){
        return Math.abs(getWeight() - another.getWeight()) < 0.0001f;
   }

   public void tranfer(Box<? super B> another){
        if(this == another) return;
        another.fruits.addAll(fruits);
        fruits.clear();
   }

   public List<B> getFruits(){
        return fruits;
   }



}

import java.util.ArrayList;
import java.util.List;

public class Box <T>{
    private List<T> list = new ArrayList<>();

    public Box() {
    }
    public void addBox(T t){
        list.add(t);
    }
    public float getWeight(){
        float weight = 0;
        for (int i = 0; i < list.size(); i++) {
            weight += weight;

        }
        return weight;
    }
    public void boxInfo(){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public void addFruit(T anotherBox<T>){
        
    }
    float getWeight() {
        if (list.isEmpty()) {
            return 0;
        } else {
            return list.size() * list.get(0).getWeight();
        }
    }

}

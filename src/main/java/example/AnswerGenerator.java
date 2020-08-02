package example;


import java.util.LinkedList;
import java.util.List;

public class AnswerGenerator {
    public int[] generate() {
        List list = new LinkedList();
        int[] data = new int[4];
        int count =0;
        while(count <4){
            int random=(int)(Math.random()*10);
            if(!list.contains(random)){
                data[count]=random;
                list.add(random);
                count++;
            }
        }


        return data;

    }
}

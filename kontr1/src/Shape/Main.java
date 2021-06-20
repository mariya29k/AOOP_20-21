package Shape;

public class Main {

    public static void main(String[] args) {
       double sum = 0;
       for (double d=0; d<10; sum += sum + d){
           d+= 0.1;
       }
    }


}

public class Car {
    int howlong =0;
    public void start(){
        System.out.printf("Стартую\n");
    }
    public void stop(){
        System.out.printf("Стопаюсь\n");
    }
    public int drive(int howlong){
        int distance;
        distance = howlong * 60;
        return distance;
    }
}

public class CarOwner {
    public static void main(String[] args) {
        Car mycar = new Car();
        mycar.start();
        mycar.stop();
        int zina = mycar.drive(5);
        System.out.println("Я проехал "+zina+" "+"км");
        JamesBondCar jcar = new JamesBondCar();
        int psina = jcar.drive(5);
        System.out.println(psina);
    }
}

package poly.car0;

public class CarMain0 {

    public static void main(String[] args) {
        Driver dirver = new Driver();
        K3Car k3Car = new K3Car();
        dirver.serK3Car(k3Car);
        dirver.drive();

        // 추가
        Model3Car model3Car = new Model3Car();
        dirver.serK3Car(null);
        dirver.setModel3Car(model3Car);
        dirver.drive();
    }
}

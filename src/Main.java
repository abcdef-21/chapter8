public class Main {
    public static void main(String[] args) {
        Hero h =new Hero();
        Matango m1 = new Matango();
        h.name = "KSG";
        h.hp =100;

        m1.name ="めるちゃむ";
        m1.hp =50;
        m1.suffix ='T';

        Matango m2 = new Matango();
        m2.hp =48;
        m2.suffix = 'B';
        h.sit(20);
        h.slip();
        m1.slip();
        m1.run();
        h.run();
    }
}


public class Main {
    public static void main(String[] args) {
       /* Sword s = new Sword();
        s.name = "炎の剣";
        s.damage = 10;*/

        Hero h1 =new Hero( "KSG");
        //h1.name = "KSG";
        System.out.println(h1.name);
        System.out.println(h1.hp);

        /*h1.sword = s;
        System.out.println("現在の武器は"+ h1.sword.name);*/

        /*Hero h2 =new Hero();
        h2.name ="めるちゃむ";
        h2.hp =50;

        Wizard w = new Wizard();
        w.name ="アナ";
        w.hp = 50;

        w.heal(h1);
        w.heal(h1);
        w.heal(h2);*/
    }
    /*public static void main(String[] args){
        Hero h1;
        h1 = new Hero();
        h1.hp = 100;
        Hero h2 = h1;
        h2.hp = 200;
        System.out.println(h1.hp);
    }*/
}


public class Matango {
    int hp;
    String name;
    final int level = 10;
    char suffix;
    public void run(){
        System.out.println("はい、やめます！");
        System.out.println(this.name+"は逃げ出した！");
    }
    public void slip(){
        this.hp-=50;
        System.out.println(this.name+"は、転んだ！");
        System.out.println("50のダメージ！");
    }
}

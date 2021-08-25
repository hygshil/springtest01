package springzuoye3;

public class Keyboard {
    private Cpu cpu;
    public Keyboard(){
        System.out.println("键盘");
    }
    public Keyboard(Cpu cpu){
        this.cpu=cpu;
    }

    public  void  play(){
        System.out.println("键盘玩");
        cpu.game();
    }
}

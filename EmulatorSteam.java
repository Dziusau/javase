public class EmulatorSteam {
    public static void main (String[] args){
        init();
    }

    static void init(){
        Steam emulator = new Steam();
        emulator.Sell(0);
        emulator.Sell(3);
        emulator.Sell(7);
        emulator.Sell(8);
    }
}

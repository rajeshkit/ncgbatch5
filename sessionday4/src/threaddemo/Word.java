package threaddemo;

public class Word {
    public static void main(String[] args) {
        WordTyping wt=new WordTyping();
        wt.start();
        SpellCheck sp=new SpellCheck();
        sp.start();
        AutoSave as=new AutoSave();
        as.start();
    }
}

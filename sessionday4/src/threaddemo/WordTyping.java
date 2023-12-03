package threaddemo;

public class WordTyping extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 15 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Word Typing: " +i);
        }
    }
}

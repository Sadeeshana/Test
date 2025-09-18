import javax.swing.*;

public class Main extends JFrame {
    public static void main(String[] args) {
            Main frame = new Main();
    }
    public Main(){
        super("Test file");
        setVisible(true);
        setSize(800,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JFrame fr = new JFrame();
        panel.add(fr);


    }

}

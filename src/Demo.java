import javax.swing.*;
import javax.xml.bind.SchemaOutputResolver;

public class Demo {
    public static void main(String[] args) {
        JFrame game = new JFrame();

        game.setTitle("2048");
        game.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        game.setSize(450, 500);
        game.setResizable(false);

        /* game.add(controller.getView());*/


        game.setLocationRelativeTo(null);
        game.setVisible(true);

    }

    public static int resetLowerBits(int number) {
        String str = Integer.toBinaryString(number);
        int x = str.length();
        StringBuffer buffer = new StringBuffer();
        buffer.append("1");
        for(int i = 1; i < x; i++){
            buffer.append("0");
        }
        return Integer.parseInt(buffer.toString(), 2);
    }

    public static int maxPowerOf2(int x) {
        x |= x >> 1;
        x |= x >> 2;
        x |= x >> 4;
        x &= ~x >> 1;
        return x;
    }
}
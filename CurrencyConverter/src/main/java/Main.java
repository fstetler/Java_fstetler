import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static String connectToApi() {
        URL url = null;
        try {
            url = new URL("http://data.fixer.io/api/latest?access_key=119fe8fd6d661e9503632e6624a596d2&format=1");
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

        try (InputStream input = url.openStream()) {
            InputStreamReader isr = new InputStreamReader(input);
            BufferedReader reader = new BufferedReader(isr);
            StringBuilder json = new StringBuilder();
            int c;
            while ((c = reader.read()) != -1) {
                json.append((char) c);
            }
            System.out.println(json);
            return json.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String [] args) {
        System.out.println(connectToApi());
        JFrame frame = new JFrame();
        JButton button1 = new JButton();
        JComboBox<String> comboBox1 = new JComboBox<>();
        JLabel label1 = new JLabel("Amount: ");
        JLabel label2 = new JLabel();
        JTextField textField1 = new JTextField();
        JTextField textField2 =  new JTextField();
        JComboBox<String> comboBox2 = new JComboBox<>();

        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(1000, 500);
        button1.setBounds(130, 100, 100, 40);
        comboBox1.setBounds(550, 200, 100, 40);
        label1.setBounds(300, 200, 100, 40);
        textField1.setBounds(450, 200, 100, 40);
        comboBox2.setBounds(550, 200, 100, 40);
        label2.setBounds(650, 200, 100, 40);
        comboBox2.setBounds(750, 200, 100, 40);


        frame.add(comboBox1);
        frame.add(label1);
        frame.add(textField1);
        frame.add(label2);
        frame.add(comboBox2);

        label1.setVisible(true);


    }



}

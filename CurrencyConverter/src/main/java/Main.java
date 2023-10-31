import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static String connectToApi() {
        try {
            URL url = new URL("http://data.fixer.io/api/latest?access_key=119fe8fd6d661e9503632e6624a596d2&format=1");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String line;
                StringBuilder response = new StringBuilder();

                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
                reader.close();

                ObjectMapper objectMapper = new ObjectMapper();

                JsonNode jsonNode = objectMapper.readTree(response.toString());

                System.out.println(jsonNode.get("rates").get("AED"));

                connection.disconnect();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "hey";

    }

    public static void main(String [] args) {

        System.out.println(connectToApi());

        //        System.out.println(connectToApi());
//        JFrame frame = new JFrame();
//        JButton button1 = new JButton();
//        JComboBox<String> comboBox1 = new JComboBox<>();
//        JLabel label1 = new JLabel("Amount: ");
//        JLabel label2 = new JLabel();
//        JTextField textField1 = new JTextField();
//        JTextField textField2 =  new JTextField();
//        JComboBox<String> comboBox2 = new JComboBox<>();
//
//        frame.setLayout(null);
//        frame.setVisible(true);
//        frame.setSize(1000, 500);
//        button1.setBounds(130, 100, 100, 40);
//        comboBox1.setBounds(550, 200, 100, 40);
//        label1.setBounds(300, 200, 100, 40);
//        textField1.setBounds(450, 200, 100, 40);
//        comboBox2.setBounds(550, 200, 100, 40);
//        label2.setBounds(650, 200, 100, 40);
//        comboBox2.setBounds(750, 200, 100, 40);
//
//
//        frame.add(comboBox1);
//        frame.add(label1);
//        frame.add(textField1);
//        frame.add(label2);
//        frame.add(comboBox2);
//
//        label1.setVisible(true);


    }



}

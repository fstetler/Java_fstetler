import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public class Main {

    static int numberOfCurrencies;
    static JsonNode jsonNode;
    static List<String> listOfCurrencies;


    public static String currencyExchangeFromUSD(String currency) {
        return jsonNode.get("data").get(currency).toString();
    }

    public static List<String> getListOfCurrencies() {
        List<String> jsonNodeList = new ArrayList<>();

        for (Iterator<String> it = jsonNode.get("data").fieldNames(); it.hasNext(); ) {
            jsonNodeList.add(it.next());
        }

        return jsonNodeList;
    }

    public static void main(String [] args) {

        jsonNode = getJsonNode();
        listOfCurrencies = getListOfCurrencies();
        numberOfCurrencies = getListOfCurrencies().size();

        JLabel amountLabel = new JLabel("Amount: ");
        amountLabel.setBounds(300, 200, 100, 40);

        JTextField inTextField = new JTextField();
        inTextField.setBounds(450, 200, 100, 40);

        JComboBox<String> fromCurrencyCombobox = new JComboBox<>();
        fromCurrencyCombobox.setBounds(550, 200, 100, 40);
        for (int i = 0; i < numberOfCurrencies; i++) {
            fromCurrencyCombobox.addItem(listOfCurrencies.get(i));
        }

        JLabel convertedAmountLabel = new JLabel();
        convertedAmountLabel.setBounds(650, 200, 100, 40);

        JComboBox<String> toCurrencyCombobox = new JComboBox<>();
        toCurrencyCombobox.setBounds(750, 200, 100, 40);
        for (int i = 0; i < numberOfCurrencies; i++) {
            toCurrencyCombobox.addItem(listOfCurrencies.get(i));
        }

        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(850, 200, 100, 40);
        convertButton.addActionListener(e -> {

            String currencyInType = Objects.requireNonNull(fromCurrencyCombobox.getSelectedItem()).toString();
            String currencyOutType = Objects.requireNonNull(toCurrencyCombobox.getSelectedItem()).toString();

            double currencyInConvertValue = Double.parseDouble(currencyExchangeFromUSD(currencyInType));
            double currencyOutConvertValue = Double.parseDouble(currencyExchangeFromUSD(currencyOutType));

            double valueInTextfield = Double.parseDouble(inTextField.getText());

            convertedAmountLabel.setText(String.valueOf(valueInTextfield/currencyInConvertValue*currencyOutConvertValue));
            convertedAmountLabel.validate();

        });

        JFrame frame = new JFrame();
        frame.setSize(1000, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.add(fromCurrencyCombobox);
        frame.add(amountLabel);
        frame.add(inTextField);
        frame.add(convertedAmountLabel);
        frame.add(toCurrencyCombobox);
        frame.add(convertButton);



        amountLabel.setVisible(true);

    }

    public static JsonNode getJsonNode() {
        try {

            URL url = new URL("https://api.freecurrencyapi.com/v1/latest?apikey=fca_live_fnuqgMqt3xhbpkxPPoXKVMBN7DyNNJVzklDM4awC");
//            URL url = new URL("http://data.fixer.io/api/latest?access_key=119fe8fd6d661e9503632e6624a596d2&format=1");
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
                jsonNode = objectMapper.readTree(response.toString());
                connection.disconnect();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jsonNode;
    }
}

public class BackEnd {

    String stringValue = "";
    Character operator = '+';
    Integer totalValue = 0;
    String stringValueIndividual = "";

    public void addActionListeners() {

        Main.frontEnd.oneButton.addActionListener(e -> {
            stringValue += "1";
            Main.frontEnd.stringOutputField.setText(stringValue);
        });

        Main.frontEnd.twoButton.addActionListener(e -> {
            stringValue += "2";
            Main.frontEnd.stringOutputField.setText(stringValue);
        });

        Main.frontEnd.threeButton.addActionListener(e -> {
            stringValue += "3";
            Main.frontEnd.stringOutputField.setText(stringValue);
        });

        Main.frontEnd.fourButton.addActionListener(e -> {
            stringValue += "4";
            Main.frontEnd.stringOutputField.setText(stringValue);
        });

        Main.frontEnd.fiveButton.addActionListener(e -> {
            stringValue += "5";
            Main.frontEnd.stringOutputField.setText(stringValue);
        });

        Main.frontEnd.sixButton.addActionListener(e -> {
            stringValue += "6";
            Main.frontEnd.stringOutputField.setText(stringValue);
        });

        Main.frontEnd.sevenButton.addActionListener(e -> {
            stringValue += "7";
            Main.frontEnd.stringOutputField.setText(stringValue);
        });

        Main.frontEnd.eightButton.addActionListener(e -> {
            stringValue += "8";
            Main.frontEnd.stringOutputField.setText(stringValue);
        });

        Main.frontEnd.nineButton.addActionListener(e -> {
            stringValue += "9";
            Main.frontEnd.stringOutputField.setText(stringValue);
        });

        Main.frontEnd.zeroButton.addActionListener(e -> {
            stringValue += "0";
            Main.frontEnd.stringOutputField.setText(stringValue);
        });

        Main.frontEnd.plusButton.addActionListener(e -> {
            stringValue += "+";
            Main.frontEnd.stringOutputField.setText(stringValue);
        });

        Main.frontEnd.minusButton.addActionListener(e -> {
            stringValue += "-";
            Main.frontEnd.stringOutputField.setText(stringValue);
        });

        Main.frontEnd.timesButton.addActionListener(e -> {
            stringValue += "*";
            Main.frontEnd.stringOutputField.setText(stringValue);
        });

        Main.frontEnd.divideButton.addActionListener(e -> {
            stringValue += "/";
            Main.frontEnd.stringOutputField.setText(stringValue);
        });

        Main.frontEnd.clearButton.addActionListener(e -> {
            stringValue = "";
            totalValue = 0;
            stringValueIndividual = "";
            operator = '+';
            Main.frontEnd.stringOutputField.setText(stringValue);
            Main.frontEnd.sumField.setText("");
        });

        Main.frontEnd.closeButton.addActionListener(e -> System.exit(0));

        Main.frontEnd.sumButton.addActionListener(e -> {
            for (int i = 0; i < stringValue.length(); i++) {
                if (stringValue.charAt(i) != '+' && stringValue.charAt(i) != '-' && stringValue.charAt(i) != '/' && stringValue.charAt(i) != '*' ) {
                    stringValueIndividual += stringValue.charAt(i);
                } else {
                    sumWithOperator();
                    stringValueIndividual = "";
                    operator = stringValue.charAt(i);
                }
            }
            sumWithOperator();
            Main.frontEnd.sumField.setText(String.valueOf(totalValue));
        });
    }

    private void sumWithOperator() {
        if (operator == '+') {
            totalValue += Integer.parseInt(stringValueIndividual);
        } else if (operator == '-') {
            totalValue -= Integer.parseInt(stringValueIndividual);
        } else if (operator == '*') {
            totalValue *= Integer.parseInt(stringValueIndividual);
        } else if (operator == '/') {
            totalValue /= Integer.parseInt(stringValueIndividual);
        }
    }
}

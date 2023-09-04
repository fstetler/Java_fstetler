import java.awt.*;

public class FrontEnd {
    Frame frame = new Frame("Calculator");
    final TextField sumField = new TextField();
    final TextField stringOutputField = new TextField();
    Button oneButton = new Button("1");
    Button twoButton = new Button("2");
    Button threeButton = new Button("3");
    Button fourButton = new Button("4");
    Button fiveButton = new Button("5");
    Button sixButton = new Button("6");
    Button sevenButton = new Button("7");
    Button eightButton = new Button("8");
    Button nineButton = new Button("9");
    Button zeroButton = new Button("0");

    Button plusButton = new Button("+");
    Button minusButton = new Button("-");
    Button timesButton = new Button("*");
    Button divideButton = new Button("/");
    Button sumButton = new Button("=");
    Button clearButton = new Button("Clear");
    Button closeButton = new Button("Close");

    public void initialize() {
        sumField.setBounds(50, 50, 150, 20);
        stringOutputField.setBounds(50, 90, 150, 20);

        setBoundsOnButtons();
        addButtonsToFrame();

        frame.add(sumField);
        frame.add(stringOutputField);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
    }

    private void addButtonsToFrame() {
        frame.add(oneButton);
        frame.add(twoButton);
        frame.add(threeButton);
        frame.add(fourButton);
        frame.add(fiveButton);
        frame.add(sixButton);
        frame.add(sevenButton);
        frame.add(eightButton);
        frame.add(nineButton);
        frame.add(zeroButton);

        frame.add(plusButton);
        frame.add(minusButton);
        frame.add(divideButton);
        frame.add(timesButton);
        frame.add(sumButton);
        frame.add(clearButton);
        frame.add(closeButton);
    }

    private void setBoundsOnButtons() {
        oneButton.setBounds(50, 270, 50, 50);
        twoButton.setBounds(120, 270, 50, 50);
        threeButton.setBounds(190, 270, 50, 50);
        fourButton.setBounds(50, 200, 50, 50);
        fiveButton.setBounds(120, 200, 50, 50);
        sixButton.setBounds(190, 200, 50, 50);
        sevenButton.setBounds(50, 130, 50, 50);
        eightButton.setBounds(120, 130, 50, 50);
        nineButton.setBounds(190, 130, 50, 50);
        zeroButton.setBounds(50, 340, 50, 50);

        plusButton.setBounds(260, 270, 50, 50);
        minusButton.setBounds(260, 200, 50, 50);
        timesButton.setBounds(260, 130, 50, 50);
        divideButton.setBounds(330, 200, 50, 50);
        clearButton.setBounds(330, 340, 50, 50);
        closeButton.setBounds(260, 340, 50, 50);

        sumButton.setBounds(330, 270, 50, 50);
    }
}

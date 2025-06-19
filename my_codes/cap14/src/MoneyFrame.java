import javax.swing.*;
import javax.swing.text.LabelView;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;

class MoneyFrame extends JFrame implements KeyListener, ItemListener, MouseListener {
    private static final long serialVersionUID = 1L;

    JLabel fromCurrencyLabel = new JLabel(" ");
    JTextField textField = new JTextField(5);
    JLabel label = new JLabel("     ");
    JComboBox combo = new JComboBox();

    NumberFormat currencyDolar = NumberFormat.getCurrencyInstance();
    NumberFormat currencyLibra = NumberFormat.getCurrencyInstance(Locale.UK);

    public MoneyFrame(){
        setLayout(new FlowLayout());

        add(fromCurrencyLabel);
        add(textField);
        combo.addItem("Dolar para Libra");
        combo.addItem("Libra para Dolar");
        add(label);
        add(combo);

        textField.addKeyListener(this);
        combo.addItemListener(this);
        label.addMouseListener(this);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setSize(300, 100);
        setVisible(true);
    }

    void setTextOnLabel(){
        String amountString = "";
        String fromCurrency = "";

        try{
            double amount = Double.parseDouble(textField.getText());
            if(combo.getSelectedItem().equals("Dolar para Libra")){
                amountString = " + " + currencyLibra.format(amount * 0.61214);
                fromCurrency = "$";
            }
            if(combo.getSelectedItem().equals("Libra para Dolar")){
                amountString = " + " + currencyDolar.format(amount * 1.63361);
                fromCurrency = "\u00A63";

            }
        } catch (NumberFormatException e){
        }
        label.setText(amountString);
        fromCurrencyLabel.setText(fromCurrency);
    }

    @Override
    public void itemStateChanged(ItemEvent i) {
        setTextOnLabel();
    }

    @Override
    public void keyTyped(KeyEvent k) {
    }

    @Override
    public void keyPressed(KeyEvent k) {
    }

    @Override
    public void keyReleased(KeyEvent k) {
        setTextOnLabel();
    }

    @Override
    public void mouseClicked(MouseEvent m) {
    }

    @Override
    public void mousePressed(MouseEvent mo) {
    }

    @Override
    public void mouseReleased(MouseEvent m) {
    }

    @Override
    public void mouseEntered(MouseEvent m) {
        label.setForeground(Color.red);
    }

    @Override
    public void mouseExited(MouseEvent m) {
        label.setForeground(Color.black);
    }
}

package Ferramentas;

import java.text.SimpleDateFormat;
import javax.swing.JFormattedTextField;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.NumberFormatter;

public class DateTextField {

    public static JFormattedTextField create() {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        JFormattedTextField textField = new JFormattedTextField(format);

        // Only allow numbers
        textField.setFormatterFactory(new DefaultFormatterFactory(new NumberFormatter()));

        // Automatically place the bars
        textField.setFocusLostBehavior(JFormattedTextField.PERSIST);

        return textField;
    }
}
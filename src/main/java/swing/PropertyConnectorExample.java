package swing;

import com.jgoodies.binding.beans.PropertyConnector;
import com.jgoodies.binding.value.ValueHolder;
import com.jgoodies.binding.value.ValueModel;
import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class PropertyConnectorExample extends JPanel {
    public PropertyConnectorExample() {
        DefaultFormBuilder defaultFormBuilder = new DefaultFormBuilder(new FormLayout("p, 2dlu, p"));
        defaultFormBuilder.setDefaultDialogBorder();

        ValueModel socialSecurityNumberModel = new ValueHolder();
        socialSecurityNumberModel.setValue("123-45-6789");

        MaskFormatter maskFormatter = null;
        try {
            maskFormatter = new MaskFormatter("###-##-####");
        } catch (ParseException e) {
            //Shouldn't Happen
        }

        JFormattedTextField socialSecurityTextField = new JFormattedTextField(maskFormatter);

        PropertyConnector propertyConnector1 = new PropertyConnector(socialSecurityNumberModel, "value",
                socialSecurityTextField, "value");
        propertyConnector1.updateProperty2();
        defaultFormBuilder.append("Formatted Text Field:", socialSecurityTextField);


        JLabel socialSecurityLabel = new JLabel();
        PropertyConnector propertyConnector2 = new PropertyConnector(socialSecurityNumberModel, "value",
                socialSecurityLabel, "text");
        propertyConnector2.updateProperty2();
        defaultFormBuilder.append("Label:", socialSecurityLabel);
        defaultFormBuilder.append(new JButton("Focus Button"), 3);

        add(defaultFormBuilder.getPanel());
    }

    public static void main(String[] a){
        JFrame f = new JFrame("Property Connector Example");
        f.setDefaultCloseOperation(2);
        f.add(new PropertyConnectorExample());
        f.pack();
        f.setVisible(true);
    }
}
package swing;

import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.jgoodies.binding.adapter.BasicComponentFactory;
import com.jgoodies.binding.adapter.Bindings;
import com.jgoodies.binding.list.SelectionInList;
import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

public class SelectionInListExample extends JPanel {
    public SelectionInListExample() {
        ArrayList strings = new ArrayList();
        strings.add("Swing");
        strings.add("SWT");
        strings.add("HTML");
        strings.add("Flash");
        strings.add("QT");

        SelectionInList selectionInList = new SelectionInList(strings);
        DefaultFormBuilder defaultFormBuilder = new DefaultFormBuilder(new FormLayout("p, 2dlu, p:g"));
        defaultFormBuilder.setDefaultDialogBorder();

        JList jlist = new JList();
        Bindings.bind(jlist, selectionInList);

        defaultFormBuilder.append("JList: ", new JScrollPane(jlist));
        defaultFormBuilder.append("Selected String: ", BasicComponentFactory.createTextField(selectionInList.getSelectionHolder()));

        add(defaultFormBuilder.getPanel());
    }

    public static void main(String[] a){
        JFrame f = new JFrame("Selection In List Example");
        f.setDefaultCloseOperation(2);
        f.add(new SelectionInListExample());
        f.pack();
        f.setVisible(true);
    }
}
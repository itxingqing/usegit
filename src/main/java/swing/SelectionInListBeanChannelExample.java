package swing;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListModel;

import com.jgoodies.binding.adapter.AbstractTableAdapter;
import com.jgoodies.binding.adapter.BasicComponentFactory;
import com.jgoodies.binding.adapter.Bindings;
import com.jgoodies.binding.beans.BeanAdapter;
import com.jgoodies.binding.list.ArrayListModel;
import com.jgoodies.binding.list.SelectionInList;
import com.jgoodies.binding.value.ValueModel;
import com.jgoodies.forms.builder.DefaultFormBuilder;
import com.jgoodies.forms.layout.FormLayout;

public class SelectionInListBeanChannelExample extends JPanel {

    private ArrayListModel arrayListModel;

    public SelectionInListBeanChannelExample() {
        DefaultFormBuilder defaultFormBuilder = new DefaultFormBuilder(new FormLayout("p, 2dlu, p:g"));
        defaultFormBuilder.setDefaultDialogBorder();

        this.arrayListModel = new ArrayListModel();
        this.arrayListModel.add(new DisplayTechnology("Swing", "Is a Java API", "Sun"));
        this.arrayListModel.add(new DisplayTechnology("Flash", "Is NOT a Java API", "Macromedia"));
        this.arrayListModel.add(new DisplayTechnology("SWT", "Is a Java API", "Eclipse"));
        this.arrayListModel.add(new DisplayTechnology("QT", "Is NOT a Java API", "Trolltech"));
        this.arrayListModel.add(new DisplayTechnology("AWT", "Is a Java API", "Sun"));

        SelectionInList selectionInList = new SelectionInList((ListModel) this.arrayListModel);

        JList jlist = new JList();
        Bindings.bind(jlist, selectionInList);
        defaultFormBuilder.append("List Model: ", new JScrollPane(jlist));

        BeanAdapter beanAdapter = new BeanAdapter(selectionInList);
        ValueModel nameModel = beanAdapter.getValueModel("name");
        ValueModel descriptionModel = beanAdapter.getValueModel("description");
        ValueModel makerModel = beanAdapter.getValueModel("maker");

        defaultFormBuilder.append("Name:", BasicComponentFactory.createTextField(nameModel));
        defaultFormBuilder.append("Description:", BasicComponentFactory.createTextField(descriptionModel));
        defaultFormBuilder.append("Maker:", BasicComponentFactory.createTextField(makerModel));

        add(defaultFormBuilder.getPanel());
    }

    public class DisplayTechnology {
        private String name;
        private String description;
        private String maker;

        public DisplayTechnology(String name, String description, String maker) {
            this.name = name;
            this.description = description;
            this.maker = maker;
        }

        public String getName() {
            return name;
        }

        public String getDescription() {
            return description;
        }

        public String getMaker() {
            return maker;
        }
        @Override
        public String toString() {
            return name;
        }
    }

    private class DisplayTechnologyTableAdapter extends AbstractTableAdapter {
        public DisplayTechnologyTableAdapter(ListModel listModel, String[] columnNames) {
            super(listModel, columnNames);
        }
        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            DisplayTechnology displayTechnology = (DisplayTechnology) getRow(rowIndex);
            if (columnIndex == 0) {
                return displayTechnology.getName();
            } else if (columnIndex == 1) {
                return displayTechnology.getDescription();
            } else {
                return displayTechnology.getMaker();
            }

        }


    }

    public static void main(String[] a){
        JFrame f = new JFrame("Selection In List Bean Channel Example");
        f.setDefaultCloseOperation(2);
        f.add(new SelectionInListBeanChannelExample());
        f.pack();
        f.setVisible(true);
    }
}


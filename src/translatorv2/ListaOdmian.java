package translatorv2;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

/**
 *
 * @author Goniprowski
 */
public class ListaOdmian extends JFrame implements ActionListener {

    private final JList list;
    private final DefaultListModel listModel;
    private final JButton Button;

    public ListaOdmian() {

        super("Lista Odmian");
        setSize(800, 600); 
        listModel = new DefaultListModel();

        DatabaseOdmiany data = new DatabaseOdmiany();
        List<DaneOdmiany> form = data.selectOdmianyLog();

        for (DaneOdmiany c : form) {

            listModel.addElement(c);

        }
        data.closeConnection();
        list = new JList(listModel);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setSelectedIndex(0);
        JScrollPane listScrollPane = new JScrollPane(list);

        Button = new JButton("Usuń");
        Button.addActionListener(this);
        JPanel buttonPane = new JPanel();
        buttonPane.add(Button);
        buttonPane.setLayout(new BoxLayout(buttonPane, BoxLayout.LINE_AXIS));
        buttonPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        add(listScrollPane, BorderLayout.CENTER);
        add(buttonPane, BorderLayout.PAGE_END);
        setVisible(true);  
    }

    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == Button) {
            int index = list.getSelectedIndex();
            listModel.remove(index);
            DatabaseOdmiany data = new DatabaseOdmiany();
            List<DaneOdmiany> form = data.selectOdmianyLog();

            data.Usun(form.get(index).nazwa_odmiany);

            data.closeConnection();
            
            int size = listModel.getSize();

            if (size == 0) { //blokuj klawisz jak nie ma co usuwac
                Button.setEnabled(false);

            } else { 
                if (index == listModel.getSize()) {
                    index--;
                }

                list.setSelectedIndex(index);
                list.ensureIndexIsVisible(index);
            }
        }
    }
}

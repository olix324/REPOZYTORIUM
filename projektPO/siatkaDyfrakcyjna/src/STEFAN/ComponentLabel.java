package STEFAN;

import java.awt.Component;
import java.util.ResourceBundle;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;

public class ComponentLabel extends Component {
	Component component;
	String label;

	public ComponentLabel(Component comp, String label) {
		// TODO Auto-generated constructor stub
		this.component = comp;
		this.label = label;
	}

	public boolean setText(ResourceBundle message) {
		boolean ret = false;
		String text = message.getString(label);
		if (component instanceof JButton) {
			((JButton) component).setText(text);
			ret = true;
		}
		if (component instanceof JFrame) {
			((JFrame) component).setTitle(text);
			ret = true;
		}
		if (component instanceof JRadioButton) {
			((JRadioButton) component).setText(text);
			ret = true;
		}
		if (component instanceof JLabel) {
			((JLabel) component).setText(text);
			ret = true;
		}
		if (component instanceof JMenuItem) {
			((JMenuItem) component).setText(text);
			ret = true;
		}
		return (ret);
	}
}

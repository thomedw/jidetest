package com.katalisindonesia.jidetest;

import com.jgoodies.forms.factories.CC;
import com.jgoodies.forms.layout.FormLayout;
import com.jidesoft.grid.QuickTableFilterField;
import com.jidesoft.grid.SortableTable;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
/*
 * Created by JFormDesigner on Thu Jul 04 11:43:49 WIT 2013
 */


class FilterTableForm
		extends JPanel {
	FilterTableForm() {
		initComponents();
	}

	QuickTableFilterField getQuickTableFilterField1() {
		return quickTableFilterField1;
	}

	JScrollPane getScrollPane1() {
		return scrollPane1;
	}

	SortableTable getSortableTable1() {
		return sortableTable1;
	}

	private void initComponents() {
		// JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		quickTableFilterField1 = new QuickTableFilterField();
		scrollPane1 = new JScrollPane();
		sortableTable1 = new SortableTable();

		//======== this ========
		setName("this");
		setLayout(
				new FormLayout(
						"default:grow",
						"default, $lgap, default"));

		//---- quickTableFilterField1 ----
		quickTableFilterField1.setName("quickTableFilterField1");
		add(quickTableFilterField1, CC.xy(1, 1));

		//======== scrollPane1 ========
		scrollPane1.setName("scrollPane1");

		//---- sortableTable1 ----
		sortableTable1.setName("sortableTable1");
		scrollPane1.setViewportView(sortableTable1);
		add(scrollPane1, CC.xy(1, 3));
		// JFormDesigner - End of component initialization  //GEN-END:initComponents
	}

	// JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private QuickTableFilterField quickTableFilterField1;
	private JScrollPane scrollPane1;
	private SortableTable sortableTable1;
	// JFormDesigner - End of variables declaration  //GEN-END:variables
}

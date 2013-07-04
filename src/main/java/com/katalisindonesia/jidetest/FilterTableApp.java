package com.katalisindonesia.jidetest;

import ca.odell.glazedlists.BasicEventList;
import ca.odell.glazedlists.EventList;
import ca.odell.glazedlists.impl.beans.BeanTableFormat;
import ca.odell.glazedlists.swing.DefaultEventTableModel;
import com.jidesoft.grid.AutoFilterTableHeader;
import com.jidesoft.grid.IFilterableTableModel;
import com.jidesoft.grid.QuickTableFilterField;
import com.jidesoft.grid.SortableTable;

import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.table.TableModel;
import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;

/**
 * App for testing JIDE autofilter table header.
 *
 * @author Thomas Edwin Santosa
 */
public class FilterTableApp
		implements Runnable {
	private final FilterTableForm form = new FilterTableForm();

	QuickTableFilterField getSearchField() {
		return form.getQuickTableFilterField1();
	}

	SortableTable getTable() {
		return form.getSortableTable1();
	}

	@Override
	public void run() {
		EventList<Bean> beans = new BasicEventList<Bean>();
		beans.add(new Bean("a", "1"));
		beans.add(new Bean("a", "2"));
		beans.add(new Bean("b", "1"));
		beans.add(new Bean("b", "2"));
		TableModel tableModel = new DefaultEventTableModel<Bean>(
				beans, new BeanTableFormat<Bean>(
				Bean.class, new String[]{
				Bean.PROPERTYNAME_NAME,
				Bean.PROPERTYNAME_DESCRIPTION,
				Bean.PROPERTYNAME_NESTED,
		}, new String[]{
				"Name",
				"Description",
				"Nested",
		}, new boolean[]{
				true,
				true,
				true,
		}
		));
		getSearchField().setTableModel(tableModel);
		IFilterableTableModel displayTableModel = getSearchField().getDisplayTableModel();

		getTable().setModel(displayTableModel);

		getTable().putClientProperty("terminateEditOnFocusLost", Boolean.TRUE);
//		getTable().setClickCountToStart(2);

		AutoFilterTableHeader tableHeader = new AutoFilterTableHeader(getTable());
		tableHeader.setShowFilterIcon(true);
		tableHeader.setShowFilterName(true);
		tableHeader.setAllowMultipleValues(true);
		tableHeader.setAutoFilterEnabled(true);

		getTable().setTableHeader(tableHeader);

		JFrame frame = new JFrame();
		frame.setContentPane(form);
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args)
			throws InvocationTargetException, InterruptedException {
		EventQueue.invokeAndWait(new FilterTableApp());
	}
}

package com.gwtplatform.client.core;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.cellview.client.ColumnSortEvent;
import com.google.gwt.user.cellview.client.ColumnSortEvent.Handler;

/**
 * List handler for cell table, which can be modified.
 * 
 * @author Ilya Sviridov
 *
 * @param <T> date type
 */
public class MutableListHandler<T> implements Handler {
	/**
	 * Data
	 */
	private List<T> list;
	
	/**
	 * Comparators
	 */
	private final Map<Column<?, ?>, Comparator<T>> comparators = new HashMap<Column<?, ?>, Comparator<T>>();

	/**
	 * Default constructor
	 */
	public MutableListHandler() {
	}

	/**
	 * sorl event handler
	 */
	public void onColumnSort(ColumnSortEvent event) {
		Column<?, ?> column = event.getColumn();
		if (column == null) {
			return;
		}

		final Comparator<T> comparator = comparators.get(column);
		if (comparator == null) {
			return;
		}
		if (event.isSortAscending()) {
			Collections.sort(list, comparator);
		} else {
			Collections.sort(list, new Comparator<T>() {
				public int compare(T o1, T o2) {
					return -comparator.compare(o1, o2);
				}
			});
		}
	}
	
	/**
	 * Setter for data
	 * @param data
	 */
	public void setData(List<T> data) {
		list = data;
	}
	
	/**
	 * Setter for comparator
	 * @param column
	 * @param comparator
	 */
	public void setComparator(Column<T, ?> column, Comparator<T> comparator) {
		comparators.put(column, comparator);
	}
}

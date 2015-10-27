package com.iteso.organize.datePicker;

import java.util.*;

import javax.swing.JTextField;

public class ObservingTextField extends JTextField implements Observer {
    
	private static final long serialVersionUID = 1L;

	public void update(Observable o, Object arg) {
        Calendar calendar = (Calendar) arg;
        DatePicker dp = (DatePicker) o;
     //   System.out.println("picked=" + dp.formatDate(calendar));
        setText(dp.formatDate(calendar));
    }
}

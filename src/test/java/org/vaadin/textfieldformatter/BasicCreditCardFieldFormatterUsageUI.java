package org.vaadin.textfieldformatter;

import org.vaadin.addonhelpers.AbstractTest;

import com.vaadin.ui.Component;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;

public class BasicCreditCardFieldFormatterUsageUI extends AbstractTest {

	public static final String INITIAL_VALUE = "Foo!";

	@Override
	public Component getTestComponent() {
		TextField tf = new TextField();
		tf.setPlaceholder("Insert credit card number");
		CreditCardFieldFormatter formatter = new CreditCardFieldFormatter();
		formatter.extend(tf);
		formatter.addCreditCardChangedListener(l -> Notification.show("" + l.getCreditCardType()));
		return tf;
	}

}

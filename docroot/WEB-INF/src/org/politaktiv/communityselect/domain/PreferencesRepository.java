package org.politaktiv.communityselect.domain;

import java.io.IOException;

import javax.portlet.PortletPreferences;
import javax.portlet.ReadOnlyException;
import javax.portlet.ValidatorException;

public class PreferencesRepository {

	/**
	 * Set value and store directly
	 * 
	 * @param name
	 * @param value
	 * @throws ReadOnlyException
	 * @throws ValidatorException
	 * @throws IOException
	 */
	public void setValueAndStore(PortletPreferences preferences, String name, String value)
			throws ReadOnlyException, ValidatorException, IOException {
		this.setValue(preferences, name, value);
		this.store(preferences);
	}

	/**
	 * Set a value - don't forget to store!
	 * 
	 * @param name
	 *            name of value
	 * @param parameter
	 *            value
	 * @throws ReadOnlyException
	 */
	private void setValue(PortletPreferences preferences, String name, String value) throws ReadOnlyException {
		preferences.setValue(name, value);

	}

	/**
	 * Storing set values
	 * 
	 * @throws ValidatorException
	 * @throws IOException
	 */
	private void store(PortletPreferences preferences) throws ValidatorException, IOException {
		preferences.store();
	}
}

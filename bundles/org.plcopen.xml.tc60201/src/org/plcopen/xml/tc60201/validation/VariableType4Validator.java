/**
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.validation;

import org.plcopen.xml.tc60201.ConnectionPointOut;
import org.plcopen.xml.tc60201.EdgeModifierType;
import org.plcopen.xml.tc60201.FormattedText;
import org.plcopen.xml.tc60201.StorageModifierType;

/**
 * A sample validator interface for {@link org.plcopen.xml.tc60201.VariableType4}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface VariableType4Validator {
	boolean validate();

	boolean validateConnectionPointOut(ConnectionPointOut value);
	boolean validateDocumentation(FormattedText value);
	boolean validateEdge(EdgeModifierType value);
	boolean validateFormalParameter(String value);
	boolean validateHidden(boolean value);
	boolean validateNegated(boolean value);
	boolean validateStorage(StorageModifierType value);
}

/**
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.validation;

import org.plcopen.xml.tc60201.AddData;
import org.plcopen.xml.tc60201.Position;

/**
 * A sample validator interface for {@link org.plcopen.xml.tc60201.ConnectionPointOut}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConnectionPointOutValidator {
	boolean validate();

	boolean validateRelPosition(Position value);
	boolean validateExpression(String value);
	boolean validateAddData(AddData value);
	boolean validateGlobalId(String value);
}
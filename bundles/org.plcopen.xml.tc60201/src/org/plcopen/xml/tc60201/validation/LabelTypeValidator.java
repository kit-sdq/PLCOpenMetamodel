/**
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.validation;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.plcopen.xml.tc60201.AddData;
import org.plcopen.xml.tc60201.FormattedText;
import org.plcopen.xml.tc60201.Position;

/**
 * A sample validator interface for {@link org.plcopen.xml.tc60201.LabelType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface LabelTypeValidator {
	boolean validate();

	boolean validatePosition(Position value);
	boolean validateAddData(AddData value);
	boolean validateDocumentation(FormattedText value);
	boolean validateExecutionOrderId(BigInteger value);
	boolean validateGlobalId(String value);
	boolean validateHeight(BigDecimal value);
	boolean validateLabel(String value);
	boolean validateLocalId(BigInteger value);
	boolean validateWidth(BigDecimal value);
}

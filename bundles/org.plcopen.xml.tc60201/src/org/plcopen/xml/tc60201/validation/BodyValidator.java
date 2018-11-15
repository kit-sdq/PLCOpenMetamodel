/**
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.validation;

import org.plcopen.xml.tc60201.AddData;
import org.plcopen.xml.tc60201.FBDType1;
import org.plcopen.xml.tc60201.FormattedText;
import org.plcopen.xml.tc60201.LDType1;
import org.plcopen.xml.tc60201.SFCType1;

/**
 * A sample validator interface for {@link org.plcopen.xml.tc60201.Body}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface BodyValidator {
	boolean validate();

	boolean validateIL(FormattedText value);
	boolean validateST(FormattedText value);
	boolean validateFBD(FBDType1 value);
	boolean validateLD(LDType1 value);
	boolean validateSFC(SFCType1 value);
	boolean validateAddData(AddData value);
	boolean validateDocumentation(FormattedText value);
	boolean validateGlobalId(String value);
	boolean validateWorksheetName(String value);
}
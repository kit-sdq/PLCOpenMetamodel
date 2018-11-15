/**
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.validation;

import org.plcopen.xml.tc60201.DataType;
import org.plcopen.xml.tc60201.RangeUnsigned;

/**
 * A sample validator interface for {@link org.plcopen.xml.tc60201.SubrangeUnsignedType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SubrangeUnsignedTypeValidator {
	boolean validate();

	boolean validateRange(RangeUnsigned value);
	boolean validateBaseType(DataType value);
}
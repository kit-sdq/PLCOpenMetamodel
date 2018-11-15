/**
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.validation;

import org.eclipse.emf.common.util.EList;

import org.plcopen.xml.tc60201.PouType1;

/**
 * A sample validator interface for {@link org.plcopen.xml.tc60201.PousType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PousTypeValidator {
	boolean validate();

	boolean validatePou(EList<PouType1> value);
	boolean validateName(String value);
}

/**
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.plcopen.xml.tc60201.ValueType;

/**
 * A sample validator interface for {@link org.plcopen.xml.tc60201.StructValueType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface StructValueTypeValidator {
	boolean validate();

	boolean validateGroup(FeatureMap value);
	boolean validateValue(EList<ValueType> value);
}

/**
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.validation;

import org.eclipse.emf.common.util.EList;

import org.plcopen.xml.tc60201.AddData;
import org.plcopen.xml.tc60201.FormattedText;
import org.plcopen.xml.tc60201.ResourceType;
import org.plcopen.xml.tc60201.VarList;
import org.plcopen.xml.tc60201.VarListAccess;
import org.plcopen.xml.tc60201.VarListConfig;

/**
 * A sample validator interface for {@link org.plcopen.xml.tc60201.ConfigurationType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface ConfigurationTypeValidator {
	boolean validate();

	boolean validateResource(EList<ResourceType> value);
	boolean validateGlobalVars(EList<VarList> value);
	boolean validateAccessVars(VarListAccess value);
	boolean validateConfigVars(VarListConfig value);
	boolean validateAddData(AddData value);
	boolean validateDocumentation(FormattedText value);
	boolean validateGlobalId(String value);
	boolean validateName(String value);
}

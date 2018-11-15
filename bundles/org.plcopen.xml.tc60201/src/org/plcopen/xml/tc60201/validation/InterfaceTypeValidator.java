/**
 *
 * $Id$
 */
package org.plcopen.xml.tc60201.validation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.util.FeatureMap;

import org.plcopen.xml.tc60201.AddData;
import org.plcopen.xml.tc60201.DataType;
import org.plcopen.xml.tc60201.ExternalVarsType;
import org.plcopen.xml.tc60201.FormattedText;
import org.plcopen.xml.tc60201.GlobalVarsType;
import org.plcopen.xml.tc60201.InOutVarsType;
import org.plcopen.xml.tc60201.InputVarsType;
import org.plcopen.xml.tc60201.LocalVarsType;
import org.plcopen.xml.tc60201.OutputVarsType;
import org.plcopen.xml.tc60201.TempVarsType;
import org.plcopen.xml.tc60201.VarList;

/**
 * A sample validator interface for {@link org.plcopen.xml.tc60201.InterfaceType}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InterfaceTypeValidator {
	boolean validate();

	boolean validateReturnType(DataType value);
	boolean validateGroup(FeatureMap value);
	boolean validateLocalVars(EList<LocalVarsType> value);
	boolean validateTempVars(EList<TempVarsType> value);
	boolean validateInputVars(EList<InputVarsType> value);
	boolean validateOutputVars(EList<OutputVarsType> value);
	boolean validateInOutVars(EList<InOutVarsType> value);
	boolean validateExternalVars(EList<ExternalVarsType> value);
	boolean validateGlobalVars(EList<GlobalVarsType> value);
	boolean validateAccessVars(EList<VarList> value);
	boolean validateAddData(AddData value);
	boolean validateDocumentation(FormattedText value);
}

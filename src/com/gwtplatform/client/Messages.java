package com.gwtplatform.client;

import java.util.Date;
/**
 * The message bundle.
 * 
 * @author Ilya Sviridov
 *
 */
public interface Messages extends com.google.gwt.i18n.client.Messages {
	@DefaultMessage("{0,date,medium}")
	@Key("dateFormat")
	String dateFormat(Date arg0);

	@DefaultMessage("Not localized role")
	@AlternateMessage({ "fullTimeRole", "Full time", "partTimeRole",
			"Part time"})
	String roles(@Select String roleName);

	@DefaultMessage("Not localized rule")
	@AlternateMessage({ "alwaysRuleType", "Always", "intervalRuleType",
			"Interval", "inactiveRuleType", "Inactive"})
	String rules(@Select String ruleName);

	/**
	 * Translated "Begin:".
	 * 
	 * @return translated "Begin:"
	 */
	@DefaultMessage("Begin:")
	@Key("beginLabel")
	String beginLabel();

	/**
	 * Translated "Cancel".
	 * 
	 * @return translated "Cancel"
	 */
	@DefaultMessage("Cancel")
	@Key("cancelButton")
	String cancelButton();

	/**
	 * Translated "Create".
	 * 
	 * @return translated "Create"
	 */
	@DefaultMessage("Create")
	@Key("createButtonText")
	String createButtonText();

	/**
	 * Translated "dd.MM.yyyy".
	 * 
	 * @return translated "dd.MM.yyyy"
	 */
	@DefaultMessage("dd.MM.yyyy")
	@Key("dateBoxDateFormat")
	String dateBoxDateFormat();

	/**
	 * Translated "Delete".
	 * 
	 * @return translated "Delete"
	 */
	@DefaultMessage("Delete")
	@Key("deleteButtonText")
	String deleteButtonText();

	/**
	 * Translated "End:".
	 * 
	 * @return translated "End:"
	 */
	@DefaultMessage("End:")
	@Key("endLabel")
	String endLabel();

	/**
	 * Translated "Me as delegate".
	 * 
	 * @return translated "Me as delegate"
	 */
	@DefaultMessage("Me as delegate")
	@Key("meAsDelegateTabTitle")
	String meAsDelegateTabTitle();

	/**
	 * Translated "My delegation rules".
	 * 
	 * @return translated "My delegation rules"
	 */
	@DefaultMessage("My delegation rules")
	@Key("myDelegationRulesTabTitle")
	String myDelegationRulesTabTitle();

	/**
	 * Translated "Enter your name".
	 * 
	 * @return translated "Enter your name"
	 */
	@DefaultMessage("Enter your name")
	@Key("nameField")
	String nameField();

	/**
	 * Translated "That feature/behavior not defined".
	 * 
	 * @return translated "That feature/behavior not defined"
	 */
	@DefaultMessage("That feature/behavior not defined")
	@Key("notDefined")
	String notDefined();

	/**
	 * Translated "OK".
	 * 
	 * @return translated "OK"
	 */
	@DefaultMessage("OK")
	@Key("okButtonText")
	String okButtonText();

	/**
	 * Translated "Please select role".
	 * 
	 * @return translated "Please select role"
	 */
	@DefaultMessage("Please select role")
	@Key("pleaseSelectRole")
	String pleaseSelectRole();

	/**
	 * Translated "Please select rule type".
	 * 
	 * @return translated "Please select rule type"
	 */
	@DefaultMessage("Please select rule type")
	@Key("pleaseSelectRuleType")
	String pleaseSelectRuleType();

	/**
	 * Translated "Please select substitutor".
	 * 
	 * @return translated "Please select substitutor"
	 */
	@DefaultMessage("Please select substitutor")
	@Key("pleaseSelectSubstitutor")
	String pleaseSelectSubstitutor();

	/**
	 * Translated "Role:".
	 * 
	 * @return translated "Role:"
	 */
	@DefaultMessage("Role:")
	@Key("roleLabel")
	String roleLabel();

	/**
	 * Translated "Rule type:".
	 * 
	 * @return translated "Rule type:"
	 */
	@DefaultMessage("Rule type:")
	@Key("ruleTypeLabel")
	String ruleTypeLabel();

	/**
	 * Translated "Save".
	 * 
	 * @return translated "Save"
	 */
	@DefaultMessage("Save")
	@Key("saveButton")
	String saveButton();

	/**
	 * Translated "Send".
	 * 
	 * @return translated "Send"
	 */
	@DefaultMessage("Send")
	@Key("sendButton")
	String sendButton();

	/**
	 * Translated "Deleting...".
	 * 
	 * @return translated "Deleting..."
	 */
	@DefaultMessage("Deleting...")
	@Key("statusDeleting")
	String statusDeleting();

	/**
	 * Translated "Error: {0}".
	 * 
	 * @return translated "Error: {0}"
	 */
	@DefaultMessage("Error: {0}")
	@Key("statusError")
	String statusError(String arg0);

	/**
	 * Translated "Error during deleting: {0}".
	 * 
	 * @return translated "Error during deleting: {0}"
	 */
	@DefaultMessage("Error during deleting: {0}")
	@Key("statusErrorDuringDeleting")
	String statusErrorDuringDeleting(String arg0);

	/**
	 * Translated "Internal error".
	 * 
	 * @return translated "Internal error"
	 */
	@DefaultMessage("Internal error")
	@Key("statusInternalError")
	String statusInternalError();

	/**
	 * Translated "Loading data...".
	 * 
	 * @return translated "Loading data..."
	 */
	@DefaultMessage("Loading data...")
	@Key("statusLoadingData")
	String statusLoadingData();

	/**
	 * Translated "Loading problems: {0}".
	 * 
	 * @return translated "Loading problems: {0}"
	 */
	@DefaultMessage("Loading problems: {0}")
	@Key("statusLoadingProblems")
	String statusLoadingProblems(String arg0);

	/**
	 * Translated "Saving substitution...".
	 * 
	 * @return translated "Saving substitution..."
	 */
	@DefaultMessage("Saving substitution...")
	@Key("statusSavingSubstitution")
	String statusSavingSubstitution();

	/**
	 * Translated "Saving substitution error: {0}".
	 * 
	 * @return translated "Saving substitution error: {0}"
	 */
	@DefaultMessage("Saving substitution error: {0}")
	@Key("statusSavingSubstitutionError")
	String statusSavingSubstitutionError(String arg0);

	/**
	 * Translated "Substitute:".
	 * 
	 * @return translated "Substitute:"
	 */
	@DefaultMessage("Substitute:")
	@Key("substituteLabel")
	String substituteLabel();

	/**
	 * Translated "This people can work on behalf of you".
	 * 
	 * @return translated "This people can work on behalf of you"
	 */
	@DefaultMessage("This people can work on behalf of you")
	@Key("substitutionManagementLabel")
	String substitutionManagementLabel();

	/**
	 * Translated "Substitution management".
	 * 
	 * @return translated "Substitution management"
	 */
	@DefaultMessage("Substitution management")
	@Key("substitutionManagementWindowTitle")
	String substitutionManagementWindowTitle();

	/**
	 * Translated "Begin".
	 * 
	 * @return translated "Begin"
	 */
	@DefaultMessage("Begin")
	@Key("tableColumnNameBegin")
	String tableColumnNameBegin();

	/**
	 * Translated "End".
	 * 
	 * @return translated "End"
	 */
	@DefaultMessage("End")
	@Key("tableColumnNameEnd")
	String tableColumnNameEnd();

	/**
	 * Translated "Role".
	 * 
	 * @return translated "Role"
	 */
	@DefaultMessage("Role")
	@Key("tableColumnNameRole")
	String tableColumnNameRole();

	/**
	 * Translated "Rule type".
	 * 
	 * @return translated "Rule type"
	 */
	@DefaultMessage("Rule type")
	@Key("tableColumnNameRuleType")
	String tableColumnNameRuleType();

	/**
	 * Translated "Substitute".
	 * 
	 * @return translated "Substitute"
	 */
	@DefaultMessage("Substitute")
	@Key("tableColumnNameSubstitute")
	String tableColumnNameSubstitute();

	/**
	 * Translated "Time interval".
	 * 
	 * @return translated "Time interval"
	 */
	@DefaultMessage("Time interval")
	@Key("timeIntervalLabel")
	String timeIntervalLabel();

	/**
	 * Translated "Updated".
	 * 
	 * @return translated "Updated"
	 */
	@DefaultMessage("Updated")
	@Key("updateButtonText")
	String updateButtonText();

	/**
	 * Translated "Begin data is not selected".
	 * 
	 * @return translated "Begin data is not selected"
	 */
	@DefaultMessage("Begin data is not selected")
	@Key("validationBeginDataIsNotSelected")
	String validationBeginDataIsNotSelected();

	/**
	 * Translated "Begin data is not set".
	 * 
	 * @return translated "Begin data is not set"
	 */
	@DefaultMessage("Begin data is not set")
	@Key("validationBeginDataIsNotSet")
	String validationBeginDataIsNotSet();

	/**
	 * Translated "End can''t be before begin data".
	 * 
	 * @return translated "End can''t be before begin data"
	 */
	@DefaultMessage("End can''t be before begin data")
	@Key("validationEndCantBeBeforeBeginData")
	String validationEndCantBeBeforeBeginData();

	/**
	 * Translated "End data is not selected".
	 * 
	 * @return translated "End data is not selected"
	 */
	@DefaultMessage("End data is not selected")
	@Key("validationEndDataIsNotSelected")
	String validationEndDataIsNotSelected();

	/**
	 * Translated "End data is not set".
	 * 
	 * @return translated "End data is not set"
	 */
	@DefaultMessage("End data is not set")
	@Key("validationEndDataIsNotSet")
	String validationEndDataIsNotSet();

	/**
	 * Translated "Role is not selected".
	 * 
	 * @return translated "Role is not selected"
	 */
	@DefaultMessage("Role is not selected")
	@Key("validationRoleIsNotSelected")
	String validationRoleIsNotSelected();

	/**
	 * Translated "Rule is not selected".
	 * 
	 * @return translated "Rule is not selected"
	 */
	@DefaultMessage("Rule is not selected")
	@Key("validationRuleIsNotSelected")
	String validationRuleIsNotSelected();

	/**
	 * Translated "Substitutor is not selected".
	 * 
	 * @return translated "Substitutor is not selected"
	 */
	@DefaultMessage("Substitutor is not selected")
	@Key("validationSubstitutorIsNotSelected")
	String validationSubstitutorIsNotSelected();
}

// Generated from /home/anderson/ProgrammingProjects/Java Projects/VocabularyExtractor_Generic/src/org/bluebird/LanguagesUtils/VisualBasic/VisualBasic.g4 by ANTLR 4.7
package org.bluebird.LanguagesUtils.VisualBasic;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VisualBasicParser}.
 */
public interface VisualBasicListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#startRule}.
	 * @param ctx the parse tree
	 */
	void enterStartRule(VisualBasicParser.StartRuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#startRule}.
	 * @param ctx the parse tree
	 */
	void exitStartRule(VisualBasicParser.StartRuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(VisualBasicParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(VisualBasicParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#moduleReferences}.
	 * @param ctx the parse tree
	 */
	void enterModuleReferences(VisualBasicParser.ModuleReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#moduleReferences}.
	 * @param ctx the parse tree
	 */
	void exitModuleReferences(VisualBasicParser.ModuleReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#moduleReference}.
	 * @param ctx the parse tree
	 */
	void enterModuleReference(VisualBasicParser.ModuleReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#moduleReference}.
	 * @param ctx the parse tree
	 */
	void exitModuleReference(VisualBasicParser.ModuleReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#moduleReferenceValue}.
	 * @param ctx the parse tree
	 */
	void enterModuleReferenceValue(VisualBasicParser.ModuleReferenceValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#moduleReferenceValue}.
	 * @param ctx the parse tree
	 */
	void exitModuleReferenceValue(VisualBasicParser.ModuleReferenceValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#moduleReferenceComponent}.
	 * @param ctx the parse tree
	 */
	void enterModuleReferenceComponent(VisualBasicParser.ModuleReferenceComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#moduleReferenceComponent}.
	 * @param ctx the parse tree
	 */
	void exitModuleReferenceComponent(VisualBasicParser.ModuleReferenceComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#moduleHeader}.
	 * @param ctx the parse tree
	 */
	void enterModuleHeader(VisualBasicParser.ModuleHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#moduleHeader}.
	 * @param ctx the parse tree
	 */
	void exitModuleHeader(VisualBasicParser.ModuleHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#moduleConfig}.
	 * @param ctx the parse tree
	 */
	void enterModuleConfig(VisualBasicParser.ModuleConfigContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#moduleConfig}.
	 * @param ctx the parse tree
	 */
	void exitModuleConfig(VisualBasicParser.ModuleConfigContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#moduleConfigElement}.
	 * @param ctx the parse tree
	 */
	void enterModuleConfigElement(VisualBasicParser.ModuleConfigElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#moduleConfigElement}.
	 * @param ctx the parse tree
	 */
	void exitModuleConfigElement(VisualBasicParser.ModuleConfigElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#moduleAttributes}.
	 * @param ctx the parse tree
	 */
	void enterModuleAttributes(VisualBasicParser.ModuleAttributesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#moduleAttributes}.
	 * @param ctx the parse tree
	 */
	void exitModuleAttributes(VisualBasicParser.ModuleAttributesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#moduleOptions}.
	 * @param ctx the parse tree
	 */
	void enterModuleOptions(VisualBasicParser.ModuleOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#moduleOptions}.
	 * @param ctx the parse tree
	 */
	void exitModuleOptions(VisualBasicParser.ModuleOptionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionBaseStmt}
	 * labeled alternative in {@link VisualBasicParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionBaseStmt(VisualBasicParser.OptionBaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionBaseStmt}
	 * labeled alternative in {@link VisualBasicParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionBaseStmt(VisualBasicParser.OptionBaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionCompareStmt}
	 * labeled alternative in {@link VisualBasicParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionCompareStmt(VisualBasicParser.OptionCompareStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionCompareStmt}
	 * labeled alternative in {@link VisualBasicParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionCompareStmt(VisualBasicParser.OptionCompareStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionExplicitStmt}
	 * labeled alternative in {@link VisualBasicParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionExplicitStmt(VisualBasicParser.OptionExplicitStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionExplicitStmt}
	 * labeled alternative in {@link VisualBasicParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionExplicitStmt(VisualBasicParser.OptionExplicitStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code optionPrivateModuleStmt}
	 * labeled alternative in {@link VisualBasicParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void enterOptionPrivateModuleStmt(VisualBasicParser.OptionPrivateModuleStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code optionPrivateModuleStmt}
	 * labeled alternative in {@link VisualBasicParser#moduleOption}.
	 * @param ctx the parse tree
	 */
	void exitOptionPrivateModuleStmt(VisualBasicParser.OptionPrivateModuleStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void enterModuleBody(VisualBasicParser.ModuleBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#moduleBody}.
	 * @param ctx the parse tree
	 */
	void exitModuleBody(VisualBasicParser.ModuleBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#moduleBodyElement}.
	 * @param ctx the parse tree
	 */
	void enterModuleBodyElement(VisualBasicParser.ModuleBodyElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#moduleBodyElement}.
	 * @param ctx the parse tree
	 */
	void exitModuleBodyElement(VisualBasicParser.ModuleBodyElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#controlProperties}.
	 * @param ctx the parse tree
	 */
	void enterControlProperties(VisualBasicParser.ControlPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#controlProperties}.
	 * @param ctx the parse tree
	 */
	void exitControlProperties(VisualBasicParser.ControlPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#cp_Properties}.
	 * @param ctx the parse tree
	 */
	void enterCp_Properties(VisualBasicParser.Cp_PropertiesContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#cp_Properties}.
	 * @param ctx the parse tree
	 */
	void exitCp_Properties(VisualBasicParser.Cp_PropertiesContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#cp_SingleProperty}.
	 * @param ctx the parse tree
	 */
	void enterCp_SingleProperty(VisualBasicParser.Cp_SinglePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#cp_SingleProperty}.
	 * @param ctx the parse tree
	 */
	void exitCp_SingleProperty(VisualBasicParser.Cp_SinglePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#cp_PropertyName}.
	 * @param ctx the parse tree
	 */
	void enterCp_PropertyName(VisualBasicParser.Cp_PropertyNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#cp_PropertyName}.
	 * @param ctx the parse tree
	 */
	void exitCp_PropertyName(VisualBasicParser.Cp_PropertyNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#cp_PropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterCp_PropertyValue(VisualBasicParser.Cp_PropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#cp_PropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitCp_PropertyValue(VisualBasicParser.Cp_PropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#cp_NestedProperty}.
	 * @param ctx the parse tree
	 */
	void enterCp_NestedProperty(VisualBasicParser.Cp_NestedPropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#cp_NestedProperty}.
	 * @param ctx the parse tree
	 */
	void exitCp_NestedProperty(VisualBasicParser.Cp_NestedPropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#cp_ControlType}.
	 * @param ctx the parse tree
	 */
	void enterCp_ControlType(VisualBasicParser.Cp_ControlTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#cp_ControlType}.
	 * @param ctx the parse tree
	 */
	void exitCp_ControlType(VisualBasicParser.Cp_ControlTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#cp_ControlIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterCp_ControlIdentifier(VisualBasicParser.Cp_ControlIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#cp_ControlIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitCp_ControlIdentifier(VisualBasicParser.Cp_ControlIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#moduleBlock}.
	 * @param ctx the parse tree
	 */
	void enterModuleBlock(VisualBasicParser.ModuleBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#moduleBlock}.
	 * @param ctx the parse tree
	 */
	void exitModuleBlock(VisualBasicParser.ModuleBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#attributeStmt}.
	 * @param ctx the parse tree
	 */
	void enterAttributeStmt(VisualBasicParser.AttributeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#attributeStmt}.
	 * @param ctx the parse tree
	 */
	void exitAttributeStmt(VisualBasicParser.AttributeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(VisualBasicParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(VisualBasicParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockStmt(VisualBasicParser.BlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#blockStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockStmt(VisualBasicParser.BlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#appActivateStmt}.
	 * @param ctx the parse tree
	 */
	void enterAppActivateStmt(VisualBasicParser.AppActivateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#appActivateStmt}.
	 * @param ctx the parse tree
	 */
	void exitAppActivateStmt(VisualBasicParser.AppActivateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#beepStmt}.
	 * @param ctx the parse tree
	 */
	void enterBeepStmt(VisualBasicParser.BeepStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#beepStmt}.
	 * @param ctx the parse tree
	 */
	void exitBeepStmt(VisualBasicParser.BeepStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#chDirStmt}.
	 * @param ctx the parse tree
	 */
	void enterChDirStmt(VisualBasicParser.ChDirStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#chDirStmt}.
	 * @param ctx the parse tree
	 */
	void exitChDirStmt(VisualBasicParser.ChDirStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#chDriveStmt}.
	 * @param ctx the parse tree
	 */
	void enterChDriveStmt(VisualBasicParser.ChDriveStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#chDriveStmt}.
	 * @param ctx the parse tree
	 */
	void exitChDriveStmt(VisualBasicParser.ChDriveStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#closeStmt}.
	 * @param ctx the parse tree
	 */
	void enterCloseStmt(VisualBasicParser.CloseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#closeStmt}.
	 * @param ctx the parse tree
	 */
	void exitCloseStmt(VisualBasicParser.CloseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#constStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstStmt(VisualBasicParser.ConstStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#constStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstStmt(VisualBasicParser.ConstStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#constSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterConstSubStmt(VisualBasicParser.ConstSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#constSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitConstSubStmt(VisualBasicParser.ConstSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#dateStmt}.
	 * @param ctx the parse tree
	 */
	void enterDateStmt(VisualBasicParser.DateStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#dateStmt}.
	 * @param ctx the parse tree
	 */
	void exitDateStmt(VisualBasicParser.DateStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeclareStmt(VisualBasicParser.DeclareStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#declareStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeclareStmt(VisualBasicParser.DeclareStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#deftypeStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeftypeStmt(VisualBasicParser.DeftypeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#deftypeStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeftypeStmt(VisualBasicParser.DeftypeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#deleteSettingStmt}.
	 * @param ctx the parse tree
	 */
	void enterDeleteSettingStmt(VisualBasicParser.DeleteSettingStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#deleteSettingStmt}.
	 * @param ctx the parse tree
	 */
	void exitDeleteSettingStmt(VisualBasicParser.DeleteSettingStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#doLoopStmt}.
	 * @param ctx the parse tree
	 */
	void enterDoLoopStmt(VisualBasicParser.DoLoopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#doLoopStmt}.
	 * @param ctx the parse tree
	 */
	void exitDoLoopStmt(VisualBasicParser.DoLoopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#endStmt}.
	 * @param ctx the parse tree
	 */
	void enterEndStmt(VisualBasicParser.EndStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#endStmt}.
	 * @param ctx the parse tree
	 */
	void exitEndStmt(VisualBasicParser.EndStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#enumerationStmt}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationStmt(VisualBasicParser.EnumerationStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#enumerationStmt}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationStmt(VisualBasicParser.EnumerationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#enumerationStmt_Constant}.
	 * @param ctx the parse tree
	 */
	void enterEnumerationStmt_Constant(VisualBasicParser.EnumerationStmt_ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#enumerationStmt_Constant}.
	 * @param ctx the parse tree
	 */
	void exitEnumerationStmt_Constant(VisualBasicParser.EnumerationStmt_ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#eraseStmt}.
	 * @param ctx the parse tree
	 */
	void enterEraseStmt(VisualBasicParser.EraseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#eraseStmt}.
	 * @param ctx the parse tree
	 */
	void exitEraseStmt(VisualBasicParser.EraseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#errorStmt}.
	 * @param ctx the parse tree
	 */
	void enterErrorStmt(VisualBasicParser.ErrorStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#errorStmt}.
	 * @param ctx the parse tree
	 */
	void exitErrorStmt(VisualBasicParser.ErrorStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#eventStmt}.
	 * @param ctx the parse tree
	 */
	void enterEventStmt(VisualBasicParser.EventStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#eventStmt}.
	 * @param ctx the parse tree
	 */
	void exitEventStmt(VisualBasicParser.EventStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#exitStmt}.
	 * @param ctx the parse tree
	 */
	void enterExitStmt(VisualBasicParser.ExitStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#exitStmt}.
	 * @param ctx the parse tree
	 */
	void exitExitStmt(VisualBasicParser.ExitStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#filecopyStmt}.
	 * @param ctx the parse tree
	 */
	void enterFilecopyStmt(VisualBasicParser.FilecopyStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#filecopyStmt}.
	 * @param ctx the parse tree
	 */
	void exitFilecopyStmt(VisualBasicParser.FilecopyStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#forEachStmt}.
	 * @param ctx the parse tree
	 */
	void enterForEachStmt(VisualBasicParser.ForEachStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#forEachStmt}.
	 * @param ctx the parse tree
	 */
	void exitForEachStmt(VisualBasicParser.ForEachStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#forNextStmt}.
	 * @param ctx the parse tree
	 */
	void enterForNextStmt(VisualBasicParser.ForNextStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#forNextStmt}.
	 * @param ctx the parse tree
	 */
	void exitForNextStmt(VisualBasicParser.ForNextStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#functionStmt}.
	 * @param ctx the parse tree
	 */
	void enterFunctionStmt(VisualBasicParser.FunctionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#functionStmt}.
	 * @param ctx the parse tree
	 */
	void exitFunctionStmt(VisualBasicParser.FunctionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#getStmt}.
	 * @param ctx the parse tree
	 */
	void enterGetStmt(VisualBasicParser.GetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#getStmt}.
	 * @param ctx the parse tree
	 */
	void exitGetStmt(VisualBasicParser.GetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#goSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterGoSubStmt(VisualBasicParser.GoSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#goSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitGoSubStmt(VisualBasicParser.GoSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#goToStmt}.
	 * @param ctx the parse tree
	 */
	void enterGoToStmt(VisualBasicParser.GoToStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#goToStmt}.
	 * @param ctx the parse tree
	 */
	void exitGoToStmt(VisualBasicParser.GoToStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineIfThenElse}
	 * labeled alternative in {@link VisualBasicParser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterInlineIfThenElse(VisualBasicParser.InlineIfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineIfThenElse}
	 * labeled alternative in {@link VisualBasicParser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitInlineIfThenElse(VisualBasicParser.InlineIfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code blockIfThenElse}
	 * labeled alternative in {@link VisualBasicParser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterBlockIfThenElse(VisualBasicParser.BlockIfThenElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code blockIfThenElse}
	 * labeled alternative in {@link VisualBasicParser#ifThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitBlockIfThenElse(VisualBasicParser.BlockIfThenElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#ifBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfBlockStmt(VisualBasicParser.IfBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#ifBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfBlockStmt(VisualBasicParser.IfBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#ifConditionStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfConditionStmt(VisualBasicParser.IfConditionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#ifConditionStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfConditionStmt(VisualBasicParser.IfConditionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#ifElseIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfElseIfBlockStmt(VisualBasicParser.IfElseIfBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#ifElseIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfElseIfBlockStmt(VisualBasicParser.IfElseIfBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#ifElseBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfElseBlockStmt(VisualBasicParser.IfElseBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#ifElseBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfElseBlockStmt(VisualBasicParser.IfElseBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#implementsStmt}.
	 * @param ctx the parse tree
	 */
	void enterImplementsStmt(VisualBasicParser.ImplementsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#implementsStmt}.
	 * @param ctx the parse tree
	 */
	void exitImplementsStmt(VisualBasicParser.ImplementsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void enterInputStmt(VisualBasicParser.InputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void exitInputStmt(VisualBasicParser.InputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#killStmt}.
	 * @param ctx the parse tree
	 */
	void enterKillStmt(VisualBasicParser.KillStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#killStmt}.
	 * @param ctx the parse tree
	 */
	void exitKillStmt(VisualBasicParser.KillStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void enterLetStmt(VisualBasicParser.LetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#letStmt}.
	 * @param ctx the parse tree
	 */
	void exitLetStmt(VisualBasicParser.LetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#lineInputStmt}.
	 * @param ctx the parse tree
	 */
	void enterLineInputStmt(VisualBasicParser.LineInputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#lineInputStmt}.
	 * @param ctx the parse tree
	 */
	void exitLineInputStmt(VisualBasicParser.LineInputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#loadStmt}.
	 * @param ctx the parse tree
	 */
	void enterLoadStmt(VisualBasicParser.LoadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#loadStmt}.
	 * @param ctx the parse tree
	 */
	void exitLoadStmt(VisualBasicParser.LoadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#lockStmt}.
	 * @param ctx the parse tree
	 */
	void enterLockStmt(VisualBasicParser.LockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#lockStmt}.
	 * @param ctx the parse tree
	 */
	void exitLockStmt(VisualBasicParser.LockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#lsetStmt}.
	 * @param ctx the parse tree
	 */
	void enterLsetStmt(VisualBasicParser.LsetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#lsetStmt}.
	 * @param ctx the parse tree
	 */
	void exitLsetStmt(VisualBasicParser.LsetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#macroIfThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroIfThenElseStmt(VisualBasicParser.MacroIfThenElseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#macroIfThenElseStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroIfThenElseStmt(VisualBasicParser.MacroIfThenElseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#macroIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroIfBlockStmt(VisualBasicParser.MacroIfBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#macroIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroIfBlockStmt(VisualBasicParser.MacroIfBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#macroElseIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroElseIfBlockStmt(VisualBasicParser.MacroElseIfBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#macroElseIfBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroElseIfBlockStmt(VisualBasicParser.MacroElseIfBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#macroElseBlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterMacroElseBlockStmt(VisualBasicParser.MacroElseBlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#macroElseBlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitMacroElseBlockStmt(VisualBasicParser.MacroElseBlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#midStmt}.
	 * @param ctx the parse tree
	 */
	void enterMidStmt(VisualBasicParser.MidStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#midStmt}.
	 * @param ctx the parse tree
	 */
	void exitMidStmt(VisualBasicParser.MidStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#mkdirStmt}.
	 * @param ctx the parse tree
	 */
	void enterMkdirStmt(VisualBasicParser.MkdirStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#mkdirStmt}.
	 * @param ctx the parse tree
	 */
	void exitMkdirStmt(VisualBasicParser.MkdirStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#nameStmt}.
	 * @param ctx the parse tree
	 */
	void enterNameStmt(VisualBasicParser.NameStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#nameStmt}.
	 * @param ctx the parse tree
	 */
	void exitNameStmt(VisualBasicParser.NameStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#onErrorStmt}.
	 * @param ctx the parse tree
	 */
	void enterOnErrorStmt(VisualBasicParser.OnErrorStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#onErrorStmt}.
	 * @param ctx the parse tree
	 */
	void exitOnErrorStmt(VisualBasicParser.OnErrorStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#onGoToStmt}.
	 * @param ctx the parse tree
	 */
	void enterOnGoToStmt(VisualBasicParser.OnGoToStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#onGoToStmt}.
	 * @param ctx the parse tree
	 */
	void exitOnGoToStmt(VisualBasicParser.OnGoToStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#onGoSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterOnGoSubStmt(VisualBasicParser.OnGoSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#onGoSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitOnGoSubStmt(VisualBasicParser.OnGoSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#openStmt}.
	 * @param ctx the parse tree
	 */
	void enterOpenStmt(VisualBasicParser.OpenStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#openStmt}.
	 * @param ctx the parse tree
	 */
	void exitOpenStmt(VisualBasicParser.OpenStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#outputList}.
	 * @param ctx the parse tree
	 */
	void enterOutputList(VisualBasicParser.OutputListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#outputList}.
	 * @param ctx the parse tree
	 */
	void exitOutputList(VisualBasicParser.OutputListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#outputList_Expression}.
	 * @param ctx the parse tree
	 */
	void enterOutputList_Expression(VisualBasicParser.OutputList_ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#outputList_Expression}.
	 * @param ctx the parse tree
	 */
	void exitOutputList_Expression(VisualBasicParser.OutputList_ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void enterPrintStmt(VisualBasicParser.PrintStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#printStmt}.
	 * @param ctx the parse tree
	 */
	void exitPrintStmt(VisualBasicParser.PrintStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#propertyGetStmt}.
	 * @param ctx the parse tree
	 */
	void enterPropertyGetStmt(VisualBasicParser.PropertyGetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#propertyGetStmt}.
	 * @param ctx the parse tree
	 */
	void exitPropertyGetStmt(VisualBasicParser.PropertyGetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#propertySetStmt}.
	 * @param ctx the parse tree
	 */
	void enterPropertySetStmt(VisualBasicParser.PropertySetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#propertySetStmt}.
	 * @param ctx the parse tree
	 */
	void exitPropertySetStmt(VisualBasicParser.PropertySetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#propertyLetStmt}.
	 * @param ctx the parse tree
	 */
	void enterPropertyLetStmt(VisualBasicParser.PropertyLetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#propertyLetStmt}.
	 * @param ctx the parse tree
	 */
	void exitPropertyLetStmt(VisualBasicParser.PropertyLetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#putStmt}.
	 * @param ctx the parse tree
	 */
	void enterPutStmt(VisualBasicParser.PutStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#putStmt}.
	 * @param ctx the parse tree
	 */
	void exitPutStmt(VisualBasicParser.PutStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#raiseEventStmt}.
	 * @param ctx the parse tree
	 */
	void enterRaiseEventStmt(VisualBasicParser.RaiseEventStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#raiseEventStmt}.
	 * @param ctx the parse tree
	 */
	void exitRaiseEventStmt(VisualBasicParser.RaiseEventStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#randomizeStmt}.
	 * @param ctx the parse tree
	 */
	void enterRandomizeStmt(VisualBasicParser.RandomizeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#randomizeStmt}.
	 * @param ctx the parse tree
	 */
	void exitRandomizeStmt(VisualBasicParser.RandomizeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#redimStmt}.
	 * @param ctx the parse tree
	 */
	void enterRedimStmt(VisualBasicParser.RedimStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#redimStmt}.
	 * @param ctx the parse tree
	 */
	void exitRedimStmt(VisualBasicParser.RedimStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#redimSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterRedimSubStmt(VisualBasicParser.RedimSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#redimSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitRedimSubStmt(VisualBasicParser.RedimSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#resetStmt}.
	 * @param ctx the parse tree
	 */
	void enterResetStmt(VisualBasicParser.ResetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#resetStmt}.
	 * @param ctx the parse tree
	 */
	void exitResetStmt(VisualBasicParser.ResetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#resumeStmt}.
	 * @param ctx the parse tree
	 */
	void enterResumeStmt(VisualBasicParser.ResumeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#resumeStmt}.
	 * @param ctx the parse tree
	 */
	void exitResumeStmt(VisualBasicParser.ResumeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(VisualBasicParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(VisualBasicParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#rmdirStmt}.
	 * @param ctx the parse tree
	 */
	void enterRmdirStmt(VisualBasicParser.RmdirStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#rmdirStmt}.
	 * @param ctx the parse tree
	 */
	void exitRmdirStmt(VisualBasicParser.RmdirStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#rsetStmt}.
	 * @param ctx the parse tree
	 */
	void enterRsetStmt(VisualBasicParser.RsetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#rsetStmt}.
	 * @param ctx the parse tree
	 */
	void exitRsetStmt(VisualBasicParser.RsetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#savepictureStmt}.
	 * @param ctx the parse tree
	 */
	void enterSavepictureStmt(VisualBasicParser.SavepictureStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#savepictureStmt}.
	 * @param ctx the parse tree
	 */
	void exitSavepictureStmt(VisualBasicParser.SavepictureStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#saveSettingStmt}.
	 * @param ctx the parse tree
	 */
	void enterSaveSettingStmt(VisualBasicParser.SaveSettingStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#saveSettingStmt}.
	 * @param ctx the parse tree
	 */
	void exitSaveSettingStmt(VisualBasicParser.SaveSettingStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#seekStmt}.
	 * @param ctx the parse tree
	 */
	void enterSeekStmt(VisualBasicParser.SeekStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#seekStmt}.
	 * @param ctx the parse tree
	 */
	void exitSeekStmt(VisualBasicParser.SeekStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#selectCaseStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectCaseStmt(VisualBasicParser.SelectCaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#selectCaseStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectCaseStmt(VisualBasicParser.SelectCaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#sC_Case}.
	 * @param ctx the parse tree
	 */
	void enterSC_Case(VisualBasicParser.SC_CaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#sC_Case}.
	 * @param ctx the parse tree
	 */
	void exitSC_Case(VisualBasicParser.SC_CaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondElse}
	 * labeled alternative in {@link VisualBasicParser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondElse(VisualBasicParser.CaseCondElseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondElse}
	 * labeled alternative in {@link VisualBasicParser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondElse(VisualBasicParser.CaseCondElseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondExpr}
	 * labeled alternative in {@link VisualBasicParser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondExpr(VisualBasicParser.CaseCondExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondExpr}
	 * labeled alternative in {@link VisualBasicParser#sC_Cond}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondExpr(VisualBasicParser.CaseCondExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondExprIs}
	 * labeled alternative in {@link VisualBasicParser#sC_CondExpr}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondExprIs(VisualBasicParser.CaseCondExprIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondExprIs}
	 * labeled alternative in {@link VisualBasicParser#sC_CondExpr}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondExprIs(VisualBasicParser.CaseCondExprIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondExprValue}
	 * labeled alternative in {@link VisualBasicParser#sC_CondExpr}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondExprValue(VisualBasicParser.CaseCondExprValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondExprValue}
	 * labeled alternative in {@link VisualBasicParser#sC_CondExpr}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondExprValue(VisualBasicParser.CaseCondExprValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseCondExprTo}
	 * labeled alternative in {@link VisualBasicParser#sC_CondExpr}.
	 * @param ctx the parse tree
	 */
	void enterCaseCondExprTo(VisualBasicParser.CaseCondExprToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseCondExprTo}
	 * labeled alternative in {@link VisualBasicParser#sC_CondExpr}.
	 * @param ctx the parse tree
	 */
	void exitCaseCondExprTo(VisualBasicParser.CaseCondExprToContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#sendkeysStmt}.
	 * @param ctx the parse tree
	 */
	void enterSendkeysStmt(VisualBasicParser.SendkeysStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#sendkeysStmt}.
	 * @param ctx the parse tree
	 */
	void exitSendkeysStmt(VisualBasicParser.SendkeysStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#setattrStmt}.
	 * @param ctx the parse tree
	 */
	void enterSetattrStmt(VisualBasicParser.SetattrStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#setattrStmt}.
	 * @param ctx the parse tree
	 */
	void exitSetattrStmt(VisualBasicParser.SetattrStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void enterSetStmt(VisualBasicParser.SetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void exitSetStmt(VisualBasicParser.SetStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#stopStmt}.
	 * @param ctx the parse tree
	 */
	void enterStopStmt(VisualBasicParser.StopStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#stopStmt}.
	 * @param ctx the parse tree
	 */
	void exitStopStmt(VisualBasicParser.StopStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#subStmt}.
	 * @param ctx the parse tree
	 */
	void enterSubStmt(VisualBasicParser.SubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#subStmt}.
	 * @param ctx the parse tree
	 */
	void exitSubStmt(VisualBasicParser.SubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#timeStmt}.
	 * @param ctx the parse tree
	 */
	void enterTimeStmt(VisualBasicParser.TimeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#timeStmt}.
	 * @param ctx the parse tree
	 */
	void exitTimeStmt(VisualBasicParser.TimeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#typeStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeStmt(VisualBasicParser.TypeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#typeStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeStmt(VisualBasicParser.TypeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#typeStmt_Element}.
	 * @param ctx the parse tree
	 */
	void enterTypeStmt_Element(VisualBasicParser.TypeStmt_ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#typeStmt_Element}.
	 * @param ctx the parse tree
	 */
	void exitTypeStmt_Element(VisualBasicParser.TypeStmt_ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#typeOfStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeOfStmt(VisualBasicParser.TypeOfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#typeOfStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeOfStmt(VisualBasicParser.TypeOfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#unloadStmt}.
	 * @param ctx the parse tree
	 */
	void enterUnloadStmt(VisualBasicParser.UnloadStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#unloadStmt}.
	 * @param ctx the parse tree
	 */
	void exitUnloadStmt(VisualBasicParser.UnloadStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#unlockStmt}.
	 * @param ctx the parse tree
	 */
	void enterUnlockStmt(VisualBasicParser.UnlockStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#unlockStmt}.
	 * @param ctx the parse tree
	 */
	void exitUnlockStmt(VisualBasicParser.UnlockStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsStruct}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsStruct(VisualBasicParser.VsStructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsStruct}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsStruct(VisualBasicParser.VsStructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAdd}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAdd(VisualBasicParser.VsAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAdd}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAdd(VisualBasicParser.VsAddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsLt}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsLt(VisualBasicParser.VsLtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsLt}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsLt(VisualBasicParser.VsLtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAddressOf}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAddressOf(VisualBasicParser.VsAddressOfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAddressOf}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAddressOf(VisualBasicParser.VsAddressOfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsNew}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsNew(VisualBasicParser.VsNewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsNew}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsNew(VisualBasicParser.VsNewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsMult}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsMult(VisualBasicParser.VsMultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsMult}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsMult(VisualBasicParser.VsMultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsNegation}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsNegation(VisualBasicParser.VsNegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsNegation}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsNegation(VisualBasicParser.VsNegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAssign}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAssign(VisualBasicParser.VsAssignContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAssign}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAssign(VisualBasicParser.VsAssignContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsDiv}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsDiv(VisualBasicParser.VsDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsDiv}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsDiv(VisualBasicParser.VsDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsLike}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsLike(VisualBasicParser.VsLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsLike}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsLike(VisualBasicParser.VsLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsPlus}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsPlus(VisualBasicParser.VsPlusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsPlus}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsPlus(VisualBasicParser.VsPlusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsNot}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsNot(VisualBasicParser.VsNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsNot}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsNot(VisualBasicParser.VsNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsGeq}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsGeq(VisualBasicParser.VsGeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsGeq}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsGeq(VisualBasicParser.VsGeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsTypeOf}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsTypeOf(VisualBasicParser.VsTypeOfContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsTypeOf}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsTypeOf(VisualBasicParser.VsTypeOfContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsICS}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsICS(VisualBasicParser.VsICSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsICS}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsICS(VisualBasicParser.VsICSContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsNeq}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsNeq(VisualBasicParser.VsNeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsNeq}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsNeq(VisualBasicParser.VsNeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsXor}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsXor(VisualBasicParser.VsXorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsXor}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsXor(VisualBasicParser.VsXorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAnd}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAnd(VisualBasicParser.VsAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAnd}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAnd(VisualBasicParser.VsAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsPow}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsPow(VisualBasicParser.VsPowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsPow}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsPow(VisualBasicParser.VsPowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsLeq}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsLeq(VisualBasicParser.VsLeqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsLeq}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsLeq(VisualBasicParser.VsLeqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsIs}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsIs(VisualBasicParser.VsIsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsIs}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsIs(VisualBasicParser.VsIsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsMod}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsMod(VisualBasicParser.VsModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsMod}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsMod(VisualBasicParser.VsModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsAmp}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsAmp(VisualBasicParser.VsAmpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsAmp}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsAmp(VisualBasicParser.VsAmpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsOr}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsOr(VisualBasicParser.VsOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsOr}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsOr(VisualBasicParser.VsOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsMinus}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsMinus(VisualBasicParser.VsMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsMinus}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsMinus(VisualBasicParser.VsMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsLiteral}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsLiteral(VisualBasicParser.VsLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsLiteral}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsLiteral(VisualBasicParser.VsLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsEqv}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsEqv(VisualBasicParser.VsEqvContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsEqv}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsEqv(VisualBasicParser.VsEqvContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsImp}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsImp(VisualBasicParser.VsImpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsImp}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsImp(VisualBasicParser.VsImpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsGt}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsGt(VisualBasicParser.VsGtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsGt}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsGt(VisualBasicParser.VsGtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsEq}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsEq(VisualBasicParser.VsEqContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsEq}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsEq(VisualBasicParser.VsEqContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vsMid}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void enterVsMid(VisualBasicParser.VsMidContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vsMid}
	 * labeled alternative in {@link VisualBasicParser#valueStmt}.
	 * @param ctx the parse tree
	 */
	void exitVsMid(VisualBasicParser.VsMidContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#variableStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableStmt(VisualBasicParser.VariableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#variableStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableStmt(VisualBasicParser.VariableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#variableListStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableListStmt(VisualBasicParser.VariableListStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#variableListStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableListStmt(VisualBasicParser.VariableListStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#variableSubStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableSubStmt(VisualBasicParser.VariableSubStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#variableSubStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableSubStmt(VisualBasicParser.VariableSubStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#whileWendStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileWendStmt(VisualBasicParser.WhileWendStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#whileWendStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileWendStmt(VisualBasicParser.WhileWendStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#widthStmt}.
	 * @param ctx the parse tree
	 */
	void enterWidthStmt(VisualBasicParser.WidthStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#widthStmt}.
	 * @param ctx the parse tree
	 */
	void exitWidthStmt(VisualBasicParser.WidthStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#withStmt}.
	 * @param ctx the parse tree
	 */
	void enterWithStmt(VisualBasicParser.WithStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#withStmt}.
	 * @param ctx the parse tree
	 */
	void exitWithStmt(VisualBasicParser.WithStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void enterWriteStmt(VisualBasicParser.WriteStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#writeStmt}.
	 * @param ctx the parse tree
	 */
	void exitWriteStmt(VisualBasicParser.WriteStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#explicitCallStmt}.
	 * @param ctx the parse tree
	 */
	void enterExplicitCallStmt(VisualBasicParser.ExplicitCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#explicitCallStmt}.
	 * @param ctx the parse tree
	 */
	void exitExplicitCallStmt(VisualBasicParser.ExplicitCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#eCS_ProcedureCall}.
	 * @param ctx the parse tree
	 */
	void enterECS_ProcedureCall(VisualBasicParser.ECS_ProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#eCS_ProcedureCall}.
	 * @param ctx the parse tree
	 */
	void exitECS_ProcedureCall(VisualBasicParser.ECS_ProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#eCS_MemberProcedureCall}.
	 * @param ctx the parse tree
	 */
	void enterECS_MemberProcedureCall(VisualBasicParser.ECS_MemberProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#eCS_MemberProcedureCall}.
	 * @param ctx the parse tree
	 */
	void exitECS_MemberProcedureCall(VisualBasicParser.ECS_MemberProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#implicitCallStmt_InBlock}.
	 * @param ctx the parse tree
	 */
	void enterImplicitCallStmt_InBlock(VisualBasicParser.ImplicitCallStmt_InBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#implicitCallStmt_InBlock}.
	 * @param ctx the parse tree
	 */
	void exitImplicitCallStmt_InBlock(VisualBasicParser.ImplicitCallStmt_InBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#iCS_B_ProcedureCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_B_ProcedureCall(VisualBasicParser.ICS_B_ProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#iCS_B_ProcedureCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_B_ProcedureCall(VisualBasicParser.ICS_B_ProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#iCS_B_MemberProcedureCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_B_MemberProcedureCall(VisualBasicParser.ICS_B_MemberProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#iCS_B_MemberProcedureCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_B_MemberProcedureCall(VisualBasicParser.ICS_B_MemberProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#implicitCallStmt_InStmt}.
	 * @param ctx the parse tree
	 */
	void enterImplicitCallStmt_InStmt(VisualBasicParser.ImplicitCallStmt_InStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#implicitCallStmt_InStmt}.
	 * @param ctx the parse tree
	 */
	void exitImplicitCallStmt_InStmt(VisualBasicParser.ImplicitCallStmt_InStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#iCS_S_VariableOrProcedureCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_S_VariableOrProcedureCall(VisualBasicParser.ICS_S_VariableOrProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#iCS_S_VariableOrProcedureCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_S_VariableOrProcedureCall(VisualBasicParser.ICS_S_VariableOrProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#iCS_S_ProcedureOrArrayCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_S_ProcedureOrArrayCall(VisualBasicParser.ICS_S_ProcedureOrArrayCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#iCS_S_ProcedureOrArrayCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_S_ProcedureOrArrayCall(VisualBasicParser.ICS_S_ProcedureOrArrayCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#iCS_S_NestedProcedureCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_S_NestedProcedureCall(VisualBasicParser.ICS_S_NestedProcedureCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#iCS_S_NestedProcedureCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_S_NestedProcedureCall(VisualBasicParser.ICS_S_NestedProcedureCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#iCS_S_MembersCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_S_MembersCall(VisualBasicParser.ICS_S_MembersCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#iCS_S_MembersCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_S_MembersCall(VisualBasicParser.ICS_S_MembersCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#iCS_S_MemberCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_S_MemberCall(VisualBasicParser.ICS_S_MemberCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#iCS_S_MemberCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_S_MemberCall(VisualBasicParser.ICS_S_MemberCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#iCS_S_DictionaryCall}.
	 * @param ctx the parse tree
	 */
	void enterICS_S_DictionaryCall(VisualBasicParser.ICS_S_DictionaryCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#iCS_S_DictionaryCall}.
	 * @param ctx the parse tree
	 */
	void exitICS_S_DictionaryCall(VisualBasicParser.ICS_S_DictionaryCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#argsCall}.
	 * @param ctx the parse tree
	 */
	void enterArgsCall(VisualBasicParser.ArgsCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#argsCall}.
	 * @param ctx the parse tree
	 */
	void exitArgsCall(VisualBasicParser.ArgsCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#argCall}.
	 * @param ctx the parse tree
	 */
	void enterArgCall(VisualBasicParser.ArgCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#argCall}.
	 * @param ctx the parse tree
	 */
	void exitArgCall(VisualBasicParser.ArgCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#dictionaryCallStmt}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryCallStmt(VisualBasicParser.DictionaryCallStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#dictionaryCallStmt}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryCallStmt(VisualBasicParser.DictionaryCallStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(VisualBasicParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(VisualBasicParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterArg(VisualBasicParser.ArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitArg(VisualBasicParser.ArgContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#argDefaultValue}.
	 * @param ctx the parse tree
	 */
	void enterArgDefaultValue(VisualBasicParser.ArgDefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#argDefaultValue}.
	 * @param ctx the parse tree
	 */
	void exitArgDefaultValue(VisualBasicParser.ArgDefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void enterSubscripts(VisualBasicParser.SubscriptsContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#subscripts}.
	 * @param ctx the parse tree
	 */
	void exitSubscripts(VisualBasicParser.SubscriptsContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#subscript}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(VisualBasicParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#subscript}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(VisualBasicParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#ambiguousIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousIdentifier(VisualBasicParser.AmbiguousIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#ambiguousIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousIdentifier(VisualBasicParser.AmbiguousIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#asTypeClause}.
	 * @param ctx the parse tree
	 */
	void enterAsTypeClause(VisualBasicParser.AsTypeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#asTypeClause}.
	 * @param ctx the parse tree
	 */
	void exitAsTypeClause(VisualBasicParser.AsTypeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(VisualBasicParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(VisualBasicParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#certainIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterCertainIdentifier(VisualBasicParser.CertainIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#certainIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitCertainIdentifier(VisualBasicParser.CertainIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(VisualBasicParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(VisualBasicParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#complexType}.
	 * @param ctx the parse tree
	 */
	void enterComplexType(VisualBasicParser.ComplexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#complexType}.
	 * @param ctx the parse tree
	 */
	void exitComplexType(VisualBasicParser.ComplexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void enterFieldLength(VisualBasicParser.FieldLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void exitFieldLength(VisualBasicParser.FieldLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#letterrange}.
	 * @param ctx the parse tree
	 */
	void enterLetterrange(VisualBasicParser.LetterrangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#letterrange}.
	 * @param ctx the parse tree
	 */
	void exitLetterrange(VisualBasicParser.LetterrangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#lineLabel}.
	 * @param ctx the parse tree
	 */
	void enterLineLabel(VisualBasicParser.LineLabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#lineLabel}.
	 * @param ctx the parse tree
	 */
	void exitLineLabel(VisualBasicParser.LineLabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(VisualBasicParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(VisualBasicParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#publicPrivateVisibility}.
	 * @param ctx the parse tree
	 */
	void enterPublicPrivateVisibility(VisualBasicParser.PublicPrivateVisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#publicPrivateVisibility}.
	 * @param ctx the parse tree
	 */
	void exitPublicPrivateVisibility(VisualBasicParser.PublicPrivateVisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#publicPrivateGlobalVisibility}.
	 * @param ctx the parse tree
	 */
	void enterPublicPrivateGlobalVisibility(VisualBasicParser.PublicPrivateGlobalVisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#publicPrivateGlobalVisibility}.
	 * @param ctx the parse tree
	 */
	void exitPublicPrivateGlobalVisibility(VisualBasicParser.PublicPrivateGlobalVisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(VisualBasicParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(VisualBasicParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#typeHint}.
	 * @param ctx the parse tree
	 */
	void enterTypeHint(VisualBasicParser.TypeHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#typeHint}.
	 * @param ctx the parse tree
	 */
	void exitTypeHint(VisualBasicParser.TypeHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#visibility}.
	 * @param ctx the parse tree
	 */
	void enterVisibility(VisualBasicParser.VisibilityContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#visibility}.
	 * @param ctx the parse tree
	 */
	void exitVisibility(VisualBasicParser.VisibilityContext ctx);
	/**
	 * Enter a parse tree produced by {@link VisualBasicParser#ambiguousKeyword}.
	 * @param ctx the parse tree
	 */
	void enterAmbiguousKeyword(VisualBasicParser.AmbiguousKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link VisualBasicParser#ambiguousKeyword}.
	 * @param ctx the parse tree
	 */
	void exitAmbiguousKeyword(VisualBasicParser.AmbiguousKeywordContext ctx);
}
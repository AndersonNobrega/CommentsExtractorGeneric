// Generated from /home/anderson/Programming Projects/Java Projects/Vocabulary_Metrics/src/org/bluebird/LanguagesUtils/Cpp/Cpp.g4 by ANTLR 4.7
package org.bluebird.LanguagesUtils.Cpp;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CppParser}.
 */
public interface CppListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CppParser#translationunit}.
	 * @param ctx the parse tree
	 */
	void enterTranslationunit(CppParser.TranslationunitContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#translationunit}.
	 * @param ctx the parse tree
	 */
	void exitTranslationunit(CppParser.TranslationunitContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#primaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryexpression(CppParser.PrimaryexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#primaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryexpression(CppParser.PrimaryexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#idexpression}.
	 * @param ctx the parse tree
	 */
	void enterIdexpression(CppParser.IdexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#idexpression}.
	 * @param ctx the parse tree
	 */
	void exitIdexpression(CppParser.IdexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#unqualifiedid}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedid(CppParser.UnqualifiedidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#unqualifiedid}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedid(CppParser.UnqualifiedidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#qualifiedid}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedid(CppParser.QualifiedidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#qualifiedid}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedid(CppParser.QualifiedidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#nestednamespecifier}.
	 * @param ctx the parse tree
	 */
	void enterNestednamespecifier(CppParser.NestednamespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#nestednamespecifier}.
	 * @param ctx the parse tree
	 */
	void exitNestednamespecifier(CppParser.NestednamespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#lambdaexpression}.
	 * @param ctx the parse tree
	 */
	void enterLambdaexpression(CppParser.LambdaexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#lambdaexpression}.
	 * @param ctx the parse tree
	 */
	void exitLambdaexpression(CppParser.LambdaexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#lambdaintroducer}.
	 * @param ctx the parse tree
	 */
	void enterLambdaintroducer(CppParser.LambdaintroducerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#lambdaintroducer}.
	 * @param ctx the parse tree
	 */
	void exitLambdaintroducer(CppParser.LambdaintroducerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#lambdacapture}.
	 * @param ctx the parse tree
	 */
	void enterLambdacapture(CppParser.LambdacaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#lambdacapture}.
	 * @param ctx the parse tree
	 */
	void exitLambdacapture(CppParser.LambdacaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#capturedefault}.
	 * @param ctx the parse tree
	 */
	void enterCapturedefault(CppParser.CapturedefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#capturedefault}.
	 * @param ctx the parse tree
	 */
	void exitCapturedefault(CppParser.CapturedefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#capturelist}.
	 * @param ctx the parse tree
	 */
	void enterCapturelist(CppParser.CapturelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#capturelist}.
	 * @param ctx the parse tree
	 */
	void exitCapturelist(CppParser.CapturelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#capture}.
	 * @param ctx the parse tree
	 */
	void enterCapture(CppParser.CaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#capture}.
	 * @param ctx the parse tree
	 */
	void exitCapture(CppParser.CaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#simplecapture}.
	 * @param ctx the parse tree
	 */
	void enterSimplecapture(CppParser.SimplecaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#simplecapture}.
	 * @param ctx the parse tree
	 */
	void exitSimplecapture(CppParser.SimplecaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#initcapture}.
	 * @param ctx the parse tree
	 */
	void enterInitcapture(CppParser.InitcaptureContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#initcapture}.
	 * @param ctx the parse tree
	 */
	void exitInitcapture(CppParser.InitcaptureContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#lambdadeclarator}.
	 * @param ctx the parse tree
	 */
	void enterLambdadeclarator(CppParser.LambdadeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#lambdadeclarator}.
	 * @param ctx the parse tree
	 */
	void exitLambdadeclarator(CppParser.LambdadeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	void enterPostfixexpression(CppParser.PostfixexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#postfixexpression}.
	 * @param ctx the parse tree
	 */
	void exitPostfixexpression(CppParser.PostfixexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void enterExpressionlist(CppParser.ExpressionlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#expressionlist}.
	 * @param ctx the parse tree
	 */
	void exitExpressionlist(CppParser.ExpressionlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#pseudodestructorname}.
	 * @param ctx the parse tree
	 */
	void enterPseudodestructorname(CppParser.PseudodestructornameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#pseudodestructorname}.
	 * @param ctx the parse tree
	 */
	void exitPseudodestructorname(CppParser.PseudodestructornameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	void enterUnaryexpression(CppParser.UnaryexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#unaryexpression}.
	 * @param ctx the parse tree
	 */
	void exitUnaryexpression(CppParser.UnaryexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryoperator(CppParser.UnaryoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#unaryoperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryoperator(CppParser.UnaryoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#newexpression}.
	 * @param ctx the parse tree
	 */
	void enterNewexpression(CppParser.NewexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#newexpression}.
	 * @param ctx the parse tree
	 */
	void exitNewexpression(CppParser.NewexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#newplacement}.
	 * @param ctx the parse tree
	 */
	void enterNewplacement(CppParser.NewplacementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#newplacement}.
	 * @param ctx the parse tree
	 */
	void exitNewplacement(CppParser.NewplacementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#newtypeid}.
	 * @param ctx the parse tree
	 */
	void enterNewtypeid(CppParser.NewtypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#newtypeid}.
	 * @param ctx the parse tree
	 */
	void exitNewtypeid(CppParser.NewtypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#newdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNewdeclarator(CppParser.NewdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#newdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNewdeclarator(CppParser.NewdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#noptrnewdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrnewdeclarator(CppParser.NoptrnewdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#noptrnewdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrnewdeclarator(CppParser.NoptrnewdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#newinitializer}.
	 * @param ctx the parse tree
	 */
	void enterNewinitializer(CppParser.NewinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#newinitializer}.
	 * @param ctx the parse tree
	 */
	void exitNewinitializer(CppParser.NewinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#deleteexpression}.
	 * @param ctx the parse tree
	 */
	void enterDeleteexpression(CppParser.DeleteexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#deleteexpression}.
	 * @param ctx the parse tree
	 */
	void exitDeleteexpression(CppParser.DeleteexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#noexceptexpression}.
	 * @param ctx the parse tree
	 */
	void enterNoexceptexpression(CppParser.NoexceptexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#noexceptexpression}.
	 * @param ctx the parse tree
	 */
	void exitNoexceptexpression(CppParser.NoexceptexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#castexpression}.
	 * @param ctx the parse tree
	 */
	void enterCastexpression(CppParser.CastexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#castexpression}.
	 * @param ctx the parse tree
	 */
	void exitCastexpression(CppParser.CastexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#pmexpression}.
	 * @param ctx the parse tree
	 */
	void enterPmexpression(CppParser.PmexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#pmexpression}.
	 * @param ctx the parse tree
	 */
	void exitPmexpression(CppParser.PmexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeexpression(CppParser.MultiplicativeexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#multiplicativeexpression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeexpression(CppParser.MultiplicativeexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveexpression(CppParser.AdditiveexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#additiveexpression}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveexpression(CppParser.AdditiveexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#shiftexpression}.
	 * @param ctx the parse tree
	 */
	void enterShiftexpression(CppParser.ShiftexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#shiftexpression}.
	 * @param ctx the parse tree
	 */
	void exitShiftexpression(CppParser.ShiftexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void enterRelationalexpression(CppParser.RelationalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#relationalexpression}.
	 * @param ctx the parse tree
	 */
	void exitRelationalexpression(CppParser.RelationalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	void enterEqualityexpression(CppParser.EqualityexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#equalityexpression}.
	 * @param ctx the parse tree
	 */
	void exitEqualityexpression(CppParser.EqualityexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#andexpression}.
	 * @param ctx the parse tree
	 */
	void enterAndexpression(CppParser.AndexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#andexpression}.
	 * @param ctx the parse tree
	 */
	void exitAndexpression(CppParser.AndexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void enterExclusiveorexpression(CppParser.ExclusiveorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#exclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void exitExclusiveorexpression(CppParser.ExclusiveorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void enterInclusiveorexpression(CppParser.InclusiveorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#inclusiveorexpression}.
	 * @param ctx the parse tree
	 */
	void exitInclusiveorexpression(CppParser.InclusiveorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#logicalandexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalandexpression(CppParser.LogicalandexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#logicalandexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalandexpression(CppParser.LogicalandexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#logicalorexpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalorexpression(CppParser.LogicalorexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#logicalorexpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalorexpression(CppParser.LogicalorexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#conditionalexpression}.
	 * @param ctx the parse tree
	 */
	void enterConditionalexpression(CppParser.ConditionalexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#conditionalexpression}.
	 * @param ctx the parse tree
	 */
	void exitConditionalexpression(CppParser.ConditionalexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentexpression(CppParser.AssignmentexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#assignmentexpression}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentexpression(CppParser.AssignmentexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#assignmentoperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentoperator(CppParser.AssignmentoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#assignmentoperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentoperator(CppParser.AssignmentoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(CppParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(CppParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#constantexpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantexpression(CppParser.ConstantexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#constantexpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantexpression(CppParser.ConstantexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CppParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CppParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#labeledstatement}.
	 * @param ctx the parse tree
	 */
	void enterLabeledstatement(CppParser.LabeledstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#labeledstatement}.
	 * @param ctx the parse tree
	 */
	void exitLabeledstatement(CppParser.LabeledstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void enterExpressionstatement(CppParser.ExpressionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#expressionstatement}.
	 * @param ctx the parse tree
	 */
	void exitExpressionstatement(CppParser.ExpressionstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#compoundstatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundstatement(CppParser.CompoundstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#compoundstatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundstatement(CppParser.CompoundstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#statementseq}.
	 * @param ctx the parse tree
	 */
	void enterStatementseq(CppParser.StatementseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#statementseq}.
	 * @param ctx the parse tree
	 */
	void exitStatementseq(CppParser.StatementseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#selectionstatement}.
	 * @param ctx the parse tree
	 */
	void enterSelectionstatement(CppParser.SelectionstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#selectionstatement}.
	 * @param ctx the parse tree
	 */
	void exitSelectionstatement(CppParser.SelectionstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(CppParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(CppParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#iterationstatement}.
	 * @param ctx the parse tree
	 */
	void enterIterationstatement(CppParser.IterationstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#iterationstatement}.
	 * @param ctx the parse tree
	 */
	void exitIterationstatement(CppParser.IterationstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#forinitstatement}.
	 * @param ctx the parse tree
	 */
	void enterForinitstatement(CppParser.ForinitstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#forinitstatement}.
	 * @param ctx the parse tree
	 */
	void exitForinitstatement(CppParser.ForinitstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#forrangedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterForrangedeclaration(CppParser.ForrangedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#forrangedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitForrangedeclaration(CppParser.ForrangedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#forrangeinitializer}.
	 * @param ctx the parse tree
	 */
	void enterForrangeinitializer(CppParser.ForrangeinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#forrangeinitializer}.
	 * @param ctx the parse tree
	 */
	void exitForrangeinitializer(CppParser.ForrangeinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void enterJumpstatement(CppParser.JumpstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#jumpstatement}.
	 * @param ctx the parse tree
	 */
	void exitJumpstatement(CppParser.JumpstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#declarationstatement}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationstatement(CppParser.DeclarationstatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#declarationstatement}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationstatement(CppParser.DeclarationstatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationseq(CppParser.DeclarationseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#declarationseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationseq(CppParser.DeclarationseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CppParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CppParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#blockdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterBlockdeclaration(CppParser.BlockdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#blockdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitBlockdeclaration(CppParser.BlockdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#aliasdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAliasdeclaration(CppParser.AliasdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#aliasdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAliasdeclaration(CppParser.AliasdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#simpledeclaration}.
	 * @param ctx the parse tree
	 */
	void enterSimpledeclaration(CppParser.SimpledeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#simpledeclaration}.
	 * @param ctx the parse tree
	 */
	void exitSimpledeclaration(CppParser.SimpledeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#static_assertdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterStatic_assertdeclaration(CppParser.Static_assertdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#static_assertdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitStatic_assertdeclaration(CppParser.Static_assertdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#emptydeclaration}.
	 * @param ctx the parse tree
	 */
	void enterEmptydeclaration(CppParser.EmptydeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#emptydeclaration}.
	 * @param ctx the parse tree
	 */
	void exitEmptydeclaration(CppParser.EmptydeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#attributedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterAttributedeclaration(CppParser.AttributedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#attributedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitAttributedeclaration(CppParser.AttributedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#declspecifier}.
	 * @param ctx the parse tree
	 */
	void enterDeclspecifier(CppParser.DeclspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#declspecifier}.
	 * @param ctx the parse tree
	 */
	void exitDeclspecifier(CppParser.DeclspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#declspecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterDeclspecifierseq(CppParser.DeclspecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#declspecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitDeclspecifierseq(CppParser.DeclspecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#storageclassspecifier}.
	 * @param ctx the parse tree
	 */
	void enterStorageclassspecifier(CppParser.StorageclassspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#storageclassspecifier}.
	 * @param ctx the parse tree
	 */
	void exitStorageclassspecifier(CppParser.StorageclassspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#functionspecifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionspecifier(CppParser.FunctionspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#functionspecifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionspecifier(CppParser.FunctionspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#typedefname}.
	 * @param ctx the parse tree
	 */
	void enterTypedefname(CppParser.TypedefnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#typedefname}.
	 * @param ctx the parse tree
	 */
	void exitTypedefname(CppParser.TypedefnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#typespecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypespecifier(CppParser.TypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#typespecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypespecifier(CppParser.TypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#trailingtypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterTrailingtypespecifier(CppParser.TrailingtypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#trailingtypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitTrailingtypespecifier(CppParser.TrailingtypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#typespecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterTypespecifierseq(CppParser.TypespecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#typespecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitTypespecifierseq(CppParser.TypespecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#trailingtypespecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterTrailingtypespecifierseq(CppParser.TrailingtypespecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#trailingtypespecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitTrailingtypespecifierseq(CppParser.TrailingtypespecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#simpletypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterSimpletypespecifier(CppParser.SimpletypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#simpletypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitSimpletypespecifier(CppParser.SimpletypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#thetypename}.
	 * @param ctx the parse tree
	 */
	void enterThetypename(CppParser.ThetypenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#thetypename}.
	 * @param ctx the parse tree
	 */
	void exitThetypename(CppParser.ThetypenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#decltypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterDecltypespecifier(CppParser.DecltypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#decltypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitDecltypespecifier(CppParser.DecltypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#elaboratedtypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterElaboratedtypespecifier(CppParser.ElaboratedtypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#elaboratedtypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitElaboratedtypespecifier(CppParser.ElaboratedtypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#enumname}.
	 * @param ctx the parse tree
	 */
	void enterEnumname(CppParser.EnumnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#enumname}.
	 * @param ctx the parse tree
	 */
	void exitEnumname(CppParser.EnumnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#enumspecifier}.
	 * @param ctx the parse tree
	 */
	void enterEnumspecifier(CppParser.EnumspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#enumspecifier}.
	 * @param ctx the parse tree
	 */
	void exitEnumspecifier(CppParser.EnumspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#enumhead}.
	 * @param ctx the parse tree
	 */
	void enterEnumhead(CppParser.EnumheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#enumhead}.
	 * @param ctx the parse tree
	 */
	void exitEnumhead(CppParser.EnumheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#opaqueenumdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterOpaqueenumdeclaration(CppParser.OpaqueenumdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#opaqueenumdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitOpaqueenumdeclaration(CppParser.OpaqueenumdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#enumkey}.
	 * @param ctx the parse tree
	 */
	void enterEnumkey(CppParser.EnumkeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#enumkey}.
	 * @param ctx the parse tree
	 */
	void exitEnumkey(CppParser.EnumkeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#enumbase}.
	 * @param ctx the parse tree
	 */
	void enterEnumbase(CppParser.EnumbaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#enumbase}.
	 * @param ctx the parse tree
	 */
	void exitEnumbase(CppParser.EnumbaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#enumeratorlist}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratorlist(CppParser.EnumeratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#enumeratorlist}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratorlist(CppParser.EnumeratorlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#enumeratordefinition}.
	 * @param ctx the parse tree
	 */
	void enterEnumeratordefinition(CppParser.EnumeratordefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#enumeratordefinition}.
	 * @param ctx the parse tree
	 */
	void exitEnumeratordefinition(CppParser.EnumeratordefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void enterEnumerator(CppParser.EnumeratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#enumerator}.
	 * @param ctx the parse tree
	 */
	void exitEnumerator(CppParser.EnumeratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#namespacename}.
	 * @param ctx the parse tree
	 */
	void enterNamespacename(CppParser.NamespacenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#namespacename}.
	 * @param ctx the parse tree
	 */
	void exitNamespacename(CppParser.NamespacenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#originalnamespacename}.
	 * @param ctx the parse tree
	 */
	void enterOriginalnamespacename(CppParser.OriginalnamespacenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#originalnamespacename}.
	 * @param ctx the parse tree
	 */
	void exitOriginalnamespacename(CppParser.OriginalnamespacenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#namespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespacedefinition(CppParser.NamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#namespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespacedefinition(CppParser.NamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#namednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamednamespacedefinition(CppParser.NamednamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#namednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamednamespacedefinition(CppParser.NamednamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#originalnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterOriginalnamespacedefinition(CppParser.OriginalnamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#originalnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitOriginalnamespacedefinition(CppParser.OriginalnamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#extensionnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterExtensionnamespacedefinition(CppParser.ExtensionnamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#extensionnamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitExtensionnamespacedefinition(CppParser.ExtensionnamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#unnamednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void enterUnnamednamespacedefinition(CppParser.UnnamednamespacedefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#unnamednamespacedefinition}.
	 * @param ctx the parse tree
	 */
	void exitUnnamednamespacedefinition(CppParser.UnnamednamespacedefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#namespacebody}.
	 * @param ctx the parse tree
	 */
	void enterNamespacebody(CppParser.NamespacebodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#namespacebody}.
	 * @param ctx the parse tree
	 */
	void exitNamespacebody(CppParser.NamespacebodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#namespacealias}.
	 * @param ctx the parse tree
	 */
	void enterNamespacealias(CppParser.NamespacealiasContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#namespacealias}.
	 * @param ctx the parse tree
	 */
	void exitNamespacealias(CppParser.NamespacealiasContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#namespacealiasdefinition}.
	 * @param ctx the parse tree
	 */
	void enterNamespacealiasdefinition(CppParser.NamespacealiasdefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#namespacealiasdefinition}.
	 * @param ctx the parse tree
	 */
	void exitNamespacealiasdefinition(CppParser.NamespacealiasdefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void enterQualifiednamespacespecifier(CppParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#qualifiednamespacespecifier}.
	 * @param ctx the parse tree
	 */
	void exitQualifiednamespacespecifier(CppParser.QualifiednamespacespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#usingdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterUsingdeclaration(CppParser.UsingdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#usingdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitUsingdeclaration(CppParser.UsingdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#usingdirective}.
	 * @param ctx the parse tree
	 */
	void enterUsingdirective(CppParser.UsingdirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#usingdirective}.
	 * @param ctx the parse tree
	 */
	void exitUsingdirective(CppParser.UsingdirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#asmdefinition}.
	 * @param ctx the parse tree
	 */
	void enterAsmdefinition(CppParser.AsmdefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#asmdefinition}.
	 * @param ctx the parse tree
	 */
	void exitAsmdefinition(CppParser.AsmdefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#linkagespecification}.
	 * @param ctx the parse tree
	 */
	void enterLinkagespecification(CppParser.LinkagespecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#linkagespecification}.
	 * @param ctx the parse tree
	 */
	void exitLinkagespecification(CppParser.LinkagespecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#attributespecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterAttributespecifierseq(CppParser.AttributespecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#attributespecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitAttributespecifierseq(CppParser.AttributespecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#attributespecifier}.
	 * @param ctx the parse tree
	 */
	void enterAttributespecifier(CppParser.AttributespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#attributespecifier}.
	 * @param ctx the parse tree
	 */
	void exitAttributespecifier(CppParser.AttributespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void enterAlignmentspecifier(CppParser.AlignmentspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#alignmentspecifier}.
	 * @param ctx the parse tree
	 */
	void exitAlignmentspecifier(CppParser.AlignmentspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#attributelist}.
	 * @param ctx the parse tree
	 */
	void enterAttributelist(CppParser.AttributelistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#attributelist}.
	 * @param ctx the parse tree
	 */
	void exitAttributelist(CppParser.AttributelistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(CppParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(CppParser.AttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#attributetoken}.
	 * @param ctx the parse tree
	 */
	void enterAttributetoken(CppParser.AttributetokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#attributetoken}.
	 * @param ctx the parse tree
	 */
	void exitAttributetoken(CppParser.AttributetokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#attributescopedtoken}.
	 * @param ctx the parse tree
	 */
	void enterAttributescopedtoken(CppParser.AttributescopedtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#attributescopedtoken}.
	 * @param ctx the parse tree
	 */
	void exitAttributescopedtoken(CppParser.AttributescopedtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#attributenamespace}.
	 * @param ctx the parse tree
	 */
	void enterAttributenamespace(CppParser.AttributenamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#attributenamespace}.
	 * @param ctx the parse tree
	 */
	void exitAttributenamespace(CppParser.AttributenamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#attributeargumentclause}.
	 * @param ctx the parse tree
	 */
	void enterAttributeargumentclause(CppParser.AttributeargumentclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#attributeargumentclause}.
	 * @param ctx the parse tree
	 */
	void exitAttributeargumentclause(CppParser.AttributeargumentclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#balancedtokenseq}.
	 * @param ctx the parse tree
	 */
	void enterBalancedtokenseq(CppParser.BalancedtokenseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#balancedtokenseq}.
	 * @param ctx the parse tree
	 */
	void exitBalancedtokenseq(CppParser.BalancedtokenseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void enterBalancedtoken(CppParser.BalancedtokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#balancedtoken}.
	 * @param ctx the parse tree
	 */
	void exitBalancedtoken(CppParser.BalancedtokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void enterInitdeclaratorlist(CppParser.InitdeclaratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#initdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void exitInitdeclaratorlist(CppParser.InitdeclaratorlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#initdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterInitdeclarator(CppParser.InitdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#initdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitInitdeclarator(CppParser.InitdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#declarator}.
	 * @param ctx the parse tree
	 */
	void enterDeclarator(CppParser.DeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#declarator}.
	 * @param ctx the parse tree
	 */
	void exitDeclarator(CppParser.DeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#ptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPtrdeclarator(CppParser.PtrdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#ptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPtrdeclarator(CppParser.PtrdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#noptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrdeclarator(CppParser.NoptrdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#noptrdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrdeclarator(CppParser.NoptrdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 */
	void enterParametersandqualifiers(CppParser.ParametersandqualifiersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#parametersandqualifiers}.
	 * @param ctx the parse tree
	 */
	void exitParametersandqualifiers(CppParser.ParametersandqualifiersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#trailingreturntype}.
	 * @param ctx the parse tree
	 */
	void enterTrailingreturntype(CppParser.TrailingreturntypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#trailingreturntype}.
	 * @param ctx the parse tree
	 */
	void exitTrailingreturntype(CppParser.TrailingreturntypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#ptroperator}.
	 * @param ctx the parse tree
	 */
	void enterPtroperator(CppParser.PtroperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#ptroperator}.
	 * @param ctx the parse tree
	 */
	void exitPtroperator(CppParser.PtroperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void enterCvqualifierseq(CppParser.CvqualifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#cvqualifierseq}.
	 * @param ctx the parse tree
	 */
	void exitCvqualifierseq(CppParser.CvqualifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#cvqualifier}.
	 * @param ctx the parse tree
	 */
	void enterCvqualifier(CppParser.CvqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#cvqualifier}.
	 * @param ctx the parse tree
	 */
	void exitCvqualifier(CppParser.CvqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void enterRefqualifier(CppParser.RefqualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#refqualifier}.
	 * @param ctx the parse tree
	 */
	void exitRefqualifier(CppParser.RefqualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void enterDeclaratorid(CppParser.DeclaratoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#declaratorid}.
	 * @param ctx the parse tree
	 */
	void exitDeclaratorid(CppParser.DeclaratoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#thetypeid}.
	 * @param ctx the parse tree
	 */
	void enterThetypeid(CppParser.ThetypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#thetypeid}.
	 * @param ctx the parse tree
	 */
	void exitThetypeid(CppParser.ThetypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#abstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractdeclarator(CppParser.AbstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#abstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractdeclarator(CppParser.AbstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterPtrabstractdeclarator(CppParser.PtrabstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#ptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitPtrabstractdeclarator(CppParser.PtrabstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrabstractdeclarator(CppParser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#noptrabstractdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrabstractdeclarator(CppParser.NoptrabstractdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#abstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterAbstractpackdeclarator(CppParser.AbstractpackdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#abstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitAbstractpackdeclarator(CppParser.AbstractpackdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterNoptrabstractpackdeclarator(CppParser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#noptrabstractpackdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitNoptrabstractpackdeclarator(CppParser.NoptrabstractpackdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclarationclause(CppParser.ParameterdeclarationclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#parameterdeclarationclause}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclarationclause(CppParser.ParameterdeclarationclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclarationlist(CppParser.ParameterdeclarationlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#parameterdeclarationlist}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclarationlist(CppParser.ParameterdeclarationlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterParameterdeclaration(CppParser.ParameterdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#parameterdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitParameterdeclaration(CppParser.ParameterdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#functiondefinition}.
	 * @param ctx the parse tree
	 */
	void enterFunctiondefinition(CppParser.FunctiondefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#functiondefinition}.
	 * @param ctx the parse tree
	 */
	void exitFunctiondefinition(CppParser.FunctiondefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void enterFunctionbody(CppParser.FunctionbodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#functionbody}.
	 * @param ctx the parse tree
	 */
	void exitFunctionbody(CppParser.FunctionbodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#initializer}.
	 * @param ctx the parse tree
	 */
	void enterInitializer(CppParser.InitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#initializer}.
	 * @param ctx the parse tree
	 */
	void exitInitializer(CppParser.InitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 */
	void enterBraceorequalinitializer(CppParser.BraceorequalinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#braceorequalinitializer}.
	 * @param ctx the parse tree
	 */
	void exitBraceorequalinitializer(CppParser.BraceorequalinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#initializerclause}.
	 * @param ctx the parse tree
	 */
	void enterInitializerclause(CppParser.InitializerclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#initializerclause}.
	 * @param ctx the parse tree
	 */
	void exitInitializerclause(CppParser.InitializerclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#initializerlist}.
	 * @param ctx the parse tree
	 */
	void enterInitializerlist(CppParser.InitializerlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#initializerlist}.
	 * @param ctx the parse tree
	 */
	void exitInitializerlist(CppParser.InitializerlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#bracedinitlist}.
	 * @param ctx the parse tree
	 */
	void enterBracedinitlist(CppParser.BracedinitlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#bracedinitlist}.
	 * @param ctx the parse tree
	 */
	void exitBracedinitlist(CppParser.BracedinitlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#classname}.
	 * @param ctx the parse tree
	 */
	void enterClassname(CppParser.ClassnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#classname}.
	 * @param ctx the parse tree
	 */
	void exitClassname(CppParser.ClassnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#classspecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassspecifier(CppParser.ClassspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#classspecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassspecifier(CppParser.ClassspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#classhead}.
	 * @param ctx the parse tree
	 */
	void enterClasshead(CppParser.ClassheadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#classhead}.
	 * @param ctx the parse tree
	 */
	void exitClasshead(CppParser.ClassheadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#classheadname}.
	 * @param ctx the parse tree
	 */
	void enterClassheadname(CppParser.ClassheadnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#classheadname}.
	 * @param ctx the parse tree
	 */
	void exitClassheadname(CppParser.ClassheadnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#classvirtspecifier}.
	 * @param ctx the parse tree
	 */
	void enterClassvirtspecifier(CppParser.ClassvirtspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#classvirtspecifier}.
	 * @param ctx the parse tree
	 */
	void exitClassvirtspecifier(CppParser.ClassvirtspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#classkey}.
	 * @param ctx the parse tree
	 */
	void enterClasskey(CppParser.ClasskeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#classkey}.
	 * @param ctx the parse tree
	 */
	void exitClasskey(CppParser.ClasskeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#memberspecification}.
	 * @param ctx the parse tree
	 */
	void enterMemberspecification(CppParser.MemberspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#memberspecification}.
	 * @param ctx the parse tree
	 */
	void exitMemberspecification(CppParser.MemberspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclaration(CppParser.MemberdeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#memberdeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclaration(CppParser.MemberdeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#memberdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclaratorlist(CppParser.MemberdeclaratorlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#memberdeclaratorlist}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclaratorlist(CppParser.MemberdeclaratorlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#memberdeclarator}.
	 * @param ctx the parse tree
	 */
	void enterMemberdeclarator(CppParser.MemberdeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#memberdeclarator}.
	 * @param ctx the parse tree
	 */
	void exitMemberdeclarator(CppParser.MemberdeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#virtspecifierseq}.
	 * @param ctx the parse tree
	 */
	void enterVirtspecifierseq(CppParser.VirtspecifierseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#virtspecifierseq}.
	 * @param ctx the parse tree
	 */
	void exitVirtspecifierseq(CppParser.VirtspecifierseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#virtspecifier}.
	 * @param ctx the parse tree
	 */
	void enterVirtspecifier(CppParser.VirtspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#virtspecifier}.
	 * @param ctx the parse tree
	 */
	void exitVirtspecifier(CppParser.VirtspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#purespecifier}.
	 * @param ctx the parse tree
	 */
	void enterPurespecifier(CppParser.PurespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#purespecifier}.
	 * @param ctx the parse tree
	 */
	void exitPurespecifier(CppParser.PurespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#baseclause}.
	 * @param ctx the parse tree
	 */
	void enterBaseclause(CppParser.BaseclauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#baseclause}.
	 * @param ctx the parse tree
	 */
	void exitBaseclause(CppParser.BaseclauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#basespecifierlist}.
	 * @param ctx the parse tree
	 */
	void enterBasespecifierlist(CppParser.BasespecifierlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#basespecifierlist}.
	 * @param ctx the parse tree
	 */
	void exitBasespecifierlist(CppParser.BasespecifierlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#basespecifier}.
	 * @param ctx the parse tree
	 */
	void enterBasespecifier(CppParser.BasespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#basespecifier}.
	 * @param ctx the parse tree
	 */
	void exitBasespecifier(CppParser.BasespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#classordecltype}.
	 * @param ctx the parse tree
	 */
	void enterClassordecltype(CppParser.ClassordecltypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#classordecltype}.
	 * @param ctx the parse tree
	 */
	void exitClassordecltype(CppParser.ClassordecltypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#basetypespecifier}.
	 * @param ctx the parse tree
	 */
	void enterBasetypespecifier(CppParser.BasetypespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#basetypespecifier}.
	 * @param ctx the parse tree
	 */
	void exitBasetypespecifier(CppParser.BasetypespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#accessspecifier}.
	 * @param ctx the parse tree
	 */
	void enterAccessspecifier(CppParser.AccessspecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#accessspecifier}.
	 * @param ctx the parse tree
	 */
	void exitAccessspecifier(CppParser.AccessspecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#conversionfunctionid}.
	 * @param ctx the parse tree
	 */
	void enterConversionfunctionid(CppParser.ConversionfunctionidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#conversionfunctionid}.
	 * @param ctx the parse tree
	 */
	void exitConversionfunctionid(CppParser.ConversionfunctionidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#conversiontypeid}.
	 * @param ctx the parse tree
	 */
	void enterConversiontypeid(CppParser.ConversiontypeidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#conversiontypeid}.
	 * @param ctx the parse tree
	 */
	void exitConversiontypeid(CppParser.ConversiontypeidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#conversiondeclarator}.
	 * @param ctx the parse tree
	 */
	void enterConversiondeclarator(CppParser.ConversiondeclaratorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#conversiondeclarator}.
	 * @param ctx the parse tree
	 */
	void exitConversiondeclarator(CppParser.ConversiondeclaratorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#ctorinitializer}.
	 * @param ctx the parse tree
	 */
	void enterCtorinitializer(CppParser.CtorinitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#ctorinitializer}.
	 * @param ctx the parse tree
	 */
	void exitCtorinitializer(CppParser.CtorinitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#meminitializerlist}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerlist(CppParser.MeminitializerlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#meminitializerlist}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerlist(CppParser.MeminitializerlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#meminitializer}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializer(CppParser.MeminitializerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#meminitializer}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializer(CppParser.MeminitializerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void enterMeminitializerid(CppParser.MeminitializeridContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#meminitializerid}.
	 * @param ctx the parse tree
	 */
	void exitMeminitializerid(CppParser.MeminitializeridContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#operatorfunctionid}.
	 * @param ctx the parse tree
	 */
	void enterOperatorfunctionid(CppParser.OperatorfunctionidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#operatorfunctionid}.
	 * @param ctx the parse tree
	 */
	void exitOperatorfunctionid(CppParser.OperatorfunctionidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#literaloperatorid}.
	 * @param ctx the parse tree
	 */
	void enterLiteraloperatorid(CppParser.LiteraloperatoridContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#literaloperatorid}.
	 * @param ctx the parse tree
	 */
	void exitLiteraloperatorid(CppParser.LiteraloperatoridContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#templatedeclaration}.
	 * @param ctx the parse tree
	 */
	void enterTemplatedeclaration(CppParser.TemplatedeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#templatedeclaration}.
	 * @param ctx the parse tree
	 */
	void exitTemplatedeclaration(CppParser.TemplatedeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#templateparameterlist}.
	 * @param ctx the parse tree
	 */
	void enterTemplateparameterlist(CppParser.TemplateparameterlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#templateparameterlist}.
	 * @param ctx the parse tree
	 */
	void exitTemplateparameterlist(CppParser.TemplateparameterlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#templateparameter}.
	 * @param ctx the parse tree
	 */
	void enterTemplateparameter(CppParser.TemplateparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#templateparameter}.
	 * @param ctx the parse tree
	 */
	void exitTemplateparameter(CppParser.TemplateparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#typeparameter}.
	 * @param ctx the parse tree
	 */
	void enterTypeparameter(CppParser.TypeparameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#typeparameter}.
	 * @param ctx the parse tree
	 */
	void exitTypeparameter(CppParser.TypeparameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#simpletemplateid}.
	 * @param ctx the parse tree
	 */
	void enterSimpletemplateid(CppParser.SimpletemplateidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#simpletemplateid}.
	 * @param ctx the parse tree
	 */
	void exitSimpletemplateid(CppParser.SimpletemplateidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#templateid}.
	 * @param ctx the parse tree
	 */
	void enterTemplateid(CppParser.TemplateidContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#templateid}.
	 * @param ctx the parse tree
	 */
	void exitTemplateid(CppParser.TemplateidContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#templatename}.
	 * @param ctx the parse tree
	 */
	void enterTemplatename(CppParser.TemplatenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#templatename}.
	 * @param ctx the parse tree
	 */
	void exitTemplatename(CppParser.TemplatenameContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#templateargumentlist}.
	 * @param ctx the parse tree
	 */
	void enterTemplateargumentlist(CppParser.TemplateargumentlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#templateargumentlist}.
	 * @param ctx the parse tree
	 */
	void exitTemplateargumentlist(CppParser.TemplateargumentlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#templateargument}.
	 * @param ctx the parse tree
	 */
	void enterTemplateargument(CppParser.TemplateargumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#templateargument}.
	 * @param ctx the parse tree
	 */
	void exitTemplateargument(CppParser.TemplateargumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#typenamespecifier}.
	 * @param ctx the parse tree
	 */
	void enterTypenamespecifier(CppParser.TypenamespecifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#typenamespecifier}.
	 * @param ctx the parse tree
	 */
	void exitTypenamespecifier(CppParser.TypenamespecifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#explicitinstantiation}.
	 * @param ctx the parse tree
	 */
	void enterExplicitinstantiation(CppParser.ExplicitinstantiationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#explicitinstantiation}.
	 * @param ctx the parse tree
	 */
	void exitExplicitinstantiation(CppParser.ExplicitinstantiationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#explicitspecialization}.
	 * @param ctx the parse tree
	 */
	void enterExplicitspecialization(CppParser.ExplicitspecializationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#explicitspecialization}.
	 * @param ctx the parse tree
	 */
	void exitExplicitspecialization(CppParser.ExplicitspecializationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#tryblock}.
	 * @param ctx the parse tree
	 */
	void enterTryblock(CppParser.TryblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#tryblock}.
	 * @param ctx the parse tree
	 */
	void exitTryblock(CppParser.TryblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#functiontryblock}.
	 * @param ctx the parse tree
	 */
	void enterFunctiontryblock(CppParser.FunctiontryblockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#functiontryblock}.
	 * @param ctx the parse tree
	 */
	void exitFunctiontryblock(CppParser.FunctiontryblockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#handlerseq}.
	 * @param ctx the parse tree
	 */
	void enterHandlerseq(CppParser.HandlerseqContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#handlerseq}.
	 * @param ctx the parse tree
	 */
	void exitHandlerseq(CppParser.HandlerseqContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#handler}.
	 * @param ctx the parse tree
	 */
	void enterHandler(CppParser.HandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#handler}.
	 * @param ctx the parse tree
	 */
	void exitHandler(CppParser.HandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#exceptiondeclaration}.
	 * @param ctx the parse tree
	 */
	void enterExceptiondeclaration(CppParser.ExceptiondeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#exceptiondeclaration}.
	 * @param ctx the parse tree
	 */
	void exitExceptiondeclaration(CppParser.ExceptiondeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#throwexpression}.
	 * @param ctx the parse tree
	 */
	void enterThrowexpression(CppParser.ThrowexpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#throwexpression}.
	 * @param ctx the parse tree
	 */
	void exitThrowexpression(CppParser.ThrowexpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#exceptionspecification}.
	 * @param ctx the parse tree
	 */
	void enterExceptionspecification(CppParser.ExceptionspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#exceptionspecification}.
	 * @param ctx the parse tree
	 */
	void exitExceptionspecification(CppParser.ExceptionspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#dynamicexceptionspecification}.
	 * @param ctx the parse tree
	 */
	void enterDynamicexceptionspecification(CppParser.DynamicexceptionspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#dynamicexceptionspecification}.
	 * @param ctx the parse tree
	 */
	void exitDynamicexceptionspecification(CppParser.DynamicexceptionspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#typeidlist}.
	 * @param ctx the parse tree
	 */
	void enterTypeidlist(CppParser.TypeidlistContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#typeidlist}.
	 * @param ctx the parse tree
	 */
	void exitTypeidlist(CppParser.TypeidlistContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#noexceptspecification}.
	 * @param ctx the parse tree
	 */
	void enterNoexceptspecification(CppParser.NoexceptspecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#noexceptspecification}.
	 * @param ctx the parse tree
	 */
	void exitNoexceptspecification(CppParser.NoexceptspecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#rightShift}.
	 * @param ctx the parse tree
	 */
	void enterRightShift(CppParser.RightShiftContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#rightShift}.
	 * @param ctx the parse tree
	 */
	void exitRightShift(CppParser.RightShiftContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#rightShiftAssign}.
	 * @param ctx the parse tree
	 */
	void enterRightShiftAssign(CppParser.RightShiftAssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#rightShiftAssign}.
	 * @param ctx the parse tree
	 */
	void exitRightShiftAssign(CppParser.RightShiftAssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#theoperator}.
	 * @param ctx the parse tree
	 */
	void enterTheoperator(CppParser.TheoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#theoperator}.
	 * @param ctx the parse tree
	 */
	void exitTheoperator(CppParser.TheoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(CppParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(CppParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#booleanliteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanliteral(CppParser.BooleanliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#booleanliteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanliteral(CppParser.BooleanliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#pointerliteral}.
	 * @param ctx the parse tree
	 */
	void enterPointerliteral(CppParser.PointerliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#pointerliteral}.
	 * @param ctx the parse tree
	 */
	void exitPointerliteral(CppParser.PointerliteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link CppParser#userdefinedliteral}.
	 * @param ctx the parse tree
	 */
	void enterUserdefinedliteral(CppParser.UserdefinedliteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link CppParser#userdefinedliteral}.
	 * @param ctx the parse tree
	 */
	void exitUserdefinedliteral(CppParser.UserdefinedliteralContext ctx);
}
// Generated from ./FineFunctionGrammar.g4 by ANTLR 4.0

	package antlr;


  import java.util.Stack;

import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface FineFunctionGrammarListener extends ParseTreeListener {
	void enterPre_else(FineFunctionGrammarParser.Pre_elseContext ctx);
	void exitPre_else(FineFunctionGrammarParser.Pre_elseContext ctx);

	void enterDeclarator(FineFunctionGrammarParser.DeclaratorContext ctx);
	void exitDeclarator(FineFunctionGrammarParser.DeclaratorContext ctx);

	void enterTemplate_decl_start(FineFunctionGrammarParser.Template_decl_startContext ctx);
	void exitTemplate_decl_start(FineFunctionGrammarParser.Template_decl_startContext ctx);

	void enterFunction_argument_list(FineFunctionGrammarParser.Function_argument_listContext ctx);
	void exitFunction_argument_list(FineFunctionGrammarParser.Function_argument_listContext ctx);

	void enterType_suffix(FineFunctionGrammarParser.Type_suffixContext ctx);
	void exitType_suffix(FineFunctionGrammarParser.Type_suffixContext ctx);

	void enterNo_squares_or_semicolon(FineFunctionGrammarParser.No_squares_or_semicolonContext ctx);
	void exitNo_squares_or_semicolon(FineFunctionGrammarParser.No_squares_or_semicolonContext ctx);

	void enterFor_statement(FineFunctionGrammarParser.For_statementContext ctx);
	void exitFor_statement(FineFunctionGrammarParser.For_statementContext ctx);

	void enterCast_expression(FineFunctionGrammarParser.Cast_expressionContext ctx);
	void exitCast_expression(FineFunctionGrammarParser.Cast_expressionContext ctx);

	void enterNo_angle_brackets_or_brackets(FineFunctionGrammarParser.No_angle_brackets_or_bracketsContext ctx);
	void exitNo_angle_brackets_or_brackets(FineFunctionGrammarParser.No_angle_brackets_or_bracketsContext ctx);

	void enterEquality_expression(FineFunctionGrammarParser.Equality_expressionContext ctx);
	void exitEquality_expression(FineFunctionGrammarParser.Equality_expressionContext ctx);

	void enterNo_comma_or_semicolon(FineFunctionGrammarParser.No_comma_or_semicolonContext ctx);
	void exitNo_comma_or_semicolon(FineFunctionGrammarParser.No_comma_or_semicolonContext ctx);

	void enterTry_statement(FineFunctionGrammarParser.Try_statementContext ctx);
	void exitTry_statement(FineFunctionGrammarParser.Try_statementContext ctx);

	void enterNumber(FineFunctionGrammarParser.NumberContext ctx);
	void exitNumber(FineFunctionGrammarParser.NumberContext ctx);

	void enterBase_type(FineFunctionGrammarParser.Base_typeContext ctx);
	void exitBase_type(FineFunctionGrammarParser.Base_typeContext ctx);

	void enterPtrMemberAccess(FineFunctionGrammarParser.PtrMemberAccessContext ctx);
	void exitPtrMemberAccess(FineFunctionGrammarParser.PtrMemberAccessContext ctx);

	void enterPre_opener(FineFunctionGrammarParser.Pre_openerContext ctx);
	void exitPre_opener(FineFunctionGrammarParser.Pre_openerContext ctx);

	void enterNo_squares(FineFunctionGrammarParser.No_squaresContext ctx);
	void exitNo_squares(FineFunctionGrammarParser.No_squaresContext ctx);

	void enterShift_expression(FineFunctionGrammarParser.Shift_expressionContext ctx);
	void exitShift_expression(FineFunctionGrammarParser.Shift_expressionContext ctx);

	void enterDeclByClass(FineFunctionGrammarParser.DeclByClassContext ctx);
	void exitDeclByClass(FineFunctionGrammarParser.DeclByClassContext ctx);

	void enterType_name(FineFunctionGrammarParser.Type_nameContext ctx);
	void exitType_name(FineFunctionGrammarParser.Type_nameContext ctx);

	void enterBreakStatement(FineFunctionGrammarParser.BreakStatementContext ctx);
	void exitBreakStatement(FineFunctionGrammarParser.BreakStatementContext ctx);

	void enterFuncCall(FineFunctionGrammarParser.FuncCallContext ctx);
	void exitFuncCall(FineFunctionGrammarParser.FuncCallContext ctx);

	void enterInclusive_or_expression(FineFunctionGrammarParser.Inclusive_or_expressionContext ctx);
	void exitInclusive_or_expression(FineFunctionGrammarParser.Inclusive_or_expressionContext ctx);

	void enterBase_classes(FineFunctionGrammarParser.Base_classesContext ctx);
	void exitBase_classes(FineFunctionGrammarParser.Base_classesContext ctx);

	void enterIncDecOp(FineFunctionGrammarParser.IncDecOpContext ctx);
	void exitIncDecOp(FineFunctionGrammarParser.IncDecOpContext ctx);

	void enterPre_closer(FineFunctionGrammarParser.Pre_closerContext ctx);
	void exitPre_closer(FineFunctionGrammarParser.Pre_closerContext ctx);

	void enterRelational_expression(FineFunctionGrammarParser.Relational_expressionContext ctx);
	void exitRelational_expression(FineFunctionGrammarParser.Relational_expressionContext ctx);

	void enterClass_name(FineFunctionGrammarParser.Class_nameContext ctx);
	void exitClass_name(FineFunctionGrammarParser.Class_nameContext ctx);

	void enterParam_decl_specifiers(FineFunctionGrammarParser.Param_decl_specifiersContext ctx);
	void exitParam_decl_specifiers(FineFunctionGrammarParser.Param_decl_specifiersContext ctx);

	void enterParam_type(FineFunctionGrammarParser.Param_typeContext ctx);
	void exitParam_type(FineFunctionGrammarParser.Param_typeContext ctx);

	void enterFunction_argument(FineFunctionGrammarParser.Function_argumentContext ctx);
	void exitFunction_argument(FineFunctionGrammarParser.Function_argumentContext ctx);

	void enterIf_statement(FineFunctionGrammarParser.If_statementContext ctx);
	void exitIf_statement(FineFunctionGrammarParser.If_statementContext ctx);

	void enterWater(FineFunctionGrammarParser.WaterContext ctx);
	void exitWater(FineFunctionGrammarParser.WaterContext ctx);

	void enterClosing_curly(FineFunctionGrammarParser.Closing_curlyContext ctx);
	void exitClosing_curly(FineFunctionGrammarParser.Closing_curlyContext ctx);

	void enterFor_init_statement(FineFunctionGrammarParser.For_init_statementContext ctx);
	void exitFor_init_statement(FineFunctionGrammarParser.For_init_statementContext ctx);

	void enterOr_expression(FineFunctionGrammarParser.Or_expressionContext ctx);
	void exitOr_expression(FineFunctionGrammarParser.Or_expressionContext ctx);

	void enterRelational_operator(FineFunctionGrammarParser.Relational_operatorContext ctx);
	void exitRelational_operator(FineFunctionGrammarParser.Relational_operatorContext ctx);

	void enterDo_statement1(FineFunctionGrammarParser.Do_statement1Context ctx);
	void exitDo_statement1(FineFunctionGrammarParser.Do_statement1Context ctx);

	void enterOperator(FineFunctionGrammarParser.OperatorContext ctx);
	void exitOperator(FineFunctionGrammarParser.OperatorContext ctx);

	void enterInc_dec(FineFunctionGrammarParser.Inc_decContext ctx);
	void exitInc_dec(FineFunctionGrammarParser.Inc_decContext ctx);

	void enterConditional_expression(FineFunctionGrammarParser.Conditional_expressionContext ctx);
	void exitConditional_expression(FineFunctionGrammarParser.Conditional_expressionContext ctx);

	void enterInitDeclSimple(FineFunctionGrammarParser.InitDeclSimpleContext ctx);
	void exitInitDeclSimple(FineFunctionGrammarParser.InitDeclSimpleContext ctx);

	void enterOpening_curly(FineFunctionGrammarParser.Opening_curlyContext ctx);
	void exitOpening_curly(FineFunctionGrammarParser.Opening_curlyContext ctx);

	void enterPrimary_expression(FineFunctionGrammarParser.Primary_expressionContext ctx);
	void exitPrimary_expression(FineFunctionGrammarParser.Primary_expressionContext ctx);

	void enterGotoStatement(FineFunctionGrammarParser.GotoStatementContext ctx);
	void exitGotoStatement(FineFunctionGrammarParser.GotoStatementContext ctx);

	void enterNo_brackets(FineFunctionGrammarParser.No_bracketsContext ctx);
	void exitNo_brackets(FineFunctionGrammarParser.No_bracketsContext ctx);

	void enterBit_and_expression(FineFunctionGrammarParser.Bit_and_expressionContext ctx);
	void exitBit_and_expression(FineFunctionGrammarParser.Bit_and_expressionContext ctx);

	void enterAssign_water(FineFunctionGrammarParser.Assign_waterContext ctx);
	void exitAssign_water(FineFunctionGrammarParser.Assign_waterContext ctx);

	void enterCast_target(FineFunctionGrammarParser.Cast_targetContext ctx);
	void exitCast_target(FineFunctionGrammarParser.Cast_targetContext ctx);

	void enterInitializer(FineFunctionGrammarParser.InitializerContext ctx);
	void exitInitializer(FineFunctionGrammarParser.InitializerContext ctx);

	void enterFunction_decl_specifiers(FineFunctionGrammarParser.Function_decl_specifiersContext ctx);
	void exitFunction_decl_specifiers(FineFunctionGrammarParser.Function_decl_specifiersContext ctx);

	void enterReturnStatement(FineFunctionGrammarParser.ReturnStatementContext ctx);
	void exitReturnStatement(FineFunctionGrammarParser.ReturnStatementContext ctx);

	void enterMultiplicative_expression(FineFunctionGrammarParser.Multiplicative_expressionContext ctx);
	void exitMultiplicative_expression(FineFunctionGrammarParser.Multiplicative_expressionContext ctx);

	void enterAssign_expr(FineFunctionGrammarParser.Assign_exprContext ctx);
	void exitAssign_expr(FineFunctionGrammarParser.Assign_exprContext ctx);

	void enterExpr_statement(FineFunctionGrammarParser.Expr_statementContext ctx);
	void exitExpr_statement(FineFunctionGrammarParser.Expr_statementContext ctx);

	void enterMemberAccess(FineFunctionGrammarParser.MemberAccessContext ctx);
	void exitMemberAccess(FineFunctionGrammarParser.MemberAccessContext ctx);

	void enterBase_class(FineFunctionGrammarParser.Base_classContext ctx);
	void exitBase_class(FineFunctionGrammarParser.Base_classContext ctx);

	void enterParameter_name(FineFunctionGrammarParser.Parameter_nameContext ctx);
	void exitParameter_name(FineFunctionGrammarParser.Parameter_nameContext ctx);

	void enterAccess_specifier(FineFunctionGrammarParser.Access_specifierContext ctx);
	void exitAccess_specifier(FineFunctionGrammarParser.Access_specifierContext ctx);

	void enterAssign_water_l2(FineFunctionGrammarParser.Assign_water_l2Context ctx);
	void exitAssign_water_l2(FineFunctionGrammarParser.Assign_water_l2Context ctx);

	void enterInit_declarator_list(FineFunctionGrammarParser.Init_declarator_listContext ctx);
	void exitInit_declarator_list(FineFunctionGrammarParser.Init_declarator_listContext ctx);

	void enterCondition(FineFunctionGrammarParser.ConditionContext ctx);
	void exitCondition(FineFunctionGrammarParser.ConditionContext ctx);

	void enterArrayIndexing(FineFunctionGrammarParser.ArrayIndexingContext ctx);
	void exitArrayIndexing(FineFunctionGrammarParser.ArrayIndexingContext ctx);

	void enterCatch_statement(FineFunctionGrammarParser.Catch_statementContext ctx);
	void exitCatch_statement(FineFunctionGrammarParser.Catch_statementContext ctx);

	void enterLabel(FineFunctionGrammarParser.LabelContext ctx);
	void exitLabel(FineFunctionGrammarParser.LabelContext ctx);

	void enterExclusive_or_expression(FineFunctionGrammarParser.Exclusive_or_expressionContext ctx);
	void exitExclusive_or_expression(FineFunctionGrammarParser.Exclusive_or_expressionContext ctx);

	void enterStatement(FineFunctionGrammarParser.StatementContext ctx);
	void exitStatement(FineFunctionGrammarParser.StatementContext ctx);

	void enterInitDeclWithCall(FineFunctionGrammarParser.InitDeclWithCallContext ctx);
	void exitInitDeclWithCall(FineFunctionGrammarParser.InitDeclWithCallContext ctx);

	void enterParam_type_id(FineFunctionGrammarParser.Param_type_idContext ctx);
	void exitParam_type_id(FineFunctionGrammarParser.Param_type_idContext ctx);

	void enterAdditive_expression(FineFunctionGrammarParser.Additive_expressionContext ctx);
	void exitAdditive_expression(FineFunctionGrammarParser.Additive_expressionContext ctx);

	void enterInitializer_list(FineFunctionGrammarParser.Initializer_listContext ctx);
	void exitInitializer_list(FineFunctionGrammarParser.Initializer_listContext ctx);

	void enterUnary_operator(FineFunctionGrammarParser.Unary_operatorContext ctx);
	void exitUnary_operator(FineFunctionGrammarParser.Unary_operatorContext ctx);

	void enterElse_statement(FineFunctionGrammarParser.Else_statementContext ctx);
	void exitElse_statement(FineFunctionGrammarParser.Else_statementContext ctx);

	void enterSwitch_statement(FineFunctionGrammarParser.Switch_statementContext ctx);
	void exitSwitch_statement(FineFunctionGrammarParser.Switch_statementContext ctx);

	void enterDo_statement(FineFunctionGrammarParser.Do_statementContext ctx);
	void exitDo_statement(FineFunctionGrammarParser.Do_statementContext ctx);

	void enterNo_brackets_curlies_or_squares(FineFunctionGrammarParser.No_brackets_curlies_or_squaresContext ctx);
	void exitNo_brackets_curlies_or_squares(FineFunctionGrammarParser.No_brackets_curlies_or_squaresContext ctx);

	void enterWhile_statement(FineFunctionGrammarParser.While_statementContext ctx);
	void exitWhile_statement(FineFunctionGrammarParser.While_statementContext ctx);

	void enterIdentifier(FineFunctionGrammarParser.IdentifierContext ctx);
	void exitIdentifier(FineFunctionGrammarParser.IdentifierContext ctx);

	void enterPrimaryOnly(FineFunctionGrammarParser.PrimaryOnlyContext ctx);
	void exitPrimaryOnly(FineFunctionGrammarParser.PrimaryOnlyContext ctx);

	void enterNo_brackets_or_semicolon(FineFunctionGrammarParser.No_brackets_or_semicolonContext ctx);
	void exitNo_brackets_or_semicolon(FineFunctionGrammarParser.No_brackets_or_semicolonContext ctx);

	void enterNo_curlies(FineFunctionGrammarParser.No_curliesContext ctx);
	void exitNo_curlies(FineFunctionGrammarParser.No_curliesContext ctx);

	void enterEquality_operator(FineFunctionGrammarParser.Equality_operatorContext ctx);
	void exitEquality_operator(FineFunctionGrammarParser.Equality_operatorContext ctx);

	void enterExpr(FineFunctionGrammarParser.ExprContext ctx);
	void exitExpr(FineFunctionGrammarParser.ExprContext ctx);

	void enterParam_type_list(FineFunctionGrammarParser.Param_type_listContext ctx);
	void exitParam_type_list(FineFunctionGrammarParser.Param_type_listContext ctx);

	void enterSimple_decl(FineFunctionGrammarParser.Simple_declContext ctx);
	void exitSimple_decl(FineFunctionGrammarParser.Simple_declContext ctx);

	void enterBlock_starter(FineFunctionGrammarParser.Block_starterContext ctx);
	void exitBlock_starter(FineFunctionGrammarParser.Block_starterContext ctx);

	void enterAssignment_operator(FineFunctionGrammarParser.Assignment_operatorContext ctx);
	void exitAssignment_operator(FineFunctionGrammarParser.Assignment_operatorContext ctx);

	void enterStatements(FineFunctionGrammarParser.StatementsContext ctx);
	void exitStatements(FineFunctionGrammarParser.StatementsContext ctx);

	void enterUnary_expression(FineFunctionGrammarParser.Unary_expressionContext ctx);
	void exitUnary_expression(FineFunctionGrammarParser.Unary_expressionContext ctx);

	void enterPtrs(FineFunctionGrammarParser.PtrsContext ctx);
	void exitPtrs(FineFunctionGrammarParser.PtrsContext ctx);

	void enterInitDeclWithAssign(FineFunctionGrammarParser.InitDeclWithAssignContext ctx);
	void exitInitDeclWithAssign(FineFunctionGrammarParser.InitDeclWithAssignContext ctx);

	void enterConstant(FineFunctionGrammarParser.ConstantContext ctx);
	void exitConstant(FineFunctionGrammarParser.ConstantContext ctx);

	void enterContinueStatement(FineFunctionGrammarParser.ContinueStatementContext ctx);
	void exitContinueStatement(FineFunctionGrammarParser.ContinueStatementContext ctx);

	void enterPtr_operator(FineFunctionGrammarParser.Ptr_operatorContext ctx);
	void exitPtr_operator(FineFunctionGrammarParser.Ptr_operatorContext ctx);

	void enterClass_def(FineFunctionGrammarParser.Class_defContext ctx);
	void exitClass_def(FineFunctionGrammarParser.Class_defContext ctx);

	void enterAnd_expression(FineFunctionGrammarParser.And_expressionContext ctx);
	void exitAnd_expression(FineFunctionGrammarParser.And_expressionContext ctx);

	void enterTemplate_param_list(FineFunctionGrammarParser.Template_param_listContext ctx);
	void exitTemplate_param_list(FineFunctionGrammarParser.Template_param_listContext ctx);

	void enterDeclByType(FineFunctionGrammarParser.DeclByTypeContext ctx);
	void exitDeclByType(FineFunctionGrammarParser.DeclByTypeContext ctx);
}
package ast.functionDef;

import org.antlr.v4.runtime.ParserRuleContext;

import ast.ASTNode;

public class ParameterType extends ASTNode
{
	String completeType = "";
	String baseType = "";

	@Override
	public String getEscapedCodeStr()
	{
		setCodeStr(completeType);
		return getCodeStr();
	}

	public void setCompleteType(String aCompleteType)
	{
		completeType = aCompleteType;
	}

	public void setBaseType(String aBaseType)
	{
		baseType = aBaseType;
	}

	public void initializeFromContext(ParserRuleContext aCtx)
	{
		// use entire parameter as location. It's the best
		// we can do right now.
		super.initializeFromContext(aCtx);
	}

}

/*
 * generated by Xtext 2.21.0
 */
package mdsd.parser.antlr;

import com.google.inject.Inject;
import mdsd.parser.antlr.internal.InternalMathCompilerParser;
import mdsd.services.MathCompilerGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MathCompilerParser extends AbstractAntlrParser {

	@Inject
	private MathCompilerGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMathCompilerParser createParser(XtextTokenStream stream) {
		return new InternalMathCompilerParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Expressions";
	}

	public MathCompilerGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MathCompilerGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
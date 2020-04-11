/*
 * generated by Xtext 2.21.0
 */
package mdsd.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Map;
import mdsd.ide.contentassist.antlr.internal.InternalMathCompilerParser;
import mdsd.services.MathCompilerGrammarAccess;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class MathCompilerParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(MathCompilerGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, MathCompilerGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getExpAccess().getAlternatives_1_0(), "rule__Exp__Alternatives_1_0");
			builder.put(grammarAccess.getFactorAccess().getAlternatives_1_0(), "rule__Factor__Alternatives_1_0");
			builder.put(grammarAccess.getPrimaryAccess().getAlternatives(), "rule__Primary__Alternatives");
			builder.put(grammarAccess.getMathExpAccess().getGroup(), "rule__MathExp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup(), "rule__Exp__Group__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1(), "rule__Exp__Group_1__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_0(), "rule__Exp__Group_1_0_0__0");
			builder.put(grammarAccess.getExpAccess().getGroup_1_0_1(), "rule__Exp__Group_1_0_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup(), "rule__Factor__Group__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1(), "rule__Factor__Group_1__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_0_0(), "rule__Factor__Group_1_0_0__0");
			builder.put(grammarAccess.getFactorAccess().getGroup_1_0_1(), "rule__Factor__Group_1_0_1__0");
			builder.put(grammarAccess.getExponentAccess().getGroup(), "rule__Exponent__Group__0");
			builder.put(grammarAccess.getVariableUseAccess().getGroup(), "rule__VariableUse__Group__0");
			builder.put(grammarAccess.getVariableBindingAccess().getGroup(), "rule__VariableBinding__Group__0");
			builder.put(grammarAccess.getParenthesisAccess().getGroup(), "rule__Parenthesis__Group__0");
			builder.put(grammarAccess.getNumberAccess().getGroup(), "rule__Number__Group__0");
			builder.put(grammarAccess.getExpressionsAccess().getExpressionsAssignment(), "rule__Expressions__ExpressionsAssignment");
			builder.put(grammarAccess.getMathExpAccess().getLineAssignment_1(), "rule__MathExp__LineAssignment_1");
			builder.put(grammarAccess.getMathExpAccess().getExpAssignment_3(), "rule__MathExp__ExpAssignment_3");
			builder.put(grammarAccess.getExpAccess().getRightAssignment_1_1(), "rule__Exp__RightAssignment_1_1");
			builder.put(grammarAccess.getFactorAccess().getRightAssignment_1_1(), "rule__Factor__RightAssignment_1_1");
			builder.put(grammarAccess.getExponentAccess().getBaseAssignment_1(), "rule__Exponent__BaseAssignment_1");
			builder.put(grammarAccess.getExponentAccess().getExponentAssignment_3(), "rule__Exponent__ExponentAssignment_3");
			builder.put(grammarAccess.getVariableUseAccess().getIdAssignment_1(), "rule__VariableUse__IdAssignment_1");
			builder.put(grammarAccess.getVariableBindingAccess().getIdAssignment_2(), "rule__VariableBinding__IdAssignment_2");
			builder.put(grammarAccess.getVariableBindingAccess().getBindingAssignment_4(), "rule__VariableBinding__BindingAssignment_4");
			builder.put(grammarAccess.getVariableBindingAccess().getBodyAssignment_6(), "rule__VariableBinding__BodyAssignment_6");
			builder.put(grammarAccess.getNumberAccess().getValueAssignment_1(), "rule__Number__ValueAssignment_1");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private MathCompilerGrammarAccess grammarAccess;

	@Override
	protected InternalMathCompilerParser createParser() {
		InternalMathCompilerParser result = new InternalMathCompilerParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public MathCompilerGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MathCompilerGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}
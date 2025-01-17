/*
 * generated by Xtext 2.21.0
 */
package mdsd.serializer;

import com.google.inject.Inject;
import java.util.List;
import mdsd.services.MathCompilerGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class MathCompilerSyntacticSequencer extends AbstractSyntacticSequencer {

	protected MathCompilerGrammarAccess grammarAccess;
	protected AbstractElementAlias match_Parenthesis_LeftParenthesisKeyword_0_a;
	protected AbstractElementAlias match_Parenthesis_LeftParenthesisKeyword_0_p;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (MathCompilerGrammarAccess) access;
		match_Parenthesis_LeftParenthesisKeyword_0_a = new TokenAlias(true, true, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
		match_Parenthesis_LeftParenthesisKeyword_0_p = new TokenAlias(true, false, grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_Parenthesis_LeftParenthesisKeyword_0_a.equals(syntax))
				emit_Parenthesis_LeftParenthesisKeyword_0_a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_Parenthesis_LeftParenthesisKeyword_0_p.equals(syntax))
				emit_Parenthesis_LeftParenthesisKeyword_0_p(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     '('*
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'let' id=ID
	 *     (rule start) (ambiguity) base=INT
	 *     (rule start) (ambiguity) id=ID
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) {Div.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {Mult.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 */
	protected void emit_Parenthesis_LeftParenthesisKeyword_0_a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     '('+
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) (ambiguity) 'let' id=ID
	 *     (rule start) (ambiguity) base=INT
	 *     (rule start) (ambiguity) id=ID
	 *     (rule start) (ambiguity) value=INT
	 *     (rule start) (ambiguity) {Div.left=}
	 *     (rule start) (ambiguity) {Minus.left=}
	 *     (rule start) (ambiguity) {Mult.left=}
	 *     (rule start) (ambiguity) {Plus.left=}
	 */
	protected void emit_Parenthesis_LeftParenthesisKeyword_0_p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}

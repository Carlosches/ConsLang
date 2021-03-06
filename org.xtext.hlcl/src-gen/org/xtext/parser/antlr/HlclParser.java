/*
 * generated by Xtext 2.13.0
 */
package org.xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.parser.antlr.internal.InternalHlclParser;
import org.xtext.services.HlclGrammarAccess;

public class HlclParser extends AbstractAntlrParser {

	@Inject
	private HlclGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalHlclParser createParser(XtextTokenStream stream) {
		return new InternalHlclParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "ConstraintProgram";
	}

	public HlclGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(HlclGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}

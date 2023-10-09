// Generated from CSV.g4 by ANTLR 4.0

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.antlr.v4.runtime.tree.ErrorNode;

public class CSVBaseListener implements CSVListener {
	@Override public void enterFile(CSVParser.FileContext ctx) { }
	@Override public void exitFile(CSVParser.FileContext ctx) { }

	@Override public void enterField(CSVParser.FieldContext ctx) { }
	@Override public void exitField(CSVParser.FieldContext ctx) { }

	@Override public void enterHdr(CSVParser.HdrContext ctx) { }
	@Override public void exitHdr(CSVParser.HdrContext ctx) { }

	@Override public void enterRow(CSVParser.RowContext ctx) { }
	@Override public void exitRow(CSVParser.RowContext ctx) { }

	@Override public void enterEveryRule(ParserRuleContext ctx) { }
	@Override public void exitEveryRule(ParserRuleContext ctx) { }
	@Override public void visitTerminal(TerminalNode node) { }
	@Override public void visitErrorNode(ErrorNode node) { }
}
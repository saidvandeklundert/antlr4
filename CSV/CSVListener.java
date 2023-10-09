// Generated from CSV.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface CSVListener extends ParseTreeListener {
	void enterFile(CSVParser.FileContext ctx);
	void exitFile(CSVParser.FileContext ctx);

	void enterField(CSVParser.FieldContext ctx);
	void exitField(CSVParser.FieldContext ctx);

	void enterHdr(CSVParser.HdrContext ctx);
	void exitHdr(CSVParser.HdrContext ctx);

	void enterRow(CSVParser.RowContext ctx);
	void exitRow(CSVParser.RowContext ctx);
}
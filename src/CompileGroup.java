import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
// import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.*;

import java.io.FileInputStream;
import java.io.InputStream;


public class CompileGroup {
	
	
	public static void error(Token t, String msg) {
	        System.err.printf("line %d:%d %s\n", t.getLine(), 
				  t.getCharPositionInLine(), msg);
	   }

	    public void process(String[] args) throws Exception {
	        String inputFile = null;
	        if ( args.length>0 ) {
	        	inputFile = args[0];
	        } else {
	        	inputFile = "C:\\Users\\HPMSD Ohgaki\\git\\Groupoid\\src\\sample.group";
	        }
	        InputStream is = System.in;
	        if ( inputFile!=null ) {
	            is = new FileInputStream(inputFile);
	        }
	        ANTLRInputStream input = new ANTLRInputStream(is);
	        GroupoidLexer lexer = new GroupoidLexer(input);
	        CommonTokenStream tokens = new CommonTokenStream(lexer);
	        GroupoidParser groupoid = new GroupoidParser(tokens);
	        groupoid.setBuildParseTree(true);
	        ParseTree tree = groupoid.group();
	        System.err.println(";; show tree in text form");
	        System.err.println(";; " + tree.toStringTree(groupoid));

	        ParseTreeWalker walker = new ParseTreeWalker();
	        //walker.walk(def, tree);
	        //System.err.println(";; create next phase and feed symbol table info from def to ref phase");
	        //RefPhase ref = new RefPhase(def.globals, def.scopes);
	        // walker.walk(ref, tree);
		
	        // Generate Code if all OK
	        System.err.println(";; start GenCode.\n;;\n;;");
		
	        BindGroup bind = new BindGroup(); // def.globals, def.scopes);
	        walker.walk(bind, tree);
	    }

	    public static void main(String[] args) throws Exception {
	        new CompileGroup().process(args);
	    }


}


import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;


import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import org.antlr.v4.runtime.*;

import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;

public class BindGroup extends GroupoidBaseListener {
	private int count;
	
	public BindGroup() {
		// nothing special
	}
	
	public void enterGroup(GroupoidParser.GroupContext ctx) {
		this.count = 0;
	}
	
	public void exitGroup(GroupoidParser.GroupContext ctx) {
		showResult();
	}
	
	public void exitMember(GroupoidParser.MemberContext ctx) {
		this.count++;
	}
	
	
	// utilities
	
	private void showResult() {
		System.out.println(Integer.toString(this.count));
	}

}

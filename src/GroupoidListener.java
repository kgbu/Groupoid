// Generated from Groupoid.g4 by ANTLR 4.0
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.Token;

public interface GroupoidListener extends ParseTreeListener {
	void enterPosition(GroupoidParser.PositionContext ctx);
	void exitPosition(GroupoidParser.PositionContext ctx);

	void enterMember(GroupoidParser.MemberContext ctx);
	void exitMember(GroupoidParser.MemberContext ctx);

	void enterWeight(GroupoidParser.WeightContext ctx);
	void exitWeight(GroupoidParser.WeightContext ctx);

	void enterGroup(GroupoidParser.GroupContext ctx);
	void exitGroup(GroupoidParser.GroupContext ctx);
}
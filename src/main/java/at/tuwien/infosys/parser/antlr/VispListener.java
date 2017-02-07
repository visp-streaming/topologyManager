// Generated from /projects/dsg_practical/code/VISP-TopologyManager/src/main/java/at/tuwien/infosys/parser/antlr/Visp.g4 by ANTLR 4.6
package at.tuwien.infosys.parser.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link VispParser}.
 */
public interface VispListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link VispParser#configfile}.
	 * @param ctx the parse tree
	 */
	void enterConfigfile(VispParser.ConfigfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link VispParser#configfile}.
	 * @param ctx the parse tree
	 */
	void exitConfigfile(VispParser.ConfigfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link VispParser#nodeBlock}.
	 * @param ctx the parse tree
	 */
	void enterNodeBlock(VispParser.NodeBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link VispParser#nodeBlock}.
	 * @param ctx the parse tree
	 */
	void exitNodeBlock(VispParser.NodeBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link VispParser#nodeHead}.
	 * @param ctx the parse tree
	 */
	void enterNodeHead(VispParser.NodeHeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link VispParser#nodeHead}.
	 * @param ctx the parse tree
	 */
	void exitNodeHead(VispParser.NodeHeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link VispParser#newNodeId}.
	 * @param ctx the parse tree
	 */
	void enterNewNodeId(VispParser.NewNodeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link VispParser#newNodeId}.
	 * @param ctx the parse tree
	 */
	void exitNewNodeId(VispParser.NewNodeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link VispParser#sourceNode}.
	 * @param ctx the parse tree
	 */
	void enterSourceNode(VispParser.SourceNodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VispParser#sourceNode}.
	 * @param ctx the parse tree
	 */
	void exitSourceNode(VispParser.SourceNodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VispParser#nodeBody}.
	 * @param ctx the parse tree
	 */
	void enterNodeBody(VispParser.NodeBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link VispParser#nodeBody}.
	 * @param ctx the parse tree
	 */
	void exitNodeBody(VispParser.NodeBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link VispParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(VispParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link VispParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(VispParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link VispParser#allowedLocationsStmt}.
	 * @param ctx the parse tree
	 */
	void enterAllowedLocationsStmt(VispParser.AllowedLocationsStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VispParser#allowedLocationsStmt}.
	 * @param ctx the parse tree
	 */
	void exitAllowedLocationsStmt(VispParser.AllowedLocationsStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VispParser#concreteLocationStmt}.
	 * @param ctx the parse tree
	 */
	void enterConcreteLocationStmt(VispParser.ConcreteLocationStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VispParser#concreteLocationStmt}.
	 * @param ctx the parse tree
	 */
	void exitConcreteLocationStmt(VispParser.ConcreteLocationStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VispParser#inputFormatStmt}.
	 * @param ctx the parse tree
	 */
	void enterInputFormatStmt(VispParser.InputFormatStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VispParser#inputFormatStmt}.
	 * @param ctx the parse tree
	 */
	void exitInputFormatStmt(VispParser.InputFormatStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VispParser#sourceStmt}.
	 * @param ctx the parse tree
	 */
	void enterSourceStmt(VispParser.SourceStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VispParser#sourceStmt}.
	 * @param ctx the parse tree
	 */
	void exitSourceStmt(VispParser.SourceStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VispParser#mechanismStmt}.
	 * @param ctx the parse tree
	 */
	void enterMechanismStmt(VispParser.MechanismStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VispParser#mechanismStmt}.
	 * @param ctx the parse tree
	 */
	void exitMechanismStmt(VispParser.MechanismStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VispParser#typeStmt}.
	 * @param ctx the parse tree
	 */
	void enterTypeStmt(VispParser.TypeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VispParser#typeStmt}.
	 * @param ctx the parse tree
	 */
	void exitTypeStmt(VispParser.TypeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VispParser#outputFormatStmt}.
	 * @param ctx the parse tree
	 */
	void enterOutputFormatStmt(VispParser.OutputFormatStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VispParser#outputFormatStmt}.
	 * @param ctx the parse tree
	 */
	void exitOutputFormatStmt(VispParser.OutputFormatStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VispParser#statefulStmt}.
	 * @param ctx the parse tree
	 */
	void enterStatefulStmt(VispParser.StatefulStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VispParser#statefulStmt}.
	 * @param ctx the parse tree
	 */
	void exitStatefulStmt(VispParser.StatefulStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VispParser#nodeType}.
	 * @param ctx the parse tree
	 */
	void enterNodeType(VispParser.NodeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VispParser#nodeType}.
	 * @param ctx the parse tree
	 */
	void exitNodeType(VispParser.NodeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link VispParser#sizeStmt}.
	 * @param ctx the parse tree
	 */
	void enterSizeStmt(VispParser.SizeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link VispParser#sizeStmt}.
	 * @param ctx the parse tree
	 */
	void exitSizeStmt(VispParser.SizeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link VispParser#sizeType}.
	 * @param ctx the parse tree
	 */
	void enterSizeType(VispParser.SizeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link VispParser#sizeType}.
	 * @param ctx the parse tree
	 */
	void exitSizeType(VispParser.SizeTypeContext ctx);
}
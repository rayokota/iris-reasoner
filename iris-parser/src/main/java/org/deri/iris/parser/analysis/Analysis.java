/* This file was generated by SableCC (http://www.sablecc.org/). */

package org.deri.iris.parser.analysis;

import org.deri.iris.parser.node.*;

public interface Analysis extends Switch
{
    Object getIn(Node node);
    void setIn(Node node, Object o);
    Object getOut(Node node);
    void setOut(Node node, Object o);

    void caseStart(Start node);
    void caseAProgram(AProgram node);
    void caseARuleExpr(ARuleExpr node);
    void caseAFactExpr(AFactExpr node);
    void caseAQueryExpr(AQueryExpr node);
    void caseARule(ARule node);
    void caseAFact(AFact node);
    void caseAQuery(AQuery node);
    void caseALitlist(ALitlist node);
    void caseAAndLitlist(AAndLitlist node);
    void caseACommaLitlist(ACommaLitlist node);
    void caseANegatedLiteral(ANegatedLiteral node);
    void caseALiteral(ALiteral node);
    void caseABuiltinLiteral(ABuiltinLiteral node);
    void caseANegatedbuiltinLiteral(ANegatedbuiltinLiteral node);
    void caseAPredicate(APredicate node);
    void caseAParamlist(AParamlist node);
    void caseATermTermlist(ATermTermlist node);
    void caseATermlist(ATermlist node);
    void caseAIntlist(AIntlist node);
    void caseAIntIntlist(AIntIntlist node);
    void caseAFunctionTerm(AFunctionTerm node);
    void caseAVarTerm(AVarTerm node);
    void caseAIntegerTerm(AIntegerTerm node);
    void caseAIntegerlTerm(AIntegerlTerm node);
    void caseAStringTerm(AStringTerm node);
    void caseAStringlTerm(AStringlTerm node);
    void caseADecimalTerm(ADecimalTerm node);
    void caseADecimallTerm(ADecimallTerm node);
    void caseASqnameTerm(ASqnameTerm node);
    void caseASqnamelTerm(ASqnamelTerm node);
    void caseAIriTerm(AIriTerm node);
    void caseAIrilTerm(AIrilTerm node);
    void caseABooleanTerm(ABooleanTerm node);
    void caseADoubleTerm(ADoubleTerm node);
    void caseAFloatTerm(AFloatTerm node);
    void caseADateTerm(ADateTerm node);
    void caseADatetzTerm(ADatetzTerm node);
    void caseATimeisTerm(ATimeisTerm node);
    void caseATimeistzTerm(ATimeistzTerm node);
    void caseATimefsTerm(ATimefsTerm node);
    void caseATimefstzTerm(ATimefstzTerm node);
    void caseATimemsTerm(ATimemsTerm node);
    void caseATimemstzTerm(ATimemstzTerm node);
    void caseADatetimeisTerm(ADatetimeisTerm node);
    void caseADatetimeistzTerm(ADatetimeistzTerm node);
    void caseADatetimefsTerm(ADatetimefsTerm node);
    void caseADatetimefstzTerm(ADatetimefstzTerm node);
    void caseADatetimemsTerm(ADatetimemsTerm node);
    void caseADatetimemstzTerm(ADatetimemstzTerm node);
    void caseADurationisTerm(ADurationisTerm node);
    void caseADurationfsTerm(ADurationfsTerm node);
    void caseADurationmsTerm(ADurationmsTerm node);
    void caseADaytimedurationfsTerm(ADaytimedurationfsTerm node);
    void caseADaytimedurationmsTerm(ADaytimedurationmsTerm node);
    void caseAYearmonthdurationTerm(AYearmonthdurationTerm node);
    void caseAGdayTerm(AGdayTerm node);
    void caseAGmonthTerm(AGmonthTerm node);
    void caseAGyearTerm(AGyearTerm node);
    void caseAGyearmonthTerm(AGyearmonthTerm node);
    void caseAGmonthdayTerm(AGmonthdayTerm node);
    void caseABase64binaryTerm(ABase64binaryTerm node);
    void caseAHexbinaryTerm(AHexbinaryTerm node);
    void caseAXmlliteralTerm(AXmlliteralTerm node);
    void caseAXmlliterallangTerm(AXmlliterallangTerm node);
    void caseAPlainliteralTerm(APlainliteralTerm node);
    void caseABinaryBuiltin(ABinaryBuiltin node);
    void caseAEqualsBuiltin(AEqualsBuiltin node);
    void caseATernaryBuiltin(ATernaryBuiltin node);

    void caseTTBlank(TTBlank node);
    void caseTTComment(TTComment node);
    void caseTTDot(TTDot node);
    void caseTTImpliedby(TTImpliedby node);
    void caseTTAnd(TTAnd node);
    void caseTTNot(TTNot node);
    void caseTTComma(TTComma node);
    void caseTTLpar(TTLpar node);
    void caseTTRpar(TTRpar node);
    void caseTTVariable(TTVariable node);
    void caseTTQuery(TTQuery node);
    void caseTTId(TTId node);
    void caseTTUnders(TTUnders node);
    void caseTTBinOp(TTBinOp node);
    void caseTTTerOp(TTTerOp node);
    void caseTTEq(TTEq node);
    void caseTTInt(TTInt node);
    void caseTTPosint(TTPosint node);
    void caseTTDec(TTDec node);
    void caseTTStr(TTStr node);
    void caseTTSq(TTSq node);
    void caseTTPreInteger(TTPreInteger node);
    void caseTTPreString(TTPreString node);
    void caseTTPreDecimal(TTPreDecimal node);
    void caseTTPreDouble(TTPreDouble node);
    void caseTTPreFloat(TTPreFloat node);
    void caseTTPreBase64(TTPreBase64 node);
    void caseTTPreBoolean(TTPreBoolean node);
    void caseTTPreDate(TTPreDate node);
    void caseTTPreDatetime(TTPreDatetime node);
    void caseTTPreDuration(TTPreDuration node);
    void caseTTPreYearmonthduration(TTPreYearmonthduration node);
    void caseTTPreDaytimeduration(TTPreDaytimeduration node);
    void caseTTPreGday(TTPreGday node);
    void caseTTPreGmonthday(TTPreGmonthday node);
    void caseTTPreGmonth(TTPreGmonth node);
    void caseTTPreGyearmonth(TTPreGyearmonth node);
    void caseTTPreGyear(TTPreGyear node);
    void caseTTPreHex(TTPreHex node);
    void caseTTPreIri(TTPreIri node);
    void caseTTPreSqname(TTPreSqname node);
    void caseTTPreTime(TTPreTime node);
    void caseTTPreXmlliteral(TTPreXmlliteral node);
    void caseTTPrePlainliteral(TTPrePlainliteral node);
    void caseEOF(EOF node);
}

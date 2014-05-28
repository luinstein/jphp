package org.develnext.jphp.core.tokenizer;

import java.util.HashMap;
import java.util.Map;

public enum TokenType {
    T_REQUIRE_ONCE(258),
    T_REQUIRE(259),
    T_EVAL(260),
    T_INCLUDE_ONCE(261),
    T_INCLUDE(262),
    T_LOGICAL_OR(263),
    T_LOGICAL_XOR(264),
    T_LOGICAL_AND(265),
    T_PRINT(266),
    T_SR_EQUAL(267),
    T_SL_EQUAL(268),
    T_XOR_EQUAL(269),
    T_OR_EQUAL(270),
    T_AND_EQUAL(271),
    T_MOD_EQUAL(272),
    T_CONCAT_EQUAL(273),
    T_DIV_EQUAL(274),
    T_MUL_EQUAL(275),
    T_MINUS_EQUAL(276),
    T_PLUS_EQUAL(277),
    T_BOOLEAN_OR(278),
    T_BOOLEAN_AND(279),
    T_IS_NOT_IDENTICAL(280),
    T_IS_IDENTICAL(281),
    T_IS_NOT_EQUAL(282),
    T_IS_EQUAL(283),
    T_IS_GREATER_OR_EQUAL(284),
    T_IS_SMALLER_OR_EQUAL(285),
    T_SR(286),
    T_SL(287),
    T_INSTANCEOF(288),
    T_UNSET_CAST(289),
    T_BOOL_CAST(290),
    T_OBJECT_CAST(291),
    T_ARRAY_CAST(292),
    T_STRING_CAST(293),
    T_DOUBLE_CAST(294),
    T_INT_CAST(295),
    T_DEC(296),
    T_INC(297),
    T_CLONE(298),
    T_NEW(299),
    T_EXIT(300),
    T_IF(301),
    T_ELSEIF(302),
    T_ELSE(303),
    T_ENDIF(304),
    T_LNUMBER(305),
    T_DNUMBER(306),
    T_STRING(307),
    T_STRING_VARNAME(308),
    T_VARIABLE(309),
    T_NUM_STRING(310),
    T_INLINE_HTML(311),
    T_CHARACTER(312),
    T_BAD_CHARACTER(313),
    T_ENCAPSED_AND_WHITESPACE(314),
    T_CONSTANT_ENCAPSED_STRING(315),
    T_ECHO(316),
    T_DO(317),
    T_WHILE(318),
    T_ENDWHILE(319),
    T_FOR(320),
    T_ENDFOR(321),
    T_FOREACH(322),
    T_ENDFOREACH(323),
    T_DECLARE(324),
    T_ENDDECLARE(325),
    T_AS(326),
    T_SWITCH(327),
    T_ENDSWITCH(328),
    T_CASE(329),
    T_DEFAULT(330),
    T_BREAK(331),
    T_CONTINUE(332),
    T_GOTO(333),
    T_FUNCTION(334),
    T_CONST(335),
    T_RETURN(336),
    T_TRY(337),
    T_CATCH(338),
    T_THROW(339),
    T_USE(340),
    T_GLOBAL(341),
    T_PUBLIC(342),
    T_PROTECTED(343),
    T_PRIVATE(344),
    T_FINAL(345),
    T_ABSTRACT(346),
    T_STATIC(347),
    T_VAR(348),
    T_UNSET(349),
    T_ISSET(350),
    T_EMPTY(351),
    T_HALT_COMPILER(352),
    T_CLASS(353),
    T_INTERFACE(354),
    T_EXTENDS(355),
    T_IMPLEMENTS(356),
    T_OBJECT_OPERATOR(357),
    T_DOUBLE_ARROW(358),
    T_LIST(359),
    T_ARRAY(360),
    T_CLASS_C(361),
    T_METHOD_C(362),
    T_FUNC_C(363),
    T_LINE(364),
    T_FILE(365),
    T_COMMENT(366),
    T_DOC_COMMENT(367),
    T_OPEN_TAG(368),
    T_OPEN_TAG_WITH_ECHO(369),
    T_CLOSE_TAG(370),
    T_WHITESPACE(371),
    T_START_HEREDOC(372),
    T_END_HEREDOC(373),
    T_DOLLAR_OPEN_CURLY_BRACES(374),
    T_CURLY_OPEN(375),
    T_PAAMAYIM_NEKUDOTAYIM(376),
    T_NAMESPACE(377),
    T_NS_C(378),
    T_DIR(379),
    T_NS_SEPARATOR(380),
    T_DOUBLE_COLON(376),

    T_INSTEADOF(341),
    T_TRAIT(355),
    T_CALLABLE(363),
    T_TRAIT_C(365),

    /// ---------------- ///

    T_J_CUSTOM(1000),
    T_J_BRACE(1001),
    T_J_ARRAY_ACCESS(1002),
    T_J_ARRAY_PUSH(1003),
    T_J_EQUAL(1004),
    T_J_BOOLEAN_NOT(1005),
    T_J_CLASS_FETCH(1006),
    T_J_CONCAT(1007),
    T_J_DIV(1008),
    T_J_IS_GREATER(1009),
    T_J_MINUS(1010),
    T_J_MOD(1011),
    T_J_MUL(1012),
    T_J_PLUS(1013),
    T_J_SMALLER(1014),
    T_J_UNAR_MINUS(1015),
    T_J_FINALLY(1016),
    T_J_BOOLEAN_XOR(1017),
    T_J_BINARY_CAST(1018);

    private int value;
    private static Map<Integer, TokenType> map = new HashMap<Integer, TokenType>();

    static {
        for (TokenType legEnum : TokenType.values()) {
            map.put(legEnum.value, legEnum);
        }
    }

    private TokenType(int value) {
        this.value = value;
    }

    public static TokenType valueOf(int typeNo) {
        return map.get(typeNo);
    }
}

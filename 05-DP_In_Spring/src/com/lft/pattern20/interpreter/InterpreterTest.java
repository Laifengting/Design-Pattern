package com.lft.pattern20.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * Function: 		ADD FUNCTION.
 * Reason:   		ADD REASON.
 * Date:            2020-09-26 9:59
 * <p>
 * Class Name:      InterpreterTest
 * Package Name:    com.lft.pattern20.interpreter
 * @author Laifengting / E-mail:laifengting@foxmail.com
 * @version 1.0.0
 * @since JDK 8
 */
public class InterpreterTest {
	public static void main(String[] args) {
		SpelExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("4 * (2 + 3) * 2 + 5");
		int result = (int) expression.getValue();
		System.out.println(result);
	}
}

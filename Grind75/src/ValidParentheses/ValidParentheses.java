package ValidParentheses;
import java.util.Stack;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 *
 * Example 1:
 * Input: s = "()"
 * Output: true
 * Example 2:
 * Input: s = "()[]{}"
 * Output: true
 */

public class ValidParentheses {
    private boolean validSolver(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // 1. Öffnende Brackets pushen
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // 2. Schließende Brackets prüfen
            else {
                // ZUERST prüfen, ob Stack leer ist
                if (stack.isEmpty()) {
                    return false;
                }

                char popped = stack.pop();

                // RICHTIG: Vergleiche das gerade gepoppte Bracket mit dem aktuellen
                if ((c == ')' && popped == '(') ||
                        (c == '}' && popped == '{') ||
                        (c == ']' && popped == '[')) {
                    // Match! Continue to next character
                } else {
                    return false;  // Kein Match
                }
            }
        }

        // Am Ende: Stack muss LEER sein (alle Brackets gematcht)
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test = "({})";
        ValidParentheses solver = new ValidParentheses();
        boolean valid = solver.validSolver(test);
        System.out.println(valid);
    }
}


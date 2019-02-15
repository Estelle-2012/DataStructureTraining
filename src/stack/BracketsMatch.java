package stack;

import java.util.Stack;

/**
 * leetcoder 第20题
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号匹配。
 * 左括号必须以正确的顺序匹配。
 * 注意空字符串可被认为是有效字符串。
 */
public class BracketsMatch {
    Stack<Character> stack = new Stack();

    public boolean isVaild(String string) {
        char[] chars = string.toCharArray();
        for (char c : chars) {
            if (chars.equals("(") || chars.equals("{") || chars.equals("[")) {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();
                if (c == ')' && topChar != '(') {
                    return false;
                }
                if (c == '}' && topChar != '{') {
                    return false;
                }
                if (c == ']' && topChar != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();


    }

}

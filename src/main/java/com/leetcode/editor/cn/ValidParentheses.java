//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 每个右括号都有一个对应的相同类型的左括号。 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "()"
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：s = "()[]{}"
//输出：true
// 
//
// 示例 3： 
//
// 
//输入：s = "(]"
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 10⁴ 
// s 仅由括号 '()[]{}' 组成 
// 
//
// Related Topics 栈 字符串 👍 3659 👎 0


package com.leetcode.editor.cn;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        Solution solution = new ValidParentheses().new Solution();
        solution.isValid("(){}}{");
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        // 初始化
        HashMap<Character, Character> hashMap = new HashMap<Character, Character>() {{
            put('(', ')');
            put('[', ']');
            put('{', '}');
        }};

        public boolean isValid(String s) {
            int strLength = s.length();
            // 字符成对
            if (strLength % 2 == 1) {
                return false;
            }

            Stack<Character> stack = new Stack<>();
//            LinkedList<Character> stack = new LinkedList<>();
            for (int i = 0; i < strLength; i++) {
                char c = s.charAt(i);
                if (hashMap.containsKey(c)) {
                    // 压栈
                    stack.push(c);
                } else {
                    // 取栈顶元素
                    if (stack.isEmpty() || hashMap.get(stack.peek()) != c) {
                        return false;
                    }
                    // 把栈顶元素弹出
                    stack.pop();
                }
            }
            return stack.isEmpty();
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
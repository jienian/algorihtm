class Solution {
    List<String> res = new ArrayList<>(); // 用于存储生成的有效括号组合

    public List<String> generateParenthesis(int n) {
        dfs(n, n, ""); // 调用深度优先搜索函数
        return res; // 返回结果列表
    }

    private void dfs(int left, int right, String curStr) {
        if (left == 0 && right == 0) { // 当左右括号都用完时，当前字符串为有效括号组合
            res.add(curStr); // 将有效括号组合添加到结果列表中
            return; // 结束递归
        }
        if (left > 0) {
            dfs(left - 1, right, curStr + "("); // 添加左括号，并继续递归
        }
        if (right > left) {
            dfs(left, right - 1, curStr + ")"); // 添加右括号，并继续递归
        }
    }
}
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        int n = 3; // 括号对的数量

        List<String> result = solution.generateParenthesis(n);

        System.out.println("生成的括号组合:");
        for (String combination : result) {
            System.out.println(combination);
        }
    }
}


完整代码；
import java.util.List;
import java.util.ArrayList;

public class Main {
    
    List<String> res = new ArrayList<>();
    public List<String> generateParenthesis(int n){
        dfs(n, n, "");
        return res;
    }
       
    private void dfs(int left, int right, String curStr){
        if(left == 0 && right == 0){
            res.add(curStr);
            return;
        }
    
    if(left > 0){
        dfs(left - 1, right, curStr + "(");
    }
    
    if(right > left){
        dfs(left, right - 1, curStr + ")");
    }
 }
    
    public static void main(String[] args) {
        Main solution = new Main();
        int n = 3;
        List<String> result = solution.generateParenthesis(n);
        System.out.println("-------");
        for(String combination : result){
            System.out.println(combination);
        }
    }
}

时间复杂度为 O(2^n)。
空间复杂度为 O(n)，即递归的深度。
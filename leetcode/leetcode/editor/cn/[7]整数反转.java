//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。 
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−2³¹, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
//
// Related Topics 数学 👍 3918 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {

        int res = 0;

        while(x != 0){
            int tmp = x % 10;
            /*判断溢出
            if (res > 214748364 || (res == 214748364 && tmp>7)){
                return 0;
            }

            if(res < - 214748364 || (res == -214748364 && tmp < -8)){
                return 0;
            }
            */
            //简化判断溢出的条件，因为题目已经说明 x 本身就被 int 限制
            //当 x 位数和 Integer.MAX_VALUE 位数相等时，它的首位最大只能是 2
            //所以后边的 res == -214748364 && tmp < -8 其实是无需再判断的
            if(res > Integer.MAX_VALUE/10 || res < Integer.MIN_VALUE/10){
                return 0;
            }

            res = res * 10 + tmp;
            x /= 10;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

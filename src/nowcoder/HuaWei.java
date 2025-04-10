package nowcoder;

import java.math.BigInteger;
import java.util.*;

public class HuaWei {

    /**
     * 字符串最后一个单词的长度
     */
    private void HJ1(){
        Scanner in = new Scanner(System.in);
        String inString = in.nextLine();
        if (!inString.endsWith(" ")){
            inString += " ";
        }
        String[] codeArrays = inString.split(" ");
        int length = 0;
        length = codeArrays[codeArrays.length - 1].length();
        System.out.println(length);
    }

    /**
     * 计算某字符出现次数
     */
    private void HJ2(){
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        String b = in.nextLine();
        int num = 0;
        char[] charArray = a.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if(b.equalsIgnoreCase(String.valueOf(charArray[i]))){
                num++;
            }
        }
        System.out.println(num);
    }

    /**
     * 明明的随机数 (需要注意的是，使用ArrayList需要 import java.util.ArrayList;)
     */
    private void HJ3(){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        ArrayList<Integer> intList = new ArrayList<>();
        for(int i = 0; i < num; i++ ){
            int input = in.nextInt();
            if(!intList.contains(input)){
                intList.add(input);
            }
        }
        intList.sort(null);
        for(int j = 0; j < intList.size(); j++){
            System.out.println(intList.get(j));
        }
    }

    /**
     * 字符串分隔
     */
    private void HJ4(){
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();
        int length = inputString.length();
        int needZeroNum = length % 8;
        if(needZeroNum != 0){
            for(int i = 0; i < 8 - needZeroNum; i++){
                inputString += "0";
            }
        }
        int index = 0;
        for(int j = 0; j < inputString.length()/8; j++){
            String out = inputString.substring(index, index + 8);
            index += 8;
            System.out.println(out);
        }
    }

    /**
     * 进制转换 (如何将字符转为对应int很关键)
     */
    private void HJ5(){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        input = input.substring(2);
        long result = 0;
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(input.length() - 1 - i);
            int value = (ch >= '0' && ch <= '9') ? (ch - '0') : (ch - 'A' + 10);
//            System.out.println("value = " + value);
            int l = 1;
            for(int j = 0; j < i; j++){
                l = (l * 16);
//                System.out.println("l = " + l);
            }
            result = result + (l * value);
        }
        System.out.println(result);
    }

    /**
     * 质数因子 (Math.sqrt(input)，因为一个数的最大因数不会超过其平方根。)
     */
    public void HJ6(){
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        ArrayList<Integer> factors = new ArrayList<>(); // 用于存储因数

        // 因数分解
        for (int i = 2; i <= Math.sqrt(input); i++) {
            while (input % i == 0) {
                factors.add(i); // 添加因数到列表
                input /= i; // 更新 input
            }
        }

        // 如果 input 不为 1，说明 input 本身是一个质数
        if (input != 1) {
            factors.add(input);
        }

        // 输出因数
        for (int i = 0; i < factors.size(); i++) {
            if (i == factors.size() - 1) {
                // 最后一个因数不加空格
                System.out.print(factors.get(i));
            } else {
                // 其他因数加空格
                System.out.print(factors.get(i) + " ");
            }
        }
    }

    /**
     * 取近似值
     */
    private void HJ7(){
        Scanner in = new Scanner(System.in);
        double inputValue = in.nextDouble();
        double b = inputValue % 1;
        int c = (int)inputValue / 1;
        if(b >= 0.5){
            System.out.print(c + 1);
        }else{
            System.out.print(c);
        }
    }


    /**
     * 合并表记录
     */
    public void HJ8(){
        //方法1：使用TreeMap，自动进行排序了
        Scanner in = new Scanner(System.in);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int num = in.nextInt();
        for(int i = 0; i < num; i++){
            if(in.hasNextLine()){
                int index = in.nextInt();
                int value = in.nextInt();
                if(map.containsKey(index)){
                    map.put(index, map.get(index) + value);
                }else{
                    map.put(index, value);
                }
            }
        }

        for(Integer key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }

    /**
     * 提取不重复的整数
     */
    public void HJ9(){
//import java.util.Scanner;
//import java.util.LinkedHashSet;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Collections;
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        LinkedHashSet<Integer> set = new LinkedHashSet<>();/*顺序 不重复 的 Set*/
        String reverseString = new StringBuffer(input).reverse().toString();/*倒序*/
        for(int i = 0; i < reverseString.length(); i++){
            set.add(Integer.valueOf(reverseString.substring(i, i + 1)));/*去重复*/
        }
        List<Integer> list = new ArrayList<>(set);
        for(Integer num : list){
            System.out.print(num);
        }
    }

    /**
     * 字符个数统计
     */
    private void HJ10(){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        LinkedHashSet<String> set = new LinkedHashSet<>();
        for(int i = 0; i < input.length(); i++){
            set.add(input.substring(i, i + 1));
        }
        System.out.print(set.size());
    }

    /**
     * 数字颠倒
     */
    private void HJ11(){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String reverse = new StringBuffer(input).reverse().toString();
        System.out.print(reverse);
    }

    /**
     * 字符串反转
     */
    private void HJ12(){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String reverse = new StringBuffer(input).reverse().toString();
        System.out.print(reverse);
    }

    /**
     * 句子逆序
     */
    private void HJ13(){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] stringArray = input.split(" ");
        for(int i = stringArray.length - 1; i >= 0; i--){
            System.out.print(stringArray[i] + " ");
        }
    }

    /**
     * 字符串排序
     */
    public void HJ14(){
        Scanner in = new Scanner(System.in);
        int lineNum = in.nextInt();
        in.nextLine(); /* 消耗掉换行符 */
        ArrayList<String> stringList = new ArrayList<>();
        for(int i = 0; i < lineNum; i++){
            stringList.add(in.nextLine());
        }
        Collections.sort(stringList);
        for(int i = 0; i < stringList.size(); i++){
            System.out.println(stringList.get(i));
        }
    }

    /**
     * 求int型正整数在内存中存储时1的个数
     */
    public void HJ15(){
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        int num = 0;
        String binary = Integer.toBinaryString(input);/* 将整数转为二进制 */
        for(int i = 0; i < binary.length(); i++){
            if(binary.substring(i, i + 1).equals("1")){
                num++;
            }
            //第二种判断方法
//            if(binary.charAt(i) == '1'){
//                num++;
//            }
        }
        System.out.print(num);
    }

    /**
     * 不要三句号的歪
     */
    private void HJ54(){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] arrays = input.split(",");
        System.out.print(Long.valueOf(arrays[3]) - Long.valueOf(arrays[1]) - 1);
    }

    /**
     *  挑7
     */
    private void HJ55(){
        Scanner in = new Scanner(System.in);
        int count = 0;
        int num = in.nextInt();
        for(int i = 1; i <= num; i++){
            if(String.valueOf(i).contains("7") || (i % 7 == 0)){
                count++;
            }
        }
        System.out.print(count);
    }

    /**
     * 完全数计算
     */
    private void HJ56(){
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int count = 0;
        int sum = 0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 2; i <= num; i++){
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    list.add(j);
                }
            }
            for(Integer zhengshu : list){
                sum += zhengshu;
            }
            if(sum == (2 * i)){
                count++;
            }
            list = new ArrayList<>();
            sum = 0;
        }
        System.out.print(count);
    }

    /**
     * 高精度整数加法
     */
    //注意：import java.math.BigInteger;
    public void HJ57(){
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextBigInteger()) { // 注意 while 处理多个 case
            BigInteger a = in.nextBigInteger();
            BigInteger b = in.nextBigInteger();
            System.out.println(a.add(b));
        }
    }

    /**
     * 输入n个整数，输出其中最小的k个
     */
    private void HJ58(){
        Scanner in = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = in.nextInt();
        int k = in.nextInt();
        for (int i = 0; i < n; i++){
            list.add(in.nextInt());
        }
        Collections.sort(list);
        for(int i = 0; i < k; i++){
            System.out.print(list.get(i) + " ");
        }
    }

    /**
     * 找出字符串中第一个只出现一次的字符
     */
    public void HJ59(){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            Character c = input.charAt(i);
            for(int j = 0; j < input.length(); j++){
                if(c == input.charAt(j)){
                    count++;
                }
            }
            if(count == 1){
                System.out.print(c);
                break;
            }
            if(i == input.length() - 1 && count != 1){
                System.out.print(-1);
            }
            count = 0;
        }
    }

    /**
     * 字符逆序
     */
    private void HJ106(){
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String reverse = new StringBuffer(input).reverse().toString();
        System.out.print(reverse);
    }

    /**
     * 构造A+B
     */
    private void HJ107(){
        Scanner in = new Scanner(System.in);
        int n = 0;
        int k = 0;
        while (in.hasNextInt()) {
            n = in.nextInt();
            k = in.nextInt();
        }
        int count = 0;
        if(n % 2 == 0){
            count = ((n/2 - 1)*2 + 1);
        }else{
            count = ((n/2)*2);
        }
        if(count >= k){
            System.out.print("YES");
        }else{
            System.out.print("NO");
        }
    }

    /**
     * 求最小公倍数
     */
    private void HJ108(){
        Scanner in = new Scanner(System.in);
        int bigger = 0;
        int a = 0;
        int b = 0;
        while (in.hasNextInt()) {
            a = in.nextInt();
            b = in.nextInt();
        }
        bigger = (a > b) ? a : b;
        for(int i = bigger; i <= (a*b); i++){
            if(i % a == 0 && i % b == 0){
                System.out.print(i);
                break;
            }
        }
    }










}

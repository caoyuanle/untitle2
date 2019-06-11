package com.company;


public class Test3 {
    /**
     * 创建指定长度的字符串
     *
     * 使用throw抛出异常
     * 使用throws声明方法抛出的异常类型
     *
     * @param length
     * @throws Exception
     */
    public static String generatedString(int length) throws Exception {
        if(length < 1) {
            //使用throw抛出异常
            throw new Exception("参数错误！！！");
        }
        String content = "";
        for(int i = 0; i < length; i++) {
            content = content + i;
            System.out.println(content);
        }
        return content;
    }
    public static void main(String[] args) {
        //在调用抛出异常的方法时, 需要捕获处理异常或继续向上层抛

        //使用 try,catch捕获异常
        try {
            String content = Test3.generatedString(3);
            System.out.println("新字符串: "+content);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("异常消息: "+e.getMessage());
        }
    }
}
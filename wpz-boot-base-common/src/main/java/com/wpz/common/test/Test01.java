package com.wpz.common.test;

public class Test01 {
    public static void main(String[] args) {

        Test01 test01 = new Test01();
        int result = test01.test();

        System.out.println(result);
    }

    public int test() {

        try {
            return 1;
        } catch (Exception e) {
            return 2;
        } finally {
            return 3;
        }
    }
}

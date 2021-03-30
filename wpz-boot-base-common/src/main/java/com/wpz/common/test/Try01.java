package com.wpz.common.test;

public class Try01 {

    public static void main(String[] args) {
        Test01 test01 = new Test01();
        Test01.Test02 test02 = test01.new Test02();

        System.out.println(test02.getM());
        System.out.println(test02.getN());
    }
}

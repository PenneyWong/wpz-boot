package com.wpz.common.test;

public class Test01 {

    private Integer i;
    private int j;
    private Test02 test02;

    public void setI(Integer i) {
        this.i = i;
    }

    public void setJ(int j) {
        this.j = j;
    }

    class Test02 {
        public Integer getM() {
            return m;
        }

        public void setM(Integer m) {
            this.m = m;
        }

        public int getN() {
            return n;
        }

        public void setN(int n) {
            this.n = n;
        }

        private Integer m;
        private int n;
    }

    public static void main(String[] args) {

        Test01 test01 = new Test01();
        int result = test01.test();

        System.out.println(result);

        System.out.println(test01.i);
        System.out.println(test01.j);

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

package com.dsy.springboot06.controller;

public class EightQueens {
    /**
     * 常量值COUNT表示皇后个数
     */
    static final int COUNT = 8;

    /**
     * 用一维数组存放皇后的摆放位置
     */
    static int[] array = new int[COUNT];
    /**
     * 用来记录有多少种摆放方案
     */
    static int sum = 0;

    public static void main(String[] args) {
        putQueen(0);
        System.out.println("八皇后总共有" + sum + "种摆放方案");
    }

    /**
     * 在棋盘上摆放皇后
     *
     * @param n 第几个皇后
     */
    public static void putQueen(int n) {
        // 如果n=COUNT,表示皇后放置完毕
        if (n == COUNT) {
            System.out.print((sum + 1) + "、八皇后的摆放位置是：");
            for (int i = 0; i < COUNT; i++) {
                int pos = array[i] + 1;
                System.out.print(pos + " ");
            }
            System.out.println();
            System.out.print("摆放位置如下图所示：");
            printPlace();
            return;
        } else {
            // 依次往棋盘中放入皇后
                    for (int i = 0; i < COUNT; i++) {
                        // 先把当前这个皇后n,放到该行的第一列
                        array[n] = i;
                        // 调用方法，判断把第n个皇后在第i列时，是否有冲突
                        if (checkPlace(n)) {
                            // 不冲突，接着放置第（n+1）个皇后，即开始递归
                            putQueen(n + 1);
                }
            }
        }
    }

    /**
     * 绘制COUNT×COUNT棋盘，打印皇后的位置
     */
    public static void printPlace() {
        System.out.println();
        sum++;
        for (int i = 0; i < COUNT; i++) {
            System.out.print(" ");
            for (int j = 0; j < COUNT; j++) {
                System.out.print("---");
            }
            System.out.println();
            for (int k = 0; k < COUNT; k++) {
                if (k == array[i]) {
                    System.out.print("|" + "♛");
                } else {
                    System.out.print("| " + " ");
                }
            }
            System.out.println("|");
        }
        System.out.print(" ");
        for (int i = 0; i < COUNT; i++) {
            System.out.print("---");
        }
        System.out.println();
    }

    /**
     * 检查皇后的摆放位置是否有冲突
     *
     * @param n 表示第几个皇后
     * @return
     */
    public static boolean checkPlace(int n) {
        for (int i = 0; i < n; i++) {
            // 一维数组的值表示该行的列值，如果值相同，则表示在同一列
            // n-i表示两个皇后相差几行，array[n]-array[i]表示相差几列，如果相减的绝对值相等，则表示在对角线上
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }
}

package org.echo.arithmetic;

/**
 * @projectName: arithmetic
 * @package: org.echo.arithmetic
 * @className: Merge
 * @author: xin
 * @description: TODO
 * @date: 2022/12/28 16:20
 * @version: 1.0
 */

public class Merge {
    private static int[] temp;

    public void sort(int[] arr) {
        temp = new int[arr.length];
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int low, int high) {
        //单个元素不排序
        if (low == high) {
            return;
        }
        int mid = low + (high - low) / 2;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private void merge(int[] arr, int low, int mid, int high) {
        for (int i = low; i <= high; i++) {
            temp[i] = arr[i];
        }
        int l = low;
        int h = mid + 1;
        //双指针合并两个数组
        for (int i = low; i < high; i++) {
            //左边数组已到边界
            if (l == mid + 1) {
                arr[i] = temp[h++];
                //右边数组已到边界
            } else if (h == high + 1) {
                arr[i] = temp[l++];
                //比较两个数组的值
            } else if (temp[l] > temp[h]) {
                arr[i] = temp[h++];
            } else {
                arr[i] = temp[l++];
            }
        }
    }
}

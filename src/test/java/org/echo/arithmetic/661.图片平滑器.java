/*
 * @lc app=leetcode.cn id=661 lang=java
 * @lcpr version=21901
 *
 * [661] 图片平滑器
 */

// @lc code=start
class Solution {
    int[] dd=new int[]{-1,0,1};
    int[] dxy=new int[]{1,0,-1};
    public int[][] imageSmoother(int[][] img) {
        int x=img.length;
        int y=img[0].length;
        int[][] res=new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                calculate(res,img, i, j);
            }
        }
        return res;
    }

    public void calculate(int[][] res,int[][] img,int x,int y){
        int sum=0;
        int size=0;
        for (int i = 0; i < dd.length; i++) {
            int tmpX=x+dd[i];
            if(tmpX>=0 && tmpX <img.length){
                for (int j = 0; j < dxy.length; j++) {
                    int tmpY=y+dxy[j];
                    if(tmpY>=0 && tmpY<img[0].length){
                        sum+=img[tmpX][tmpY];
                        size++;
                    }
                }
            }
        }
        res[x][y]=sum/size;
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,1,1],[1,0,1],[1,1,1]]
// @lcpr case=end

// @lcpr case=start
// [[100,200,100],[200,50,200],[100,200,100]]
// @lcpr case=end

 */



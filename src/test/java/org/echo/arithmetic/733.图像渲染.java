/*
 * @lc app=leetcode.cn id=733 lang=java
 * @lcpr version=21901
 *
 * [733] 图像渲染
 */

// @lc code=start
class Solution {
    int[] dx=new int[]{-1,0,1,0};
    int[] dy=new int[]{0,1,0,-1};
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        fill(image, sr, sc, color, image[sr][sc]);
        return image;
    }

    public void fill(int[][] image,int sr,int sc,int color,int originColor){
        image[sr][sc]=color;
        for (int i = 0; i < 4; i++) {
            int x=sr+dx[i];
            int y=sc+dy[i];
            if(x>=0 && x<image.length && y>=0 && y<image[0].length){
                if(image[x][y]==originColor){
                    image[x][y]=color;
                    fill(image, x, y, color, originColor);
                }
            }
        }
    }
}
// @lc code=end



/*
// @lcpr case=start
// [[1,1,1],[1,1,0],[1,0\n1\n1\n2\n
// @lcpr case=end

// @lcpr case=start
// [[0,0,0],[0,0,0]]\n0\n0\n2\n
// @lcpr case=end

 */



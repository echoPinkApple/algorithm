package org.echo.arithmetic;



public class ExceptionTest {
    public static void main(String[] args) {
        // int[] nums=new int[]{1,12,-5,-6,50,3};
        // int a=51;
        // a=a-nums[1]+nums[5];
        // System.out.println(a);
        // findMaxAverage(nums, 4);

        ExceptionTest test = new ExceptionTest();
        int[][] img=new int[][]{
            {1,1,1},
            {1,0,1},
            {1,1,1}
        };
        test.imageSmoother(img);
    }
    // ThreadPoolExecutor executor=new ThreadPoolExecutor(1,2,5, TimeUnit.MINUTES,new ArrayBlockingQueue<>(100));
    public static double findMaxAverage(int[] nums, int k) {
        double sum=0;
        double avg=0;
        for (int i = 0; i < k; i++) {
            sum+=nums[i];
        }
        avg=sum/k;
        for (int i = k; i < nums.length; i++) {
            sum-=nums[i-k];
            sum+=nums[i];
            avg=Math.max(avg, sum/k);
        }
        return avg;
    }



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

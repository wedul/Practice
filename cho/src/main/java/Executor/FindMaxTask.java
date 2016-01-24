package Executor;

import java.util.concurrent.Callable;

public class FindMaxTask implements Callable<Integer>{
   private int[] data;
   private int start;
   private int end;
   
   FindMaxTask(int[] data, int start, int end){
	   this.data = data;
	   this.start = start;
	   this.end = end;
   }
   
   public Integer call(){
	   int max = Integer.MIN_VALUE; // 정수가 나타내는 최소값을 나타냄 -2147483648
	   for(int i= start;i<end;i++){
		   if(data[i] > max ) max = data[i];
	   }
	   return max;
   }
}

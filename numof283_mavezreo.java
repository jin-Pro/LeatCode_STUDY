package java_LEET;





public class numof283_mavezreo {
	 
	  public void moveZeroes(int[] nums) {
	        int length=nums.length;
	        int count=0,cnt=0;
	       for(int i=0;i<length;i++){
	           if(nums[i]==0) cnt++;
	       }//0�� ���� ����
	      for(int i=0;i<length;i++){
	          if(nums[i]!=0){
	              nums[count]=nums[i];
	              count++;
	          }
	      }// �Ϲ� ������ �ÿ� �������� �տ� �α�
	      for(int i=length-1;i>length-1-cnt;i--){
	          nums[i]=0;
	      } //0�� ������ŭ ���� �ֱ�
	    
	    }
}

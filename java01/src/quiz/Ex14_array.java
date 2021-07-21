package quiz;

public class Ex14_array {
	public static void main(String[] args) {
		int[] nums={77,88,99,-15,50,85,3,250};
		int sum=0; //합계
		int max=nums[0]; //최대값
		int min=nums[0]; //최소값
		for(int i=0; i<nums.length; i++) {
			sum = sum+nums[i]; //합계 누적
			if(max<nums[i]) { //더 큰 값이 있으면
				max=nums[i]; //최대값으로 
			}
			if(min>nums[i]) { //더 작은 값이 있으면
				min=nums[i]; //최소값으로
			}			
		}
		System.out.println("합계:"+sum);
		System.out.println("최소값:"+min);
		System.out.println("최대값:"+max);
	}
	
}

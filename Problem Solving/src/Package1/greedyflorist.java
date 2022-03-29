package Package1;

public class greedyflorist {
	int a,b,c,d,i,temp,sum1,step,sum;
	public void maximize(int p, int f, int arr[]){
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		step = 1;
		sum = 0;
		while(i<arr.length) {
			int j=0;
			sum = 0;
			while(j<p) {
				if(i+j<arr.length) {
				    sum = sum+arr[i+j];
				    j++;
				}
				else {break;}
			}
			sum1 = sum1 + (sum)*step;
			step++;
			i=i+p;
		}
		System.out.println("The sum is "+sum1);
	}       

	public static void main(String[] args) {
		greedyflorist g = new greedyflorist();
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		g.maximize(3, 10, arr);

	}

}

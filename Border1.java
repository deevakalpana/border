
 class Border1 {

	public static void main(String[] args) {
		int arr[]= {10,5,8,2,6};
		int temp=0;
		for(int i=0; i<arr.length;i++) {
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i] > arr[j])
				{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
			for(int j=0; j<arr.length;j++) {
				System.out.print("" + arr[j] +"");
			}
	}

}

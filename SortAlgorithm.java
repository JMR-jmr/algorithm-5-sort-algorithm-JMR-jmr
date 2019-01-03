public class SortAlgorithm{
bucket sort
  
	int[] a = {2,1,100};
	 int tmp = a[0];
	for(int i=0;i<a.length;i++){
	  if(tmp<a[i])
	    tmp=a[i] ;
	}
	  int[]b= new int[tmp+1];
	  for(int i=0;i<a.length;i++){
	    b[a[i]]++;
	
	  for(int i=0;i<b.length;i++){
	    if(b[i]>0){
	      System.out.print(i+" ");
	    }
	  }
      
bubble sort 
  int[] test = {5,1,2,4,3};
int temp = 0;
int length = test.length;
for(int i = 0; i < length; i++){
  for(int j = 0; j <length - 1; j++)
  {
    if(test[i] > test[i + 1]){
      temp = test[i];
      test[i] = test[i + 1];
      test[i + 1] = temp;
    }
  
  }
  length--;
}

      
selection sort
  public static void selectionSort(int[] a)
{
  for(int i=0; i<a,length;i++){
  int minIndex = i;
    for(int j=j+1;j<a.length;j++){
      if(a[j]<a[minIndex]){
        minIndex = j;
      }
      int temp =a[i];
      a[i] = a[minIndex];
      a[minIndex]= temp;
    }
  
  }


}
    }
  
  
  insertion
    public static void mergeSort(int[] ints, int leftStart, int rightEnd) {
        if (leftStart == rightEnd) {
            return;
        }
        int leftEnd = (rightEnd - leftStart) / 2 + leftStart;
        mergeSort(ints, leftStart, leftEnd);
        mergeSort(ints, leftEnd + 1, rightEnd);
        merge(ints, leftStart, leftEnd, rightEnd);
    }

    public static void merge(int[] ints, int leftStart, int leftEnd, int rightEnd) {
        int index = 0;
        int[] temp = new int[rightEnd - leftStart + 1];
        int left = leftStart;
        int right = leftEnd + 1;
        while (left <= leftEnd && right <= rightEnd) {
            if (ints[left] < ints[right]) {
                temp[index] = ints[left];
                index++;
                left++;
            } else if (ints[right] < ints[left]) {
                temp[index] = ints[right];
                index++;
                right++;
            } else {
                temp[index] = ints[left];
                left++;
            }
        }
        while (left <= leftEnd) {
            temp[index] = ints[left];
            index++;
            left++;
        }
        while (right <= rightEnd) {
            temp[index] = ints[right];
            index++;
            right++;
        }
        for (int i = 0; i < temp.length; i++) {
            ints[leftStart + i] = temp[i];
        }
    }
  

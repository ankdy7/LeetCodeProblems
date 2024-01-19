import java.util.ArrayList;
import java.util.Collections;

public class MergeSortedArray_88 {

	public static void main(String[] args) {
		int [] nums1 = new int[] {1,2,3,0,0,0};
		int [] nums2 = new int[] {2,5,6};
		int m=3;
		int n = 3;
		
		
		
		ArrayList <Integer> arr1 = new ArrayList<Integer>();
		for(int i=0;i<m;i++) {
			arr1.add(nums1[i]);
		}
		
		ArrayList <Integer> arr2 = new ArrayList<Integer>();
		for(int i=0;i<n;i++) {
			arr2.add(nums2[i]);
		}
		
		arr1.addAll(arr2);
		Collections.sort(arr1);
		 for (int i = 0; i < nums1.length; i++) {
	            nums1[i]=arr1.get(i);
	        }
		 
		 for (int i = 0; i < nums1.length; i++) {
	            System.out.println(nums1[i]);
	            
	        }
		 
		 

	}
	
}
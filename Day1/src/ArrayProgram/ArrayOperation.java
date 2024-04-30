package ArrayProgram;

import java.util.Scanner;

public class ArrayOperation {
	
// --1 ----------------------------------------------------------------------------------------------------------------------------	
	
	public static int[] createArray(int size) {
		
		Scanner sc=new Scanner(System.in);
		int[] number = new int[size];
		System.out.println("Enter the number");

		for (int i = 0; i <= size - 1; i++) {
			number[i] = sc.nextInt();
		}
		sc.close();
		
		
		return number;
	}
//---2-----------------------------------------------------------------------------------------------------------------------------
	public static void printArray(int [] arr) {
		System.out.println("Print the Enterd Array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}
//--3--------------------------------------------------------------------------------------------------------------------------------	
	public static int[] revesreArray(int []arr, int size) {
		System.out.println("Reversed Array");
		int[] arr1 =new int[size];

		int j=0;
		for (int i = arr.length-1; i >= 0; i--) {
		
			arr1[j]=arr[i];
			j++;
		}
		
		return arr1;
	}
//-----4------------------------------------------------------------------------------------------------------------------------------
	public static int[] assendingOrder(int[] arr2) {
		System.out.println("Sorting An Array in AssendingOrder");
		for (int i = 0; i < arr2.length; i++) {
			int temp;
			for (int j = i+1; j < arr2.length; j++) {
				if(arr2[i] > arr2[j]) {
					temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		return arr2;
	}
//-----5-------------------------------------------------------------------------------------------------------------------------------
	public static void mergeArray() {
		System.out.println("Merging an Two Array");
		System.out.println("===================================");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the First Array");
		int size1=sc.nextInt();
		System.out.println("enter the Second Array");
		int size2=sc.nextInt();
		int[] array1=new int[size1];
		int[] array2=new int[size2];
		int[] array3=new int[size1+size2];
		int k=0;
		System.out.println("Enter the First Array Element");
		for (int i = 0; i <= size1 - 1; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("Enter the Second Array Element");
		for (int i = 0; i <= size2 - 1; i++) {
			array2[i] = sc.nextInt();
		}
		
		for (int i = 0; i < array1.length; i++) {
			array3[k]=array1[i];
			k++;
		}
		for (int i = 0; i < array2.length; i++) {
			array3[k]=array2[i];
			k++;
		}
		System.out.println("After Merging Two Different Arrays");
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
			sc.close();
		}
		
	}
//-----6---------------------------------------------------------------------------------------------------------------------------------
	public static void zigZagMergeArray() {
		System.out.println("Merging an Two Array");
		System.out.println("===================================");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the First Array");
		int size1=sc.nextInt();
		System.out.println("enter the Second Array");
		int size2=sc.nextInt();
		int[] array1=new int[size1];
		int[] array2=new int[size2];
		int[] array3=new int[size1+size2];
		int size = size1+size2;
		int k=0;
		int j=0;
		System.out.println("Enter the First Array Element");
		for (int i = 0; i <= size1 - 1; i++) {
			array1[i] = sc.nextInt();
		}
		System.out.println("Enter the Second Array Element");
		for (int i = 0; i <= size2 - 1; i++) {
			array2[i] = sc.nextInt();
		}
		for(int i=0; i<size;i++ ) {
			if(i%2==0) {
				array3[i]=array1[k++];
			}
			else {
				array3[i]=array2[j++];
			}
		}
		System.out.println(" After Merging in the method of ZigZag : ");
		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
			sc.close();
		}
	    }
//-----7---------------------------------------------------------------------------------------------------------------------------------
	public static void maxElement() {
		int[] arr2= {4,6,3,8,2};
		for (int i = 0; i < arr2.length; i++) {
			int temp;
			for (int j = i+1; j < arr2.length; j++) {
				if(arr2[i] > arr2[j]) {
					temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		System.out.println("Max Element of the Array is : "+arr2[arr2.length-1]);
		
	}
//-----8---------------------------------------------------------------------------------------------------------------------------------
	public static void minElement() {
		int[] arr2= {4,6,3,8,2};
		for (int i = 0; i < arr2.length; i++) {
			int temp;
			for (int j = i+1; j < arr2.length; j++) {
				if(arr2[i] > arr2[j]) {
					temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}
		System.out.println("Min Element of the Array is : "+arr2[0]);
		
	}
//-----9---------------------------------------------------------------------------------------------------------------------------------
	public static void unionArray() {
			
			int[] array1 = {4,6,8,4};
			int[] array2 = {4,8,3,6};			
			int[] array3 = new int[array1.length+array2.length];
			int j=0,i=0,k=0; 
			while(i<array1.length && j<array2.length) {
				if(array1[i]==array2[j]) {
					array3[k++]=array1[i++];
					j++;
				}
				else if(array1[i]<array2[j]) {
					array3[k++]=array1[i++];
				}
				else {
					array3[k++]=array2[j++];
				}
			}
			while(i<array1.length) {
				array3[k++]=array1[i++];
			}
			while(j<array2.length) {
				array3[k++]=array2[j++];
			}
			System.err.println("");
			for(int value:array3) {
				if(value!=0) {
					System.out.println(value + "");
				}
			}
		}
//-----10-------------------------------------------------------------------------------------------------------------------------------
	public static void interSectionArray() {
		int[] arr1 = {1,5,8,3,5};
		int[] arr2 = {1,9,6,8,5};
		int[] arr3 = new int[arr1.length+arr2.length];
		int k=0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if(arr1[i]==arr2[i]) {
					arr3[k]=arr1[i];
				}
			}
			
		}
		int count = 0;
		for (int i = 0;i<arr3.length;i++) {
			if(arr3[i] != 0)
				count++;
		}
		System.out.println("InterSection of the Array Element is : ");
		for (int i = 0; i < count; i++) {
			System.out.println(arr3[i]);
		}
	}
//-----11----------------------------------------------------------------------------------------------------------------------
public static void removeDuplicate(){
		int [] array1= {1,2,8,3,6,5,4,1,2,5,8};
		for(int i=0;i<array1.length;i++) {
			for(int j=i+1;j<array1.length;j++) {
				if(array1[i]==array1[j]) {
					array1[j] = -1;
			
				}			
			}
			
		}
	
		int result[] = new int[array1.length];
		int k=0;
		for(int i=0;i<array1.length;i++) {
			if(array1[i]!=-1){
				result[k++] = array1[i];	
				}	
		}
		int count = 0;
		for (int i = 0;i<result.length;i++) {
			if(result[i] != 0)
				count++;
		}
		System.out.println("Remove Duplicate Array : ");
		for (int i = 0; i < count; i++) {
			System.out.println(result[i]);
		}
}

//------12---------------------------------------------------------------------------------------------------------------------
	public static void duplicateElement() {
		int[] array1 = {9,5,3,6,8,4,2,6,5,9,8,7,4,2,8};
		System.out.println("Duplicate Elements:");
		for (int i = 0; i < array1.length - 1; i++) {
			for (int j = i + 1; j < array1.length; j++) {
				if (array1[i] == array1[j]) {
					System.out.println(array1[i]);
				}
			}
		}
	}
//------13--------------------------------------------------------------------------------------------------------------------	
	public static void primeArray() {
		int[] array = {4,6,5,2,3,55,66,8,9,1,5};
		System.out.println("Prime Numbers are Present inside the Array ");
		for(int i=0; i<array.length; i++){
	        boolean isPrime = true;
	        for (int j=2; j<array[i]; j++){        
	            if(array[i]%j==0){
	                isPrime = false;
	                break;
	            }
	        } 
	        if(isPrime) {
	            System.out.println(array[i]);
	        	}
	        }
	}
//------14--------------------------------------------------------------------------------------------------------------------
	public static void occurenceArray() {
		int[] array1= {7,8,9,6,5,4,5,6,8};
		int array2[]=new int[array1.length];
		for(int i=0;i<array1.length;i++) {
			array2[i]=1;
			for(int j=i+1;j<array1.length;j++) {
				if(array1[i]==array1[j]) {
					array1[j]=-1;
					array2[i]++;
			
				}			
			}		
		}	
		
		for(int i=0;i<array1.length;i++) {
			if(array1[i]!=-1) {
			System.out.println("Occurence of "+array1[i]+" is :" + array2[i]);
		}
		}
	}
	
//-----MAIN METHOD-------------------------------------------------------------------------------------------------------------	
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("Enter the Size of the Array");
//
//		int size = sc.nextInt();
//		int[] arr=createArray(size);
//		printArray(arr);
//		int[] arr2=revesreArray(arr,size);
//	
//		for (int i = 0; i < arr2.length; i++) {
//			System.out.println(arr2[i]);
//		}
//		
//		int[] arr3=assendingOrder(arr2);
//		for (int i = 0; i < arr3.length; i++) {
//			System.out.println(arr3[i]);	
//		}
		
//		mergeArray();
//		zigZagMergeArray();
//		 maxElement();	
//		 minElement();
//		unionArray();
//		interSectionArray();
//		removeDuplicate();
//		duplicateElement();
//		primeArray();
		occurenceArray();
		
	}	
}

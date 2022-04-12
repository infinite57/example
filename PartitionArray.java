import java.lang.*;
import java.util.*;
class PartitionArray{
	public static void main(String[] args){
		int originalArray[]  = {7, 2, 4, 1, 3, 5, 6, 8, 2, 10};
		int partitionArray[]={7, 2, 4, 1, 3, 5, 6, 8, 2, 10} ;
		int temporaryIndex=0;
		for(int index=0; index<originalArray.length;++index){
			if(originalArray[index]%2==0){
				partitionArray[temporaryIndex]=originalArray[index];
				temporaryIndex++;
			}
		}
		for(int index=0; index<originalArray.length;++index){
			if(originalArray[index]%2==1){
				partitionArray[temporaryIndex]=originalArray[index];
				temporaryIndex++;
			}
		}
		System.out.println("Partition array is : "+ Arrays.toString(partitionArray));
	}
}
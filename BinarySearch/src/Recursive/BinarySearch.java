package Recursive;

public class BinarySearch {
	
	//search in a integer Array
	public static int searchInt(int[] universe, int target) throws BinarySearchException{
		if(universe == null || universe.length == 0){
			throw new BinarySearchException("There's no array to search into!");
		}else{
			if(orderedUniverseInt(universe)){
				return searchInt(universe, target, 0, universe.length);
			}else{
				throw new BinarySearchException("the universe is in chaos!");
			}
		}
	}
	
	//Recursive search function for int arrays
	private static int searchInt(int[] universe, int target, int indexI, int indexJ){
		//Get the position closest to the the medium of the array
		int mean = (indexI + indexJ)/2;
		
		//Avoid exception
		if(mean < 0 || mean > universe.length - 1){
			return -mean;
		}
		
		//Universe break out
		if(indexI > indexJ){
			return -indexI;
		}
		
		if(universe[mean] == target){
			return mean; //target found
		}else{
			if(universe[mean] < target){
				//Discard the right side if the target is greater 
				//than the universe at given position
				indexI = mean + 1;  
			}else{
				//Discard the left side if the target is less
				//than the universe at given position
				indexJ = mean - 1;
			}
		}
		
		if(indexJ < 0){
			return -1;
		}
		//Recursive call if solution is not found during this operation
		return searchInt(universe, target, indexI, indexJ);
	}
	
	//Check if the array is ordered
	private static boolean orderedUniverseInt(int[] universe){
		int min = universe[0];
		int lenght = universe.length;
		boolean result = false;
		
		for(int i = 0; i < lenght && !result; i++){
			result = min > universe[i];
			min = universe[i];
		}
		return !result;
	}
}

import Recursive.*;


public class TestClass {

	public static void main(String[] args) {
		int[] universe = {2, 4, 5, 8, 12, 18, 23, 45};
		int targetValue = -72;
		try{
			System.out.println(BinarySearch.searchInt(universe, targetValue));
		}catch(BinarySearchException ex){
			System.out.println(ex.getMessage());
		}

	}

}

package Easy;

import java.util.ArrayList;
import java.util.List;

class PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {

		ArrayList<List<Integer>> arr = new ArrayList<List<Integer>>();

		if (numRows == 0)
			return arr;

		// First Row
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(1);
		arr.add(ar);

		if (numRows == 1)
			return arr;

		// Second Row
		ArrayList<Integer> ar2 = new ArrayList<Integer>();
		ar2.add(1);
		ar2.add(1);
		arr.add(ar2);

		// Remaining Rows
		for (int i = 2; i < numRows; i++) {
			ArrayList<Integer> ar1 = new ArrayList<Integer>();
			ar1.add(1);

			for (int j = 1; j < i; j++) { // Adjusted this line
				int answer = arr.get(i - 1).get(j - 1) + arr.get(i - 1).get(j);
				ar1.add(answer);
			}

			ar1.add(1);
			arr.add(ar1);
		}
		return arr;
	}
}
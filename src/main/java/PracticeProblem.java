import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static ArrayList<String> perms(String str) {
		//Base Case:
		if (str.length() == 0) {
			ArrayList<String> base = new ArrayList<>();
			base.add("");
			return base;
		}
		ArrayList<String> result = new ArrayList<>();
		//Recursive Case:
		char first = str.charAt(0);
		String rest = str.substring(1);
		ArrayList<String> permsOfRest = perms(rest);
		for (String perm : permsOfRest) {
		for (int i = 0; i <= perm.length(); i++) {
			String before = perm.substring(0, i);
			String after =  perm.substring(i);
			String newPerm = before + first + after;
			result.add(newPerm);
		}
		}
		return result;
}
//Question 2
public static ArrayList<String> permsUnique(String str) {
    // Base Case:
    if (str.length() == 0) {
        ArrayList<String> base = new ArrayList<>();
        base.add("");
        return base;
    }

    char first = str.charAt(0);
    String rest = str.substring(1);

    ArrayList<String> permsOfRest = permsUnique(rest);

    java.util.HashSet<String> set = new java.util.HashSet<>();

    for (String perm : permsOfRest) {
        for (int i = 0; i <= perm.length(); i++) {
            String before = perm.substring(0, i);
            String after = perm.substring(i);
            set.add(before + first + after);
        }
    }

    return new ArrayList<>(set);
}
}
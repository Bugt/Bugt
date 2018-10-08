package V1_tree;
import java.util.ArrayList;

public class Tree {
	public static final String TREE_BODY = "*";
	public static final String SPACE = " ";
	public static final int TREE_BODY_HEIGHT = 9;
	public static final int TRUNK_THICKNESS = 3;
	public static final int TRUNK_HEIGHT = 3;
	

	public static void main(String[] args) {

		ArrayList<String> treeBodyLine = new ArrayList<String>();
		ArrayList<String> treeTrunkLine = new ArrayList<String>();

		// generate TreeBody
		int spaceLeft = TREE_BODY_HEIGHT;
		for (int i = 0; i < TREE_BODY_HEIGHT; i++) {
			// clear line array
			treeBodyLine.clear();
			
			// add empty spaces;
			spaceLeft = TREE_BODY_HEIGHT - i;
			for (int it = 0; it < spaceLeft; it++) {
				treeBodyLine.add(SPACE);
			}

			for (int itt = 0; itt < i; itt++) {
				treeBodyLine.add(TREE_BODY);
			}

			// mirror it
			for (int itt = 0; itt < i; itt++) {
				treeBodyLine.add(TREE_BODY);
			}

			spaceLeft = TREE_BODY_HEIGHT - i;
			for (int it = 0; it < spaceLeft; it++) {
				treeBodyLine.add(SPACE);
			}

			// print line!
			String finalLine = "";
			for (String part : treeBodyLine) {
				finalLine = finalLine + part;
			}
			System.out.println(finalLine);
		}
		// add trunk
		int trunkSpaceLeft = TREE_BODY_HEIGHT -1;
		for (int iTrunk = 0; iTrunk < trunkSpaceLeft; iTrunk++) {
			treeTrunkLine.add(SPACE);
		}
		for (int iTrunkT = 0; iTrunkT < TRUNK_THICKNESS; iTrunkT++) {
			treeTrunkLine.add(TREE_BODY);
		}

		// print line!
		String trunkLine = "";
		for (String part : treeTrunkLine) {
			trunkLine = trunkLine + part;
		}
		
		for (int thI = 0; thI < TRUNK_HEIGHT; thI++) {
			System.out.println(trunkLine);
		}
	}
}

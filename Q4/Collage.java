
public class Collage {
	private String name;
	
	public Course getCourseByCode(char[] code) {
		
	}
	private boolean codeCheck(char[] code1, char[] code2) {
		boolean arraysEq = true;
		if(code1.length != code2.length) {
			arraysEq = false;
		}
		else {
			for(int i = 0; i < code1.length; i++) {
				if(code1[i] != code2[i]) {
					arraysEq = false;
					break;
				}
			}
		}
		return arraysEq;
	}

}

package student_management;

public class student_management extends student {
	// Declare students age and grade as class arrays
	int[] iAgeArray = new int[5];
	int[] iGradeArray = new int[5];
	
	// Use method to get a students age and grade
	public void GetStudentGradeAge() {
		// Declare variables
			int iAge, iGrade, iCount;
			// Use for loop to get data into arrays
			for (iCount = 0; iCount < 5; iCount += 1) {
				// Prompt user for the name of the student, store in variable, and add to array.
				System.out.println("What is the age of student " + (iCount + 1) + "? ");
				iAge = reader.nextInt();
				iAgeArray[iCount] = iAge;
				// Prompt user for the id of the student, store in variable, and add to array.
				System.out.println("What is the grade of student " + (iCount + 1) + "? ");
				iGrade = reader.nextInt();
				iGradeArray[iCount] = iGrade;
			}
	}
	
	// Use method to have user enter in an id of a student and print out students who are the same age or grade
	public void PrintSimilarStudents(){
		// Declare variables
		int iStudentID, iGrade = 0, iAge = 0, iCount;
		// Prompt user for the student ID
		System.out.println("What is the ID # of the student you would like to see similar students of?");
		iStudentID = reader.nextInt();
		// Use for loop to iterate through the student ID's and get the student's age and grade
		for (iCount = 0; iCount < 5; iCount += 1) {
			if (iStudentIDArray[iCount] == iStudentID) {
				iGrade = iGradeArray[iCount];
				iAge = iAgeArray[iCount];
			}
		// Describe the following output
		System.out.println("These are the students who are in the same grade or have the same age as the student you entered: ");
		// Use another for loop to print out students with the same age or grade
			for (iCount = 0; iCount < 5; iCount += 1) {
				if (iAgeArray[iCount] == iAge) {
					System.out.print(sNameArray[iCount] + ", "); 
				}
				else if (iGradeArray[iCount] == iGrade) {
					System.out.print(sNameArray[iCount] + ", "); 
				}
			}
		}
	}

}

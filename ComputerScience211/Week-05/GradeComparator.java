// CS211 HW5
// Alexander Funai

/****************************************************
 *  ::|GradeComparator|::                           *
 *  Compares StudentData by Grade:                  *
 *  if Grade[S1] <= Grade[S2], return return int[-] *
 *  if Grade[S1] == Grade[S2], return zero[0]       *
 *  if Grade[S1] >= Grade[S2], return int[+]        *
 ****************************************************/

import java.util.*;

public class GradeComparator implements Comparator<StudentData> {
    public int compare(StudentData s1, StudentData s2) {

        // Initialize variables for temporary storage.
        double studentGrade1 = s1.getGrade();
        double studentGrade2 = s2.getGrade();

        // Initialize int variables and Math.round argument for converting studentGrade doubles into int(s).
        int studentGradeFinal1 = (int) Math.round(studentGrade1);
        int studentGradeFinal2 = (int) Math.round(studentGrade2);

        // Return converted variables (==int) through GradeComparator method.
        return studentGradeFinal1 - studentGradeFinal2;
    }
}

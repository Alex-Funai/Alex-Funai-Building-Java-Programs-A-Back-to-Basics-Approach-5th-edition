// CS211 HW5
// Alexander Funai

/************************************************
 *  ::|IdComparator|::                          *
 *  Compares StudentData by Id:                 *
 *  if Id[S1] <= Id[S2], return return int[-]   *
 *  if Id[S1] == Id[S2], return zero[0]         *
 *  if Id[S1] >= Id[S2], return int[+]          *
 ************************************************/

import java.util.*;

public class IdComparator implements Comparator<StudentData> {
    public int compare(StudentData s1, StudentData s2) {

        // Initialize storage variables.
        String Id1 = s1.getId();
        String Id2 = s2.getId();

        // Initialize storage/conversion variables.
        int idFinal1 = Integer.parseInt(Id1);
        int idFinal2 = Integer.parseInt(Id2);

        // Converted variables from [String => Integer] can now be returned via method.
        return idFinal1 - idFinal2;
    }
}

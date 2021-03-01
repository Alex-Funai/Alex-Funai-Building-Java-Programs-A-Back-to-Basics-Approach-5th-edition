// CS211 HW5
// Alexander Funai

/**************************************************
 *  ::|NameComparator|::                          *
 *  Compares StudentData by Name:                 *
 *  if Name[S1] <= Name[S2], return return int[-] *
 *  if Name[S1] == Name[S2], return zero[0]       *
 *  if Name[S1] >= Name[S2], return int[+]        *
 **************************************************/

import java.util.*;

public class NameComparator implements Comparator<StudentData> {
    public int compare(StudentData s1, StudentData s2) {
        return s1.getName().compareTo(s2.getName());
    }
}

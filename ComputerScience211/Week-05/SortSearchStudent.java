// CS211 HW5
// Alexander Funai

/********************************************
 *  ::| Sort Search Student |::             *
 *  Sort and search with custom ordering.   *
 ********************************************/

import java.io.*;
import java.util.*;

public class SortSearchStudent {

    private List<StudentData> studentList = new ArrayList<StudentData>();

    // Initializing and declaring variables
    String studentNameFirst;
    String studentNameLast;
    String studentName;
    String studentID;
    Double studentGrade;
    int count = 0;

    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("E:/ProjectTempStorage/Assignment5/src/students.txt");

        SortSearchStudent sss = new SortSearchStudent(f);

        System.out.println("\n=== The original ===");
        sss.PrintList();


        System.out.println("\n=== Sort by Name ===");
        sss.SortList(new NameComparator());
        sss.PrintList();


        System.out.println("\n=== Search by Name: Smith Marty ===");
        sss.SearchAndPrintEntry(new StudentData("Smith Marty", "", 0), new NameComparator());
        System.out.println("\n=== Search by Name: Johnson Gus ===");
        sss.SearchAndPrintEntry(new StudentData("Johnson Gus", "", 0), new NameComparator());

        System.out.println("\n=== Search by Name: Foo Bar ===");
        sss.SearchAndPrintEntry(new StudentData("Foo Bar", "", 0), new NameComparator());


        System.out.println("\n=== Sort by Id ===");
        sss.SortList(new IdComparator());
        sss.PrintList();

        System.out.println("\n=== Search by Id: 346282 ===");
        sss.SearchAndPrintEntry(new StudentData("", "346282", 0), new IdComparator());
        System.out.println("\n=== Search by Id: 210498 ===");
        sss.SearchAndPrintEntry(new StudentData("", "210498", 0), new IdComparator());
        System.out.println("\n=== Search by Id: 999999 ===");
        sss.SearchAndPrintEntry(new StudentData("", "999999", 0), new IdComparator());


        System.out.println("\n=== Sort by Grade ===");
        sss.SortList(new GradeComparator());
        sss.PrintList();

        System.out.println("\n=== Search by Grade: 84.1 ===");
        sss.SearchAndPrintEntry(new StudentData("", "", 84.1), new GradeComparator());
        System.out.println("\n=== Search by Grade: 98.6 ===");
        sss.SearchAndPrintEntry(new StudentData("", "", 98.6), new GradeComparator());
        System.out.println("\n=== Search by Grade: 72.4 ===");
        sss.SearchAndPrintEntry(new StudentData("", "", 72.4), new GradeComparator());
        System.out.println("\n=== Search by Grade: 100 ===");
        sss.SearchAndPrintEntry(new StudentData("", "", 100), new GradeComparator());
    }

    public SortSearchStudent(File f) throws FileNotFoundException {

        Scanner input = new Scanner(f); // Initialize Scanner to read in file (students.txt).

        //  Initialize loop to read scanner input into various variables, and then add them to the studentList[].
        while (input.hasNext()) {
            //  Initialize variables to store Scanner input's 'input'.
            studentNameFirst = input.next();
            studentNameLast = input.next();
            studentName = studentNameFirst + " " + studentNameLast;
            studentID = input.next();
            studentGrade = input.nextDouble();

            studentList.add(new StudentData(studentName, studentID, studentGrade));  // Initialize StudentData() class instance
        }

    }

    public void PrintList() {
        for(StudentData d: studentList) {
            System.out.println(d);
        }
    }

    public void SortList(Comparator<StudentData> comp) {
        Collections.sort(studentList, comp);
    }

    public void SearchAndPrintEntry(StudentData toFind, Comparator<StudentData> comp) {
        int index = Collections.binarySearch(studentList, toFind, comp);

        if(index >= 0) {
            System.out.println(studentList.get(index));
        } else {
            System.out.println("(hmm, no such student!)");
        }
    }
}

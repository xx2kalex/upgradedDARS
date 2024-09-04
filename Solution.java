import java.util.ArrayList;

public class Solution
{
  static ArrayList<Class> myClassesWishlist = new ArrayList<>();
  static ArrayList<Class> myClassesCompletedAndEnrolled = new ArrayList<>();

  public static void addToWishlist(Class myClass)
  {
    myClassesWishlist.add(myClass);
  }

  public static void addToCompleted(Class myClass)
  {
    myClassesCompletedAndEnrolled.add(myClass);
  }

  public static void main(String[] args)
  {
    // COMPLETED OR ENROLLED
    Class hs = new Class("HIGHSCHOOLTRANSFER", "N/A", 18, true);
    // Fall 2022
    Class math113 = new Class("Math 113", "N/A", 3, true);
    Class ca100 = new Class("Communication Arts 100", "COM A", 3, true);
    Class cs200 = new Class("Comp Sci 200", "N/A", 3, true);
    Class h120 = new Class("History 120", "ADDL Humanities", 4, true);
    // Spring 2023
    Class cs300 = new Class("Comp Sci 300", "Basic Computer Science", 3, true);
    Class math221 = new Class("Math 221", "N/A", 5, true);
    Class geo101 = new Class("Geography 101", "COM B", 4, true);
    // Summer 2023
    Class math222 = new Class("Math 222", "N/A", 4, true);
    // Fall 2023
    Class cs400 = new Class("Comp Sci 400", "Basic Computer Science", 3, true);
    Class astro103 = new Class("Astronomy 103", "Natural Science - Physical Science", 3, true);
    Class anthro104 = new Class("Anthropology 104", "Ethnic Studies", 3, true);
    Class littrans275 = new Class("Littrans 275", "Humanities - Literature", 3, true);
    // Spring 2024
    Class math240 = new Class("Math 240", "Basic Computer Science", 3, true);
    Class cs252 = new Class("Comp Sci 252", "Basic Computer Science", 3, true);
    Class cs320 = new Class("Comp Sci 320", "N/A", 3, true);
    Class entom201 = new Class("Entomology 201", "Natural Science - Biological Science", 3, true);
    // Fall 2024
    Class cs354 = new Class("Comp Sci 354", "Basic Computer Science", 3, false);
    Class cs570 = new Class("Comp Sci 570", "Applications", 4, false);
    Class stat324 = new Class("Statistics 324", "Math Beyond Calculus", 3, false);
    Class lis202 = new Class("LIS 202", "ADDL Humanities", 3, false);

    // Mandatory Future Courses
    Class cs577 = new Class("Comp Sci 577", "Theory of CS", 3, false);
    Class math340 = new Class("Math 340", "Math Beyond Calculus", 3, false);

    // Potential Future Courses
    Class cs564 = new Class("Comp Sci 564", "SW/HW", 4, false);
    cs564.setDescription("Database Management Systems: Design and Implementation");

    Class cs544 = new Class("Comp Sci 544", "SW/HW", 3, false);
    cs544.setDescription("Introduction to Big Data Systems");

    Class cs540 = new Class("Comp Sci 540", "Electives", 3, false);
    cs540.setDescription("Introduction to Artificial Intelligence");

    Class cs537 = new Class("Comp Sci 537", "SW/HW", 4, false);
    cs537.setDescription("Introduction to Operating Systems");

    Class cs536 = new Class("Comp Sci 536", "SW/HW", 3, false);
    cs536.setDescription("Introduction to Programming Languages and Compilers");

    Class cs542 = new Class("Comp Sci 542", "SW/HW", 3, false);
    cs542.setDescription("Introduction to Software Security");







  }
}


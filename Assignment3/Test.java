public class Test {
    public static void main (String[] args) {
        Course course1 = new Course(6000);
        Course course2 = new Course(6205, 12);
        Course course3 = new Course(5100, 0012, 4);

        course1.display();
        course2.display();
        course3.display();

        course1.setCourseId(-1);
        course3.setCourseName("Claire");
        course1.setMaxCapacity(7);
        course1.setMaxCapacity(90);
        course1.display();
        course2.setProfessorId(345678);
        course2.display();
        course3.setCredits(43);
        course3.setCredits(4);
        course3.display();
        /*int[]studentIds = test1.registerStudent( 1);*/
        /*for (int n : studentIds)
        System.out.print(n + " ");*/
        //------------------------------
        System.out.println("-------------------------- ");
        int[] newStudentIds = course1.removeDuplicates(new int[]{1,6,2,3,2,4,5,6});
        System.out.print("result3 -->  " );
        for (int n : newStudentIds)
            System.out.print(n + " ");
        //------------------------------
        System.out.println(" ");

        System.out.println("result4 -->  " + course2.groupsOfStudents(new int[]{1,2,3,4,5,6}));
        //------------------------------
        Questions test5 = new Questions();
        System.out.println("result5 -->  " +test5.countAndSay(5));
        //------------------------------
        Questions test = new Questions();
        System.out.println("result6 -->  " + test.reverseWord("the sky is blue"));

        //------------------------------
        Questions test7 = new Questions();
        int[][] arr = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8},{9,10,11,12}};
        int[][] arr2 = new int[][]{{1, 2, 3}, {4, 5, 6},{7, 8, 9}};
        System.out.println("result7 -->  " + test7.spiralOrder(arr) + "\n" + test7.spiralOrder(arr2));
        //------------------------------
        Questions test8 = new Questions();

        System.out.println("result8 -->  " + test8.convert("PAYPALISHIRING", 3)
                        + "\n" + test8.convert( "PAYPALISHIRING", 4));
        //------------------------------
    }
}

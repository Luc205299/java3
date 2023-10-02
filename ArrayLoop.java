

public class ArrayLoop {
    public static void main(String[] args) {
        String[] mySubjects = { "HTML", "CSS", "Bootstrap", "JavaScript", "jQuery", "Java", "Python" };
        // Using the "length" property to find the length of the array
        for (int i = 0; i < mySubjects.length; i++) {
            if (mySubjects[i].equals("Java")) {
                System.out.println(mySubjects[i] + " [Our current course]");
            } else {
                System.out.println(mySubjects[i]);
            }
        } // end for

        /*
         * Using Enhanced for loop with array:
         */

        // copy the students array from the previous example:
        String[] students = new String[6];
        students[0] = "Alex Chow";
        students[1] = "Martin Smith";
        students[2] = "Sam Simpson";
        students[3] = "Sarah Grandson";
        students[4] = "Kate Wilson";
        students[5] = "Elena Chow";

        // Like in PHP,JS:
        System.out.println("Student List:");
        for (String student : students) {
            System.out.println(student);
        }

        int[] myFavChannelsNumbers = { 8, 24, 63, 82, 102, 310 };
        System.out.println("My Favourite Channels:");
        for (int channel : myFavChannelsNumbers) {
            System.out.println(channel);
        }
    } // end main()
}

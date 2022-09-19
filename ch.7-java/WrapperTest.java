public class WrapperTest {
      public static void main(String[] args) {

            System.out.println("**** TESTING SHALLOW OBJECTS ****\n");

            WrapperShallow ws = new WrapperShallow();

            ws.setArray(new int[] { 7, 17, 77 });

            WrapperShallow ws2 = new WrapperShallow(ws);

            System.out.println("initial shallow object contains");

            System.out.println(ws);

            System.out.println("copy shallow object contains");

            System.out.println(ws2);

            ws.setArray(new int[] { 13, 14, 15 });

            System.out.println("initial shallow object changed to");

            System.out.println(ws);

            System.out.println("copy shallow object not changed contains");

            System.out.println(ws2);

            if (ws.equals(ws2)) {

                  System.out.println("WOOPS! ws.equals(ws2) is true");

            } 
            else {
                  System.out.println("RIGHT! ws.equals(ws2) is false");
            }

            System.out.println("\n**** TESTING DEEP OBJECTS ****\n");

            WrapperDeep wd = new WrapperDeep();

            wd.setArray(new int[] { 2, 3, 4 });

            WrapperDeep wd2 = new WrapperDeep(wd);

            System.out.println("initial deep object contains");

            System.out.println(wd);

            System.out.println("copy deep object contains");

            System.out.println(wd2);

            wd.setArray(new int[] { 7, 6, -5 });

            System.out.println("initial deep object changed to");

            System.out.println(wd);

            System.out.println("copy deep object not changed contains");

            System.out.println(wd2);

            if (wd.equals(wd2)) {

                  System.out.println("WOOPS! wd.equals(wd2) is true");

            } 
            else {
                  System.out.println("RIGHT! wd.equals(wd2) is false");
            }
            System.out.println("\nProcess completed.");
      }
}
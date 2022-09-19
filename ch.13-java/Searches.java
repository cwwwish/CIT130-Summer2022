/*
Christopher Wischmann
CIT 130
July 9th, 2022
Generic Binary Search
*/

public class Searches {  
   public static void main(String[] args) {
      
       Integer[] IntegerArray={0,2,4,6,8,10,12,14,16,18};
       System.out.println("Integer test array contains : ");
       print(IntegerArray);
       int result;
              
       result=Searches.<Integer>bsearch(IntegerArray, 0, 10, -3);
       if(result==-1)
           System.out.println("-3 is not in the array");
      
       result=Searches.<Integer>bsearch(IntegerArray, 0, 10, -2);
       if(result==-1)
           System.out.println("-2 is not in the array");
      
       result=Searches.<Integer>bsearch(IntegerArray, 0, 10, -1);
       if(result==-1)
           System.out.println("-1 is not in the array");
      
       result=Searches.<Integer>bsearch(IntegerArray, 0, 10, 0);
       if(result!=-1)
           System.out.println("0 is at index "+result);
      
       result=Searches.<Integer>bsearch(IntegerArray, 0, 10, 1);
       if(result==-1)
           System.out.println("1 is not in the array ");
      
       result=Searches.<Integer>bsearch(IntegerArray, 0, 10, 2);
       if(result!=-1)
           System.out.println("2 is at index "+result);
      
       result=Searches.<Integer>bsearch(IntegerArray, 0, 10, 3);
       if(result!=-1)
           System.out.println("3 is at index "+result);
      
       result=Searches.<Integer>bsearch(IntegerArray, 0, 10, 4);
       if(result!=-1)
           System.out.println("4 is at index "+result);
      
       String[] StringArray={"apples","oranges","peaches",
               "strawberries","watermelons"};
      
       System.out.println("String test array contains");
       print(StringArray);
      
       result=Searches.<String>bsearch(StringArray, 0, 5, "apples");
       if(result!=-1)
           System.out.println("apples is at index "+result);
      
       result=Searches.<String>bsearch(StringArray, 0, 5, "plums");
       if(result==-1)
           System.out.println("plums is not in the array");
    }
  
   public static <T> void print(T[] a) {
       for (int i = 0; i < a.length; i++) {
           System.out.print(a[i]+" ");
        }

       System.out.println();
    }

   public static <T extends Comparable<T>>
   int bsearch(T[] a, int first, int last,T key) {
          
       if (first < last) {
                int mid = first + (last - first) / 2;
                if (key.compareTo(a[mid])<0) {
                    return bsearch(a, first, mid, key);
                   
                } else if (key.compareTo(a[mid])>0) {
                    return bsearch(a, mid+1, last , key);
                   
                } else {
                    return mid;
                }
            }
            return -1;
    } 
}


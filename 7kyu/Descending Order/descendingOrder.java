import java.util.Arrays;
 class descendingOrder{
     
    public static int sortDesc(final int num) {

         String n = String.valueOf(num);
         char arr[] = new char[n.length()];
         
         for (int i = 0; i <n.length(); i++) {
            arr[i] = n.charAt(i );
         }       
         Arrays.sort(arr);
         String s = new StringBuilder(String.valueOf(arr)).reverse().toString();  
         return Integer.valueOf(s);
    }

  
     public static void main(String[] args) {
        System.out.println(sortDesc(32145));    
     }
 }

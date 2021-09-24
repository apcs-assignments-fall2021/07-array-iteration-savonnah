import java.util.Arrays;

public class MyMain {

    // Reverses an array
    public static int[] reverse(int[] arr) {
        int[] newarr =new int[arr.length];
        int currentindex = 0;
        for (int i = arr.length-1; i >=0; i=i-1) {
            newarr[currentindex]+=arr[i];
            currentindex+=1;
        }
        return newarr;
    }

    // Finds the second largest number in an array
    public static int secondLargest(int[] arr) {
        int maxnum = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++) {
            if (arr[i] > maxnum) {
                maxnum = arr[i];
            } else {
                maxnum = maxnum;
            }
        }
        for(int x = 0; x<arr.length; x++){
            if (arr[x] != maxnum && arr[x] > second){
                second = arr[x];
            }
        }
        return second;
    }

    // This method is given a word, and it checks to see
    // if it was spelled correctly. The method only considers
    // words in the array dictionary as valid words
    // The method returns true is the word is spelled correctly
    // and false otherwise
    public static boolean spellCheck(String word) {
        // Don't edit this array
        // This is our dictionary of valid words
        String[] dictionary = {"the","of","and","a","to","in","is","you","that","it","he","was","for","on","are","as","with","his","they","I","at","be","this","have","from","or","one","had","by","word","but","not","what","all","were","we","when","your","can","said","there","use","an","each","which","she","do","how","their","if","will","up","other","about","out","many","then","them","these","so","some","her","would","make","like","him","into","time","has","look","two","more","write","go","see","number","no","way","could","people","my","than","first","water","been","call","who","oil","its","now","find","long","down","day","did","get","come","made","may","cat","dog","cats","dogs"};

        for(int x = 0; x<dictionary.length; x++){
            if (word == dictionary[x]){
                return true;
            }
        }

        return false;

    }


    public static void main(String[] args) {
        System.out.println("reverse Tests:");
        int[] nums = {1, 6, 2, 6};
        int[] nums2 = {-1, -6, -3};
        int[] nums3 = {8, 2, 3, 9, 3};
        System.out.println(Arrays.toString(reverse(nums))); // [6, 2, 6, 1]
        System.out.println(Arrays.toString(reverse(nums2))); // [-3, -6, -1]
        System.out.println(Arrays.toString(reverse(nums3))); // [3, 9, 3, 2, 8]

        System.out.println();
        System.out.println("secondLargest Tests:");
        System.out.println(secondLargest(nums));
        System.out.println(secondLargest(nums2));
        System.out.println(secondLargest(nums3));

    }
}

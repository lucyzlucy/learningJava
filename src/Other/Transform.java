package Other;

// Converts string into array and then combines two arrays in reverse order

public class Transform {
    public static void main(String[] args) {
        String s = "abc";
        char [] ss = s.toCharArray();
        System.out.println(ss);
        char [] ss1 = {'1', '2', '3'};
         System.out.println(ss1);
        char [] ss2 = new char[ss.length + ss1.length];
        for (int a = ss.length-1, b = 0; a >= 0; b++, a--){
            ss2[b] = ss[a];
        }
        for (int a = ss1.length-1, b = ss.length; a >= 0; b++, a--){
            ss2[b] = ss1[a];
        }
        System.out.println(ss2);

    }
}

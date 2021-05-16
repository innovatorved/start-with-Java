import jdk.tools.jlink.internal.plugins.SystemModulesPlugin;

public class j16StringMetheods {
    public static void main(String[] args){
        // Note : Strings are Immutable once declare doesnot changed
        // how to declre String

        String str1 = "Ved Gupta";
        String str2 = new String("This is a String");
        System.out.println("Inputt string : "+str2);

        // Check length of String
        System.out.println("Length of String : "+str2.length());

        // return string in lowercase
        System.out.println("String to Lower Case : "+str2.toLowerCase());

        // return string in to upper case
        System.out.println("String to Upper Case : "+str2.toUpperCase());

        // Remove White Space to start and end  from String trim() metheod
        String str_with_whitespace = "   This Is String     ";
        System.out.println("str_with_whitespace : " + str_with_whitespace);

        System.out.println("str_without_whitespace : " + str_with_whitespace.trim());

        // Substring 
        /* --- input is index you want to start in string and goes to last and scound  input is 
            stop index  
        */

        System.out.println("Return Substring of String str2 start with index5 :  "+str2.substring(5));

        System.out.println("Start with index 3 and stop index 15 : " + str2.substring(3,15));

        // Replace Character from String
        System.out.println("Original String : " + str2);

        System.out.println("Replace 'is a' by Hello : " + str2.replace("is a", "hello"));

        System.out.println("Replace ' i ' in String by a : " + str2.replace('i', 'a'));

        // Check Strings Start with your input char or string
        System.out.println("Strings Start with his or not : " + str2.startsWith("his"));

        // check end with
        System.out.println("Check String end with 'ing' : " + str2.endsWith("ing"));

        // Check character at specific index
        System.out.println("Char at inder 3 : " + str2.charAt(3));
        
        // check index of specific character
        System.out.println("Index of s : " + str2.indexOf('s'));
        //and we also start checking from specific index
        //lets check i after 6
        System.out.println("check  'i' After 6 index : " + str2.indexOf('i' , 6));
        // If match not find function return  -1
        System.out.println("Check hello in str2 : " + str2.indexOf("hello"));

        // Check whole String equal to any String
        String str3  = "Ved Prakash Gupta";
        // c//check
        System.out.println(str3.equals("Ved Prakash Gupta")); // if true the string are equal
        // str3.equalsIgnoreCase(anotherString) : function ignore the string case 
        System.out.println(str3.equals("ved prakash gupta")); // does not ignore
        System.out.println(str3.equalsIgnoreCase("ved prakash gupta")); // ignore the string case
    }
}

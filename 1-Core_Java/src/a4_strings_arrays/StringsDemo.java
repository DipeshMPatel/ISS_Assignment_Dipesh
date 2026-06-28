package a4_strings_arrays;

public class StringsDemo { 

    public static void main(String[] args) {

        // Creating String using character array
        char[] nameArray = {'D', 'i', 'p', 'e', 's', 'h'};
        String studentName = new String(nameArray);

        // Creating String using String literal
        String name = "Dipesh";

        System.out.println("String from character array : " + studentName);
        System.out.println("String literal              : " + name);

        // Creating String using new keyword
        String message = new String("Core Java");
        System.out.println("String using new keyword    : " + message);

        // Common String Methods
        String text = "Programming";

        System.out.println("Length                    : " + text.length());
        System.out.println("Character at index 4      : " + text.charAt(4));
        System.out.println("Index of 'r'              : " + text.indexOf('r'));
        System.out.println("Last index of 'm'         : " + text.lastIndexOf('m'));
        System.out.println("Substring from index 3    : " + text.substring(3));
        System.out.println("Substring (2,7)           : " + text.substring(2, 7));
        System.out.println("Uppercase                 : " + text.toUpperCase());
        System.out.println("Lowercase                 : " + text.toLowerCase());
        System.out.println("Replace 'a' with 'A'      : " + text.replace('a', 'A'));
        System.out.println("Replace 'Pro' with 'Java': " + text.replace("Pro", "Java"));
        System.out.println("Starts with 'Pro'        : " + text.startsWith("Pro"));
        System.out.println("Ends with 'ing'          : " + text.endsWith("ing"));
        System.out.println("Equals 'programming'      : " + text.equals("programming"));
        System.out.println("Equals Ignore Case        : " + text.equalsIgnoreCase("programming"));
        System.out.println("Trim                      : '" + "   Java   ".trim() + "'");
        System.out.println("Concatenation             : " + text.concat(" Language"));

        // StringBuilder
        StringBuilder builder = new StringBuilder("Dipesh");

        System.out.println();
        System.out.println("StringBuilder             : " + builder);
        System.out.println("Reverse                   : " + builder.reverse());

        builder.reverse();

        builder.append(" Patel");
        System.out.println("Append                    : " + builder);

        builder.insert(6, " M.");
        System.out.println("Insert                    : " + builder);

        builder.replace(0, 6, "Student");
        System.out.println("Replace                   : " + builder);

        builder.delete(7, 10);
        System.out.println("Delete                    : " + builder);

        System.out.println("Length                    : " + builder.length());

        // Traversing String
        System.out.println();
        System.out.println("Traversing String:");

        int count = 0;

        for (char ch : text.toCharArray()) {
            System.out.print(ch + " ");
            count++;
        }

        System.out.println();
        System.out.println("Character Count : " + count);

    }

}
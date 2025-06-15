public class StringBufferLab {
    public static void main(String[] args) {
        
        StringBuffer sb = new StringBuffer("Multithreading Lab");

       
        sb.append(" - Learning Java");
        System.out.println("After append: " + sb);

        
        int indexAfterLab = sb.indexOf("Lab") + "Lab".length();
        sb.insert(indexAfterLab, " is fun");
        System.out.println("After insert: " + sb);

       
        int start = sb.indexOf("Learning");
        int end = start + "Learning".length();
        sb.delete(start, end);
        System.out.println("After delete: " + sb);

       
        sb.reverse();
        System.out.println("After reverse: " + sb);
    }
}

//7.Convert null to wrapper classes
package Day6_portal_assignment;

public class null_wrapereg{
    public static void main(String[] args) {
        String v = null;
        try {
            Integer i = Integer.valueOf(v);
            System.out.println("Integer value: " + i);
        } catch (Exception e) {
            System.out.println("Integer conversion not possible");
        }
        try {
            Double d = Double.valueOf(v);
            System.out.println("Double value: " + d);
        } catch (Exception e) {
            System.out.println("Double conversion not possible");
        }

        Boolean b = Boolean.valueOf(v);
        System.out.println("Boolean value: " + b);
    }
}
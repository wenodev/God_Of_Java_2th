package godOfJava2th.ch20.homework;

/**
 * 직접해봅시다
 */
public class NumberObjects {
    public static void main(String[] args) {
        NumberObjects numberObjects = new NumberObjects();
        System.out.println(numberObjects.parseLong("10a"));
        numberObjects.printOtherBase(1024);
    }

    public long parseLong(String data){
        long result = 0L;
        try{
            result = Long.parseLong(data);
        }catch(NumberFormatException e){
            System.out.println(data + "is not a number.");
            return -1;
        }
        return result;
    }

    public void printOtherBase(long value){
        System.out.println("Original: " + value);
        System.out.println("Binary: " + Long.toBinaryString(value));
        System.out.println("Hex: " + Long.toHexString(value));
        System.out.println("Octal: " + Long.toOctalString(value));
    }
}

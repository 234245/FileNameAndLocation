import java.util.Scanner;

public class FileNameAndLocations
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" enter the drive letter: ");
        String driveLetter = in.next();
        System.out.print(" enter the path: ");
        String path = in.next();
        System.out.print(" enter the filename: ");
        String filename = in.next();
        System.out.print(" enter the extension: ");
        String extension = in.next();
        in.close();
        String completeFilename = driveLetter +":"+ "\\"  + path + "\\" + filename + "." + extension;
        System.out.println(completeFilename);
    }
}
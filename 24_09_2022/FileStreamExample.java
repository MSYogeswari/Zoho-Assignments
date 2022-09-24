import java.io.*;
import java.util.Scanner;

public class FileStreamExample {
  public static void main(String[] args) {
      try {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter a source file path with name");
          String sourcefile_path = sc.nextLine();
          //sourcefile_path = "C:\\Users\\ADMIN\\IdeaProjects\\Test\\src\\Sample.txt"
          FileInputStream input = new FileInputStream(sourcefile_path);
          System.out.println("Enter a destination path with file name");
          String destinationfile_path = sc.nextLine();
          //destinationfile_path = "C:\\Users\\ADMIN\\Desktop\\SampleCopy.txt"
          FileOutputStream output = new FileOutputStream(destinationfile_path);
          System.out.println("FILE CONTENT: ");
            int linecount  = 0;
            int wordcount = 0;
          int i = input.read();
          while (i != -1) {
              output.write(i);
              if((char)i == '\n') {
                  linecount++;
             }
              if((char)i == ' ' || (char)i == '\n') {
                  wordcount++;
              }
              System.out.print((char) i);
              i = input.read();
          }
          System.out.println();
          System.out.println("Number of lines: " + linecount);
          System.out.println("Number of words: " + wordcount);
          System.out.println("Copied file location: " + destinationfile_path);
          input.close();
      } catch (FileNotFoundException ex) {
          throw new RuntimeException(ex);
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
  }
}

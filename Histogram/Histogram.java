import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
/**
Create histogram of text files
*/
public class Histogram
{
  public static void main(String[] args) throws IOException
  {
    String fname = "hamlet.txt";

    File file = new File(fname);
    Scanner scan = new Scanner(file);

    HashMap<String, Integer> map = new HashMap<>();

    while(scan.hasNext())
    {
      String key = scan.next();
      if (map.containsKey(key))
      {
        map.put(key, map.get(key) + 1);
      }
      else
      {
        map.put(key, 1);
      }
    }

    for (HashMap.Entry<String, Integer> entry : map.entrySet())
      System.out.println(entry);
  }
}

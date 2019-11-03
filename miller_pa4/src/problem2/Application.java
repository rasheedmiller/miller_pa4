package problem2;

public class Application
{
public static void main(String[] args)
{
  String input_file = "problem2.txt";
 
  String output_file = "unique_word_counts.txt";
  
  DuplicateCounter DupCouObj = new DuplicateCounter();
  
  DupCouObj.count(input_file);

  DupCouObj.write(output_file);
}

}
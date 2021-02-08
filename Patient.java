class Patient
{
 import java.util.Scanner*
  private String name;
  private int age;
  private String gender;

  public Patient()
  {
    name = " ";
    age = 0;
    gender = " ";
  }

  public Patient(String name, int age, String gender)
  {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public String toString()
  {
    return "\nName: " + this.name + "\nAge: " + this.age + "\nGender: " + this.gender;
  }
  
  public static String reformat(String condition)
  {
    condition = condition.substring(0,1);
    if(condition.equals("y"))
    {
      condition = "Y";
    } 
    return condition;
  }

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.println("\nHi! This is my diagnosis program. *DISCLAIMER: THIS IS NOT A REPLACEMENT FOR A DOCTOR, PLEASE GO TO YOUR NEAREST HOSPITAL IF YOU ARE ILL* \n");
  
  boolean confirmed = false;
  while(confirmed==false)
  {
  //I found at https://www.geeksforgeeks.org/why-is-scanner-skipping-nextline-after-use-of-other-next-functions/ how to scan integers and what the issue was. What happened when I was scanning intergers was it didnt move to the next line after scanning

  //Gathering user information
  System.out.println("Please enter your name: ");
  String name = scanner.nextLine();
  System.out.println("Please enter your gender: ");
  String gender = scanner.nextLine();
  System.out.println("Please enter your age: ");
  int age = Integer.parseInt(scanner.nextLine());

  System.out.println("\nplease wait");
  Patient user = new Patient(name, age, gender);

  System.out.println("\nIs your information?: " + user.toString() +"\n");
  String answer = scanner.nextLine();
  if(answer.equals("yes"))
  {
    confirmed = true;
  }
  else 
  {
    confirmed = false;
  }
  }
  
 Diagnose d = new Patient();
  //Asking symptoms
  System.out.println("\nWe will now be asking your symptoms\n");
  System.out.println("Do you have headaches?");
  String headache = scanner.nextLine();
  headache = Patient.reformat(headache);
 // System.out.println(headache);
  System.out.println("\nDo you have a sore throat?");
  String soreThroat = scanner.nextLine();
  soreThroat = Patient.reformat(soreThroat);
  System.out.println("\nDo you have a runny or stuffy nose?");
  String runnyNose = scanner.nextLine();
  runnyNose = Pa.reformat(runnyNose);
  System.out.println("\nDo you have a cough?");
  String cough = scanner.nextLine();
  cough = Patient.reformat(cough); 
  System.out.println("\nDo you have chills and/or aches?");
  String chillsAches = scanner.nextLine();
  chillsAches = Patient.reformat(chillsAches);
  System.out.println("\nDo you have a fever?");
  String fever = scanner.nextLine();
  fever = Patient.reformat(fever); 
  System.out.println("\nDo you feel fatiuge?");
  String fatiuge = scanner.nextLine();
  fatiuge = Patient.reformat(fatiuge); 
  System.out.println("\nHave you thrown up?");
  String throwUp = scanner.nextLine();
  throwUp = Patient.reformat(throwUp); 
  System.out.println("\nDo you have diarreha?");
  String diarreha = scanner.nextLine();
  diarreha = Patient.reformat(diarreha);
  System.out.println("\nDo you have a upset stomach?");
  String upsetStomach = scanner.nextLine();
  upsetStomach = Patient.reformat(upsetStomach);  

//Producing results
System.out.println("\nPlease wait while loading results\n");
scanner.close();
System.out.println(d.diagnosiCalc(headache, soreThroat, runnyNose, cough, chillsAches, fever, fatiuge, throwUp, diarreha, upsetStomach));
System.out.println("\nRemember these results are not a subsitute for a doctor, if you feel very ill please go to your nearest hospital. \nThank you for using Diagnosis Program!");
  }

}
}

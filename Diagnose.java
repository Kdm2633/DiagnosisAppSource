class Diagnose{

  public String diagnosiCalc(String headache, String soreThroat, String runnyNose, String cough, String chillsAches, String fever, String fatiuge, String throwUp, String diarreha, String upsetStomach)
 {
   String diagnosis = " you are not ill.";
   int coldCount=0;
   int fluCount=0;
   int stomachBugCount=0;
   //counts how many symptoms and totals them into there possiblities
   if(headache.equals("Y"))
   {
     coldCount++;
     fluCount++;
     stomachBugCount++;
   }
  if(soreThroat.equals("Y"))
   {
      coldCount++;
   }
  if(runnyNose.equals("Y"))
  {
    coldCount++;
  }
   if(cough.equals("Y"))
   {
     coldCount++;
     fluCount++;
   }
      if(chillsAches.equals("Y"))
   {
     fluCount++;
     stomachBugCount++;
   }
    if(fever.equals("Y"))
    {
      fluCount++;
      stomachBugCount++;
    }
  if(fatiuge.equals("Y"))
   {
     coldCount++;
     fluCount++;
     stomachBugCount++;
   }
   if(throwUp.equals("Y"))
   {
     fluCount++;
     stomachBugCount++;
   }
   if(diarreha.equals("Y"))
   {
     fluCount++;
     stomachBugCount++;
   }
   if(upsetStomach.equals("Y"))
   {
     stomachBugCount++;
   }
//Using totals to make a result
  if(stomachBugCount==fluCount)
  {
    diagnosis = " you have a stomach bug or the flu. We have detected that this case is severe, please contact your doctor immediately for safety precaution.";
  }
   else if((stomachBugCount> fluCount) && (stomachBugCount>coldCount))
   {
     diagnosis = " you have a stomach bug/ virus.";
   }
   else if((fluCount > stomachBugCount) && (fluCount>coldCount))
   {
    diagnosis = " you have the flu.";
   }
   else if ((coldCount==5 && stomachBugCount == 0) || (coldCount > stomachBugCount) && (coldCount>fluCount))
   {
     diagnosis = " you have a cold.";
   }

   //Uncomment to see point process and how diagnosis system works
   //System.out.println("Cold points:"+ coldCount + " // Flu points:" + fluCount + " // Bug points:" + stomachBugCount +"\n");
   return "Our diagnosis is" + diagnosis;
 }
}

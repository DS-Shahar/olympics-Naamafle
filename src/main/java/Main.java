class Main {
  public static void main(String[] args) {
    System.out.println("Hello World!");
     Grade[] g1={new Grade("swiming", 100)
                ,new Grade("runing",120)
                ,new Grade("Swiming",130)};
        Grade[] g2={new Grade("biking", 100)
                ,new Grade("biking",100)
                ,new Grade("Swiming",120)};

        Athlete a1=new Athlete("a",g1.length);
        a1.setGrades(g1);

        Athlete a2=new Athlete("b",g2.length);
        a2.setGrades(g2);

        //AddGrade
        System.out.println("Adding a new grade for Athlete 1");
        a1.AddGrade("diving", 110);

        //deleteGrade
        System.out.println("Deleting a grade for Athlete 2");
        a2.deleteGrade("biking");

        //average
        System.out.println("Calculating the average grade for Athlete 1");
        double avgGradeA1 = a1.average();
        if (avgGradeA1 != -1) {
            System.out.println("Average grade for Athlete 1: " + avgGradeA1);
        }
        else {
            System.out.println("No grades available for Athlete 1");
        }

        //allGradesAbove
        System.out.println("Checking if all grades for Athlete 2 are above 110");
        boolean allAbove110 = a2.allGradesAbove(110);
        if (allAbove110) {
            System.out.println("All grades for Athlete 2 are above 110");
        }
        else {
            System.out.println("Not all grades for Athlete 2 are above 110");
        }

        //isBetter
        System.out.println("Checking if Athlete 1 is better than Athlete 2");
        if (a1.isBetter(a2)) {
            System.out.println("Athlete 1 is better than Athlete 2");
        }
        else {
            System.out.println("Athlete 2 is better than or equal to Athlete 1");
        }

  }
}

package edu.calpoly.csc305.lab1a;

class Driver{
  public static void main(String args []) {
    Example ex = new Example();
    int total = 0;

    while (true){
      int num = ex.getNums()[0];
      total += num;
      break;
    }
    System.out.println(ex.sameName("Jack"));
    System.out.println(total);
  }
}


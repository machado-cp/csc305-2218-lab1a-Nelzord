package edu.calpoly.csc305.lab1a;

class Example {

  private String name = "Jack";
  private int[] nums = new int[]{ 1,2,3 };
  Example(){

  }

  boolean sameName(String other) {
    return other.equals(name);
  }

  public int[] getNums() {
    return nums;
  }
}  

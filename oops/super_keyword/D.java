package oops.super_keyword;

class D extends C{
    void print(){
        System.out.println("ohh its not valid");
    }
     
    void parentPrint(){
        super.print();
    }
  }

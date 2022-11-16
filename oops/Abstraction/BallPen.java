package oops.Abstraction;

class BallPen extends Pen {
  
    void write(){
        System.out.println("BallPen is writing");
    }

    public static void main(String[] args) {
        BallPen bp = new BallPen();
        bp.refil();
       
    }

    
    

}

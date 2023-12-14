class Main {
  public static void main(String[] args) {
    Matrice m = new Matrice("verme");
    Vigenere v = new Vigenere(0,12,0,12,m);
    Thread t = new Thread(v);
    Vigenere v1 = new Vigenere(13,25,13,25,m);
    Thread t1 = new Thread(v1);
    t.start();
    try{
      
    }catch(InterruptedException e){
      System.err
    }
    t.join();
    t1.start();
    m.stampa();
  }
}
class Main {
 float v1,v2,v3;

  Main(){
    
  }
  
  float media(float v1, float v2, float v3){
    this.v1=v1;
    this.v2=v2;
    this.v3=v3;
    
    return (v1+v2+v3)/3;
  }
  
  public static void main(String[] args) {
    Main main = new Main ();

    System.out.println(main.media(7.0f,8.0f,9.0f));
  }
}
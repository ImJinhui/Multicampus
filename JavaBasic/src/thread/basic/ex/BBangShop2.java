package thread.basic.ex;

class Producer2 extends Thread
{
 private BBangShop2  shop;
 private String bread = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
 

 public Producer2( BBangShop2 s ){
  shop = s; 
 }
 
 public void run(){
  
  char c;
  
  for( int i=0; i<10 ; i++)
  {
   c = bread.charAt( (int)(Math.random() * 25 ) );
   shop.add( c );
   //System.out.println(c + "빵을 만들고 진열함"); -> 1번
   
   try{
    sleep( (int)(Math.random() * 500 ));
   } catch(InterruptedException ex){}
  } 
 }
}


class Consumer2 extends Thread
{
 private BBangShop2  shop;
 
 public Consumer2( BBangShop2 s ){
  shop = s; 
 }
 
 public void run(){
  
  char c;
  
  for( int i=0; i<10 ; i++)
  {
   c = shop.buy( );
   
   //System.out.println(c + "빵을 산다 ");  -> 2번
   
   try{
    sleep( (int)(Math.random() * 500 ) );
   } catch(InterruptedException ex){}
  } 
 }
}


public class BBangShop2
{
 private char breads[] = new char[6];
 private int  addnext = 0;
 private int  buynext = 0;
 
 private boolean isFull = false;
 private boolean isEmpty = true;
 
 public synchronized char buy()
 {
  
  while( isEmpty == true ){
   System.out.println("빵이 없습니다");
   try{
   wait();
   }catch(InterruptedException ex ){}
  }
  
  char buyBread = breads[ buynext ];
  
  buynext = ( buynext + 1 ) % 6;
  
  if( buynext == addnext ) isEmpty = true;
  
  isFull = false;
  System.out.println(buyBread + "빵을 산다 ");   //2번 여기로 이동
  notify();
  
  return buyBread;
    
 
 }
 
 public synchronized void add( char newBread )
 {
  while( isFull == true ){
   System.out.println("빵이 가득차서 진열할수 없습니다 ");
   try{
   wait();
   }catch(InterruptedException ex ){}
  }
  
  breads[ addnext ] = newBread;
  
  addnext = ( addnext + 1 ) % 6;
  
  if( buynext == addnext ) isFull = true;
  
  isEmpty = false;
  System.out.println(newBread + "빵을 만들고 진열함");  //1번 여기로 이동
  notify();
  
 }
 
 public static void main( String [] args )
 {
  BBangShop2 shop  = new BBangShop2();
  Producer2  p  = new Producer2( shop );
  Consumer2  c  = new Consumer2( shop );
  
  p.start();
  c.start(); 
 } 
}


//"빵을 진열함", "빵을 삼" 출력을 shop.add(), shop.buy()의 notify() 이전으로 보냄

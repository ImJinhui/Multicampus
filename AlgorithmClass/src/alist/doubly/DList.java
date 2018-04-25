package alist.doubly;
import java.util.NoSuchElementException;
public class DList <E> {
	 protected DNode head, tail;
     protected int size;
     
     public DList(){  //생성자
         head = new DNode (null, null, null);
         tail = new DNode (null, head, null);  // tail의 이전 노드를 head로 만든다.
         head.setNext(tail);  //head의 다음 노드를 tail로 만든다.
         size = 0;
     }
     
     public int size() { return size; }
     public boolean isEmpty() { return size == 0; }
   
     /**  p가 가리키는 노드 앞에 삽입 */
     public void insertBefore(DNode p, E newItem){ 
    	 // 1. p노드의 이전노드를 얻어온다
    	 // 2. 새로운 노드를 생성한다
    	 // 3. p노드의 이전 레퍼런스에 새노드를 지정한다
    	 // 4. p노드의 이전 노드(1번)의 다음 레퍼런스에 생성한 새 노드를 지정한다
    	 // 5. 리스크 크기를 변경한다
    	
     }
     
     /**  p가 가리키는 노드 뒤에 삽입 */
     public void insertAfter(DNode p, E newItem){ 
    	 // 1. p노드가 가리키는 다음 노드를 얻어온다
    	 // 2. 새로운 노드를 생성한다
    	 // 3. p노드의 다음 노드의 이전 레퍼런스에 생성한 새 노드를 지정한다
    	 // 4. p노드의 다음 레퍼런스에 새노드를 지정한다
    	 // 5. 리스크 크기를 변경한다
    	 
    	
     }  
          
     /**  x가 가리키는 노드 삭제 */
     public void delete(DNode x) {               
 		if (x ==  null) throw new NoSuchElementException();
 		// 1. x 노드가 가리키는 이전 노드와 다음 노드를 얻어온다
 		// 2. 이전노드의 다음 레퍼런스에 다음 노드를 지정한다
 		// 3. 다음노드의 이전 레퍼런스에 이전 노드를 지정한다
 		// 4. 삭제하려는 x 노드의 이전과 다음 레퍼런스에  null을 지정한다
 		// 5. 리스트 크기 변경
 		
 		
     }

     
     
     public void print(){  // 연결 리스트 노드들의 item들을 차례로 출력
 		if (size > 0) 
 			for (DNode p = head.getNext(); p != tail; p = p.getNext()) 
 					System.out.print(p.getItem()+"\t ");
 		else
 			System.out.println("리스트 비어있음");
 		System.out.println();
 	}
}

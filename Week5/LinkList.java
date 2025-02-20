import java.util.LinkedList;

public class LinkList {
    public static void main (String[] args){
        LinkedList<String> linkedList = new LinkedList<String>();
        // .push(E) push item from the start: FDCBA
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        // Removes the item "on top" (in this case, F)
        linkedList.pop();

        // .offer(E) adds item from the end: ABCDF
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        // .poll(E) removes item from the end 
        // linkedList.poll();

        // Add an element E at index position 4 
        linkedList.add(4, "E");
        // Directly searches for the element in the LinkedList 
        linkedList.remove("E");

        System.out.println(linkedList.indexOf("F"));
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        linkedList.addFirst("0");
        linkedList.addLast("Z");
        System.out.println(linkedList);
    }
}
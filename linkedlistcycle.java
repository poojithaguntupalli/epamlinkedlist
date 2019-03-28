 static boolean hasCycle(SinglyLinkedListNode head) {
SinglyLinkedListNode fast = head;
    
    while(fast != null && fast.next != null) {
        fast = fast.next.next;
        head = head.next;
        
        if(head.equals(fast)) {
            return true;
        }
    }
    return false;

    }


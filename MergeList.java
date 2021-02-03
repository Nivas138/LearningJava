   static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        //SinglyLinkedListNode temp1lastNode;
        SinglyLinkedListNode temp1 = head1;
        SinglyLinkedListNode temp2 = head2;
        int count = 0;
        while(temp1 != null){
          ++count;
          if(temp1.next == null){
             temp1.next = temp2; 
             break;
          }else{
              temp1 = temp1.next; 
          }
        }
        temp1 = head1;
        while(temp1 != null){
            ++count;
            temp1 = temp1.next;
        }
        temp1 = head1;
        if (count > 1) {
           SinglyLinkedListNode current = temp1;
           while (current != null) {
              SinglyLinkedListNode second = current.next;
              while (second != null) {
                if (current.data > second.data) {
                    int tmp = current.data;
                    current.data = second.data;
                    second.data = tmp;
                }
                second = second.next;
              }
            current = current.next;
            }
        }
        return head1;
    }

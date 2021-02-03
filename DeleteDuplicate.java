static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp = head;
        while(temp != null && temp.next != null){
            SinglyLinkedListNode nextnode = temp.next;
            if(temp.data == nextnode.data){
                //System.out.println("Entered..");
                temp.next = nextnode.next;
            }else{
               temp = temp.next; 
            }
        }
        return head;
    }

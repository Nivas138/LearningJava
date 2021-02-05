   static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode temp = head;
        int count = 0;
        while(temp != null){
            ++count;
            temp = temp.next;
        }
        //int[] st = new int[count];
        SinglyLinkedListNode temp2 = head;
         SinglyLinkedListNode temp3 = null;
        for(int i=0;i<count;i++){
            //System.out.println("---"+temp2.data);
            int kk = temp2.data;
            temp2 = temp2.next;
            SinglyLinkedListNode newNode = new SinglyLinkedListNode(kk);
            newNode.next = temp3;
            temp3 = newNode;
        }
       
        return temp3;
    }

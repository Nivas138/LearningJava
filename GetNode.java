static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode temp = head;
        int count = -1,searchcount = 0;
        while(temp != null){
            ++count;
            temp = temp.next;
        }
        SinglyLinkedListNode search = head;
        if(count == 1){
            return search.data;
        }else{
            searchcount = count - positionFromTail;
            System.out.println(positionFromTail);
            while(searchcount>0 && search != null){
                search = search.next;
                searchcount -= 1;
            }
            return search.data; 
        }
    }

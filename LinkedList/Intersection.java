import org.w3c.dom.Node;

class Intersection{

    public Node intersect(Node p, Node q){
        Node inter = null;
        int lengthp = 1;
        int lengthq = 1;

        Node currentp = p;
        Node currentq = q;

        while(currentp.next != null){
            currentp = currentp.next;
            lengthp++;
        }
        while(currentq.next != null){
            currentq = currentq.next;
            lengthq++;
        }

        currentp = p;
        currentq = q;
        if(lengthp > lengthq){
            for(int i = 0; i < lengthp - lengthq; i++) currentp = currentp.next;
        }
        else{
            for(int i = 0; i < lengthq - lengthp; i++) currentq = currentq.next;
        }

        while(currentp.next != null && currentq.next != null){
            if(currentp == currentq) return currentq;
        }

        if(currentp == currentq) return currentq;
        else return null;
    }
}
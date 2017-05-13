import java.util.Queue;

import jdk.nashorn.internal.runtime.regexp.joni.ast.Node;

class RouteBetweenNodes{

    enum State{Unvisited, Visited, Visiting;}

    public boolean search(Grapg g, Node start, Node end){
        if(start == end) return true;
        Queue<Node> queue = new LinkedList<Node>();

        for(Node n : g.getNodes()) u.state = State.Unvisited;
        start.state = State.Visiting;
        queue.add(start);
        while(!queue.isEmpty()){
            Node temp = queue.remove();
            if(temp != null){
                for(Node u : u.getAdjacent()){
                    if(u.state == State.Unvisited){
                        if(v == end) return true;
                        else{
                            u.state = State.Visiting;
                            queue.add(u);
                        }
                    }
                }
            }
            temp.state = State.Visited;
        }
        return false;
    }
}
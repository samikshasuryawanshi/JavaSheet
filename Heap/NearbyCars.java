import java.util.*;
class NearbyCars{

    static class Point{
        int x;
        int y;
        int distsq;

        public Point(int x,int y,int distsq){
            this.x = x;
            this.y = y;
            this.distsq = distsq;
        }

        @Override
        public int CompareTo(Point p2) {
            return this.distsq - p2.distsq;
        }
    }

    public static void main(String[] args) {
        int pts[][] = {{3,3},{5,-1},{-2,4}};
        int k = 2;  


        PriorityQueue<Point> pq = new PriorityQueue<>();

        for(int i =0;i< pts.length;i++){
            int x = pts[i][0];
            int y = pts[i][1];
            int distsq = (x * x) + (y * y);
            pq.add(new Point(x, y, distsq));
        }


        //nearest k points
        for(int i = 0; i < k; i++){
            Point p = pq.remove();
            System.out.println("Point: (" + p.x + ", " + p.y + "), Distance Squared: " + p.distsq);
        }


    }
}
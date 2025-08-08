class FloodFill{
    public void helper(int[][] image, int sr, int sc, int color, int orgColor, boolean[][] visited) {
        if(sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || visited[sr][sc] || image[sr][sc] != orgColor) {
            return; // Out of bounds or already visited or not the original color
        }

        //left
        helper(image, sr, sc-1, color, orgColor, visited);
        //right
        helper(image, sr, sc+1, color, orgColor, visited);
        //up
        helper(image, sr-1, sc, color, orgColor, visited);
        //down
        helper(image, sr+1, sc, color, orgColor, visited);

    }


    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        boolean[][] visited = new boolean[image.length][image[0].length];
        helper(image, sr, sc, newColor, image[sr][sc], visited);
        return image;
    }
    public static void main(String[] args) {
        
        
    }
}
import javax.imageio.stream.ImageInputStream;

public class MinesweeperModel {



    public MinesweeperModel(int i,int j,int n)
    {   gridOpened=new boolean[i+2][j+2];
        grid=new int[i+2][j+2];
        this.n=n;
        setGrid();

    }



    int[][] grid;
    int n;
    boolean[][] gridOpened;

    public void setGrid()
    {
       loop1: for(int i=0; i<n; i++)
        {
            int x=(int)(Math.random()*11);
            int y=(int)(Math.random()*11);
            if(x==0 || x==11 || y==0 || y==11 || grid[x][y]==-1){
                i=i-1; continue loop1;}
            grid[x][y]=-1;
        }

        for(int i=0; i<grid.length; i++)
        {for(int j=0; j<grid[0].length; j++)
        {
            if(i==0 || i==grid.length-1 || j==0 || j==grid[0].length-1){grid[i][j]=-10;}
        }
        }
        for(int i=1; i<grid.length-1; i++)
        {for(int j=1; j<grid[0].length-1; j++)
        {
            grid[i][j]=getnums(i,j);
        }
        }
    }


    public boolean[][] squareClicked(int x,int y)
    {
        if(grid[x][y]==-1){System.exit(0);}
        else{openSquare(x,y);}

        return gridOpened;
    }

    public int getnums(int x,int y)
    {   int count=0;
        if(grid[x][y]==-1){return -1;}
        for(int i=x-1; i<=x+1; i++)
        {for(int j=y-1; j<=y+1; j++)
        {
            if(grid[i][j]==-1){count++;}
        }
        }
        return count;
    }

    public int[][] getGrid() {
        return grid;
    }

    public void openSquare(int x, int y)
    {
        gridOpened[x][y]=true;
        if(grid[x+1][y]!=-1 && grid[x+1][y]!=-10 && !gridOpened[x+1][y] && grid[x][y]==0){openSquare(x+1,y);}
        if(grid[x-1][y]!=-1 && grid[x-1][y]!=-10 && !gridOpened[x-1][y] && grid[x][y]==0){openSquare(x-1,y);}
        if(grid[x][y-1]!=-1 && grid[x][y-1]!=-10 && !gridOpened[x][y-1] && grid[x][y]==0){openSquare(x,y-1);}
        if(grid[x][y+1]!=-1 && grid[x][y+1]!=-10 && !gridOpened[x][y+1] && grid[x][y]==0){openSquare(x,y+1);}


    }



}

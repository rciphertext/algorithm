import java.util.*;
import java.io.*;

class DFS_path
{
	static int[][] A;
	static int[] COLOR;
	static Stack<Integer> S;
	static int[] PI;

	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		int n;

		System.out.println("Enter no of vertices : ");
		n=in.nextInt();
		
		A=new int[n+1][n+1];
		S= new Stack<Integer>();
		COLOR=new int[n+1];
		PI=new int[n+1];

		System.out.println("Enter elements :");

		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				A[i][j]=in.nextInt();
			}		
		}
		
		dfs(n,2);

		System.out.println("Enter the element :");
		int vertex;

		//vertex=in.nextInt();
		for(int x=1;x<=5;x++)
		{
			vertex=x;
			while(PI[vertex]!=vertex)
			{
				System.out.print(PI[vertex]+" ");
				vertex=PI[vertex];
			}
			System.out.println(" ");
		}	

	}

	static void dfs(int n,int source)
	{
		S.push(source);
		COLOR[source]=1; //blue
		PI[source]=source;

		try
		{	while(S.peek()!=null)
			{	

				int x=S.pop();
				if(COLOR[x]!=2)
				{
				  System.out.println("-->"+x);
			    }

				for(int i=1;i<=n;i++)
				{
					if((A[x][i]==1) && COLOR[i]==1)
					{
						System.out.println("-->"+i);
						COLOR[i]=2;
					}
					if((A[x][i]==1) && COLOR[i]==0 )
					{
						S.push(i);
						COLOR[i]=1;
						PI[i]=x;
						
					}
				}


				COLOR[x]=2;	
			}
		}
		catch(Exception e)
		{
			System.out.println(" ");
		}
	}
}		
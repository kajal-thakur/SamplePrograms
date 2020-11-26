public class Demo1 {

	public static void main(String[] args) {
			for(int i=0;i<=10;i++)
			{
			    if(i==2)
			    {
			        System.out.println("continuing the loop");
			        continue;
			    }
			    if(i==5)
			    {
			        System.out.println("exiting the loop");
			        break;
			    }
			    System.out.println("the loop is working without continue and break");
			}
		}
}

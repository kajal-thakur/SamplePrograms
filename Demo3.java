
public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s= "Java";
		s.concat("Program");
		System.out.println(s);
		System.out.println("Hashcode of s:"+s.hashCode()); 
		
		String sg= "Java";
		System.out.println("Hashcode of sg before concat:"+sg.hashCode());
		sg=sg.concat("Program");
		System.out.println(sg);
		System.out.println("Hashcode of sg after conact:"+sg.hashCode()); 
		
		
		StringBuffer sb= new StringBuffer("java");
		System.out.println("Hashcode of sb before append:"+sb.hashCode());
		sb.append("Program");
		System.out.println(sb);
		System.out.println("Hashcode of sb after append:"+sb.hashCode()); 
		
		StringBuilder sr= new StringBuilder("java");
		System.out.println("Hashcode of sr before append:"+sr.hashCode());
		sr.append("Program");
		System.out.println(sr); 
		System.out.println("Hashcode of sr after append:"+sr.hashCode()); 

	}

}

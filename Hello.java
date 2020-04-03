public class Hello{
	//collab comment + 2
	public static void main(String argv[]){
		String name = "World";
		if(argv.length !=0){
			name=argv[0];
		}
		System.out.println("Hello, " + name + "!");
	}
}

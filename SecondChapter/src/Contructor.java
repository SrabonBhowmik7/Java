import java.lang.reflect.Constructor;

public class Contructor {
		 int id;
		 String name;
		 int age;
		public Contructor(){
			
		}
		public Contructor(int id)
		{
			this.id= id;
		}
		public Contructor (int id , String name ,int age )
		{
			this.id = id;
			this.name = name ;
			this.age = age ;
		}
		void printvalues(){
			System.out.println("id "+id+" name "+name+" age "+age);
		}
}

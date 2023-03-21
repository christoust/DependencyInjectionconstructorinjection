package ustbatchno3.Di_constructorinjection;



	public class Roles {
		public String character_name;
		public String responsibility;
		/**
		 * @return the character_name**/
		public Roles(String character_name, String responsibility) {
			super();
			this.character_name = character_name;
			this.responsibility = responsibility;
		}
		
		@Override
		public String toString() {
			return "Roles [character_name=" + character_name + ", responsibility=" + responsibility + "]";
		}
		public void Display()
		{
			System.out.println("My name is\t"+character_name+"\nMy responsibility is\t"+responsibility);
		}
		

	}





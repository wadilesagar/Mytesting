package sample1;

 public  class Real extends Demo{
int a=10;
	public static void main(String[] args) {
		Real d=new Real();
		d.s1();
		d.s2();
		d.s3();
		d.s4();
     System.out.println(+d.a);

	}
		public void s4()
		{
			int a=20/this.a;
			System.out.println("method "+a);
		}
        public void s3() {
			System.out.println("method s3");
			
		}	
        public abstract void s8();
}


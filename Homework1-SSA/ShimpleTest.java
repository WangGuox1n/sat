public class ShimpleTest{
	int x = 0;
	public void test(){
		int y = 0;
		if( x > 0){
			x = 100;
			y = 200;
		}
		else{
			x = 300;
			y = 400;
		}
		y += x; 
	}
}
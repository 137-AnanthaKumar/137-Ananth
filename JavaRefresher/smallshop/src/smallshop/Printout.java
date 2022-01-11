package smallshop;

public class Printout {
	int a;
	
	public int Prize1(int num_page) {
		
		if(num_page<10 || num_page==10) {
			int p=5;
			int Prize=num_page*p;
			return Prize;
		}
		else if(num_page<30 && num_page>10) {
            int p=4;
			int Prize=num_page*p;
			return Prize;
		}
		else if(num_page>30 && num_page<75) {
			int p=2;
			int Prize=num_page*p;
		    return Prize;	
		}
		else {
			int p=1;
			int Prize=num_page*p;
			return Prize;
		}
		}
	public int Prize2( int num_page) {
		if(num_page>20) {
			int p=2;
			int Prize2=num_page*p;
			return Prize2;
		}
		else {
			int Prize2=num_page;
			return Prize2;
		}
	}
	public int Prize3( int num_page) {
		if(num_page>3) {
			int p=10;
			int Prize3=num_page*p;
			return Prize3;
		}
		else {
			int p=5;
			int Prize3=num_page*p;
			return Prize3;
		}
	}
	}



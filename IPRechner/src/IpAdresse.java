
public class IpAdresse {
	String binaer;
	String o1;
	String o2;
	String o3;
	String o4;
	
	public IpAdresse(int a){
		this.binaer = Integer.toBinaryString(a);
		for (int i = binaer.length(); i < 32; i++) {
			binaer=0+binaer;}
		this.o1 = binaer.substring(0, 8);
		this.o2 = binaer.substring(8, 16);
		this.o3 = binaer.substring(16, 24);
		this.o4 = binaer.substring(24,32);
		
	}
	public IpAdresse(int a,int b,int c,int d){
		this.o1 = Integer.toBinaryString(a);
		for (int i = o1.length(); i < 8; i++) {
			o1=0+o1;}
		this.o2 = Integer.toBinaryString(b);
		for (int i = o2.length(); i < 8; i++) {
			o2=0+o2;}
		this.o3 = Integer.toBinaryString(c);
		for (int i = o3.length(); i < 8; i++) {
			o3=0+o3;}
		this.o4 = Integer.toBinaryString(d);
		for (int i = o4.length(); i < 8; i++) {
			o4=0+o4;}
		this.binaer = o1+o2+o3+o4;
		
		
	}
	public IpAdresse(int[] a){
		this.o1 = Integer.toBinaryString(a[0]);
		for (int i = o1.length(); i < 8; i++) {
			o1=0+o1;}
		this.o2 = Integer.toBinaryString(a[1]);
		for (int i = o2.length(); i < 8; i++) {
			o2=0+o2;}
		this.o3 = Integer.toBinaryString(a[2]);
		for (int i = o3.length(); i < 8; i++) {
			o3=0+o3;}
		this.o4 = Integer.toBinaryString(a[3]);
		for (int i = o4.length(); i < 8; i++) {
			o4=0+o4;}
		this.binaer = o1+o2+o3+o4;
	}
	public int get(int a){
		switch (a) {
		case 0:
				return Integer.parseInt(o1,2);
		case 1:
				return Integer.parseInt(o2,2);
		case 2:
				return Integer.parseInt(o3,2);
		case 3:
				return Integer.parseInt(o4,2);			
		default:
				return -1;
		}
		
	}
	public void set(int index,int oktett){
		switch (index) {
		case 0:
			this.o1 = Integer.toBinaryString(oktett);
			break;
		case 1:
			this.o2 = Integer.toBinaryString(oktett);
			break;
		case 2:
			this.o3 = Integer.toBinaryString(oktett);
			break;
		case 3:
			this.o4 = Integer.toBinaryString(oktett);
			break;
		default:
			break;
		}
		binaer = o1+o2+o3+o4;
	}
	public int toInt(){
		int tmp=0;
		for (int i = 0,j=3; i < 4; i++,j--) {
		tmp +=(this.get(i)*(int)Math.pow(256,j));
		}	
		return tmp;
		
	}
}

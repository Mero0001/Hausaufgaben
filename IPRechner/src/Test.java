
public class Test {

	public static void main(String[] args) {
		IpAdresse test = new IpAdresse(192,168,2,67);
		Netzwerk nw = new Netzwerk(test);
		System.out.println(nw.getBroadcast().get(0));

		System.out.println(nw.getBroadcast().get(1));
		System.out.println(nw.getBroadcast().get(2));
		System.out.println(nw.getBroadcast().get(3));
		
		System.out.println(nw.getNetzwerkIp().get(0));
		System.out.println(nw.getNetzwerkIp().get(1));
		System.out.println(nw.getNetzwerkIp().get(2));
		System.out.println(nw.getNetzwerkIp().get(3));
//		System.out.println(test.binaer);
//		System.out.println(test.o1);
//		System.out.println(test.o2);
//		System.out.println(test.o3);
//		System.out.println(test.o4);
//		System.out.println(test.get(0));
//		System.out.println(test.get(1));
//		System.out.println(test.get(2));
//		System.out.println(test.get(3));
//		test.set(2, 235);
//		System.out.println(test.binaer);
//		System.out.println(test.get(0));
//		System.out.println(test.get(1));
//		System.out.println(test.get(2));
//		System.out.println(test.get(3));
//		System.out.println(test.toInt());
		
	}

}

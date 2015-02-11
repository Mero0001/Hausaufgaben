
public class Netzwerk {
	IpAdresse maske ;
	IpAdresse host;
	IpAdresse nId;
	IpAdresse bc;

	
	public Netzwerk(IpAdresse ip){
		this.host=ip;
		if(ip.get(0)<128)
			this.maske = new IpAdresse(255,0,0,0);
		if(ip.get(0)>=128 && ip.get(0)< 192)
			this.maske = new IpAdresse(255,255,0,0);
		if(ip.get(0)>=192 && ip.get(0)< 224)
			this.maske = new IpAdresse(255,255,255,0);
		if(ip.get(0)>=224 && ip.get(0)< 240)
			this.maske = new IpAdresse(255,255,255,0);
		if(ip.get(0)>=240 && ip.get(0)<256)
			this.maske = new IpAdresse(255,255,255,0);	
		this.nId= new IpAdresse(host.toInt()&maske.toInt());;
		this.bc= new IpAdresse(nId.toInt()|(~(maske.toInt())));;
	}
	public Netzwerk(IpAdresse ip, IpAdresse mask){
		this.maske=mask;
		this.host=ip;
		this.nId= new IpAdresse(host.toInt()&maske.toInt());;
	}
	public IpAdresse getNetzwerkIp(){
		return nId;	
	}
	public IpAdresse getBroadcast(){
		return bc;
		
	}
}

import java.util.HashMap;
import java.util.Set;

public class MapHash{
	public static void main (String[] args) {
		HashMap<String, String> trackList = new HashMap<String, String>();
		
		trackList.put("Sugar, We're Going Down", "We’re going down, down in an earlier round\n" + 
					"And Sugar, we’re going down swinging\n" + 
					"I’ll be your number one with a bullet\n" + 
					"A loaded God complex, cock it and pull it");
		
		trackList.put("Mr. Brightside", "Jealousy, turning saints into the sea\n" + 
					"Swimming through sick lullabies\n" + 
					"Choking on your alibis\n" + 
					"But it's just the price I pay\n" + 
					"Destiny is calling me\n" + 
					"Open up my eager eyes\n" + 
					"'Cause I'm Mr. Brightside");
		
		trackList.put("Helena", "What's the worst that I could say?\n" + 
					"Things are better if I stay\n" + 
					"So long and goodnight\n" + 
					"So long and goodnight\n" + 
					"Came a time\n" + 
					"When every star fall\n" + 
					"Brought you to tears again\n" + 
					"We are the very hurt you sold");
		
		trackList.put("Dance, Dance", "Dance, dance\n" + 
					"We're falling apart to halftime\n" + 
					"Dance, dance\n" + 
					"And these are the lives you love to lead\n" + 
					"Dance, this is the way they'd love\n" + 
					"If they knew how misery loved me");
		
		String track = trackList.get("Helena");
		System.out.println(track);
		
		Set<String> tracks = trackList.keySet();
		for(String key: tracks){
			System.out.println(key + ":");
			System.out.println(trackList.get(key));
		}
	}
}
public class Label {
	public static void main (String[] args){
		int a = 0;
		int b = 0;
		while (a<10){
		firstLoop:
		    
		    while(true){
		    	b++;
		        if(b>10){
		            break firstLoop;
		        }
		    }
		a++;
		 }
}
}
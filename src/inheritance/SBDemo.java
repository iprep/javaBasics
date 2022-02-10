package inheritance;

public class SBDemo {

	public static void main(String[] args) {
		StringBuffer data = new StringBuffer("Mohammad");
		System.out.println("Length: "+(data.length()));
		System.out.println("Capacity: "+(data.capacity()));
		
		data.append("appendto24xxxxxx");
		System.out.println("Length: "+(data.length()));
		System.out.println("Capacity: "+(data.capacity()));
		
		data.append("ap");
		System.out.println("Length: "+(data.length()));
		System.out.println("Capacity: "+(data.capacity()));
	
		long startTime = System.currentTimeMillis();  
        StringBuffer sb = new StringBuffer("Mohammad");  
        for (int i=0; i<10000; i++){  
            sb.append("Tpoint");  
        }  
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
        startTime = System.currentTimeMillis();  
        StringBuilder sb2 = new StringBuilder("Mohammad");  
        for (int i=0; i<10000; i++){  
            sb2.append("Tpoint");  
        }  
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
	
	}

}

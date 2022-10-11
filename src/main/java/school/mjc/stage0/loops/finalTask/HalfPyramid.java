package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
    	for (int i =1; i<=cathetusLength;i++) { 
    		for (int j=1; j<=cathetusLength*2-1;j++){
    			if(j<=cathetusLength) {if (i<=Math.absExact(cathetusLength-j)) {System.out.print(" ");}
   		 		else  System.out.print("*");}
             }
       System.out.println("");	
	 }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iqtest;

/**
 *
 * @author uday
 */
public class Iqtest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       int[] input = {1,2,3,4,5};
//        System.out.println("result:" + calculateweight(input));
    }
    public static int  calculateweight(int[] nos){
		
//		nos = new int[2];
		int[] weights;
		weights = new int[5];
		
		for(int i=0; i < nos.length;i++){
			weights[i] =0;
		}
		
		int calculateweight=0;
			
			for(int i=0; i < nos.length;i++){
				
				if(nos[i] == 1 )
					weights[0]++;			
				else  if(nos[i] == 2 )
					weights[1]++;
				if(nos[i] == 3 )
					weights[2]++;
				if(nos[i] == 4 )
					weights[3]++;
				if(nos[i] == 5 )
					weights[4]++;
				if(nos[i] == 6 )
					weights[5]++;
				
			}
			
			System.out.println(weights);
			
			for(int i=0; i < weights.length;i++){	
				System.out.println("weights"+(i+1)+"   "+weights[i]+"  "+calculateweight);
				if( i == 0  && weights[i] >= 3 ){
					calculateweight = calculateweight + 1000;
					calculateweight =  calculateweight + ( weights[i] - 3)  * 100 ;
					System.out.println(calculateweight);

				}
				else if( i == 3  && weights[i] >= 3 ){

					calculateweight = calculateweight + 400 ;
					calculateweight =  calculateweight +( weights[i] - 3) * 40 ;
					System.out.println(calculateweight);

				}
				else if( weights[i] >= 3 ){
					System.out.println((i+1));
					calculateweight = calculateweight + (i+1)  * 100 ;
//					calculateweight =  calculateweight + (weights[i] - 3) * 0 ;
					System.out.println(calculateweight);

				}
				
				else if( i == 0  && weights[i] < 3 ){
					System.out.println(calculateweight);

					calculateweight =  calculateweight + weights[i] * 100 ;
					System.out.println(calculateweight);

				}
				else if( i == 3  && weights[i] <  3 && weights[i] >=1 ){
					
					System.out.println("inside 3 lless than 3");
					calculateweight =  calculateweight + weights[i] * 40 ;
					System.out.println(calculateweight);

				}
				
	
			}
			System.out.println("final"+calculateweight);
			return calculateweight;

	}

    
}

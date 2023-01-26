package com.day8.q3;

public class PrimeNumber {

		public int[] findAndReturnPrimeNumbers(int[] inputArray){
		//write the logic to iterate through the supplied inputArray and return array of prime
		//numbers
		//if no prime number is found then return the empty array.
			int[] arr= new int[inputArray.length];
			
			for(int i=0;i<inputArray.length;i++) {
				if(isPrime(inputArray[i])) {
					arr[i]=inputArray[i];
				}
		}
			
			return arr;
			
			
		}
		
		
		public boolean isPrime(int n) {
			
			for(int i=2;i<=(n/2);i++) {
				if(n%i==0)
					return false;
		}
			return true;
		
		}
		
		
		public static void main(String[] args){
			//Create the object of Main class
			//on the object of Main class call the findAndReturnPrimeNumbers method
			//by supplying the following array as the parameter
			int[] arr = {10,2,54,50,11,14,15};
			//print each element from the returned array of findAndReturnPrimeNumbers method
			//if findAndReturnPrimeNumbers method returns an empty array then print the following
			//message:
			// "Prime number not found in the supplied Array"
			PrimeNumber p = new PrimeNumber();
			
			int[] ans=p.findAndReturnPrimeNumbers(arr) ;
			int flag=0;
			for(int i:ans) {
				if(i!=0) {
					System.out.print(i+" ");
					flag=1;
				}
				
			}
			if(flag==0) {
				System.out.println("Prime Number Not Found in the Supplied Array ");
			}
			
			
			
			}
		
		
		
		
		
		
		
		
			}


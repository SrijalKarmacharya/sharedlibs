def call(name){
 echo "Hey ${name}, How are you?"
 
 
  pipeline{
    agent any
    stages{
 	   stage('Demo'){
         steps{
	         welcome("Srijal Karmacharya")
	 	   script{
	           calculator.add(20,30)
	           calculator.mul(20,30)
	          }
	        }
     }
    }
  }
}

def call(name){
 echo "Hey ${name}, How are you?"
 
  pipeline{
    agent any
    stages{
 	   stage('Demo'){
         steps{
	         welcome("Srijal Karmacharya")
	 	 welcome("Tyler Durden")  
	        }
     }
    }
  }
}

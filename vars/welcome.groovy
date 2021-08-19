
 
  pipeline{
    agent any
    stages{
 	   stage('Demo'){
         steps{
	        script{
	       calculator.add(20,30)
	       calculator.mul(20,30)
	       } 
	        }
     }
    }
  }
}

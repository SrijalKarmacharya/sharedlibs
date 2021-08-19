def call(body) {
  def pipelineParams= [:]
  body.resolveStrategy = Closure.DELEGATE_FIRST
  body.delegate = pipelineParams
  body()
 
  pipeline{
    agent any
    stages{
 	   stage('Demo'){
		   echo "suceeded"
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

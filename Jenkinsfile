pipeline {
    agent any 
    environment {
        DOCKER_IMAGE_NAME = "desaiajayhnr17/springdevops"
    }
    
    stages {
        stage('Build') {
                steps {
                    sh 'mvn clean package'
                }
        }
    }
}
              
    

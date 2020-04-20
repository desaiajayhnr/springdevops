pipeline {
    agent any 
    environment {
        DOCKER_IMAGE_NAME = "desaiajayhnr17/springdevops"
    }
    
    stages {
        stage('Build') {
              sh 'mvn clean package'
        }
    }
}
              
    

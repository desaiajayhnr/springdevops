pipeline {
    agent any 
    environment {
        DOCKER_IMAGE_NAME = "desaiajayhnr17/springdevops"
    }
     tools {
        maven 'M2_HOME'
        jdk 'JAVA_HOME'
    }
    
    stages {
        stage('Initialize') {
            steps {
                sh '''
                    echo "PATH = ${PATH}"
                    echo "M2_HOME = ${M2_HOME}"
                '''
            }
        }
        stage('Build') {
                steps {
                    sh 'mvn clean package'
                }
        }
    }
}
              
    

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
                    sh 'mvn clean install'
                }
        }
        
        stage('Docker Image Build') {
            when {
                branch 'master'
            }
            steps {
                script {
                    sh ' echo ${USER}'
                    sh ' echo testing'
                    app = docker.build(DOCKER_IMAGE_NAME)
                    
                }
            }
        }
        
        stage('Docker Push') {
            steps {
                script {
                    
                    sh 'echo Publishing image'
                     withCredentials([usernamePassword(credentialsId: 'dockerlogin', passwordVariable: 'dockerpass', usernameVariable: 'dockeruser')]) {
                    // some block
                    sh 'docker login -u ${dockeruser} -p ${dockerpass}'
                    }
                    sh 'docker push desaiajayhnr17/springdevops'
                }
            }
        }
    }
}
              
    

pipeline {
    agent any

    tools {
        maven "java-maven"
    }

    stages{
        stage ("SCM Checkout"){
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/vojjalasaikumar-techie/devops-first-project.git']])
            }
        }
        stage ("Build Process"){
            steps{
                script{
                    bat 'mvn clean install'
                }
            }
        }

        stage ('Deployment to Apache Tomcat'){
            steps {
                deploy adapters: [tomcat9(alternativeDeploymentContext: '', credentialsId: 'tomcat-admin-creds', path: '', url: 'http://localhost:9090/')], contextPath: 'appContainerGroovy', war: '**/*.war'
            }
        }
    }
}

//SCM Checkout
//Build
//Deploy WAR to Tomcat
//Send Email
node{
    stage('SCM Checkout'){
    git 'https://github.com/dasras/JenkinGitSample'    
    }
    stage('Compile-Package'){
    sh 'mvn package'
    }
}

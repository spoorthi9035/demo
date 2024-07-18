pipeline{
	agent any
	stages{
		stage("Building the Student Survey Image"){
			steps{
				script{
					checkout scm
					sh 'rm -rf *.jar'
					sh 'mvn clean package'
					sh 'echo ${BUILD_TIMESTAMP}'
					sh 'docker login -u charuvarthana -p Charu@1234'
					sh 'docker build -t charuvarthana/demo .'
				}
			}
		}
		stage("Pushing image to docker"){
			steps{
				script{
					sh 'docker push charuvarthana/demo'
				}
			}
		}
		stage("Deploying to rancher"){
			steps{
				script{
					sh 'kubectl rollout restart deploy demo'
				}
			}
		}
	}
}
pipeline {
    agent any
	
  
    stages {
	
        stage('Run project') {
            steps {
	        echo "hello ${params.Ejecucion_casos_fallidos}"
		script {
                         if (params.Ejecucion_casos_fallidos) {
			    echo  "ejecutar programa java" 
                        //ejecuto programa
			   
		         }else {
			 echo 'I only execute on the master branch'
			 echo "hello ${params.Ejecucion_casos_fallidos}"
		         bat "mvn clean verify -Denvironment=funcional"   
			 
                    }
                }	                  
            }
        }


  for (int i = 0; i < 4; i++) {
    try {	
	stage(list[i]){
	sh "curl --connect-timeout 15 -v -L ${list[i]}"
			} 
	} catch (Exception e) {
	echo "Stage failed, but we continue"  
    }
  }


	    
        stage('publish html report') {
            steps {

               publishHTML target: [
               allowMissing: false,
               alwaysLinkToLastBuild: false,
               keepAll: true,
               reportName : 'Serenity Report1',
               reportDir:   'reports',
            //   reportDir:   'target/site/serenity',
               reportFiles: 'serenity-summary.html'
            //   useWrapperFileDirectly: true
               ]
               publishHTML target: [
               allowMissing: false,
               alwaysLinkToLastBuild: false,
               keepAll: true,
               reportName : 'Serenity Report2',
               reportDir:   'reports',
               reportFiles: 'index.html'
               ]
           }
        }
		
	stage('publish log') {
            steps {
	       
               bat " echo test "
	    }
	}
		
		 
	stage('save report and log') {
            steps {
		  bat "echo \" <<<<<<<<<<<<<<<<<<<< copiando report >>>>>>>>>>>>>>>>>>>>  \" "
		 bat "XCOPY C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\qaautomation\\reports C:\\Users\\ccgualterosg\\Documents\\fallabella_cristian\\reports\\%date:~5,2%-%date:~8,2%-%date:~11,4%\\aprobarTransferencias\\%time:~0,2%-%time:~3,2%-%time:~6,2% /E/I"
                 bat "echo \" <<<<<<<<<<<<<<<<<<<< copiando logs >>>>>>>>>>>>>>>>>>>>  \" "
		 bat "XCOPY C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\qaautomation\\LogSerenity C:\\Users\\ccgualterosg\\Documents\\fallabella_cristian\\LogSerenity\\%date:~5,2%-%date:~8,2%-%date:~11,4%\\aprobarTransferencias\\%time:~0,2%-%time:~3,2%-%time:~6,2% /E/I"
            }
        }

    }
}






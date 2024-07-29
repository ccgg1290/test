pipeline {
    agent any
  
    stages {
        stage('Test') {
            steps {
               bat "mvn  clean verify -Denvironment=funcional "    
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
              //    publishHTML target: [
              // allowMissing: false,
              // alwaysLinkToLastBuild: false,
              // keepAll: true,
              // reportName : 'Serenity Report2',
            //   reportDir:   'reports',
               //reportDir:   'target/site/serenity',
          //     reportFiles: 'index.html'
            //   useWrapperFileDirectly: true
              // ]
            //     bat "dir"

                //bat "set directorio=%date:~5,2%-%date:~8,2%-%date:~11,4%"
              //  bat "set directorio=%date:~5,2%-%date:~8,2%-%date:~11,4%"
               // bat "echo %directorio%"
                //bat "if exist %directorio% (echo "archivo existe %directorio%") else (mkdir "%userprofile%\\Documents\\fallabella_cristian\\reports\\%directorio%")"

              //  bat "mkdir %userprofile%\\Documents\\fallabella_cristian\\reports\\%directorio%\\aprobarTransferencias\\EndToEnd"
               //bat "cd target\\site\\serenity
              //  bat "COPY C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\p\\reports C:\\Users\\ccgualterosg\\Documents\\fallabella_cristian\\reports\\%date:~5,2%-%date:~8,2%-%date:~11,4%\\aprobarTransferencias\\"
                    bat "XCOPY C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\p\\reports C:\\Users\\ccgualterosg\\Documents\\fallabella_cristian\\reports\\%date:~5,2%-%date:~8,2%-%date:~11,4%\\aprobarTransferencias\\%time:~0,2%-%time:~3,2%-%time:~6,2% /E/I"
       //         bat "COPY target\\site\\serenity C:\\Users\\ccgualterosg\\Documents\\fallabella_cristian\\reports\\%date:~5,2%-%date:~8,2%-%date:~11,4%\\aprobarTransferencias\\prueba.zip"


                
                //bat " MOVE reports 'C:\Users\ccgualterosg'"
            }
  

        }
    }
}



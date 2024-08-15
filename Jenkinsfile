node('master') {	
	EjecucionCasosFallidos()
}

def EjecucionCasosFallidos(){
    
    stage("Run project "){
	echo "corriendo prueba normal"    
        bat "mvn  clean verify -Denvironment=funcional "
    }
    
	for (int i = 0; i <  params.Ejecucion_casos_fallidos.toInteger(); i++) {
		try {	
			stage("Ejecucion casos fallidos ${i+1}"){
			   
				//	bat "curl --connect-timeout 15 -v -L ${list[i]}"
				 echo '${i+1}  ehecutandose '
				 bat "mvn  clean verify"
			   
			} 
		} catch (Exception e) {
			echo "fallo el script, no se hizo la ejecucion n: '${i+1} "  
		}
	}
}






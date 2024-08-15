node('master') {	
	EjecucionCasosFallidos()
}

def EjecucionCasosFallidos(){
    
    stage("Run project "){
        echo "comando ejecutado"
    }
    
	for (int i = 0; i <  params.Ejecucion_casos_fallidos.toInteger(); i++) {
		try {	
			stage("Ejecucion casos fallidos ${i+1}"){
			   
				//	bat "curl --connect-timeout 15 -v -L ${list[i]}"
				 echo ' I only execute on the master branch'
			   
			} 
		} catch (Exception e) {
			echo "Stage failed, but we continue"  
		}
	}
}






package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object usuario
     
    /**
     * <p></p>
     */
    public static Object contrasena
     
    /**
     * <p></p>
     */
    public static Object url
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['usuario' : 'davidavg', 'contrasena' : 'manhatan', 'url' : 'http://www.dentdepot.com.mx/'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        def selectedVariables = allVariables[profileName]
		
		for(object in selectedVariables){
			String overridingGlobalVariable = RunConfiguration.getOverridingGlobalVariable(object.key)
			if(overridingGlobalVariable != null){
				selectedVariables.put(object.key, overridingGlobalVariable)
			}
		}

        usuario = selectedVariables["usuario"]
        contrasena = selectedVariables["contrasena"]
        url = selectedVariables["url"]
        
    }
}

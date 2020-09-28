package com.hcltrainings.lambdaexpressionasarguments;
import static com.hcltrainings.lambdaexpressionasarguments.Operations.*;

public class Main {
	public static void main(String[] args) {
		LambaAsArgument.stringOperation(tolowerCase,"SIVASANKAR");
		LambaAsArgument.stringOperation(toupperCase,"sivasankar");
		LambaAsArgument.stringOperation(strLength,"SIVASANKAR");
		LambaAsArgument.stringOperation(trimString,"               SIVASANKAR");
		
		
	}
}

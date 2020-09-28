package com.hcltrainings.lambdaexpressionasarguments;

public class Operations {
	public static FuncInterface trimString = (str) -> str.trim();
	public static FuncInterface toupperCase = (str) -> str.toUpperCase();
	public static FuncInterface tolowerCase = (str) -> str.toLowerCase();
	public static FuncInterface strLength = (str) -> String.valueOf(str.length());
}

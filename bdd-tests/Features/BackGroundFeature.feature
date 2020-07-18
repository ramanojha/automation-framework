Feature: feature description 
	In order to do something
	As someone
	I want something else to happen
	
Background: 
	Given   This is abcc 
		| param_1 | param_2 | param_3 |
		| value1_1 | value1_2 | value1_3 |                       
		
Scenario Outline: scenario description 
	Given something with <param_1> 
	And something with <param_2> 
	Then check <param_3> is the output 
	
	Examples: 
		| param_1 | param_2 | param_3 |
		| value1_1 | value1_2 | value1_3 |
		| value2_1 | value2_2 | value2_3 |
		| value3_1 | value3_2 | value3_3 |
	
The class diagram with four classes Student, Graduate, Undergraduate and Exchange is given. The Write down the classes as described in the class diagram. The fields and methods for each class is given below. All the fields should be private and also write constructors, toString methods, getters and setters. 
 
Student: 
 	Fields:  major (String) 
gpa (double)  	 	creditHours (int)  	Methods: 
 	 	constructor: takes initial values for the fields as the parameter 
 	 	getGpa: returns gpa 
getYear: returns freshman, sophomore, junior or senior as determined by earned credit hours:  
•	Freshman: Less than 32 credit hours 
•	Sophomore: At least 32 credit hours but less than 64 credit hours 
•	Junior: At least credit hours 64 but less than 96 credit hours     
•	Senior: At least 96 credit hours 
 
Graduate: 
 	Fields: degree (String) (“masters” or “phd”)  	 	concentration (String) 
 	 	years (int) (stores no. of years spent in grad school)  	Methods: getYear: returns years 
 	 	    getConcentration: returns concentration 
 
Undergraduate: 
 	Fields: honors (Boolean) 
 	Methods: isHonors: returns honors 
 
Exchange: 
 	Fields: country (String) year(string) (start semester of the exchange program, stores Fall, Spring or Summer followed by the year eg: Fall 2017) 
 	Methods: 
 	 	getYear: returns year 
 	 	getCountry: returns country 
 
 
•	Write another client class.  
•	Create an object of class Undergraduate called Maya whose major is CS, gpa is 
3.9, credit hours = 54 and honors = true.  
•	Create an object of class Graduate called John whose degree is “Masters”, years = 1, gpa is 4.10, major =“computer science” and concentration is “Cybersecurity”.  
•	Print out the Maya’s major, gpa, year and use isHonors method to see if the student is an honors student.  
•	Print out the John’s concentration, years spent in grad school and major. 
•	Create an object of class Exchange for an exchange student for Summer 2017 from a foreign country of your choice and print out his gpa, major and country. 
 

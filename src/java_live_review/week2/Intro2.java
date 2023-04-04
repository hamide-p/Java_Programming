package java_live_review.week2;

public class Intro2 {
}
/*
HP
#1301

Saim — 01/29/2023 7:12 PM
@student Get used to checking this channel as well. It is where I will share everything
Saim — 01/29/2023 8:44 PM
@student If there is any technical issues, its okay
do not panic. you don't need to figure everything out in a day
The support team will meet and help anyone that has some trouble on Tuesday at 10 AM EST
Classes don't start until next week to resolve everything, so if you have any questions post them in q & a, otherwise email support or get help from them on Tuesday
Saim — 02/06/2023 8:20 PM
@student As a reminder week 1 materials are all shared. Look at 🎥-weekly-recordings For all the details
There is no fixed days or times to watch, but we recommend what we outlined on the calendar.
The content from week 1 just need to be gone through before Sunday for the review. Especially the classes
Saim — 02/06/2023 8:28 PM
Also just to clarify, GitHub is just where the code from the classes are shared. You don't need to do anything else there
Saim — 02/08/2023 9:23 PM
I added one more terminology video that can be helpful this week: Programming Language
Saim — 02/12/2023 4:47 PM
GitHub Recording Code: https://github.com/Cydeo-B29/Java_Programming
Saim
 pinned
a message
 to this channel. See all
pinned messages
.
 — 02/12/2023 4:47 PM
Saim — 02/12/2023 4:50 PM
https://github.com/orgs/Cydeo-B29/repositories
Saim — 02/12/2023 11:48 PM
Todays Notes: https://github.com/Cydeo-B29/Java_Live_Reviews/blob/master/src/week1/Review%201%20Notes.txt
Notes are also shared in LMS under Sunday Live Review Module
Todays Code: https://github.com/Cydeo-B29/Java_Live_Reviews/tree/master/src/week1
Live Review GitHub: https://github.com/Cydeo-B29/Java_Live_Reviews
Saim
 pinned
a message
 to this channel. See all
pinned messages
.
 — 02/12/2023 11:49 PM
Saim — 02/13/2023 12:18 AM
@student and here is some extra practices for week 1
https://github.com/Cydeo-B29/Java_Live_Reviews/blob/master/src/week1/Week%201%20Extra%20Practice.txt
Saim — 02/14/2023 11:06 PM
I shared a copy of the class notes on the lms. You can find the notes for each day under its module
Saim — 02/16/2023 9:49 PM
Hey @student I shared some practices to get ready for our review. https://github.com/Cydeo-B29/Java_Live_Reviews/blob/master/src/week2/Week2Tasks.txt
Try them out yourself. If you get stuck its okay. The plan is to go through these tasks on Sunday to review the concepts we have learned so far
See you in a couple days!
Saim — 02/16/2023 10:07 PM
I also shared the practice solutions from this week https://github.com/Cydeo-B29/Java_Practice_Soltuions/tree/master/src
Saim — Today at 5:53 PM
2/19/2023

Week 2
    Day04 - Primitive Castings, Concatenation
    Day05 - Operators
    Day06 - If Statements Intro

Office Hours will be starting next week. These are optional, for extra practice and review. The material/tasks will be same in both sessions offered. The sessions will be recorded and upload.
    when: Wednesdays
        session 1: 11am-2pm EST
        session 2: 7pm-10pm EST

    I will share tasks for these sessions along with the weekly schedule
__________________________________________________________________

String
char
Concatenation
Primitive Type Casting
Operators
    arithmetic
    unary
    shorthand
    relational
    logical
Operator precedence
If statements
If else statements
__________________________________________________________________

char: primitive datatype that holds a single character
     char letter = 'a';

ASCII
    every character has a number related to it

String
    holds a sequence of characters
    non primitive/ object

    Q: What is the difference between "A" and 'A'
        "A" is a String type
        'A' is a char type
        the datatypes are different

Concatenation:

    operator +

    used to combine something with a String -> the result is a String

        String + String -> concatenation
        int + String -> concatenation
        char + char -> addition
        int + int -> addition

__________________________________________________________________


come back 12: 07
Saim — Today at 7:07 PM
2/19/2023

Week 2
	Day04 - Primitive Castings, Concatenation
	Day05 - Operators
	Day06 - If Statements Intro
Expand
message.txt
3 KB
﻿
2/19/2023

Week 2
	Day04 - Primitive Castings, Concatenation
	Day05 - Operators
	Day06 - If Statements Intro

Office Hours will be starting next week. These are optional, for extra practice and review. The material/tasks will be same in both sessions offered. The sessions will be recorded and upload.
	when: Wednesdays
		session 1: 11am-2pm EST
		session 2: 7pm-10pm EST

	I will share tasks for these sessions along with the weekly schedule
__________________________________________________________________

String
char
Concatenation
Primitive Type Casting
Operators
	arithmetic
	unary
	shorthand
	relational
	logical
Operator precedence
If statements
If else statements
__________________________________________________________________

char: primitive datatype that holds a single character
	 char letter = 'a';

ASCII
	every character has a number related to it

String
	holds a sequence of characters
	non primitive/ object

	Q: What is the difference between "A" and 'A'
		"A" is a String type
		'A' is a char type
		the datatypes are different

Concatenation:

	operator +

	used to combine something with a String -> the result is a String

		String + String -> concatenation
		int + String -> concatenation
		char + char -> addition
		int + int -> addition

__________________________________________________________________

Primitive Type Casting

	convert from one primitive datatype to another

	[Smallest] byte -> short -> int -> long -> float -> double [Largest]

		going from the smaller type to the bigger type:
			widening casting
			implicit (automatically)

		going from the bigger type to the smaller type:
			narrowing casting
			explicit (manually)

			(datatype) var

__________________________________________________________________

Operators
	arithmetic
		+, -, *, /, %

		10 / 3 = 3
		10.0/3 = 3.33

		10 % 3 = 1
		3 + 3 + 3 = 9
		left over 10 - 9 = 1

		use case: 	even and odd
					divisibility

		ex:
			20 / 5 = 4
			20 % 5 = 0

			3 % 5 = 3 -> 3 cannot be divided evenly by 5, so the left over is just 3

	unary

		+ (positive)
		- (negative)
		++ incrementing
		-- decrementing

		--pre the number is updated first and then used in the code
		post-- the number is used in the code, and then after is is updated

	shorthand
		perform the operation and update the variable

		+= -= *= /= %=

		int a = 1;
		a = a + 2; // i add the value of a to 2, and reassign the result into the a variable

		shorthand: a += 2;

	relational
		< > <= >= == !=

			4 == 4 -> true
			4 != 5 -> true

		Q: what is the difference between == and =
			= is the assignment operator
			== is to compare the values and return boolean

	logical

		! && ||

		&& AND
			both boolean should be true for the result to be true

		|| OR
			at least one of the boolean should be true for the result to be true

		! NOT
			opposite boolean

come back 2:15 est
message.txt
3 KB
 */
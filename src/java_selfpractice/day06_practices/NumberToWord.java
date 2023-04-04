package java_selfpractice.day06_practices;

public class NumberToWord {


    public static void main(String[] args) {


        String word;

        int number = 2;

        if(number==0){
            word="Zero";
        }else if(number == 1){
            word = "one";
        }else if(number==2){
            word = "Two";
        }else if(number==3){
            word="Three";
        }else if(number==4){
            word="Four";
        } else if (number==5) {
            word="five";
        } else if (number==6) {
            word="six";
        } else if (number==7) {
            word= "seven";
        } else if (number==8) {
            word= "Eight";
        }else {
            word="Nine";
        }
        System.out.println(word);
    }
}
/*
2. Create a  class named NumberToWord, and write a java program that can convert numbers between 0 ~ 9 to words
			Ex:
				number = 1;

			output:
				One

		Note: Do not use more than one print statement

 */
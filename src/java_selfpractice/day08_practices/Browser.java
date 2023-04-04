package java_selfpractice.day08_practices;

public class Browser {
    public static void main(String[] args) {


        String browserName = "Chrome";


        switch (browserName){

            case "Chrome":
                System.out.println("Chrome");
                break;
            case "Firefox":
                System.out.println("Firefox");
                break;
            case "Opera":
                System.out.println("Opera");
                break;
            case "Safari":
                System.out.println("Safari");
                break;
            case "Edge":
                System.out.println("Edge");
                break;
            default:
                System.out.println("Invalid Browser");


        }


    }
}
/*
9. write a program that can display the selected browser
            3.1  declare a String variable called browserName
            3.2  Assume that the valid browsers are: chrome, firefox, opera, safari, edge
            3.3 if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser

        	Do Not use if statement or ternary
 */

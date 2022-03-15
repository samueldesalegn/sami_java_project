package arrays101;

import java.util.Scanner;

public class CountFamily {

private static final double PERCENT_AMOUNT = 0.1;
private static double setPercentage = (PERCENT_AMOUNT * 100);
private static int k;
private static int lowCount;
private static double income[];
static Scanner sc = new Scanner(System.in);

public static void main(String[] args){
}

public CountFamily(){
System.out.println("This program will gather information from the user"
+ "\nto compute how many family members there are and their" + (int) setPercentage + " percent of the max income value.\n");

FamilyAmount();
income = new double[k];
getIncome();
getLess();

System.out.println("The total amount of family members that gets less than \n"
+ (int) setPercentage + "of the max income is: " + lowCount);
}

/*
Postcondition: Method will only ask for the amount of family members.
Precondition: Method will return integer k for the amount of family members.
*/
private static int FamilyAmount(){
System.out.println("How many family members?");
k = sc.nextInt();
return k;
}

/*
Precondition: Array length must be set first, all values will be
of type double for the array.
Postcondition: Method will ask for the income of each member and
add their value to array income[].
*/
private static void getIncome(){
System.out.println("For each family member, supply their current income.");
for(int k = 0; k < income.length; k++){
int family = k + 1;
System.out.print("For family member " + family + ", what is his/her income: ");
double in = sc.nextDouble();
income[k] = in;
}
}

/*
Precondition: All information should be supplied before using this method.
Postcondition: THe method will return if a family member makes less than
set percent of the total income.
*/
private static int getLess(){
double perc = 0.0;
double Max = 0.0;

//Get income max
for(int i = 0; i < income.length; i++){
if(income[i] > Max){
Max = income[i];
}
}

System.out.println("Max income is: " + Max);

//Get 10 percent of income sum as a double value
perc = Max * PERCENT_AMOUNT;

//Check each value in array to get the count of how many get less than
//set percentage.

for(int i = 0; i < income.length; i++){
if(income[i] < perc){
lowCount++;
}
}

return lowCount;
}
}

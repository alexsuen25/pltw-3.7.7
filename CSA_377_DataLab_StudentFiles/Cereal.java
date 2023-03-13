import java.util.concurrent.ScheduledFuture;
import java.util.Scanner;  
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class Cereal {
    private int calories;
    private int protein;
    private int fat;
    private int sodium;
    private int fiber;
    private int carbs;
    private int sugar;
    private int potassium;
    private int vitamins;
    private int shelf;
    private int cups;
    private double rating;
    public Cereal(String brandname){
        String line = "";
        String splitBy = ",";
        try {
        //parsing a CSV file into BufferedReader class constructor  
        BufferedReader br = new BufferedReader(new FileReader("Copy of Cereal.csv"));
        while ((line = br.readLine()) != null)
        //returns a Boolean value  
            {
                String[] info = line.split(splitBy);
                //use comma as separator  
                if (info[0].equals(brandname)){
                    calories = Integer.parseInt(info[2]);
                    protein = Integer.parseInt(info[3]);
                    fat = Integer.parseInt(info[4]);
                    sodium = Integer.parseInt(info[5]);
                    fiber = Integer.parseInt(info[6]);
                    carbs = Integer.parseInt(info[7]);
                    sugar = Integer.parseInt(info[8]);
                    potassium = Integer.parseInt(info[9]);
                    vitamins = Integer.parseInt(info[10]);
                    shelf = Integer.parseInt(info[11]);
                    rating = Double.parseDouble(info[14]);
                }
            }
        }
        catch(IOException e) {
        e.printStackTrace();
        }
        System.out.println("Creating a cereal object");
    }
    public String toString(int value){
        return "The value is " + value;
    }
    public int returnCalories(){
        return calories;
    }
    public int returnProtein(){
        return protein;
    }
    public int returnFat(){
        return fat;
    }
    public int returnSodium(){
        return sodium;
    }
    public int returnCarbs(){
        return carbs;
    }
    public int returnSugar(){
        return sugar;
    }
    public int returnPotassium(){
        return potassium;
    }
    public int returnVitamins(){
        return vitamins;
    }
    public int returnShelf(){
        return shelf;
    }
    public int returnCups(){
        return cups;
    }
    public double returnRating(){
        return rating;
    }
    public int determineHealthyRating(){
        return (sugar + fat);
    }
    public static void main(String args[]){
        Cereal cereal1 = new Cereal("100% Bran");
        Cereal cereal2 = new Cereal("Apple Jacks");
        Cereal cereal3 = new Cereal("Clusters");
    }
}

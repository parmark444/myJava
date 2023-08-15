package javaapplication12;
import java.util.*;  
public class BlackJack_final {  
    public static void main(String[] args) {  
    //Create 2 arrays for suites and cards
    String[] suite = {"Diamonds", "Hearts", "Clubs", "Spades" } ;       
    String[] card_value = {"Ace of ", "2 of ", "3 of ", "4 of ", "5 of ", "6 of ", "7 of ", "8 of ", "9 of ", "10 of ", "Jack of ", "Queen of ", "King of "};       
    String [] deck = new String[52];       
    ArrayList<String> value = new ArrayList<String>();  
    //shuffle arraylist each time game starts
    for (int i = 0; i < deck.length; i++) {       
        deck[i] = card_value[i%13] + suite[i/13];       
    }       
    for (int i = 0; i <deck.length; i++) {       
        int index = (int)(Math.random() * deck.length);       
        String hold = deck[i];       
        deck[i] = deck[index];       
        deck[index] = hold;       
    }       
     for (int i = 0; i < deck.length; i++) {       
       value.add(deck[i]);          
    }       
    for (int i = 0; i <deck.length; i++)       
      if (value.get(i).equals("Jack of Clubs")) {       
          System.out.println(" The Deck has been shuffled");       
      }   
    //start game and name input with shuffled deck
    System.out.println("Welcome to Blackjack!");      
    Scanner console = new Scanner(System.in);      
    System.out.print("Please enter the name of player: ");      
    String name_1 = console.next();       
    System.out.println(" ");      
    int balance = 100;      
    int bet = 0;      
    System.out.println(name_1 + ", you have $" + balance + " in your bank what would you like to bet? The bet must be less than $10 and greater than $0: ");      
    for (int i = 5; i > 4; i++) {      
    bet = console.nextInt();      
    if (bet > 10 || bet == 0 || bet < 0) {      
        System.out.println("Bet does not meet requirements, please re-enter bet again.") ;      
    }      
    else {             
        i = 2;      
    }        
         }    
    //declartion for all arraylist and vars used in game
    System.out.println("--------------------------------------");      
    ArrayList<String> p_hand = new ArrayList<String>();        
    ArrayList<String> d_hand = new ArrayList<String>();        
    double p_Wins = 0;     
    int num_of_aces = 0;    
    int end_game = 0;    
    int holder_for_ending = 0;    
    double d_Wins = 0;     
    while (end_game <52) {    
    int winner_holder = 0;  
    int loser_holder = 0;  
    String firstcard = value.get(0);      
    p_hand.add(firstcard);     
    String secondcard = value.get(1);      
    p_hand.add(secondcard);     
    String dealercard1 = value.get(2);      
    d_hand.add(dealercard1);     
    String dealercard2 = value.get(3);      
    d_hand.add(dealercard2);     
    int p_Bust = 0;     
    int counter;     
    int sum = 0;     
    int card_pull = 4;     
    end_game = end_game + 4;   
    //dealer and player show cards
    System.out.println(name_1 + " shows " + p_hand.get((0)));        
    System.out.println("Dealer shows " + d_hand.get(0));     
    System.out.println("--------------------------------------");    
    //series of if/else statments for logic and card sums
    for (int i = 5; i >4; i++) {     
        sum = 0;     
    for (int j = 0; j < p_hand.size(); j++) {     
       counter = 0;     
        if (p_hand.get(j).equals("2 of Spades") || p_hand.get(j).equals("2 of Clubs") ||      
          p_hand.get(j).equals("2 of Diamonds") || p_hand.get(j).equals("2 of Hearts")) {                 
          counter = 2;     
          sum = sum + counter;     
        }     
        else if (p_hand.get(j).equals("3 of Spades") || p_hand.get(j).equals("3 of Clubs") ||      
            p_hand.get(j).equals("3 of Diamonds") || p_hand.get(j).equals("3 of Hearts")) {      
            counter = 3;     
            sum = sum + counter;     
        }     
        else if (p_hand.get(j).equals("4 of Spades") || p_hand.get(j).equals("4 of Clubs") ||      
            p_hand.get(j).equals("4 of Diamonds") || p_hand.get(j).equals("4 of Hearts")) {      
            counter = 4;     
            sum = sum + counter;     
        }         
        else if (p_hand.get(j).equals("5 of Spades") || p_hand.get(j).equals("5 of Clubs") ||      
            p_hand.get(j).equals("5 of Diamonds") || p_hand.get(j).equals("5 of Hearts")) {      
            counter = 5;     
            sum = sum + counter;     
        }         
        else if (p_hand.get(j).equals("6 of Spades") || p_hand.get(j).equals("6 of Clubs") ||      
            p_hand.get(j).equals("6 of Diamonds") || p_hand.get(j).equals("6 of Hearts")) {      
            counter = 6;     
            sum = sum + counter;     
        }         
        else if (p_hand.get(j).equals("7 of Spades") || p_hand.get(j).equals("7 of Clubs") ||      
            p_hand.get(j).equals("7 of Diamonds") || p_hand.get(j).equals("7 of Hearts")) {      
            counter = 7;     
            sum = sum + counter;     
        }         
        else if (p_hand.get(j).equals("8 of Spades") || p_hand.get(j).equals("8 of Clubs") ||      
            p_hand.get(j).equals("8 of Diamonds") || p_hand.get(j).equals("8 of Hearts")) {      
            counter = 8;     
            sum = sum + counter;     
        }     
        else if (p_hand.get(j).equals("9 of Spades") || p_hand.get(j).equals("9 of Clubs") ||      
            p_hand.get(j).equals("9 of Diamonds") || p_hand.get(j).equals("9 of Hearts")) {      
            counter = 9;     
            sum = sum + counter;     
        }     
        else if (p_hand.get(j).equals("Ace of Spades") || p_hand.get(j).equals("Ace of Clubs") ||      
            p_hand.get(j).equals("Ace of Diamonds") || p_hand.get(j).equals("Ace of Hearts")) {      
            counter = 1;    
            num_of_aces++;    
            sum = sum + counter;     
        }     
        else {     
            counter = 10;     
            sum = sum + counter;     
        }     
        for (int s = 0; s < p_hand.size(); s++) {    
        if (p_hand.get(s).equals("Ace of Spades") || p_hand.get(s).equals("Ace of Clubs") ||      
  
               p_hand.get(s).equals("Ace of Diamonds") || p_hand.get(s).equals("Ace of Hearts")) {    
            if (sum + 10 < 21) {    
  
                counter =11;    
            sum = sum + counter;     
            }      
        }    
         }     
            }     
  //print card values and hit or stand logic
    System.out.println(name_1 + " ,you have " + p_hand + "(" + sum + ")");     
     if (sum > 21) {     
        System.out.println("You busted!");     
        i = 2;     
        p_Bust++;     
        sum = 0;     
    } else {     
    System.out.println("Do you want to hit or stand? ");     
    String play = console.next();     
    if (play.equals("hit")) {     
        String addcard = value.get(card_pull);      
    p_hand.add(addcard);     
     card_pull++;     
        end_game++;    
    }     
    else if (play.equals("stand")) {     
        i = 2;     
    }     
     }     
    }     
    int sum1 = 0;     
    System.out.println("--------------------------------------");      
    //computer logic for card vcalues for ace
      for (int i = 5; i >4; i++) {     
        sum1 = 0;     
    for (int j = 0; j < d_hand.size(); j++) {     
       counter = 0;     
        if (d_hand.get(j).equals("2 of Spades") || d_hand.get(j).equals("2 of Clubs") ||      
               d_hand.get(j).equals("2 of Diamonds") || d_hand.get(j).equals("2 of Hearts")) {                 
          counter = 2;     
          sum1 = sum1 + counter;     
        }     
        else if (d_hand.get(j).equals("3 of Spades") || d_hand.get(j).equals("3 of Clubs") ||      
               d_hand.get(j).equals("3 of Diamonds") || d_hand.get(j).equals("3 of Hearts")) {      
            counter = 3;     
            sum1 = sum1 + counter;     
        }     
        else if (d_hand.get(j).equals("4 of Spades") || d_hand.get(j).equals("4 of Clubs") ||      
               d_hand.get(j).equals("4 of Diamonds") || d_hand.get(j).equals("4 of Hearts")) {      
            counter = 4;     
            sum1 = sum1 + counter;     
        }         
        else if (d_hand.get(j).equals("5 of Spades") || d_hand.get(j).equals("5 of Clubs") ||      
            d_hand.get(j).equals("5 of Diamonds") || d_hand.get(j).equals("5 of Hearts")) {      
            counter = 5;     
            sum1 = sum1 + counter;     
        }         
        else if (d_hand.get(j).equals("6 of Spades") || d_hand.get(j).equals("6 of Clubs") ||      
               d_hand.get(j).equals("6 of Diamonds") || d_hand.get(j).equals("6 of Hearts")) {      
            counter = 6;     
            sum1 = sum1 + counter;     
        }         
        else if (d_hand.get(j).equals("7 of Spades") || d_hand.get(j).equals("7 of Clubs") ||      
               d_hand.get(j).equals("7 of Diamonds") || d_hand.get(j).equals("7 of Hearts")) {      
            counter = 7;     
            sum1 = sum1 + counter;     
        }         
        else if (d_hand.get(j).equals("8 of Spades") || d_hand.get(j).equals("8 of Clubs") ||      
               d_hand.get(j).equals("8 of Diamonds") || d_hand.get(j).equals("8 of Hearts")) {      
            counter = 8;     
            sum1 = sum1 + counter;     
        }     
        else if (d_hand.get(j).equals("9 of Spades") || d_hand.get(j).equals("9 of Clubs") ||      
               d_hand.get(j).equals("9 of Diamonds") || d_hand.get(j).equals("9 of Hearts")) {      
            counter = 9;     
            sum1 = sum1 + counter;     
        }   
        else if (d_hand.get(j).equals("Ace of Spades") || d_hand.get(j).equals("Ace of Clubs") ||      
               d_hand.get(j).equals("Ace of Diamonds") || d_hand.get(j).equals("Ace of Hearts")) {      
           counter =1;    
            sum = sum + counter;     
        }    
        else {     
            counter = 10;     
            sum1 = sum1 + counter;     
        }    
        //Ace card logoc for 1 and 11
        for (int s = 0; s < d_hand.size(); s++) {    
        if (d_hand.get(s).equals("Ace of Spades") || d_hand.get(s).equals("Ace of Clubs") ||      
               d_hand.get(s).equals("Ace of Diamonds") || d_hand.get(s).equals("Ace of Hearts")) {    
            if (sum + 10 < 21) {    
                counter =10;    
            sum = sum + counter;     
            }    
        }    
         }    
            }     
    //print for dealer and logic for hit and stand
       System.out.println("Dealer has " + d_hand + "(" + sum1 + ")");     
       if (p_Bust == 0) {     
       if (sum1 > 21) {     
        System.out.println("Dealer busts!");     
        i = 2;     
        sum1 = 0;     
    }      
       else if (sum1 < 17) {     
          System.out.println("Dealer hits");               
          String addacard = value.get(card_pull);      
          d_hand.add(addacard);     
          card_pull++;     
          end_game++;    
      } else if (sum1 >= 17 && sum1 <= 21) {     
          System.out.println("Dealer stands");     
          i = 2;     
      }     
      } else {     
            System.out.println("Dealer stands");     
          i = 2;     
       }      
      }  
      //score counting
     if (sum > sum1){     
         p_Wins++;     
         winner_holder++;  
     } else if (sum1 > sum) {     
         d_Wins++;     
         loser_holder++;  
     } else if (sum1 == sum) {     
         p_Wins = p_Wins + 0.5;    
         winner_holder = 2;  
         d_Wins = d_Wins + 0.5;     
         loser_holder = 2;  
     }     
     //actually print points
     System.out.println("--------------------------------------");      
      System.out.println(name_1 + " has " + p_Wins + " points!");     
      System.out.println("Dealer has " + d_Wins + " points!");     
      if (sum > sum1) {     
          balance = balance + bet;     
      } else if (sum1 > sum) {     
          balance = balance - bet;     
      }      
      System.out.println("--------------------------------------");      
      System.out.println(name_1 + " you have " + balance + "$");     
        int cardremoval = p_hand.size() + d_hand.size();    
       if (cardremoval < value.size()) {    
       for (int i = 0; i < cardremoval; i++) {    
       value.remove(0);    
  }    
       }    
       System.out.println("--------------------------------------");      
       int phandsize = p_hand.size();  
for (int i = 0; i < phandsize; i++) {    
    p_hand.remove(0);    
       }    
       int dhandsize = d_hand.size();  
       for (int i = 0; i < dhandsize; i++) {    
           p_hand.remove(0);    
       }    
       //cont or stop game logic
       System.out.println("Would you like to [c]ontinue or [q]uit?");    
       String answer = console.next();    
       if (answer.equals("q")) {    
           System.out.println("Thank you for playing!");    
        end_game = 100;    
           holder_for_ending = 1;    
      }    
       if (end_game >= 52 && holder_for_ending == 0) {    
           System.out.println("Deck is out of cards! Thank you for playing.");    
       }    
       if (holder_for_ending == 0) {    
    System.out.println("You have $" + balance + " ,how much would you like to bet? The bet must be or be less than $10 and greater than $0: ");      
    for (int i = 5; i > 4; i++) {      
    int betholder = console.nextInt();      
    bet = betholder;    
    if (bet > 10 || bet == 0) {      
        System.out.println("Bet is too much or invalid, please enter again.") ;      
    }      
  else {             
        i = 2;      
    }        
         }     
       }    
    }    
    } 
}      

/**
 * @author Chris Park, Henry Liu
 * Jun 7, 2022
 * 
 * A user class, contains user's favourite music and subscription details
 * subscription and recommendation methods
 * 
 */
 
import java.util.*;
public class Profile {
   
   //attributes
   
   /** username */
   private String user;
   
   /** user's favourite music genre */
   private String favGenre1;
   
   /** user's second favourite music genre */
   private String favGenre2;
   
   /** user's third favourite music genre */
   private String favGenre3;
   
   /** user's fourth favourite music genre */
   private String favGenre4;
   
   /** subscribed or not */
   private boolean isSubscribed;
   
   /** bank account balance */
   private double bankBalance;
   
   //constructors
   
   /** 
  * creating the user
  *
  * @param user, user's username
  * @param favGenre1 to favGenre4, user's top 4 music genres
  * @param isSubscribed, whether the user is subscribed or not
  * @param bankBalance, user's bank account
  */
   public Profile(String user, String favGenre1, String favGenre2, String favGenre3, String favGenre4, boolean isSubscribed, double bankBalance) {
      this.user = user;
      this.favGenre1 = favGenre1;
      this.favGenre2 = favGenre2;
      this.favGenre3 = favGenre3;
      this.favGenre4 = favGenre4;
      this.isSubscribed = isSubscribed;
      this.bankBalance = bankBalance;
   }
   
   /** 
  * creating the user, but does not have their bank account
  *
  * @param user, user's username
  * @param favGenre1 to favGenre4, user's top 4 music genres
  * @param isSubscribed, whether the user is subscribed or not
  */
   public Profile(String user, String favGenre1, String favGenre2, String favGenre3, String favGenre4, boolean isSubscribed) {
      this.user = user;
      this.favGenre1 = favGenre1;
      this.favGenre2 = favGenre2;
      this.favGenre3 = favGenre3;
      this.favGenre4 = favGenre4;
      this.isSubscribed = isSubscribed;
      this.bankBalance = 0;
   }
  
   //accessor methods

   public String getUser() {
      return this.user;
   }
   
   public String getFavGenre1() {
      return this.favGenre1;
   }
   
   public String getFavGenre2() {
      return this.favGenre1;
   }
   
   public String getFavGenre3() {
      return this.favGenre1;
   }
   
   public String getFavGenre4() {
      return this.favGenre1;
   }
   
   public boolean GetIsSubscribed() {
      return this.isSubscribed;
   }
   
   public double GetBankBalance() {
      return this.bankBalance;
   }
   
   //mutator methods
   
 /**
  * subscribe method
  * let's the user subscribe if they have enough money
  * if they are already subscribed it changes nothing
  *
  */
   public void subscribe() {
      if (isSubscribed == true) {
         isSubscribed = true;
         System.out.println("You are already subscribed");
      } else if (bankBalance < 9.99) {
         isSubscribed = false;
         System.out.println("You do not have enough money to subscribe");
      } else {
         bankBalance -= 9.99;
         isSubscribed = true;
         System.out.println("You have successfuly subscribed");
      }
   }
   
   /**
  * unsubscribe method
  * let's the user unsubscribe
  * If user is subscribed they are now unsubscribed, without a refund of course
  * if user is unsubscribed it changes nothing 
  *
  */
   public void unsubscribe() {
      isSubscribed = false;
      System.out.println("You have unsubscribed");
   }
   
 /**
  * recommendations method
  * recommendation method based on the user's top four music genres
  * ((this took wayyy too long))
  * ((sorry blues and folk fans)) 
  *
  */
   public String recommend() {
      String recommendations = "Recommendations:";
      if ((favGenre1 == "pop") || (favGenre2 == "pop") || (favGenre3 == "pop") || (favGenre4 == "pop")) {
         recommendations += "\n\n\nPop recommendations:";
         
         recommendations += "\n\nDance pop:\n";
         recommendations += "Justin TImberlake\n";
         recommendations += "Lady Gaga\n";
         recommendations += "Britney Spears\n";
         recommendations += "Katy Perry\n";
         recommendations += "Ke$ha\n";
         
         recommendations += "\n\nGirl Group:\n";
         recommendations += "Spice Girls\n";
         recommendations += "Destiny's Child\n";
         recommendations += "TLC\n";
         recommendations += "The Supremes\n";
         recommendations += "Fifth Harmony\n";
         
         recommendations += "\n\nBoy Band:\n";
         recommendations += "One Direction\n";
         recommendations += "The Backstreet Boys\n";
         recommendations += "NSYNC\n";
         recommendations += "The Beach Boys\n";
         recommendations += "Boyz II Men\n";
         
         recommendations += "\n\nK-pop:\n";
         recommendations += "BTS\n";
         recommendations += "Blackpink\n";
         recommendations += "EXO\n";
         recommendations += "Red Velvet\n";
         recommendations += "Psy\n";
      } else {
         recommendations += "";
      } 
      
      if ((favGenre1 == "rap") || (favGenre2 == "rap") || (favGenre3 == "rap") || (favGenre4 == "rap")) {
         recommendations += "\n\n\nRap recommendations:";
      
         recommendations += "\n\nHardcore Hip Hop:\n";
         recommendations += "Nas\n";
         recommendations += "Eminem\n";
         recommendations += "Wu-Tang CLan\n";
         recommendations += "Run-D.M.C.\n";
         recommendations += "Public Enemy\n";
         
         recommendations += "\n\nWest Coast Hip Hop:\n";
         recommendations += "Kendrick Lamar\n";
         recommendations += "Snoop Dogg\n";
         recommendations += "Dr. Dre\n";
         recommendations += "Ice Cube\n";
         recommendations += "N.W.A.\n";
         
         recommendations += "\n\nGangsta Rap:\n";
         recommendations += "Tupac\n";
         recommendations += "The Notorious B.I.G.\n";
         recommendations += "Jay-Z\n";
         recommendations += "Mobb Depp\n";
         recommendations += "Ice-T\n";
      } else {
         recommendations += "";
      }  
      
      if ((favGenre1 == "classical") || (favGenre2 == "classical") || (favGenre3 == "classical") || (favGenre4 == "classical")) {
         recommendations += "\n\n\nClassical recommendations:";
      
         recommendations += "\n\nBaroque Era:\n";
         recommendations += "Antonio Vivaldi\n";
         recommendations += "Johann Sebastian Bach\n";
         recommendations += "George Frideric Handel\n";
         recommendations += "Henry Purcell\n";
         recommendations += "Claudio Monteverdi\n";
         
         recommendations += "\n\nClassical Era:\n";
         recommendations += "Wolfgang Amadeus Mozart\n";
         recommendations += "Ludwig van Beethoven\n";
         recommendations += "Joseph Haydn\n";
         recommendations += "Antonio Salieri\n";
         recommendations += "Luigi Boccherini\n";
         
         recommendations += "\n\nRomantic Era:\n";
         recommendations += "Niccolò Paganini\n";
         recommendations += "Frédéric Chopin\n";
         recommendations += "Franz Liszt\n";
         recommendations += "Pyotr Ilyich Tchaikovsky\n";
         recommendations += "Richard Wagner\n";
         
         recommendations += "\n\nModernist Era:\n";
         recommendations += "Claude Debuss\n";
         recommendations += "Gustav Holst\n";
         recommendations += "Igor Stravinsky\n";
         recommendations += "Dmitri Shostakovich\n";
         recommendations += "Béla Bartók\n";
      } else {
         recommendations += "";
      }
      
      if ((favGenre1 == "jazz") || (favGenre2 == "jazz") || (favGenre3 == "jazz") || (favGenre4 == "jazz")) {
         recommendations += "\n\n\nJazz recommendations:";
      
         recommendations += "\n\nAvant-Garde Jazz:\n";
         recommendations += "Charles Mingus\n";
         recommendations += "John Coltrane\n";
         recommendations += "Ornette Coleman\n";
         recommendations += "Eric Dolphy\n";
         recommendations += "Sonny Sharrock\n";
         
         recommendations += "\n\nJazz Fusion:\n";
         recommendations += "Miles Davis\n";
         recommendations += "Frank Zappa\n";
         recommendations += "Herbie Hancock\n";
         recommendations += "Weather Report\n";
         recommendations += "Chick Corea\n";
         
         recommendations += "\n\nHard Bop:\n";
         recommendations += "Horace Silver\n";
         recommendations += "Clifford Brown\n";
         recommendations += "Art Blakey\n";
         recommendations += "Thelonious Monk\n";
         recommendations += "Hank Mobley\n";
         
         recommendations += "\n\nModal Jazz:\n";
         recommendations += "Bill Evans\n";
         recommendations += "McCoy Tyner\n";
         recommendations += "Cannonball Adderley\n";
         recommendations += "Wayne Shorter\n";
         recommendations += "Lee Morgan\n";
         
         recommendations += "\n\nSwing:\n";
         recommendations += "Duke Ellington\n";
         recommendations += "Benny Carter\n";
         recommendations += "Ella Fitzgerald\n";
         recommendations += "Count Basie\n";
         recommendations += "Tommy Dorsey\n";
      } else {
         recommendations += "";
      }
      
      if ((favGenre1 == "rock") || (favGenre2 == "rock") || (favGenre3 == "rock") || (favGenre4 == "rock")) {
         recommendations += "\n\n\nRock recommendations:";
         
         recommendations += "\n\nAlternative Rock:\n";
         recommendations += "U2\n";
         recommendations += "System of a Down\n";
         recommendations += "Radiohead\n";
         recommendations += "Nirvana\n";
         recommendations += "Red Hot Chili Peppers\n";
         
         recommendations += "\n\nProgressive Rock:\n";
         recommendations += "Pink Floyd\n";
         recommendations += "Rush\n";
         recommendations += "King Crimson\n";
         recommendations += "Yes\n";
         recommendations += "Tool\n";
         
         recommendations += "\n\nHard Rock:\n";
         recommendations += "Led Zeppelin\n";
         recommendations += "AC/DC\n";
         recommendations += "Deep Purple\n";
         recommendations += "Guns n' Roses\n";
         recommendations += "The Who\n";
         
         recommendations += "\n\nPop Rock:\n";
         recommendations += "The Beatles\n";
         recommendations += "David Bowie\n";
         recommendations += "Fleetwood Mac\n";
         recommendations += "The Rolling Stones\n";
         recommendations += "Aerosmith\n";
      } else {
         recommendations += "";
      }
      
      if ((favGenre1 == "metal") || (favGenre2 == "metal") || (favGenre3 == "metal") || (favGenre4 == "metal")) {
         recommendations += "\n\n\nMetal recommendations:";
         
         recommendations += "\n\nTraditional Heavy Metal:\n";
         recommendations += "Black Sabbath\n";
         recommendations += "Iron Maiden\n";
         recommendations += "Judas Priest\n";
         recommendations += "Motörhead\n";
         recommendations += "Dio\n";
         
         recommendations += "\n\nProgressive Metal:\n";
         recommendations += "Dream Theater\n";
         recommendations += "Opeth\n";
         recommendations += "Gojira\n";
         recommendations += "Meshuggah\n";
         recommendations += "Queensrÿche\n";
         
         recommendations += "\n\nPower Metal:\n";
         recommendations += "Gamma Ray\n";
         recommendations += "Blind Guardian\n";
         recommendations += "Helloween\n";
         recommendations += "Rhapsody of Fire\n";
         recommendations += "Iced Earth\n";
         
         recommendations += "\n\nThrash Metal:\n";
         recommendations += "Metallica\n";
         recommendations += "Megadeth\n";
         recommendations += "Slayer\n";
         recommendations += "Kreator\n";
         recommendations += "Sodom\n";
         
         recommendations += "\n\nDoom Metal:\n";
         recommendations += "Candlemass\n";
         recommendations += "Katatonia\n";
         recommendations += "Electric Wizard\n";
         recommendations += "My Dying Bride\n";
         recommendations += "Esoteric\n";
         
         recommendations += "\n\nDeath Metal:\n";
         recommendations += "Death\n";
         recommendations += "Cannibal Corpse\n";
         recommendations += "Morbid Angel\n";
         recommendations += "Obituary\n";
         recommendations += "Deicide\n";
         
         recommendations += "\n\nBlack Metal:\n";
         recommendations += "Mayhem\n";
         recommendations += "Darkthrone\n";
         recommendations += "Burzum\n";
         recommendations += "Immortal\n";
         recommendations += "Emperor\n";
      } else {
         recommendations += "";
      }
      
      if ((favGenre1 == "punk") || (favGenre2 == "punk") || (favGenre3 == "punk") || (favGenre4 == "punk")) {
         recommendations += "\n\n\nPunk recommendations:";
         
         recommendations += "\n\nHardcore Punk:\n";
         recommendations += "Dead Kennedys\n";
         recommendations += "Nails\n";
         recommendations += "Black Flag\n";
         recommendations += "Minor Threat\n";
         recommendations += "Bad Brains\n";
         
         recommendations += "\n\nGrindcore:\n";
         recommendations += "Napalm Death\n";
         recommendations += "Pig Destroyer\n";
         recommendations += "Terrorizer\n";
         recommendations += "Discordance Axis\n";
         recommendations += "Assück\n";
         
         recommendations += "\n\nCrust Punk:\n";
         recommendations += "Dystopia\n";
         recommendations += "His Hero Is Gone\n";
         recommendations += "G.I.S.M.\n";
         recommendations += "Sacrilege\n";
         recommendations += "Filth of Mankind\n";
         
         recommendations += "\n\nMetalcore:\n";
         recommendations += "Converge\n";
         recommendations += "Botch\n";
         recommendations += "The Dillinger Escape Plan\n";
         recommendations += "Between the Buried and Me\n";
         recommendations += "Snapcase\n";
         
         recommendations += "\n\nPowerviolence:\n";
         recommendations += "Magrudergrind\n";
         recommendations += "Charles Bronson\n";
         recommendations += "Yacøpsæ\n";
         recommendations += "Dropdead\n";
         recommendations += "SPAZZ\n";
         
         recommendations += "\n\nScreamo:\n";
         recommendations += "Orchid\n";
         recommendations += "Gospel\n";
         recommendations += "Corea\n";
         recommendations += "Portraits of Past\n";
         recommendations += "City of Caterpillar\n";
      } else {
         recommendations += "";
      }
      
      if ((favGenre1 == "R&B") || (favGenre2 == "R&B") || (favGenre3 == "R&B") || (favGenre4 == "R&B")) {
         recommendations += "\n\n\nPunk recommendations:";
         
         recommendations += "\n\nContemporary R&B:\n";
         recommendations += "Michael Jackson\n";
         recommendations += "Janet Jackson\n";
         recommendations += "Prince\n";
         recommendations += "Lauryn Hill\n";
         recommendations += "Frank Ocean\n";
         
         recommendations += "\n\nRhythm & Blues:\n";
         recommendations += "Nina Simone\n";
         recommendations += "Amy Winehouse\n";
         recommendations += "Little Richard\n";
         recommendations += "Etta James\n";
         recommendations += "Booker T. & The M.G.'s\n";
         
         recommendations += "\n\nSoul:\n";
         recommendations += "Stevie Wonder\n";
         recommendations += "Marvin Gaye\n";
         recommendations += "Curtis Mayfield\n";
         recommendations += "Otis Redding\n";
         recommendations += "Tyler, the Creator\n";
      } else {
         recommendations += "";
      }
      
      if ((favGenre1 == "Country") || (favGenre2 == "Country") || (favGenre3 == "Country") || (favGenre4 == "Country")) {
         recommendations += "\n\n\nCountry recommendations:";
         
         recommendations += "\n\nBluegrass:\n";
         recommendations += "The Nitty Gritty Dirt Band\n";
         recommendations += "Doc Watson\n";
         recommendations += "The Dillards\n";
         recommendations += "The Del McCoury Band\n";
         recommendations += "Jerry Garcia & David Grisman\n";
         
         recommendations += "\n\nCountry Pop:\n";
         recommendations += "Nancy Sinatra & Lee Hazlewood\n";
         recommendations += "Willie Nelson\n";
         recommendations += "Charlie Rich\n";
         recommendations += "Patsy Cline\n";
         recommendations += "Rosanne Cash\n";
      } else {
         recommendations += "";
      }
      
      if ((favGenre1 == "Electronic") || (favGenre2 == "Electronic") || (favGenre3 == "Electronic") || (favGenre4 == "Electronic")) {
         recommendations += "\n\n\nElectronic recommendations:";
         
         recommendations += "\n\nAmbient:\n";
         recommendations += "Aphex Twin\n";
         recommendations += "Natural Snow Buildings\n";
         recommendations += "Stars of the Lid\n";
         recommendations += "Brian Eno\n";
         recommendations += "Grouper\n";
         
         recommendations += "\n\nDrone:\n";
         recommendations += "Boris\n";
         recommendations += "Tim Hecker\n";
         recommendations += "Sunn O)))\n";
         recommendations += "Earth\n";
         recommendations += "Eliane Radigue\n";
         
         recommendations += "\n\nNoise:\n";
         recommendations += "Merzbow\n";
         recommendations += "Yellow Swans\n";
         recommendations += "Lingua Ignota\n";
         recommendations += "Ramleh\n";
         recommendations += "The Gerogerigegege\n";
         
         recommendations += "\n\nChiptune:\n";
         recommendations += "Fearofdark\n";
         recommendations += "Koji Kondo\n";
         recommendations += "Disasterpiece\n";
         recommendations += "Anamanaguchi\n";
         recommendations += "In Love With a Ghost\n";
         
         recommendations += "\n\nDungeon Synth:\n";
         recommendations += "Depressive Silence\n";
         recommendations += "Secret Stairways\n";
         recommendations += "Jötgrimm\n";
         recommendations += "Summoning\n";
         recommendations += "Mortiis\n";
         
         recommendations += "\n\nElectronic Dance Music:\n";
         recommendations += "Daft Punk\n";
         recommendations += "Burial\n";
         recommendations += "Flying Lotus\n";
         recommendations += "Björk\n";
         recommendations += "Against All Logic\n";
         
         recommendations += "\n\nTrance:\n";
         recommendations += "Psykovsky\n";
         recommendations += "BT\n";
         recommendations += "Hallucinogen\n";
         recommendations += "Anthony1\n";
         recommendations += "Dream Dolphin\n";
         
         recommendations += "\n\nElectropop:\n";
         recommendations += "Gorillaz\n";
         recommendations += "P-Model\n";
         recommendations += "The Knife\n";
         recommendations += "Grimes\n";
         recommendations += "M.I.A.\n";
         
         recommendations += "\n\n:\n";
         recommendations += "Charli XCX\n";
         recommendations += "Dorian Electra\n";
         recommendations += "100 gecs\n";
         recommendations += "glaive\n";
         recommendations += "SOPHIE\n";
      } else {
         recommendations += "";
      }
      
      return recommendations;
   }
   
   /**
  * Main method
  * tests the class
  *
  */
   public static void main(String[] args) {
   
      Profile freeUser = new Profile("ChrisP", "pop", "rap", "metal", "classical", false, 0);
      
      // Profile freeUser = new Profile("ChrisP", "pop", "rap", "metal", "classical", false, 0);
   
      System.out.println(freeUser.recommend());
      
   }
}
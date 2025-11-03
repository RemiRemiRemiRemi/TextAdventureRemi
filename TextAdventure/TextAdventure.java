import java.util.*;

public class TextAdventure 
{
  FancyConsole console;
  Scanner inScanner;
  Player ourHero;

  public TextAdventure()
  {
    console = new FancyConsole("Great Text Adventure!", 600, 600);
    inScanner = new Scanner(System.in);

    // feel free to change the player's starting values
    ourHero = new Player("Player", 100, 0);
  }

  public void play()
  {
    String input;
    // start of adventure. You can change this if you like
    console.setImage("pinkclouds.png");

    // ask the user for their name.
    System.out.println("What is your name?\n");
    input = inScanner.nextLine();

    // Change ourHero's name
    // ADD CODE HERE
    ourHero.changeName(input);
    // describe the starting situation. Feel free to change this
    System.out.println("You suddenly open your eyes to a vast world of bright colors and big fluffy clouds, and realize that you are in the sky. \nYou look around in extreme panic, and see several prominent landmarks around you as you turn your head repeatedly in shock with your eyes wide open. \nWhere will you go first? \npond: go towards the pond with shimmering water\npalace: run frantically towards the palace which may have people that could help you\nfield: wander into a huge expase of clouds\n" + ourHero.getName() + ": ");

    // get user input and go to the appropriate zone based on their input
    // ADD CODE HERE
    input = inScanner.nextLine();

    if(input.equals("pond")){
      enterZone1();
    }
    if(input.equals("palace")){
      enterZone2();
    }
    if(input.equals("field")){
      enterZone3();
    }
  
    
  }

  private void enterZone1()
  {
    // change image
    // ADD CODE HERE
    console.setImage("animals.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("Not knowing how to think of the situation, you make your way to the pond. As you lean over the surface of the water, your reflection stares into your soul, making you remember the dark reality that you came from. \nWhat now? \npalace: make your way back to the palace that you saw earlier \njump: jump into the water of the pond (cannot jump while holding wondrous star)\n" + ourHero.getName() + ": ");
    // Take action or go to another zone based on their choice
    // ADD CODE HERE

    String input = inScanner.nextLine();

    if(input.equals("palace")){
    enterZone2();
  }
    if(input.equals("jump") && ourHero.getGold() == 0){ //gold is the wondrous star
    enterZone4();
  }
  }

  private void enterZone2()
  {
    // change image
    // ADD CODE HERE
    console.setImage("forest.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You sprint to the palace, hoping that there is someone there that can help you to figure out where you are. As you enter the palace doors, you find that the walls are covered in vibrant shapes and colors. However, there is no sign of life around you. \nWhere in the palace will you explore now? \nthrone: enter the throne room. Perhaps someone of royalty will be sitting there \nbedroom: you are tired, so you may go and rest in the bedroom here\n" + ourHero.getName() + ": ");
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    String input = inScanner.nextLine();

    if(input.equals("throne")){
    enterZone5();
  }
    if(input.equals("bedroom")){
    enterZone6();
  }
  }

  private void enterZone3()
  {
    // change image
    // ADD CODE HERE
    console.setImage("graveyard.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You run to the empty field of clouds, and see a small pink area in the field that looks like it would be a wonderful area to rest in... \nWhich area will you go to next? \nrest: rest in the cozy-looking area \npalace: run to the palace you saw earlier \npond: make your way to the pond from before\n" + ourHero.getName() + ": ");
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    String input = inScanner.nextLine();
    if(input.equals("rest")){
    System.out.println("You lie down on the pink clouds, and your vision slowly gets blurrier... It seems like you want to stay in this area forever, and after a long while, you never return back to reality");
    System.out.println("*bad ending*");
    gameEnd();
  }
    if(input.equals("pond")){
    enterZone1();
  }
    if(input.equals("palace")){
    enterZone2();
  }
  }

  private void enterZone4()
  {
    // change image
    // ADD CODE HERE
    console.setImage("mountains.png");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("Mesmerized by the reflective surface of the pond, you plunge into the water. The seemingly small pond is actually incredibly deep, and its warm water invites you in to go deeper. You see a strange object at the bottom. \nWhere will you swim? \nup: swim back to the surface of the pond \ndown: grab the object at the bottom of the lake \n" + ourHero.getName() + ": ");
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    String input = inScanner.nextLine();
    if(input.equals("up")){
    System.out.println("You make your way back to the surface...");
    enterZone1();
  }
    if(input.equals("down")){
    enterZone7();
  }
  }

  private void enterZone5()
  {
    // change image
    // ADD CODE HERE
    console.setImage("ocean.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You walk through the splendiferous halls of the palace until you find the throne room. The room is covered in beautiful star shapes, but there is no one here. However, there is a strange slot on the wall behind the throne that a special star-shaped object could fit into... \nWhere to now? \nunlock: try to fit an item into the slot on the wall (requires wondrous star) \npond: go to the pond from before \nentrance: return to the entrance of the palace\n" + ourHero.getName() + ": ");
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
        String input = inScanner.nextLine();
    if(input.equals("unlock")){
    //enterZone9();
  }
    if(input.equals("pond")){
    enterZone1();
  }
    if(input.equals("entrance")){
    enterZone2();
  }
  }

  private void enterZone6()
  {
    // change image
    // ADD CODE HERE
    console.setImage("ocean.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("After walking for a long time, you eventually find the grand, royal bedroom. The thick sheets of the bed draw you in, and your vision slowly becomes blurrier... You start to forget about what you are doing, or where you came from, and you never get back to reality.");
    // Take action or go to another zone based on their choice
    System.out.println("*bad ending*");
    gameEnd();
    // ADD CODE HERE
    
  }

  private void enterZone7()
  {
    // change image
    // ADD CODE HERE
    console.setImage("ocean.jpg");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You swim deeper into the pond, and grab the object at the bottom. It is a heavy star-shaped object. (obtained wondrous star)");
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    ourHero.setGold(1);
    System.out.println("You can now either return to the surface of the pond, or stay longer in the warm embrace of the soothing water \nreturn: go back to the surface \ndive: go even deeper\n" + ourHero.getName() + ": ");
    String input = inScanner.nextLine();

    if(input.equals("return")){
      enterZone1();
    }
      if(input.equals("dive")){
        System.out.println("As you make your way deeper into the pond, the warmth of the water comforts you, and your vision becomes blurrier... Wanting to stay here longer, you never return to reality.");
        System.out.println("*bad ending*");
        gameEnd();
      }
  }




  private void gameEnd()
  {
    // ADD CODE HERE

    inScanner.close();
  }
}
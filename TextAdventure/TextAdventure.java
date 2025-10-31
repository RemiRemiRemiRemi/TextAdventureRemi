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
    ourHero = new Player("Bob", 100, 0);
  }

  public void play()
  {
    String input;
    // start of adventure. You can change this if you like
    console.setImage("distantcity.jpg");

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

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("Not knowing how to think of the situation, you make your way to the pond. As you lean over the surface of the water, your reflection stares into your soul, making you remember the dark reality that you came from. \nWhat now? \npalace: make your way back to the palace that you saw earlier \njump: jump into the water of the pond\n" + ourHero.getName() + ": ");
    // Take action or go to another zone based on their choice
    // ADD CODE HERE

    String input = inScanner.nextLine();

    if(input.equals("palace")){
    enterZone2();
  }
    if(input.equals("jump")){
    enterZone4();
  }
  }

  private void enterZone2()
  {
    // change image
    // ADD CODE HERE

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

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println();
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone4()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone5()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void enterZone6()
  {
    // change image
    // ADD CODE HERE

    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE

    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    
  }

  private void gameEnd()
  {
    // ADD CODE HERE

    inScanner.close();
  }
}
//Remi-Laurent Guy - Text Adventure

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
    System.out.println("What is your name...?\n");
    input = inScanner.nextLine();
    ourHero.setHealth(100);
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
    console.setImage("pond.png");
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
    if(input.equals("jump") && ourHero.getGold() != 1.0){ //gold is the wondrous star
    enterZone4();
  }
  }

  private void enterZone2()
  {
    // change image
    // ADD CODE HERE
    console.setImage("palace.png");
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
    console.setImage("field.png");
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
    console.setImage("pond.png");
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
    console.setImage("throne.png");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You walk through the splendiferous halls of the palace until you find the throne room. The room is covered in beautiful star shapes, but there is no one here. However, there is a strange slot on the wall behind the throne that a special star-shaped object could fit into... \nWhere to now? \nunlock: try to fit an item into the slot on the wall (requires wondrous star) \npond: go to the pond from before \nentrance: return to the entrance of the palace\n" + ourHero.getName() + ": ");
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
        String input = inScanner.nextLine();
    if(input.equals("unlock") && ourHero.getGold() == 1){
    enterZone9();
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
    console.setImage("palace.png");
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
    console.setImage("pond.png");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You swim deeper into the pond, and grab the object at the bottom. It is a heavy star-shaped object. (obtained wondrous star)");
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    ourHero.setGold(1.0);
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

  private void enterZone9()
  {
    // change image
    // ADD CODE HERE
    console.setImage("corridor.png");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You insert the wondrous star into the slot, and the walls shift, revealing a long corridor that looks like it could go on forever. You make your way down the hall, and the bright colors of the perfect world start to fade into darkness...");
    System.out.println("Suddenly, a shadowy figure carrying a large object looks back at you in the darkness! \nHow will you react? \nrun: run away \nconfront: enter battle\n" + ourHero.getName() + ": ");
    // Take action or go to another zone based on their choice
    // ADD CODE HERE
    String input = inScanner.nextLine();
    if(input.equals("run")){
    System.out.println("You try to run away, but it is already too late. A sharp point pierces through your chest, causing your vision to get blurry, and making you never return to reality ever again...");
    System.out.println("*bad ending*");
    gameEnd();
    }
    if(input.equals("confront")){
    System.out.println("-= Battle start! =-");
    burden();
    }
  }







  private void burden(){ //BURDEN FIGHT
  console.setImage("burden.png");
  int burdenHP = 100;
  while(true){

    System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~\n~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");

  System.out.println(ourHero.getName() + "'s HP: " + ourHero.getHealth());
  System.out.println("BURDEN's HP: " + burdenHP);

  System.out.println("select a move: \nattack (20 DMG, 100% success rate) \nheavy attack (50 DMG, 40% success rate)\n" + ourHero.getName() + ": ");
  String input = inScanner.nextLine();

  System.out.print("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~\n~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");

  if(input.equals("attack")){
    System.out.println("\nYou land a blow on BURDEN!");
    burdenHP -= 20;
  }
    if(input.equals("heavy attack")){
      if(Math.random() < 0.4){
      System.out.println("\nYou land a powerful strike on BURDEN!");
      burdenHP -= 50;
      }
      else{
      System.out.println("\nAttack missed!");
      }
    }

    if (burdenHP <= 0) {
    break;
    }

    System.out.println("BURDEN strikes with its syringe!");
    ourHero.setHealth(ourHero.getHealth() - 15);

    if(ourHero.getHealth() <= 0){
    System.out.println("BURDEN's huge syringe sinks into your body, causing your vision to go blurry, making you never return to reality...");
    System.out.println("*bad ending*");
    gameEnd();
    break;
    }

  }
  
  if(burdenHP <= 0 && ourHero.getHealth() > 0){
  System.out.println("-= Victory! =-");
  System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~\n~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");
  System.out.println("The strange humanoid creature known as BURDEN has disappeared. You continue down the corridor, and it all hits you at once...");
  System.out.println("You must not stay here any longer. This place may seem wonderful, but just being here makes you feel like you are being hurt from the inside...");
  System.out.println("That dark creature also seemed oddly familiar, or perhaps it reminded you of something in the real world? Either way, its presence means that this place is dangerous.");
  System.out.println("The corridor becomes much more happy and colorful than before, and you recover slightly from your injuries (+20 HP)");
  ourHero.setHealth(ourHero.getHealth() + 20);
  System.out.println("HP is now " + ourHero.getHealth());
  System.out.println("You see two tunnels up ahead, one filled with clouds, and the other coated in darkness... \nWhich path will you take? \ncloud: enter the warm and inviting cloud tunnel \ndarkness: enter the horrifying dark tunnel \nback: go back the way you came from\n" + ourHero.getName() + ": ");
  console.setImage("tunnel.png");
  String input = inScanner.nextLine();
  if(input.equals("cloud")){
  System.out.println("You enter the cloud tunnel, but you suddenly stumble right after entering it... After falling you do not want to get up anymore, and you are sucked into the clouds as your vision blurs, never to return to reality again...");
  System.out.println("*bad ending*");
  gameEnd();
  }

  if(input.equals("darkness")){
  System.out.println("You enter the dark tunnel, and dark tendrils suddenly wrap around you, consuming you whole! Your vision blurs, and you never see reality again...");
  System.out.println("*bad ending*");
  gameEnd();
  }

  if(input.equals("back")){
  enterZone10();
  }

}

  }



  private void enterZone10()
  {
    // change image
    // ADD CODE HERE
    console.setImage("plushies.png");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You turn back to go where you came from, and find that the old corridor has changed completely. You find yourself in a pink and blue room. There is an opening on the ceiling as well as a messy pile of stuffed animals on the ground. \nopening: climb through the opening on the ceiling \nanimals: sink into the pile of stuffed animals on the ground\n" + ourHero.getName() + ": ");
    // Take action or go to another zone based on their choice
    // ADD CODE HERE

  String input = inScanner.nextLine();

  if(input.equals("animals")){
  System.out.println("You find comfort in the stuffed animal pile, and sink deeper and deeper into it. Eventually you succumb to the feeling, and your vision gets blurry as you never want to leave or return to reality again...");
  System.out.println("*bad ending*");
  gameEnd();
  }

  if(input.equals("opening")){
  enterZone11();
  }

  }

  private void enterZone11()
  {
    // change image
    // ADD CODE HERE
    console.setImage("moon.png");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You enter the ceiling opening and climb into a huge area of pink clouds that go on forever in all directions, similar to the field you saw before. However, darkness starts to consume the clouds, coating everything in shadows. \nHow should you go about this situation? \nrun: escape the darkness by running \nscream: scream at the darkness \n" + ourHero.getName() + ": ");
    // Take action or go to another zone based on their choice
    // ADD CODE HERE

  String input = inScanner.nextLine();

  if(input.equals("scream")){
  System.out.println("You scream as loud as you can at the darkness, telling it to stop over and over again. However, nothing happens, and it slowly consumes you as your vision blurs, preventing you from ever seeing reality again");
  System.out.println("*bad ending*");
  gameEnd();
  }

  if(input.equals("run")){
  enterZone12();
  }

  }
  private void enterZone12()
  {
    // change image
    // ADD CODE HERE
    console.setImage("moon.png");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("You run as fast as you can, but a huge shadow suddenly appears in front of you. You can feel that you are almost back to reality, just one last push... \nfight: time to end it all \n" + ourHero.getName() + ": ");
    // Take action or go to another zone based on their choice
    // ADD CODE HERE

  String input = inScanner.nextLine();

  if(input.equals("fight")){
  System.out.println("-= Battle start! =-");
  brokenness();
  }
  }



  private void brokenness(){ //BROKENNESS FIGHT
  console.setImage("brokenness.png");
  int brokennessHP = 120;
  while(true){

    System.out.println("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~\n~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");

  System.out.println(ourHero.getName() + "'s HP: " + ourHero.getHealth());
  System.out.println("BROKENNESS's HP: " + brokennessHP);

  System.out.println("select a move: \nattack (20 DMG, 100% success rate) \nheavy attack (50 DMG, 40% success rate)\n" + ourHero.getName() + ": ");
  String input = inScanner.nextLine();

  System.out.print("~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~\n~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~*~");

  if(input.equals("attack")){
    System.out.println("\nYou land a blow on BROKENNESS!");
    brokennessHP -= 20;
  }
    if(input.equals("heavy attack")){
      if(Math.random() < 0.4){
      System.out.println("\nYou land a powerful strike on BROKENNESS!");
      brokennessHP -= 50;
      }
      else{
      System.out.println("\nAttack missed!");
      }
    }

    if (brokennessHP <= 0) {
    break;
    }

    System.out.println("BROKENNESS strikes with its dark tendrils!");
    ourHero.setHealth(ourHero.getHealth() - 18);

    if(ourHero.getHealth() <= 0){
    System.out.println("BROKENNESS's terrifying tendrils wrap around your body, causing your vision to go blurry, making you never return to reality...");
    System.out.println("*bad ending*");
    gameEnd();
    break;
    }

  }
  if(brokennessHP <= 0 && ourHero.getHealth() > 0){
  System.out.println("-= Victory! =-");
  enterZone13();
  }
  }



  private void enterZone13()
  {
    // change image
    // ADD CODE HERE
    console.setImage("hospital.png");
    // describe the area/situation to the user. 
    // Give them options for choices.
    // ADD CODE HERE
    System.out.println("After destroying BROKENNESS, you see a bright flash of colorful lights! Everything melts around you, and after a long blink, you start to feel the blanket of a hospital bed around you");
    System.out.println("You open your eyes to reality, and feel the real world around you.");
    System.out.println("You look at your arm to see old bandages covering healing injection sites, and start to remember the real world again, and the burdens you had to go through.");
    System.out.println("This world may have brought you pain and suffering, but you could not let that consume you.");
    System.out.println("You realize that living in your head too much to escape reality can be dangerous as well. You have to face your problems, not hide from them.");
    System.out.println("Tears roll down your face as you plan to start a better life in the real world. \nsmile: move on in life \n" + ourHero.getName() + ": ");
    // Take action or go to another zone based on their choice
    // ADD CODE HERE

    String input = inScanner.nextLine();

    if(input.equals("smile")){
    System.out.println("You smile at the world around you");
    System.out.println("==== THE END ====");
    System.out.println("*good ending*");
    gameEnd();
  }

  }


  private void gameEnd()
  {
    // ADD CODE HERE

    inScanner.close();
  }
}
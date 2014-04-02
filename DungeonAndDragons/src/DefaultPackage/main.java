package DefaultPackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class main {

	public static void main(String[] notUsed) throws ClassNotFoundException{
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Run run = new Run();
		
		runLoop:
		while(true){
			String[] args = null;
			System.out.print("Type a command: ");
			try {
				String line = br.readLine();
				//System.out.println("You typed " + args);
				args = line.split(" ");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (args == null || args.length == 0){
				System.out.println("Welcome. Start here: ");
				continue;
			}

			String command = args[0];


			switch(command) {
			//implement spellSets, preparing by tags later
			case "help": 
				if (args.length == 1){
					System.out.println("getKnownSpells, getKnownSpells [tag], cast [spell],"
							+ " prepare, prepare [spell], \n"
							+ "learn [spell] , levelUp, tag [spell] with [tag], removeTag [tag]"
							+ " from [spell], \n removeSpell [spell] from [location], "
							+ "save, help [command]");
				} else {
					String follow = args[1];
					switch(follow){
					case "getKnownSpells":
						System.out.println("type getKnownSpells to get your spell repertoire, "
								+ "or you can prefix it with a created tag or with a spell field"
								+ "to get a list of only certain spells");
						break;
					case "cast":
						System.out.println("casts that spell");

					case "prepare":
						System.out.println("prepares your spells for the day. By specifying a"
								+ "certain spell, you can fill in a slot you forgot to fill, or"
								+ " purposfully saved for later");
					case "learn":
						System.out.println("adds that spell to your repertoire");

					case "levelUp":
						System.out.println("helps you add spells to your repertoire "
								+ "when leveling up");
					case "tag":
						System.out.println("tags that spell for future organization");

					case "removeTag":
						System.out.println("permanently removes specified tag from"
								+ "specified spell");

					case "removeSpell":
						System.out.println("removes that spell in case you learned "
								+ "the wrong spell or are a bard who is switching out"
								+ "spells. Specify if you are removing from prepared list"
								+ "or from full repertoire");
					default :
						System.out.println("That is not a help commmand");
						break;
					}
				}
				break;
			case "save":
				run.save();
				break;
			case "init":
				run.initialize();
				break;
			case "getKnownSpells":
				if(args.length > 1){
					run.getKnownSpells(args[1]);
					//System.out.println("Why god why");
				} else {
					run.getKnownSpells();
				}
				break;
			case "getPrepSpells":
				if(args.length > 1){
					run.getPrepSpells(args[1]);
					//System.out.println("Why god why");
				} else {
					run.getPrepSpells();
				}
				break;
			case "cast":
				if(args.length > 1){
					run.cast(args[1]);
				} else {
					System.out.println("you need to specify a spell");
				}
				break;
			case "prepare":
				if(args.length > 1){
					run.prepare(args[1]);
				} else {
					run.prepare();
				}
				break;
			case "learn":
				if(args.length > 1){
					run.learn(args[1]);
				} else {
					System.out.println("you need to specify a spell");
				}
				break;
			case "levelUp":
				run.levelUp();

			case "tag":
				if(args.length > 3){
					run.tag(args[1], args[3]);
				} else if( args.length > 2) {
					run.tag(args[1], args[3]);
				} else {
					System.out.println("you need to specify a tag and a spell");
				}
				break;
			case "removeTag":
				if(args.length > 3){
					run.removeTag(args[1], args[3]);
				} else if( args.length > 2) {
					run.removeTag(args[1], args[3]);
				} else {
					System.out.println("you need to specify a tag and a spell");
				}
				break;
			case "removeSpell":
				if(args.length > 3){
					run.removeSpell(args[1], args[3]);
				} else if( args.length > 2) {
					run.removeSpell(args[1], args[3]);
				} else {
					System.out.println("you need to specify a location and a spell");
				}
				break;
			case "exit":
				break runLoop;
			default:
				System.out.println("Not a command. Type 'help' to get help");
				break;
			}
		}
	}
}




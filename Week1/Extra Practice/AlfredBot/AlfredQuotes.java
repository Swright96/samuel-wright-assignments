import java.util.Date;
public class AlfredQuotes {
    
    public String basicGreeting() {
        // You do not need to code here, this is an example method
        return "Hello, lovely to see you. How are you?";
    }
    
    public String guestGreeting(String name) {
        String guestGreeting = String.format("Greetings, "+ name);
        return guestGreeting;
    }
    
    public String dateAnnouncement() {
        Date date = new Date();
        return "It is currently "+ date;
    }
    
    public String respondBeforeAlexis(String conversation) {
        // int a = conversation.indexOf("Alexis");
        if (conversation.indexOf("Alexis") > -1) {
            return "Not today Alexis! I've got this!";
        }
        if (conversation.indexOf("Alfred") > -1) {
            return "How can I help?";
        }
        return "Aaaaaaand im off.";
    }
    
	// NINJA BONUS
	// See the specs to overload the guessGreeting method
    // SENSEI BONUS
    // Write your own AlfredQuote method using any of the String methods you have learned!
}


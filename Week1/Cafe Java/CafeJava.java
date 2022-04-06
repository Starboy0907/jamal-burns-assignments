public class CafeJava {
    
    public static void main(String[] args) {
        
        //APP VARIABLES
        //LINES of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage0 = ", your Coffee will be ready shortly";
        String pendingMessage1 = ", your Cappacino will be ready shortly";
        String pendingMessage2 = ", your Lattes will be ready shortly";
        String pendingMessage3 = ", your Mocha will be ready shortly";
        String readyMessage0 = ", your Coffee is ready";
        String readyMessage1 = ", your Lattes are ready";
        String readyMessage2 = ", your Mocha is ready";
        String readyMessage3 = ", your Cappacino is ready";
        String displayTotalMessage = "Your total is $";
        
        //Menu variables (add yours below)
        double mochaPrice = 3.5;
        double lattePrice = 4.5;
        double coffeePrice = 5.5;
        double cappucinoPrice = 6.5;
        
        //Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
        
        //Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
        
        
        //Cindhuri orders a coffee
        //coffeeIsReady("Cindhuri");
        //System.out.println(generalGreeting + customer1);
        //Cindhuroi Order
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
        System.out.println(customer1 + pendingMessage0);
        System.out.println(displayTotalMessage + coffeePrice);
        
        //Noah's Order
        System.out.println(generalGreeting + customer4);
        if(isReadyOrder4) {
            System.out.println(customer4 + readyMessage3);
        }
        else {
            System.out.println(customer4 + pendingMessage1);
        }
        //Sams Order
        System.out.println(generalGreeting + customer2);
        if(isReadyOrder2) {
            System.out.println(customer2 + readyMessage1);
            System.out.println(displayTotalMessage + (lattePrice * 2));
        }
        else {
            System.out.println(customer2 + pendingMessage2);
        }
        //Jimmy's Order
        System.out.println(generalGreeting + customer3);
        if(isReadyOrder3) {
            System.out.println(customer3 + readyMessage0);
            System.out.println(displayTotalMessage + coffeePrice);
        } else {
            System.out.println(customer3 + pendingMessage0);
        }
        if(isReadyOrder2) {
            System.out.println(customer3 + readyMessage1);
            System.out.println(displayTotalMessage + (lattePrice - coffeePrice));
        }
        else {
            System.out.println(pendingMessage2);
        }
    }
}

    
        // ** Your customer interaction print statements will go here ** //
        
        
        //APP INTERACTION SIMULATION (Add your code for the challenges below)
        
   





import java.util.Scanner;

public class project1 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to CarsCheckout");
        System.out.println("Login or Create?\nIF YOU WANT TO LOGIN ENTER--> LOGIN(SMALL-LETTER)\nIF YOU WANT TO CREATE ENTER--> CREATE(SMALL-LETTER)\n");
        String ans1 = sc.next();
        if (ans1.equals("login")) 
        {
            System.out.println("Enter your username");
            String username = sc.next();
            System.out.println("Enter your password");
            String password = sc.next();
            System.out.println("YOU HAVE LOGINED SUCESSFULLY.");
            
            System.out.println("LOOK FOR YOUR FAVORITE COMAPNIES BELOW.");
            System.out.println("\t-->VOLKSWAGEN\t-->TOYOTA");
            System.out.println("\t-->FORD\t\t-->CHEVROLET");
            System.out.println("\t-->BMW\t\t-->MERCEDES");
            System.out.println("\t-->AUDI\t\t-->LEXUS");
            System.out.println("\t-->HONDA\t-->NISSAN");
            System.out.println("\t-->HYUNDAI\t-->KIA");
            System.out.println("\t-->MAZDA\t-->SUBARU");
            System.out.println("\t-->JAGUAR\t-->LAND ROVER");
            System.out.println("\t-->TESLA\t-->PORSCHE");
            System.out.println("\t-->FERRARI\t-->LAMBORGHINI");
            System.out.println("ENTER THE CAR COMPANY YOU LIKE TO GO WITH: ");
            String car = sc.next();
            if(car.equals("volkswagen"))
            {
                System.out.println("\t-->Volkswagen Virtus\t\tRs. 11.56 Lakh");
                System.out.println("\t-->Volkswagen Polo\t\tRs. 6.45 Lakh");
                System.out.println("\t-->Volkswagen Vento\t\tRs. 9.99 Lakh");
                System.out.println("\t-->Volkswagen T-Roc\t\tRs. 21.35 Lakh");
                System.out.println("\t-->Volkswagen Taigun\t\tRs. 10.49 Lakh");
            } else if(car.equals("toyota")) {
                System.out.println("\t-->Toyota Camry\t\tRs. 40.59 Lakh");
                System.out.println("\t-->Toyota Corolla\t\tRs. 16.45 Lakh");
                System.out.println("\t-->Toyota Fortuner\t\tRs. 30.34 Lakh");
                System.out.println("\t-->Toyota Innova\t\tRs. 20.35 Lakh");
                System.out.println("\t-->Toyota Yaris\t\tRs. 9.56 Lakh");
            } else if(car.equals("ford")) {
                System.out.println("\t-->Ford Mustang\t\tRs. 74.62 Lakh");
                System.out.println("\t-->Ford EcoSport\t\tRs. 8.19 Lakh");
                System.out.println("\t-->Ford Endeavour\t\tRs. 29.99 Lakh");
                System.out.println("\t-->Ford Figo\t\tRs. 5.82 Lakh");
                System.out.println("\t-->Ford Aspire\t\tRs. 7.28 Lakh");
            } else if(car.equals("chevrolet")) {
                System.out.println("\t-->Chevrolet Spark\t\tRs. 4.22 Lakh");
                System.out.println("\t-->Chevrolet Cruze\t\tRs. 13.95 Lakh");
                System.out.println("\t-->Chevrolet Beat\t\tRs. 4.32 Lakh");
                System.out.println("\t-->Chevrolet Tavera\t\tRs. 10.24 Lakh");
                System.out.println("\t-->Chevrolet Sail\t\tRs. 6.41 Lakh");
            } else if(car.equals("bmw")) {
                System.out.println("\t-->BMW X1\t\tRs. 41.50 Lakh");
                System.out.println("\t-->BMW X3\t\tRs. 61.90 Lakh");
                System.out.println("\t-->BMW 3 Series\t\tRs. 45.30 Lakh");
                System.out.println("\t-->BMW 5 Series\t\tRs. 63.90 Lakh");
                System.out.println("\t-->BMW 7 Series\t\tRs. 1.35 Crore");
            } else if(car.equals("mercedes")) {
                System.out.println("\t-->Mercedes A-Class\t\tRs. 40.20 Lakh");
                System.out.println("\t-->Mercedes C-Class\t\tRs. 57.45 Lakh");
                System.out.println("\t-->Mercedes E-Class\t\tRs. 67.20 Lakh");
                System.out.println("\t-->Mercedes S-Class\t\tRs. 1.57 Crore");
                System.out.println("\t-->Mercedes G-Class\t\tRs. 1.62 Crore");
            } else if(car.equals("audi")) {
                System.out.println("\t-->Audi A3\t\tRs. 35.67 Lakh");
                System.out.println("\t-->Audi A4\t\tRs. 47.61 Lakh");
                System.out.println("\t-->Audi Q3\t\tRs. 44.89 Lakh");
                System.out.println("\t-->Audi Q5\t\tRs. 60.55 Lakh");
                System.out.println("\t-->Audi Q7\t\tRs. 80.21 Lakh");
            } else if(car.equals("lexus")) {
                System.out.println("\t-->Lexus ES\t\tRs. 59.50 Lakh");
                System.out.println("\t-->Lexus RX\t\tRs. 99.00 Lakh");
                System.out.println("\t-->Lexus NX\t\tRs. 58.20 Lakh");
                System.out.println("\t-->Lexus LX\t\tRs. 2.33 Crore");
                System.out.println("\t-->Lexus LS\t\tRs. 1.91 Crore");
            } else if(car.equals("honda")) {
                System.out.println("\t-->Honda City\t\tRs. 11.43 Lakh");
                System.out.println("\t-->Honda Civic\t\tRs. 18.94 Lakh");
                System.out.println("\t-->Honda CR-V\t\tRs. 28.34 Lakh");
                System.out.println("\t-->Honda Jazz\t\tRs. 8.10 Lakh");
                System.out.println("\t-->Honda Amaze\t\tRs. 6.32 Lakh");
            } else if(car.equals("nissan")) {
                System.out.println("\t-->Nissan Magnite\t\tRs. 6.00 Lakh");
                System.out.println("\t-->Nissan Kicks\t\tRs. 9.49 Lakh");
                System.out.println("\t-->Nissan Micra\t\tRs. 6.63 Lakh");
                System.out.println("\t-->Nissan Sunny\t\tRs. 7.07 Lakh");
                System.out.println("\t-->Nissan Terrano\t\tRs. 10.00 Lakh");
            } else if(car.equals("hyundai")) {
                System.out.println("\t-->Hyundai i10\t\tRs. 5.20 Lakh");
                System.out.println("\t-->Hyundai i20\t\tRs. 7.88 Lakh");
                System.out.println("\t-->Hyundai Verna\t\tRs. 10.74 Lakh");
                System.out.println("\t-->Hyundai Creta\t\tRs. 10.00 Lakh");
                System.out.println("\t-->Hyundai Tucson\t\tRs. 24.35 Lakh");
            } else if(car.equals("kia")) {
                System.out.println("\t-->Kia Seltos\t\tRs. 10.89 Lakh");
                System.out.println("\t-->Kia Sonet\t\tRs. 7.15 Lakh");
                System.out.println("\t-->Kia Carnival\t\tRs. 30.00 Lakh");
                System.out.println("\t-->Kia Carens\t\tRs. 10.00 Lakh");
                System.out.println("\t-->Kia Sportage\t\tRs. 15.00 Lakh");
            } else if(car.equals("mazda")) {
                System.out.println("\t-->Mazda 2\t\tRs. 9.00 Lakh");
                System.out.println("\t-->Mazda 3\t\tRs. 12.00 Lakh");
                System.out.println("\t-->Mazda 6\t\tRs. 20.00 Lakh");
                System.out.println("\t-->Mazda CX-3\t\tRs. 15.00 Lakh");
                System.out.println("\t-->Mazda CX-5\t\tRs. 25.00 Lakh");
            } else if(car.equals("subaru")) {
                System.out.println("\t-->Subaru Impreza\t\tRs. 10.00 Lakh");
                System.out.println("\t-->Subaru Legacy\t\tRs. 18.00 Lakh");
                System.out.println("\t-->Subaru Forester\t\tRs. 25.00 Lakh");
                System.out.println("\t-->Subaru Outback\t\tRs. 28.00 Lakh");
                System.out.println("\t-->Subaru Ascent\t\tRs. 35.00 Lakh");
            } else if(car.equals("jaguar")) {
                System.out.println("\t-->Jaguar XE\t\tRs. 46.64 Lakh");
                System.out.println("\t-->Jaguar XF\t\tRs. 55.67 Lakh");
                System.out.println("\t-->Jaguar F-Pace\t\tRs. 74.88 Lakh");
                System.out.println("\t-->Jaguar F-Type\t\tRs. 98.13 Lakh");
                System.out.println("\t-->Jaguar E-Pace\t\tRs. 65.00 Lakh");
            } else if(car.equals("land rover")) {
                System.out.println("\t-->Land Rover Range Rover\tRs. 2.10 Crore");
                System.out.println("\t-->Land Rover Discovery\t\tRs. 88.06 Lakh");
                System.out.println("\t-->Land Rover Defender\t\tRs. 76.57 Lakh");
                System.out.println("\t-->Land Rover Evoque\t\tRs. 66.60 Lakh");
                System.out.println("\t-->Land Rover Velar\t\tRs. 83.33 Lakh");
            } else if(car.equals("tesla")) {
                System.out.println("\t-->Tesla Model S\t\tRs. 1.50 Crore");
                System.out.println("\t-->Tesla Model 3\t\tRs. 60.00 Lakh");
                System.out.println("\t-->Tesla Model X\t\tRs. 2.00 Crore");
                System.out.println("\t-->Tesla Model Y\t\tRs. 75.00 Lakh");
                System.out.println("\t-->Tesla Cybertruck\t\tRs. 1.00 Crore");
            } else if(car.equals("porsche")) {
                System.out.println("\t-->Porsche 911\t\tRs. 1.80 Crore");
                System.out.println("\t-->Porsche Cayenne\t\tRs. 1.20 Crore");
                System.out.println("\t-->Porsche Macan\t\tRs. 83.21 Lakh");
                System.out.println("\t-->Porsche Panamera\t\tRs. 1.50 Crore");
                System.out.println("\t-->Porsche Taycan\t\tRs. 1.50 Crore");
            } else if(car.equals("ferrari")) {
                System.out.println("\t-->Ferrari Roma\t\tRs. 3.76 Crore");
                System.out.println("\t-->Ferrari Portofino\t\tRs. 3.50 Crore");
                System.out.println("\t-->Ferrari F8 Tributo\t\tRs. 4.02 Crore");
                System.out.println("\t-->Ferrari SF90 Stradale\t\tRs. 7.50 Crore");
                System.out.println("\t-->Ferrari 812 Superfast\t\tRs. 5.75 Crore");
            } else if(car.equals("lamborghini")) {
                System.out.println("\t-->Lamborghini Huracan\t\tRs. 3.22 Crore");
                System.out.println("\t-->Lamborghini Aventador\t\tRs. 6.25 Crore");
                System.out.println("\t-->Lamborghini Urus\t\tRs. 3.10 Crore");
                System.out.println("\t-->Lamborghini Sian\t\tRs. 12.00 Crore");
                System.out.println("\t-->Lamborghini Centenario\t\tRs. 18.00 Crore");
            } else {
                System.out.println("Sorry, we do not have information on the car company you entered.");
            }
            System.out.println("ENTER YOUR CAR NAME: ");
            String car1 =sc.next();
            System.out.println("ENTER YOUR CAR PRICE: ");
            double price1 = sc.nextInt();
            double tot,gst,acces,mod,totwm;
            gst=(price1*18)/100;
            acces=(price1*12)/100;
            mod=(price1*20)/100;
            tot=price1+gst+acces;
            totwm=price1+gst+acces+mod;
            System.out.println("DISCRIPTION :");
            System.out.println("CAR: "+car1);
            System.out.println("CAR PRICE: "+price1+"/-");
            System.out.println("ACCESSORIES: "+acces+"%");
            System.out.println("MODIFICATION: "+mod+"%");
            System.out.println("GST: "+gst+"%");
            System.out.println("THE ON ROAD PRICE WITH FOR "+car1+" WITHOUT MODIFICATIONS IS: "+tot);
            System.out.println("THE ON ROAD PRICE WITH FOR "+car1+" WITH MODIFICATIONS IS: "+totwm);
        }
        else if (ans1.equals("create")) 
        {
            System.out.println("Enter your username");
            String username = sc.next();
            System.out.println("Enter your password");
            String password = sc.next();

            System.out.println("YOU HAVE CREATED YOUR ACCOUNT SUCESSFULLY.\nENTER YOUR LOGIN DETAIL BELOW\n");

            System.out.println("ENTER YOUR USERNAME: ");
            String username1 = sc.next();
            System.out.println("ENTER YOUR PASSWORD: ");
            String password1 = sc.next();

            while (!username1.equals(username)||!password1.equals(password)) 
            {
                System.out.println("RE-ENTER YOUR USERNAME:");
                username1 = sc.next();
                System.out.println("RE-ENTER YOUR PASSWORD:");
                password1 = sc.next();
            }
            System.out.println("YOU HAVE LOGINED SUCESSFULLY.");
            System.out.println("LOOK FOR YOUR FAVORITE COMAPNIES BELOW.");
            
            System.out.println("LOOK FOR YOUR FAVORITE COMAPNIES BELOW.");
            System.out.println("\t-->VOLKSWAGEN\t-->TOYOTA");
            System.out.println("\t-->FORD\t\t-->CHEVROLET");
            System.out.println("\t-->BMW\t\t-->MERCEDES");
            System.out.println("\t-->AUDI\t\t-->LEXUS");
            System.out.println("\t-->HONDA\t-->NISSAN");
            System.out.println("\t-->HYUNDAI\t-->KIA");
            System.out.println("\t-->MAZDA\t-->SUBARU");
            System.out.println("\t-->JAGUAR\t-->LAND ROVER");
            System.out.println("\t-->TESLA\t-->PORSCHE");
            System.out.println("\t-->FERRARI\t-->LAMBORGHINI");
            System.out.println("ENTER THE CAR COMPANY YOU LIKE TO GO WITH: ");
            String car = sc.next();
            if(car.equals("volkswagen"))
            {
                System.out.println("\t-->Volkswagen Virtus\t\tRs. 11.56 Lakh");
                System.out.println("\t-->Volkswagen Polo\t\tRs. 6.45 Lakh");
                System.out.println("\t-->Volkswagen Vento\t\tRs. 9.99 Lakh");
                System.out.println("\t-->Volkswagen T-Roc\t\tRs. 21.35 Lakh");
                System.out.println("\t-->Volkswagen Taigun\t\tRs. 10.49 Lakh");
            } else if(car.equals("toyota")) {
                System.out.println("\t-->Toyota Camry\t\tRs. 40.59 Lakh");
                System.out.println("\t-->Toyota Corolla\t\tRs. 16.45 Lakh");
                System.out.println("\t-->Toyota Fortuner\t\tRs. 30.34 Lakh");
                System.out.println("\t-->Toyota Innova\t\tRs. 20.35 Lakh");
                System.out.println("\t-->Toyota Yaris\t\tRs. 9.56 Lakh");
            } else if(car.equals("ford")) {
                System.out.println("\t-->Ford Mustang\t\tRs. 74.62 Lakh");
                System.out.println("\t-->Ford EcoSport\t\tRs. 8.19 Lakh");
                System.out.println("\t-->Ford Endeavour\t\tRs. 29.99 Lakh");
                System.out.println("\t-->Ford Figo\t\tRs. 5.82 Lakh");
                System.out.println("\t-->Ford Aspire\t\tRs. 7.28 Lakh");
            } else if(car.equals("chevrolet")) {
                System.out.println("\t-->Chevrolet Spark\t\tRs. 4.22 Lakh");
                System.out.println("\t-->Chevrolet Cruze\t\tRs. 13.95 Lakh");
                System.out.println("\t-->Chevrolet Beat\t\tRs. 4.32 Lakh");
                System.out.println("\t-->Chevrolet Tavera\t\tRs. 10.24 Lakh");
                System.out.println("\t-->Chevrolet Sail\t\tRs. 6.41 Lakh");
            } else if(car.equals("bmw")) {
                System.out.println("\t-->BMW X1\t\tRs. 41.50 Lakh");
                System.out.println("\t-->BMW X3\t\tRs. 61.90 Lakh");
                System.out.println("\t-->BMW 3 Series\t\tRs. 45.30 Lakh");
                System.out.println("\t-->BMW 5 Series\t\tRs. 63.90 Lakh");
                System.out.println("\t-->BMW 7 Series\t\tRs. 1.35 Crore");
            } else if(car.equals("mercedes")) {
                System.out.println("\t-->Mercedes A-Class\t\tRs. 40.20 Lakh");
                System.out.println("\t-->Mercedes C-Class\t\tRs. 57.45 Lakh");
                System.out.println("\t-->Mercedes E-Class\t\tRs. 67.20 Lakh");
                System.out.println("\t-->Mercedes S-Class\t\tRs. 1.57 Crore");
                System.out.println("\t-->Mercedes G-Class\t\tRs. 1.62 Crore");
            } else if(car.equals("audi")) {
                System.out.println("\t-->Audi A3\t\tRs. 35.67 Lakh");
                System.out.println("\t-->Audi A4\t\tRs. 47.61 Lakh");
                System.out.println("\t-->Audi Q3\t\tRs. 44.89 Lakh");
                System.out.println("\t-->Audi Q5\t\tRs. 60.55 Lakh");
                System.out.println("\t-->Audi Q7\t\tRs. 80.21 Lakh");
            } else if(car.equals("lexus")) {
                System.out.println("\t-->Lexus ES\t\tRs. 59.50 Lakh");
                System.out.println("\t-->Lexus RX\t\tRs. 99.00 Lakh");
                System.out.println("\t-->Lexus NX\t\tRs. 58.20 Lakh");
                System.out.println("\t-->Lexus LX\t\tRs. 2.33 Crore");
                System.out.println("\t-->Lexus LS\t\tRs. 1.91 Crore");
            } else if(car.equals("honda")) {
                System.out.println("\t-->Honda City\t\tRs. 11.43 Lakh");
                System.out.println("\t-->Honda Civic\t\tRs. 18.94 Lakh");
                System.out.println("\t-->Honda CR-V\t\tRs. 28.34 Lakh");
                System.out.println("\t-->Honda Jazz\t\tRs. 8.10 Lakh");
                System.out.println("\t-->Honda Amaze\t\tRs. 6.32 Lakh");
            } else if(car.equals("nissan")) {
                System.out.println("\t-->Nissan Magnite\t\tRs. 6.00 Lakh");
                System.out.println("\t-->Nissan Kicks\t\tRs. 9.49 Lakh");
                System.out.println("\t-->Nissan Micra\t\tRs. 6.63 Lakh");
                System.out.println("\t-->Nissan Sunny\t\tRs. 7.07 Lakh");
                System.out.println("\t-->Nissan Terrano\t\tRs. 10.00 Lakh");
            } else if(car.equals("hyundai")) {
                System.out.println("\t-->Hyundai i10\t\tRs. 5.20 Lakh");
                System.out.println("\t-->Hyundai i20\t\tRs. 7.88 Lakh");
                System.out.println("\t-->Hyundai Verna\t\tRs. 10.74 Lakh");
                System.out.println("\t-->Hyundai Creta\t\tRs. 10.00 Lakh");
                System.out.println("\t-->Hyundai Tucson\t\tRs. 24.35 Lakh");
            } else if(car.equals("kia")) {
                System.out.println("\t-->Kia Seltos\t\tRs. 10.89 Lakh");
                System.out.println("\t-->Kia Sonet\t\tRs. 7.15 Lakh");
                System.out.println("\t-->Kia Carnival\t\tRs. 30.00 Lakh");
                System.out.println("\t-->Kia Carens\t\tRs. 10.00 Lakh");
                System.out.println("\t-->Kia Sportage\t\tRs. 15.00 Lakh");
            } else if(car.equals("mazda")) {
                System.out.println("\t-->Mazda 2\t\tRs. 9.00 Lakh");
                System.out.println("\t-->Mazda 3\t\tRs. 12.00 Lakh");
                System.out.println("\t-->Mazda 6\t\tRs. 20.00 Lakh");
                System.out.println("\t-->Mazda CX-3\t\tRs. 15.00 Lakh");
                System.out.println("\t-->Mazda CX-5\t\tRs. 25.00 Lakh");
            } else if(car.equals("subaru")) {
                System.out.println("\t-->Subaru Impreza\t\tRs. 10.00 Lakh");
                System.out.println("\t-->Subaru Legacy\t\tRs. 18.00 Lakh");
                System.out.println("\t-->Subaru Forester\t\tRs. 25.00 Lakh");
                System.out.println("\t-->Subaru Outback\t\tRs. 28.00 Lakh");
                System.out.println("\t-->Subaru Ascent\t\tRs. 35.00 Lakh");
            } else if(car.equals("jaguar")) {
                System.out.println("\t-->Jaguar XE\t\tRs. 46.64 Lakh");
                System.out.println("\t-->Jaguar XF\t\tRs. 55.67 Lakh");
                System.out.println("\t-->Jaguar F-Pace\t\tRs. 74.88 Lakh");
                System.out.println("\t-->Jaguar F-Type\t\tRs. 98.13 Lakh");
                System.out.println("\t-->Jaguar E-Pace\t\tRs. 65.00 Lakh");
            } else if(car.equals("land rover")) {
                System.out.println("\t-->Land Rover Range Rover\tRs. 2.10 Crore");
                System.out.println("\t-->Land Rover Discovery\t\tRs. 88.06 Lakh");
                System.out.println("\t-->Land Rover Defender\t\tRs. 76.57 Lakh");
                System.out.println("\t-->Land Rover Evoque\t\tRs. 66.60 Lakh");
                System.out.println("\t-->Land Rover Velar\t\tRs. 83.33 Lakh");
            } else if(car.equals("tesla")) {
                System.out.println("\t-->Tesla Model S\t\tRs. 1.50 Crore");
                System.out.println("\t-->Tesla Model 3\t\tRs. 60.00 Lakh");
                System.out.println("\t-->Tesla Model X\t\tRs. 2.00 Crore");
                System.out.println("\t-->Tesla Model Y\t\tRs. 75.00 Lakh");
                System.out.println("\t-->Tesla Cybertruck\t\tRs. 1.00 Crore");
            } else if(car.equals("porsche")) {
                System.out.println("\t-->Porsche 911\t\tRs. 1.80 Crore");
                System.out.println("\t-->Porsche Cayenne\t\tRs. 1.20 Crore");
                System.out.println("\t-->Porsche Macan\t\tRs. 83.21 Lakh");
                System.out.println("\t-->Porsche Panamera\t\tRs. 1.50 Crore");
                System.out.println("\t-->Porsche Taycan\t\tRs. 1.50 Crore");
            } else if(car.equals("ferrari")) {
                System.out.println("\t-->Ferrari Roma\t\tRs. 3.76 Crore");
                System.out.println("\t-->Ferrari Portofino\t\tRs. 3.50 Crore");
                System.out.println("\t-->Ferrari F8 Tributo\t\tRs. 4.02 Crore");
                System.out.println("\t-->Ferrari SF90 Stradale\t\tRs. 7.50 Crore");
                System.out.println("\t-->Ferrari 812 Superfast\t\tRs. 5.75 Crore");
            } else if(car.equals("lamborghini")) {
                System.out.println("\t-->Lamborghini Huracan\t\tRs. 3.22 Crore");
                System.out.println("\t-->Lamborghini Aventador\t\tRs. 6.25 Crore");
                System.out.println("\t-->Lamborghini Urus\t\tRs. 3.10 Crore");
                System.out.println("\t-->Lamborghini Sian\t\tRs. 12.00 Crore");
                System.out.println("\t-->Lamborghini Centenario\t\tRs. 18.00 Crore");
            } else {
                System.out.println("Sorry, we do not have information on the car company you entered.");
            }
            System.out.println("ENTER YOUR CAR NAME: ");
            String car1 =sc.next();
            System.out.println("ENTER YOUR CAR PRICE: ");
            double price1 = sc.nextInt();
            double tot,gst,acces,mod,totwm;
            gst=(price1*18)/100;
            acces=(price1*12)/100;
            mod=(price1*20)/100;
            tot=price1+gst+acces;
            totwm=price1+gst+acces+mod;
            System.out.println("DISCRIPTION :");
            System.out.println("CAR: "+car1);
            System.out.println("CAR PRICE: "+price1+"/-");
            System.out.println("ACCESSORIES: "+acces+"%");
            System.out.println("MODIFICATION: "+mod+"%");
            System.out.println("GST: "+gst+"%");
            System.out.println("THE ON ROAD PRICE WITH FOR "+car1+" WITHOUT MODIFICATIONS IS: "+tot);
            System.out.println("THE ON ROAD PRICE WITH FOR "+car1+" WITH MODIFICATIONS IS: "+totwm);
        }
        else
        {
            System.out.println("INVALID INPUT, THANK YOU");
        }
    }
}

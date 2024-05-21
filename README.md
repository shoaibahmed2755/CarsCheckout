# CarsCheckout
CarsCheckout is a Java console application that allows users to log in or create an account, select a car from various companies, and view car prices. It calculates the total on-road price, including GST, accessories, and modifications. This user-friendly program simplifies car selection and price calculation for potential buyers.

# CarsCheckout

## Overview
CarsCheckout is a Java-based console application that allows users to log in or create an account, select a car from a variety of car companies, and view the car prices. It also calculates the total price including GST, accessories, and modifications.

## Features
- User authentication (Login/Create account)
- Selection of cars from multiple companies
- Display of car prices
- Calculation of total on-road price with and without modifications

## How to Use
1. **Login or Create Account**: The program starts by asking the user to log in or create an account.
   - **Login**: Enter your username and password.
   - **Create**: Create a new account by entering a username and password, then log in with the new credentials.

2. **Select Car Company**: After logging in, you can select a car company from the list provided.

3. **View Car Prices**: The program displays the available cars and their prices for the selected company.

4. **Calculate Total Price**: Enter the name and price of the car you are interested in. The program calculates the total price including GST, accessories, and modifications.

## Example
Here is a brief example of how the program works:

```sh
Welcome to CarsCheckout
Login or Create?
IF YOU WANT TO LOGIN ENTER--> LOGIN(SMALL-LETTER)
IF YOU WANT TO CREATE ENTER--> CREATE(SMALL-LETTER)

login
Enter your username
user1
Enter your password
password1
YOU HAVE LOGINED SUCESSFULLY.
LOOK FOR YOUR FAVORITE COMAPNIES BELOW.
  -->VOLKSWAGEN  -->TOYOTA
  ...
ENTER THE CAR COMPANY YOU LIKE TO GO WITH:
toyota
  -->Toyota Camry      Rs. 40.59 Lakh
  -->Toyota Corolla    Rs. 16.45 Lakh
  ...
ENTER YOUR CAR NAME:
Camry
ENTER YOUR CAR PRICE:
4059000
DISCRIPTION :
CAR: Camry
CAR PRICE: 4059000/-
ACCESSORIES: 487080.0%
MODIFICATION: 811800.0%
GST: 730620.0%
THE ON ROAD PRICE WITH FOR Camry WITHOUT MODIFICATIONS IS: 5585700.0
THE ON ROAD PRICE WITH FOR Camry WITH MODIFICATIONS IS: 6397500.0

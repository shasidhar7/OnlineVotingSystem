# Online Voting System

The **Online Voting System** is a simple Java-based application designed to simulate an online voting process. This project focuses on user eligibility verification and voting functionality, maintaining a global vote count for predefined parties.

## About the Project

- Users input their **name** and **age** to check their voting eligibility.  
- Voters must be at least **18 years old** to cast their vote.  
- Once eligible, users select their preferred party (e.g., "Andhra Party" or "Praja Party").  
- The system keeps track of the total votes for each party using static variables.  
- Error handling is implemented for invalid inputs (e.g., age below 18 or invalid choices).  
- A thank-you note is displayed after successful voting.

## Features

1. **Eligibility Check**:  
   - Ensures that users below 18 years are not allowed to vote.  
   - Displays an appropriate message for ineligible voters.  

2. **Voting Process**:  
   - Presents a list of parties for eligible voters.  
   - Records the user's vote and increments the global vote count for the selected party.  

3. **Vote Counting**:  
   - Automatically updates the vote count as users cast their votes.  

4. **Feedback**:  
   - Displays a thank-you note after successful voting.  

## Technologies Used

- **Programming Language**: Java  
- **Environment**: Console-based application  

## How to Run the Application

1. **Clone the Repository**:  
   ```bash
   git clone https://github.com/shasidhar7/OnlineVotingSystem.git
   cd OnlineVotingSystem

2. **Compile the Java code**
   ```
   javac Main.java
   ```
3. **Run the application**
   ```
   java Main
   ```
4. **follow the Instructions**

   - Enter your name and age when prompted.
   - If eligible, select a party to cast your vote.
##  Future Enhancements

  - Displaying detailed voting results at the end of the process.
  - Adding more parties dynamically without hardcoding them.
  - Storing votes persistently using a database or file system.
  - Implementing a graphical user interface (GUI) for ease of use.

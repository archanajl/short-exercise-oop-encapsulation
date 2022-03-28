1.Look at the DodgyBankAccount, this class is not well-encapsulated. Can you note down the problems with how the class is designed, and the ways it is being misused?

    The problems in the design are:
    
    1. The properties , accountNumber, accountBalance and rewardAmount are declared as public. Hence, they will be exposed.
        Instead, it should be made private.

    2. The rewardAmount is a fixed value, hence we can declare it as magic numbers 
            private final int REWARDAMOUNT = 50;

    3. addReward method can be made private , as it is called internally from the depositAmount method 
        and need not be exposed.


2.Compare and contrast the DodgyBankAccount and the SecureBankAccount, how is the SecureBankAccount different to the 
DodgyBankAccount? How is it designed to prevent it from being misused? Are there instances of better method names for clearer abstraction?

    The benefits in the design are:

    1. The properties , accountNumber, accountBalance and rewardAmount are declared as private. 
        Hence, they will be not exposed.

    2. The rewardAmount is a fixed value, hence declared as magic numbers 
            private final int REWARDAMOUNT = 50;

    Better method names :
        The method name displayAccountBalance instead of getAccountBalance explains the purpose of the method better.
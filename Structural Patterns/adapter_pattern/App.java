import legacy.LegacyBankAccount;

public class App {
    public static void main(String[] args) {
        LegacyBankAccount legacyBankAccount = new LegacyBankAccount(1, "John Smith");
        /* Won't work due to missing parameters!!
        AccountCreationService accountCreationService = new AccountCreationService(legacyBankAccount.getID(), legacyBankAccount.getName())
        */
        PersonalInfoDB personalInfoDB = new PersonalInfoDB();
        personalInfoDB.setName("John Smith");
        personalInfoDB.setEmail("john@smith.com");
        personalInfoDB.setAmount(1000L);

        BankAccountAdapter bankAccountAdapter = new BankAccountAdapter(legacyBankAccount, personalInfoDB);
        AccountCreationService accountCreationService = new AccountCreationService(bankAccountAdapter.getID(),
                bankAccountAdapter.getName(), bankAccountAdapter.getEmail(), bankAccountAdapter.getAmount());

        accountCreationService.createAccount();
    }
}
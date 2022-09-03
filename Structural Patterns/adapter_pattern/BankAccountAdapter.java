import legacy.LegacyBankAccount;

public class BankAccountAdapter implements BankAccountInfo{

    LegacyBankAccount instance;
    PersonalInfoDB dbConnector;

    public BankAccountAdapter(LegacyBankAccount instance, PersonalInfoDB dbConnector){
        this.instance = instance;
        this.dbConnector = dbConnector;
    }

    @Override
    public int getID(){
        return instance.getID();
    }

    @Override
    public String getName() {
        return instance.getName();
    }

    @Override
    public String getEmail() {
        return dbConnector.getEmail();
    }

    @Override
    public Long getAmount() {
        return dbConnector.getAmount();
    }
}

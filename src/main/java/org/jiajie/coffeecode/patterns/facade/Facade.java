package org.jiajie.coffeecode.patterns.facade;

/**
 * @author jay
 */
public class Facade {
    AdminOfIndustry admin = new AdminOfIndustry();
    Bank bank = new Bank();
    Taxation taxation = new Taxation();

    public Company openCompany(String name){
        Company c = this.admin.register(name);
        String bankAccount = this.bank.openAccount(c.getId());
        c.setBankAccount(bankAccount);
        String taxCode = this.taxation.applyTaxCode(c.getId());
        c.setTaxCode(taxCode);
        return c;
    }
}

package entities;

//Com SavingAcount como classe final a declaração a seguir não é permitida
//public class SavingAcountPlus extends SavingAcount {

//}

//Agora, SavingAccount não é mais final mas o seu método withdraw() sim
public class SavingAcountPlus extends SavingAccount {

	//A declaração a seguir, então, não é permitidah pois witdraw() em
	//SavingAccount foi declarado como final
	@Override
	public void withdraw(double amount) {
		balance -= amount + 2.0;
	}
}

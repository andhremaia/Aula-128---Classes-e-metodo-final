package entities;

//Com SavingAcount como classe final a declara��o a seguir n�o � permitida
//public class SavingAcountPlus extends SavingAcount {

//}

//Agora, SavingAccount n�o � mais final mas o seu m�todo withdraw() sim
public class SavingAcountPlus extends SavingAccount {

	//A declara��o a seguir, ent�o, n�o � permitidah pois witdraw() em
	//SavingAccount foi declarado como final
	@Override
	public void withdraw(double amount) {
		balance -= amount + 2.0;
	}
}

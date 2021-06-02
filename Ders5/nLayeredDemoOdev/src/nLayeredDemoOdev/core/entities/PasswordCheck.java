package nLayeredDemoOdev.core.entities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import nLayeredDemoOdev.core.abstracts.CheckService;
import nLayeredDemoOdev.entities.concretes.Product;

public class PasswordCheck implements CheckService{

	String passwordRegex = "^.{6,}$";
    Pattern passwordPattern = Pattern.compile(passwordRegex);
    
	@Override
	public boolean check(Product product) {
		Matcher matcher = passwordPattern.matcher(product.getPassword());
		if(matcher.matches()) {
			return true;
		}
		System.out.println("Hata!!! Þifre altý karakterden büyük olmalýdýr");
		return false;
	}

}

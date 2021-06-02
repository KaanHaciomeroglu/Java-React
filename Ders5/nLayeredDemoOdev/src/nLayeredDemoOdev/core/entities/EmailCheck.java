package nLayeredDemoOdev.core.entities;

import nLayeredDemoOdev.core.abstracts.CheckService;
import nLayeredDemoOdev.entities.concretes.Product;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailCheck implements CheckService {

	String emailRegex = "[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?";
	Pattern emailPattern = Pattern.compile(emailRegex);

	@Override
	public boolean check(Product product) {
		Matcher matcher = emailPattern.matcher(product.geteMail());
		if (matcher.matches()) {
			return true;
		}
		System.out.println("Hata!!! E-Mail kabul edilmedi");
		return false;
	}

}

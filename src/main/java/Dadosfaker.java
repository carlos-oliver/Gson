import com.github.javafaker.Faker;

public class Dadosfaker {
    public static void main (String args[]){
        Faker faker = new Faker();

        String fone = faker.phoneNumber().cellPhone();
        fone = fone.replace("-", "");
        System.out.print(fone);
    }
}

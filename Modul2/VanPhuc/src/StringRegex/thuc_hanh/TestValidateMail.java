package StringRegex.thuc_hanh;

public class TestValidateMail {
    public static final String[] validEmail = new String[] { "a@gmail.com", "ab@yahoo.com", "abc@hotmail.com" };
        public static final String[] invalidEmail = new String[] { "@gmail.com", "ab@gmail.", "@#abc@gmail.com" };

        public static void main(String args[]) {
            ValidateMail validateMail = new ValidateMail();
            for (String email : validEmail) {
                boolean isvalid = validateMail.validate(email);
                System.out.println("Email is " + email +" is valid: "+ isvalid);
            }
            for (String email : invalidEmail) {
                boolean isvalid = validateMail.validate(email);
                System.out.println("Email is " + email +" is valid: "+ isvalid);
            }
        }
    }


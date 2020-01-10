package enforcing_privacy_with_cryptography;

/*
 * Jason Matthew Wiley
 * 01/09/2020
 * Enforcing Privacy with Cryptography Application
 * 
 * The explosive growth of Internet communications and data storage on Internet-connected 
 * computers has greatly increased privacy concerns. The field of cryptography is concerned with 
 * coding data to make it difficult (and hopefully—with the most advanced schemes—impossible) for 
 * unauthorized users to read. In this exercise you’ll investigate a simple scheme for encrypting 
 * and decrypting data. A company that wants to send data over the Internet has asked you to 
 * write a program that will encrypt it so that it may be transmitted more securely. All the data 
 * is transmitted as four-digit integers. Your application should read a four-digit integer 
 * entered by the user and encrypt it as follows: Replace each digit with the result of adding 
 * 7 to the digit and getting the remainder after dividing the new value by 10. Then swap the 
 * first digit with the third, and swap the second digit with the fourth. Then print the 
 * encrypted integer. Write a separate application that inputs an encrypted four-digit integer 
 * and decrypts it (by reversing the encryption scheme) to form the original number. [Optional 
 * reading project: Research “public key cryptography” in general and the PGP (Pretty Good 
 * Privacy) specific public key scheme. You may also want to investigate the RSA scheme, which is 
 * widely used in industrial-strength applications.]
 */

public class EnforcingPrivacyWithCryptographyTest 
{
	public static void main(String[] args) 
	{
		
		EnforcingPrivacyWithCryptography enforcing = new EnforcingPrivacyWithCryptography();
		
		//repeat if number.length < 4
		while (enforcing.getNumber().length() != 4) 
		{
			enforcing.setNumber();
		}
		//end loop
		
		enforcing.setNumber1(enforcing.getNumber().charAt(0));
		enforcing.setNumber2(enforcing.getNumber().charAt(1));
		enforcing.setNumber3(enforcing.getNumber().charAt(2));
		enforcing.setNumber4(enforcing.getNumber().charAt(3));
		
		enforcing.setSwap1();
		enforcing.setSwap2();
		enforcing.setSwap3();
		enforcing.setSwap4();
		
		//print Encrypted Code: code
		System.out.printf("Encrypted Code: %s%s%s%s", enforcing.getSwap1(), enforcing.getSwap2(), enforcing.getSwap3(), enforcing.getSwap4());		
	}
}
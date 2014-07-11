package emailing;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class Mailer {

	public static void main(final String [] args) {

		// Recipient's email ID needs to be mentioned.
		final String to = "daniel.temple@williamhill.com";
		//		final String to = "jayraj.mody@williamhill.com";

		// Sender's email ID needs to be mentioned
		final String from = "daniel.temple@williamhill.com";

		// Assuming you are sending email from localhost
		final String host = "localhost";

		// Get system properties
		final Properties properties = System.getProperties();

		// Setup mail server
		properties.setProperty("mail.smtp.host", host);

		// Get the default Session object.
		final Session session = Session.getDefaultInstance(properties);

		try {
			// Create a default MimeMessage object.
			final MimeMessage message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.addRecipient(Message.RecipientType.TO,
					new InternetAddress(to));

			// Set Subject: header field
			message.setSubject("This is the Subject Line!");

			// Now set the actual message
			message.setText("This is actual message");

			// Send message
			Transport.send(message);
			System.out.println("Sent message successfully....");
		}
		catch (final MessagingException mex) {
			mex.printStackTrace();
		}


	}
}

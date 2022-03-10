/*package mail_send;

import java.util.Date;
import java.util.Properties;

import javax.mail.Session;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;

import sun.rmi.transport.Transport;

public class SendMail {

	public static void main(String[] args) {
		try {
			String host ="smtp.gmail.com";
			final String user = "abdulwariskhan175@gmail.com";
			final String pass = "007890825";
			String to = "suhailakhan86@gmail.com";
			String from = "abdulwariskhan175@gmail.com";
			String subject = "Simple message";
			String messagetext = "Sending mail waris test demo";
			boolean sesssionDebug = false;

			Properties properties = System.getProperties();
			properties.put("mail.smtp.starttls.enable","true");
			properties.put("mail.smtp.host", host);
			properties.put("mail.smtp.port", "587");
			properties.put("mail.smtp.auth", "true");
			properties.put("mail.smtp.starttls.required", "true");
			java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
			Session session = Session.getDefaultInstance(properties, null);
			session.setDebug(sesssionDebug);

			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress(from));
			InternetAddress[] address = { new InternetAddress(to)};
			message.setRecipients(Message.RecipientType.TO, address);
			message.setSubject(subject);
			message.setSentDate(new Date());
			message.setText(messagetext);
			Transport transport = session.getTransport("smtp");
			transport.connect(host,user, pass);
			Transport.send(message, message.getAllRecipients());
			transport.close();
			System.out.println("Message sent succsessfully");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
*/
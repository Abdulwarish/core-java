/*
 * package mail_send;
 * 
 * import java.util.Date; import java.util.Properties;
 * 
 * import javax.mail.Message; import javax.mail.MessagingException; import
 * javax.mail.PasswordAuthentication; import javax.mail.Session; import
 * javax.mail.Transport; import javax.mail.internet.InternetAddress; import
 * javax.mail.internet.MimeMessage;
 * 
 * public class EmailSend {
 * 
 * public static void main(String[] args) { try { String host ="smtp.gmail.com";
 * String user = "suhailakhan86@gmail.com"; String pass = "suhel12345"; String
 * to = "awaris458@gmail.com"; String from = "suhailakhan86@gmail.com"; String
 * subject =
 * "This is confirmation number for your expertprogramming account. Please insert this number to activate your account."
 * ; String messageText = "waris Congratuation"; boolean sessionDebug = false;
 * 
 * Properties props = System.getProperties();
 * 
 * props.put("mail.smtp.starttls.enable","true"); props.put("mail.smtp.host",
 * host); props.put("mail.smtp.port", "587"); props.put("mail.smtp.auth",
 * "true"); props.put("mail.smtp.starttls.required", "true");
 * 
 * java.security.Security.addProvider(new
 * com.sun.net.ssl.internal.ssl.Provider()); Session mailSession =
 * Session.getDefaultInstance(props, null); mailSession.setDebug(sessionDebug);
 * Message msg = new MimeMessage(mailSession); msg.setFrom(new
 * InternetAddress(from)); InternetAddress[] address = {new
 * InternetAddress(to)}; msg.setRecipients(Message.RecipientType.TO, address);
 * msg.setSubject(subject); msg.setSentDate(new Date());
 * msg.setText(messageText);
 * 
 * Transport transport=mailSession.getTransport("smtp"); transport.connect(host,
 * user, pass); transport.sendMessage(msg, msg.getAllRecipients());
 * transport.close(); System.out.println("message send successfully");
 * }catch(Exception ex) { System.out.println(ex); } }
 * 
 * }
 */
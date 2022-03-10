package html.table.creation;

/**
 * @Author Abdul Warish 07-Mar-2022
 */
public class Table {
	public static void main(String[] args) {
		StringBuilder pw = new StringBuilder();
	    pw.append("<table border=\"1\"><tr  bgcolor=\"#f2f2f2\"><th>Product Name<th>Investment Amount& Fees</tr>");
	    for (int i = 1; i <= 20; i++) {
	           int square = i * i;
	           pw.append("<tr><td>" + i + "<td>" + square);
	    }
	    pw.append("</table>");
	    System.out.println(pw);
	}
}

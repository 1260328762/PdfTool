
import java.io.File;

public class Main {
	public static void main(String[] args) {
		PdfToWord test = new PdfToWord();
		String res = new PdfToWord().pdftoword("K:\\����\\fdd.pdf");
		System.out.println(res);
	}
}

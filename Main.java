import java.io.*;

public class Main {

    public static void main(String [] args) {
        InputStream in;
        OutputStream out;

        try {
            FileOutputStream fos = new FileOutputStream("text11.txt", true);
            PrintStream ps = new PrintStream(fos);
            ps.println("Text One");
            ps.println("fnadslfndskfn fnjaksdnfjdsk jnfkjadfsn home chair jcabkdbs bfadsf fbbsdf");
            ps.println("fbdshbfdhsf End Text One");
          
            FileOutputStream fos1 = new FileOutputStream("text22.txt", true);
            PrintStream ps1 = new PrintStream(fos1);
            ps1.println("Text two");
            ps1.println("Next ,sdfmsadfn jbfjskdf  fnasdkjl f jadfsnj home nfkjadfnask");
            ps1.println("vadsjbfs bfjaksdf chairr bfadskbfcdkcds End Text two");
            fos1.close();

            FileInputStream fis = new FileInputStream("text22.txt");
            int b;
            while((b = fis.read()) != -1) {
                fos.write((char) b);
            }
            fos.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}

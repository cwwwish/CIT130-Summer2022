import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.omg.CORBA.portable.OutputStream;

public class Classifier {
    public static void main(String args[]) throws IOException {
        boolean flag=true;

        while(flag) {
            Scanner sc=new Scanner(System.in);
  
            System.out.println("Enter file name");
            String filename=sc.nextLine();
           
            System.out.println("Choose binary or text file(b/t)");
            char ch=sc.next().charAt(0);

            if(ch=='t'){
                System.out.println("Choose read or write(r/w):");
                char rw=sc.next().charAt(0);

                if(rw=='w') {
                    File fout = new File(filename);
                    FileOutputStream fos = new FileOutputStream(fout);
                    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
                    
                    for (;; ) {
                        System.out.println("Enter a line of information to write to the file:");
                        Scanner sc1=new Scanner(System.in);
                        String s=sc1.nextLine();
                        bw.write(s);
                        bw.newLine();

                        System.out.println("Would you like to enter another line? Y/N only");
                        char ch1=sc1.next().charAt(0);


                        if(ch1=='y')continue;

                        else break;
                    }

                    bw.close();
                }
                
                else {
                    FileInputStream fis = null;
                    BufferedReader reader = null;

                    try {
                        fis = new FileInputStream(filename);
                        reader = new BufferedReader(new InputStreamReader(fis));

                        System.out.println("Reading File line by line using BufferedReader");
                        String line = reader.readLine();
                    
                        while(line != null){
                            System.out.println(line);
                            line = reader.readLine();
                        }   
                    }

                    catch (FileNotFoundException ex) {
                    }

                    catch (IOException ex) {
                    }

                    finally {
                        try {
                            reader.close();
                            fis.close();
                        }

                        catch (IOException ex) {
                            Logger.getLogger(Classifier.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
            }

            else {
                System.out.println("Choose read or write(r/w):");
                char rw=sc.next().charAt(0);

                if(rw=='w') {
                    FileOutputStream out = null;

                    try{
                        out = new FileOutputStream(filename);

                        for (;; ) {
                            System.out.println("Enter a line of information to write to the file:");
                            Scanner sc11=new Scanner(System.in);
                            String ss=sc11.nextLine();
                            byte[] totalBytes = ss.getBytes();
                            out.write(totalBytes);
                            System.out.println("Would you like to enter another line? Y/N only");
                            char ch1=sc11.next().charAt(0);
                            if(ch1=='y') continue;

                            else break;
                    }
                }

                finally{
                    if(out !=null) out.close();
                }
            }

            else {
                try {
                    byte[] buffer = new byte[1000];
                    FileInputStream inputStream = new FileInputStream(filename);
                    int total = 0; 
                    int nRead = 0;

                    while((nRead = inputStream.read(buffer)) != -1) {
                        System.out.println(new String(buffer));
                        total += nRead;
                    }

                    inputStream.close();
                }

                catch(FileNotFoundException ex) {   
                }

                catch(IOException ex) {
                }
            }
        }

        System.out.println("Continue(y/n)");
        Scanner ssss=new Scanner(System.in);
        char re=ssss.next().charAt(0);
        if(re=='n') flag=false;
    }

    System.out.println("Process Completed");
  }
}

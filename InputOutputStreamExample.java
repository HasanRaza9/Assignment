import java.io.*;
 public class InputOutputStreamExample {
    public static void main(String[] args) throws IOException {
        String path = "D://Hasan Raza//phase1.txt";
        DataInputStream dis = new DataInputStream(System.in);

        FileOutputStream fout=new FileOutputStream(path,true);
        BufferedOutputStream bout=new BufferedOutputStream(fout,1024);
        System.out.println("Enter text (@ at the end):");
        char ch;

        while((ch=(char)dis.read())!='@')
        {
            bout.write(ch);
        }
        //close the file
        bout.close();

       FileInputStream fin= new FileInputStream(path);

        System.out.println("Number of bytes read:"+fin.available());

        System.out.println("FileContents :");

        int ch1;
        while((ch1=fin.read())!=-1)
            System.out.print((char)ch1);

        //close the file
        fin.close();

    }
}

import java.io.*;

public class WritertoFile {
    StringBuilder stringBuilder = new StringBuilder();
    public void append(String out){
        stringBuilder.append(out+"\n");
    }
    public void flush(File file){
        try ( Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file)))){
            writer.write(stringBuilder.toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

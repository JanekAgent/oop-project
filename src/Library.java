
public class Library {
    int maxid;   
    WriteFile file;
    ReadFile readFile;
    String fileName;
    void newBook(){
        maxid=maxid+1;
        file.Write(Integer.toString(maxid));
        
    }
    Library(String fileNamel){
        fileName=fileNamel;
        CreateFile file = new CreateFile(fileName);
        file.Create();
        this.file = new WriteFile(fileName,false);
        this.readFile = new ReadFile(fileName); 
        maxid=Integer.valueOf(readFile.loadLine());
    }
    int lastBook(){
        return maxid;
    }
}

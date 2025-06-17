
public class FactoryMethodPattern {

    interface Document {

        void open();
    }
    

    static class WordDoc implements Document {

        public void open() {
            System.out.println("Word_Documet");
        }
    }

    static class PdfDoc implements Document {

        public void open() {
            System.out.println("PDF_Documet");
        }
    }

    static class ExlDoc implements Document {

        public void open() {
            System.out.println("Excel_Documet");
        }
    }
    abstract static class DocumentFactory{
        public abstract Document createDocument();
    }

   static class WordFactory extends DocumentFactory{
    public Document createDocument(){
        return new WordDoc();
    } 
  }
   static class PdfFactory extends DocumentFactory{
    public Document createDocument(){
        return new PdfDoc();
    } 
  }
  
   static class ExcelFactory extends DocumentFactory{
    public Document createDocument(){
        return new ExlDoc();
    } 
  }

  public static void main(String[] args) {
      DocumentFactory word=new WordFactory();
      Document doc1=word.createDocument();
      doc1.open();

      DocumentFactory pdf=new PdfFactory();
      Document doc2=pdf.createDocument();
      doc2.open();

      DocumentFactory exl=new ExcelFactory();
      Document doc3=exl.createDocument();
      doc3.open();

  }

}

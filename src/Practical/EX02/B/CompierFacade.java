package Practical.EX02.B;

public class CompierFacade {
    private Parser parser;
    private Transformer transformer;
    private Assembler assembler;

    public CompierFacade() {

      parser=new Parser();
      transformer=new Transformer();
      assembler=new Assembler();
    }

    public String compile(String sourceCode){

        String parsedCode=parser.parse(sourceCode);
        String transformcode=transformer.transform(parsedCode);
        String asseblyCode=assembler.generate(transformcode);

        return asseblyCode;
    }
}

 enum SMELL {
   
    MultipleReturn, //1 Multiple return statement
    ExtremeChains, // 2
    DeadCodeReturn, //3
    FunctionsNotCalled, //4
    ReturnInLoop, //5
    LongConditionals, // 6
    MethodTooLong, // 7 
    IdTooLong,// 8
    DeeplyNestedCode, //9
}

public class CodeSmell {
    public SMELL type;
    public int line;
    public int column;
    public String message;
}
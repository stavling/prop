import java.io.IOException;

/**
 * Created by molotov on 11/14/14.
 */
public class Parser implements IParser {

    public static Tokenizer tokenizer;

    public Parser() {
        tokenizer = new Tokenizer();
    }

    @Override
    public void open(String fileName) throws IOException, TokenizerException {
        try {
            tokenizer.open(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TokenizerException e) {
            e.printStackTrace();
        }
        tokenizer.moveNext();
    }

    @Override
    public INode parse() throws IOException, TokenizerException, ParserException {
        return null;
    }

    @Override
    public void close() throws IOException {
        tokenizer.close();
    }
}

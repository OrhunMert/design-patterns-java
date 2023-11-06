package design.patterns.java.structural.adapter.example2.adapter;


import design.patterns.java.structural.adapter.example2.model.Codex;
import design.patterns.java.structural.adapter.example2.model.Crypt;

public class CodexAdapter implements Crypt {
    private Codex codex;

    public CodexAdapter(Codex codex) {
        this.codex = codex;
    }

    @Override
    public void encrypt(String text) {
        codex.textToCode(text);
    }

    @Override
    public void decrypt(String text) {
        codex.codeToText(text);
    }
}

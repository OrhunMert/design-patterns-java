package design.patterns.java.structural.adapter.example2;


import design.patterns.java.structural.adapter.example2.adapter.CodexAdapter;
import design.patterns.java.structural.adapter.example2.model.Codex;
import design.patterns.java.structural.adapter.example2.model.Crypt;
import design.patterns.java.structural.adapter.example2.model.CryptA;
import design.patterns.java.structural.adapter.example2.model.CryptB;

public class Example2Demo {

    public static void main(String[] args) {
        Crypt crypt = new CryptA();

        crypt.encrypt("");
        crypt.decrypt("");

        crypt = new CryptB();

        crypt.encrypt("");
        crypt.decrypt("");

        Codex codex = new Codex();
        crypt = new CodexAdapter(codex);

        crypt.encrypt("Orhun Mert");
        crypt.decrypt("Bozkurt");
    }
}

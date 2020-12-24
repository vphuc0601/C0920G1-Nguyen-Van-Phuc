package OnTap.Dictionary;

public class Word {
    String pronoun;
    String noun;
    String adjective;
    String verb;
    String synonymous;

    public Word(String pronoun, String noun, String adjective, String verb, String synonymous) {
        this.pronoun = pronoun;
        this.noun = noun;
        this.adjective = adjective;
        this.verb = verb;
        this.synonymous = synonymous;
    }

    public String getPronoun() {
        return pronoun;
    }

    public void setPronoun(String pronoun) {
        this.pronoun = pronoun;
    }

    public String getNoun() {
        return noun;
    }

    public void setNoun(String noun) {
        this.noun = noun;
    }

    public String getAdjective() {
        return adjective;
    }

    public void setAdjective(String adjective) {
        this.adjective = adjective;
    }

    public String getVerb() {
        return verb;
    }

    public void setVerb(String verb) {
        this.verb = verb;
    }

    public String getSynonymous() {
        return synonymous;
    }

    public void setSynonymous(String synonymous) {
        this.synonymous = synonymous;
    }
}

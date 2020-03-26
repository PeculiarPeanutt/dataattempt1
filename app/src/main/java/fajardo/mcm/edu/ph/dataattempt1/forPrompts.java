package fajardo.mcm.edu.ph.dataattempt1;

//import java.util.

public class forPrompts {

    /*private String scenery, adventure, scifi, steampunk , fantasy, medieval, cyberpunk
            ,horror, character, superhero, space, fable, historical, mythology;

     */
    private String category ;
    private String words , situation , words1;

    public forPrompts(String category , String words , String situation){

        this.category = category;
        this.situation = situation;
        this.words = words;
        this.words1 = words;

    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }


    public String getWords() {
        return words;
    }

    public void setWords(String words) {
        this.words = words;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public String getWords1() {
        return words1;
    }

    public void setWords1(String words1) {
        this.words1 = words1;
    }
}

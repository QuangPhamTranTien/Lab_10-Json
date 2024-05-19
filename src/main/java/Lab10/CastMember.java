package Lab10;
public class CastMember {
    private String actorName;
    private String characterName;

    public CastMember(String actorName, String characterName) {
        this.actorName = actorName;
        this.characterName = characterName;
    }

    // Getters and Setters (optional, if needed)
    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getCharacterName() {
        return characterName;
    }

    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
}

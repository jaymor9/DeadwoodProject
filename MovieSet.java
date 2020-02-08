public class MovieSet {

    private SceneCard sceneCard;
    private boolean faceUp;
    private int shotCount;
    private int shotMax;
    private Role[] roles;

    public MovieSet(int shotCount, int shotMax) {
        this.shotCount = 0;
        this.shotMax = shotMax;
    }

    public SceneCard getSceneCard() {
        return sceneCard;
    }

    public void setSceneCard(SceneCard sceneCard) {
        this.sceneCard = sceneCard;
    }

    public boolean isFaceUp() {
        return faceUp;
    }

    public void setFaceUp(boolean faceUp) {
        this.faceUp = faceUp;
    }

    public int getShotCount() {
        return shotCount;
    }

    public void setShotCount(int shotCount) {
        this.shotCount = shotCount;
    }

    public int getShotMax() {
        return shotMax;
    }

    public Role[] getRoles() {
        return roles;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }
}

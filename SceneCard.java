public class SceneCard {
    private int cardNum;
    private int budget;
    private Role[] roles;

    public SceneCard(int cardNum, int budget, Role[] roles) {
        this.cardNum = cardNum;
        this.budget = budget;
        this.roles = roles;
    }

    public int getBudget() {
        return budget;
    }

    public Role[] getRoles() {
        return roles;
    }
}

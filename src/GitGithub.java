public class GitGithub {

    int pocetGit;
    double priemerGit;

    public GitGithub(int pocetGit, double priemerGit) {
        this.pocetGit = pocetGit;
        this.priemerGit = priemerGit;
    }

    public int getPocetGit() {
        return pocetGit;
    }

    public double getPriemerGit() {
        return priemerGit;
    }

    @Override
    public String toString() {
        return "GitGithub{" +
                "pocetGit=" + pocetGit +
                ", priemerGit=" + priemerGit +
                '}';
    }
}

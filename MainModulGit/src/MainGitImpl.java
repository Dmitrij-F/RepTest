/**
 * Created by Bro on 17.09.15.
 */
public class MainGitImpl extends MainGit {
    int k = 1;
    private int jj = 44;

   public int kk(int k) {
        //c=5;
        this.k = k + c;
        return this.k;
    }

    MainGitImpl(){}

    public MainGitImpl(int y, int k) {
        new MainGit(5);
//        super(y);
        this.k = k;
super.bb();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        MainGitImpl mainGit = (MainGitImpl) o;

        if (k != mainGit.k) return false;
        return jj == mainGit.jj;

    }

    @Override
    public int hashCode() {
        int result = k;
        result = 31 * result + jj;
        return result;
    }

    @Override
    public int someM(double dd) {
        dd=0.2;
        super.sqr4(0.2);
        super.sqr4(0.2);



        return super.someM(dd);

    }

    public static void main(String[] args) {
        new MainGitImpl().someM(1.1);
        new MainGitImpl().kk(7);



    }
}

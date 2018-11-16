public class HorseBarn {
    private Horse spaces[];

    public HorseBarn( Horse spaces[])
    {
        this.spaces=spaces;
    }


    public int findHorseSpace(String name)
    {
        for (int i = 0; i < this.spaces.length; i++) {
            if (this.spaces[i]!=null && name.equals(this.spaces[i].getName())) {
                return i;
            }
        }
        return -1;
    }

    public void consolidate() {
        for (int i = 0; i < this.spaces.length - 1; i++) {
            if (this.spaces[i] == null) {
                for (int j = i + 1; j < this.spaces.length; j++) {
                    if (this.spaces[j] != null) {
                        this.spaces[i] = this.spaces[j];
                        this.spaces[j] = null;
                        j = this.spaces.length;
                    }
                }
            }
        }
    }

    public String toString() {
        String list = "";
        for (int x = 0; x < this.spaces.length; x++) {
            if (this.spaces[x] == null) {
                list = list + " null ";
            } else {
                list = list + " " + this.spaces[x].getName() + " ";
            }
        }
        return list;

    }
}

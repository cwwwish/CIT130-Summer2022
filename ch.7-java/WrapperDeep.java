public class WrapperDeep {
      private int[] a;
      public WrapperDeep() {
            a = new int[3];
      }

        public WrapperDeep(WrapperDeep wd) {
              a = new int[wd.a.length];
              for (int i = 0; i < a.length; i++) {
                    a[i] = wd.a[i];
            }
        }
  
        public String toString() {
              String str = "";
              for (int i = 0; i < a.length; i++) {
                    str += a[i] + " ";
              }
              return str.trim();
            }

        public boolean equals(Object other) {
              if (other instanceof WrapperDeep) {
                    WrapperDeep wd = (WrapperDeep) other;
                    if (a.length != wd.a.length) {
                          return false;
                  }

                    for (int i = 0; i < a.length; i++) {
                          if (a[i] != wd.a[i]) {
                                return false;
                        }
                  }
                    return true;
            }
              return false;
        }

        public void setArray(int[] a) {
              this.a = new int[a.length];
              for (int i = 0; i < a.length; i++) {
                    this.a[i] = a[i];
            }
      }
}
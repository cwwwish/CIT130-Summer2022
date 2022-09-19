public class WrapperShallow {
        private int[] a;
        public WrapperShallow() {
              a = new int[3];
        }

        public WrapperShallow(WrapperShallow ws) {
              a = ws.a;
        }
  
        public String toString() {
              String str = "";
              for (int i = 0; i < a.length; i++) {
                    str += a[i] + " ";
              }

              return str.trim();
        }
  
        public boolean equals(Object other) {
              if (other instanceof WrapperShallow) {
                    WrapperShallow ws = (WrapperShallow) other;
                    if (a.length != ws.a.length) {
                          return false;
                    }
  
                    for (int i = 0; i < a.length; i++) {
                          if (a[i] != ws.a[i]) {
                                return false;
                          }
                    }
                    return true;
              }
              return false;
        }

        public void setArray(int[] a) {
              for (int i = 0; i < a.length && i < this.a.length; i++) {
                    this.a[i] = a[i];
              }
        }
  }

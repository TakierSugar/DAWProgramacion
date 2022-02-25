package POO.CutreClown;

public class Usuario{
        private int id = generadorDeId();
        private String email;
        private String password;

        public Usuario(int id, String email, String password) {
            this.id = id;
            this.email = email;
            this.password = password;
        }
        public Usuario(){
            this.id = generadorDeId();
            this.email = "Pocoyo@gmail.com";
            this. password = "1234";
        }

        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getEmail() {
            return email;
        }
        public void setEmail(String email) {
            this.email = email;
        }
        public String getPassword() {
            return password;
        }
        public void setPassword(String password) {
            this.password = password;
        }
        public int generadorDeId(){
            return id++;
        }
    }
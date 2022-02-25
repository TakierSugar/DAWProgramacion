package POO.CutreClown;


    
    public class Media{
        private int id = 0;
        private String nombre;
        private String contenido;
        private Mediatype tipo;
        private Usuario usuario;
        
        public Media(String nombre, String contenido, Mediatype tipo, Usuario usuario) {
            this.id = id++;
            this.nombre = nombre;
            this.contenido = contenido;
            switch(tipo){
                case Audio:
                tipo = Mediatype.Audio;
                case Video:
                tipo = Mediatype.Video;
                case Imagen:
                tipo = Mediatype.Imagen;
            }
            this.usuario = usuario;
        }
        public int getId() {
            return id;
        }
        public void setId(int id) {
            this.id = id;
        }
        public String getNombre() {
            return nombre;
        }
        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getContenido() {
            return contenido;
        }
        public void setContenido(String contenido) {
            this.contenido = contenido;
        }
        public Mediatype getTipo() {
            return tipo;
        }
        public void setTipo(Mediatype tipo) {
            this.tipo = tipo;
        }
        public Usuario getUsuario_id() {
            return usuario;
        }
        public void setUsuario_id(Usuario usuario) {
            this.usuario = usuario;
        }
        /*public void DeleteByName(String nombre){
            if (this.nombre == nombre)
                this.Media = null;
        }*/
        public enum Mediatype{
            Audio, Video, Imagen
        }
}
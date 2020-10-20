
public class Cliente {
	 public String id;
	    public String fone;
	   Cliente cliente;
	    public Cliente(String id, String fone){
	        this.id = id;
	        this.fone = fone;
	    }
	    public String toString(){
	        return id + ":" + fone;
	    }
		public boolean equals(String id, String fone) {
			
			this.id = id;
	        this.fone = fone;
			return false;

}

}

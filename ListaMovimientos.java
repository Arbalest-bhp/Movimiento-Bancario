public class ListaMovimientos{
	MovimientoBancario top;

	public boolean insertaPrimerNodo(MovimientoBancario element){
		if (top == null) { //La lista no está vacía
			//top = new MovimientoBancario();
			//top.name = dato;
            top = element;
			top.next = null;

			return true;
		}
		else {
			return false;
		}
	}

    

	public void imprimir(){
		for (MovimientoBancario temp = this.top; temp != null; temp = temp.next){
			System.out.print("[ " + temp.fechaHora + " " 
            + ((temp.tipo == 0) ? "-" + temp.monto: "+" + temp.monto) + " ] -> ");

            System.out.printf("[%ty%tm%td ###,##0.00]", temp.fechaHora, 
                temp.fechaHora, temp.fechaHora, ((temp.tipo == 0) ? temp.monto * -1: temp.monto) );
		}

		System.out.print("[X]\n"); 
	}

	public String toString(){
		String cadAux = "";
		for (MovimientoBancario temp = this.top; temp != null; temp = temp.next){
			cadAux += "[ " + temp.fechaHora + " "
            + ((temp.tipo == 0) ? "-" + temp.monto : "+" temp.monto " ] -> ";
		}

		cadAux += "[X]\n"; 

		return cadAux;
	}


	public void insertaAntesPrimerNodo(MovimientoBancario temp2){
		MovimientoBancario temp; 
		//temp = new MovimientoBancario ();
    	//temp.name = nombre;

        //temp = element;

		temp.next = this.top;
		this.top = temp;
		temp = null;
	}

	public void insertaAlFinal(MovimientoBancario temp){
		///MovimientoBancario temp = new MovimientoBancario ();
		//temp.name = nombre;
		//temp.next = null;
		//MovimientoBancario temp2;

		MovimientoBancario temp2 = this.top;

		while (temp2.next != null)
			temp2 = temp2.next;

		temp2.next = temp;
		temp = null;
		temp2 = null;
	}

    
    //It's best to utilize dates in order to insert and organize data
	public boolean insertaEntreNodos(MovimientoBancario temp){  //
		//MovimientoBancario temp = new MovimientoBancario();
		//temp.name = nombre;

		MovimientoBancario temp2 = this.top; //Nodo actual
			
			
		while((temp2 != null)
		      && temp2.fechaHora < temp.fechaHora ){
			temp2 = temp2.next;
		}
		if (temp2 != null){ //MovimientoBancario has been found
			temp.next = temp2.next;
			temp2.next = temp;
			temp = null;
			temp2 = null;
			return true;
		}
		else return false;
		
	}
    */
        
	//Removal of Nodes
	//Removing the first MovimientoBancario
	public void borrarPrimerNodo(){
		this.top = this.top.next;
	}
	
	//Removing a MovimientoBancario that is not the first
	public boolean borrarCualquierNodo(String buscado){
		MovimientoBancario temp = this.top;
		while((temp != null)
		      && temp.name.equals(buscado) == false){
			temp = temp.next;
		}
		if (temp != null){ //MovimientoBancario has been found
			temp.next = temp.next.next;
			temp = null;
			return true;
		}
		else return false;
		}

	//Eliminating the final MovimientoBancario of the list
	//Need to find the second to last MovimientoBancario of the list
	public void borrarUltimoNodo(){
	MovimientoBancario temp = top;
	//First make sure that the list does not only have one or no element
	    if (temp == null)
	          return null;
	    if (temp.next == null)
	          return null;
	                
            //Find the Penultimate MovimientoBancario
            while (temp.next.next != null)
		temp = temp.next;
            //Once found, erase the last MovimientoBancario
            temp.next = null;
        }


	//Eliminate a MovimientoBancario by key value
	
	/*To remove a MovimientoBancario
	top = top.next*/
}
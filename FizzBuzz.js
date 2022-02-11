
const FizzBuzz = ({testgama}) => {
   
   let nombre = []
   for (let i = 0; i <100; i++) 
   {
          nombre[i] = i+1             
                        
    }
    function multipleTois(n) 
    {
       if (n % 3 == 0) 
       {
           return true
       }
       else{
           return false
       } 
    }
    function multipleCinq(n) 
    {
       if (n % 5 == 0) 
       {
           return true
       }
       else{
           return false
       } 
    }
    function multipleCinqEtTrois(n) 
    {
       if (n % 5 == 0 && n % 3==0) 
       {
           return true
       }
       else{
           return false
       } 
    }
    function contienTrois(n) 
    {
        var nbr = " "+n
        var ok = false
        for (let i = 0; i <nbr.length ; i++) 
        {
           if(nbr.charAt(i)=='3') {
               ok =true
               break
           }
            
        }
        return ok
       
    }
    function contienCinq(n) 
    {
        var nbr = " "+n
        var ok = false
        for (let i = 0; i <nbr.length ; i++) 
        {
           if(nbr.charAt(i)=='5') {
               ok =true
               break
           }
            
        }
        return ok
       
    }
testgama= "gama"
 return (
            <div>
                
                {  
                  nombre.map((nb)=>(
                      
                      <div>
                          {
                          multipleTois(nb) && !multipleCinqEtTrois(nb)? <p>Fizz</p>:<p>{nb}</p> &&
                           multipleCinq(nb) && !multipleCinqEtTrois(nb) ? <p>Buzz</p>:<p>{nb}</p>&&
                           multipleCinqEtTrois(nb) ? <p>FizzBuzz</p>: <p>{nb}</p>&&
                           contienTrois(nb)? <p>Fizz</p>:<p>{nb}</p> &&
                           contienCinq(nb)? <p>Buzz</p>:<p>{nb}</p>
                          }
                          
                      </div>
                  ))
               }
            </div>
      );
}
 
export default FizzBuzz;

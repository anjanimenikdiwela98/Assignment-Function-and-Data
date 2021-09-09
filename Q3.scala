class account(idNumber:String,accountNumber:Int,accountBalance:Double){
	def nicNumber=idNumber
	def accNumber=accountNumber
	def accBalance=accountBalance

	def withdraw(amount:Double)= new account(this.nicNumber,this.accNumber,this.accBalance-amount) 
	def deposit(amount:Double)= new account(this.nicNumber,this.accNumber,this.accBalance+amount)
	def transfer(Acc:account,amount:Double)={
	  if(this.accBalance>amount){
		  val transferAcc = this.withdraw(amount)
		  val transferedAcc = Acc.deposit(amount)
      
      println("Transfer=>  "+transferAcc)
		  println("Transfered=>  "+transferedAcc)
	  }
    else{
		  println("Your account balnce is not sufficient.")
	  }
	  
  }
  
  
  override def toString= "NIC: "+nicNumber+"  Account No: "+accNumber+"  Balance: "+accBalance
}

object Q3 extends App{
		println("\t   Bank Tranfer")

		var acc1 = new account("S123",1000,35000)
		var acc2 = new account("S124",1001,10000)

		acc1.transfer(acc2,10000)
	
}

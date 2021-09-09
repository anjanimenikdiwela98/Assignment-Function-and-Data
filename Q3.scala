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
      
      		println("The account which transfer the money=>  "+transferAcc)
		println("The account which get the money=>  "+transferedAcc)
	  }
    	  else{
		println("Your account balnce is not sufficient.")
	  }
	  
  }
  
  
  override def toString= "NIC: "+nicNumber+"  Account No: "+accNumber+"  Balance: "+accBalance
}

object Q3 extends App{
		println("\t   Bank Tranfer")

		var acc1 = new account("98745612V",1000,35000)
		var acc2 = new account("68745125V",1001,12000)

		acc1.transfer(acc2,10000)
	
}

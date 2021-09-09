class account(idNumber:String,accountNumber:Int,accountBalance:Double)
{
	def nicNumber=idNumber
	def accNumber=accountNumber
	def accBalance=accountBalance
}

object Q4
{
	def main(args:Array[String])
	{
		println("*******Overdraft----Total Balance----Interest*********")

		var acc1=new account("98745612V",1001,25000)
		var acc2=new account("95412365V",1002,10000)
		var acc3=new account("75412368V",1003,50000)
		var acc4=new account("69854122V",1004,-1000)
		var acc5=new account("92146385V",1005,-10000)
		var acc6=new account("85123698V",1006,12000)
		val bank:List[account]=List(acc1,acc2,acc3,acc4,acc5,acc6)

		print("Overdraft account numbers   : ")
		var ODlist=overdraft(bank)
		ODlist.foreach(x=>print(x.accNumber+"   "))

		var tBalance=balance(bank)
		print("\nTotal account balance       : Rs."+tBalance.accBalance)

		println("\nAccount balances after interest")
		var interestList=interest(bank)
		interestList.foreach(x=>println("Rs. "+x))
		
		println("\n-------------------------------------")
	}

	val overdraft=(list:List[account])=>list.filter(x=>x.accBalance<=0)
	val balance=(list:List[account])=>list.reduce((x,y)=>new account("00000V",00001,x.accBalance+y.accBalance))
	val interest=(list:List[account])=>list.map(x=>(if(x.accBalance>0) x.accBalance*1.05d else x.accBalance*1.1d))
}

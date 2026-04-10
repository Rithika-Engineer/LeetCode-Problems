select u.name as NAME,sum(t.amount)as BALANCE from Users as u join Transactions as t 
on t.account=u.account  group by u.name,t.account having sum(t.amount)>10000;

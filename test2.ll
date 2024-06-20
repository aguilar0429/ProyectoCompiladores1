%number = alloca  i32
%result = alloca  i32
declare i32 @fact (i32 %n) {
	%i = alloca  i32
	%answer = alloca  i32
	store i32 1, i32* %answer
	%compare = icmp  sgt 	
	br i1 %compare, label %if_true, label %end_if
if_true:
		null	end_if:
}

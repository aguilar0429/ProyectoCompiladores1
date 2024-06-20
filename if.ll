%number = alloca  i32
loop_check:
	%compare = icmp  eq  %number, %0
	br i1 %compare, label %loop_body, label %loop_end
loop_body
	nullloop_end:
loop_check:
	%compare = icmp  slt  %number, %0
	br i1 %compare, label %loop_body, label %loop_end
loop_body
	nullloop_end:

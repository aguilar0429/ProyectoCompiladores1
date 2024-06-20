%lenght = alloca  i32
%i = alloca  i32
%j = alloca  i32
%x = alloca  i32
%y = alloca  i32
%cont = alloca  i32
%z = alloca  i32
%s = constant [256 * i8]%counter = alloca i32
store i32 x, i32* %counter
br label loop_check
loop_check
	%current_value = load i32, i32* %counter
	%comparison = icmp slt i32, %current_value, 1
	br i1 %compare_result, label %loop_body, label %loop_end
loop_body:
	nullloop_end:%counter = alloca i32
store i32 1, i32* %counter
br label loop_check
loop_check
	%current_value = load i32, i32* %counter
	%comparison = icmp slt i32, %current_value, 0
	br i1 %compare_result, label %loop_body, label %loop_end
loop_body:
	null	nullloop_end:loop_check:
	%compare = icmp  ne  %cont, %lenght
	br i1 %compare, label %loop_body, label %loop_end
loop_body
	null	nullloop_end:

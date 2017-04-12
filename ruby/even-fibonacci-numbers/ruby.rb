
#By considering the terms in the Fibonacci sequence whose values do not exceed
#four million, find the sum of the even-valued terms.

def even_fibonacci_numbers(maxNumber)

  sum = 0

  previous_num = 1
  current_num = 2

  while(current_num < maxNumber)

    if(even?(current_num))
      sum += current_num
    end

    temp_current_num = current_num
    current_num += previous_num
    previous_num = temp_current_num

  end

  return sum

end

def even?(num)
  return num % 2 == 0
end

puts even_fibonacci_numbers(4000000)

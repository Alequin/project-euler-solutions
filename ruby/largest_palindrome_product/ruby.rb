
#Find the largest palindrome made from the product of two 3-digit numbers.

def largest_palindrome_product()

  num1 = 999
  num2 = 999
  max_palindrome = 0

  while(num2 >= 100)
    while(num1 >= num2)
      product = num1*num2
      if( number_palindrome?(product) && max_palindrome < product)
        max_palindrome = product
      end
      num1 -= 1
    end
    num1 = 999
    num2 -=1
  end

  puts max_palindrome
end

def number_palindrome?(number)

  num_as_string = number.to_s
  length = num_as_string.length

  if(!even?(length))
    return false
  end

  index = 0
  while(index < length/2)
    opposite_index = (length-1)-index
    if(num_as_string[index] != num_as_string[opposite_index])
      return false
    end
    index += 1
  end

  return true
end

def even?(num)
  return num % 2 == 0
end

puts largest_palindrome_product()

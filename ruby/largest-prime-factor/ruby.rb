
#What is the largest prime factor of the number 600851475143 ?

def largest_prime_factor(number)

  prime_factors = Array.new

  while(!prime?(number) && number != 1)

    (0..Math.sqrt(number)).each { |num|
      if(prime?(num))
        if(number % num == 0)
          prime_factors.push(num)
          number = number / num
        end
      end
    }
  end

  # The loop will stop when number is prime. This number is also a prime factors
  # of the input and should be added to the array
  prime_factors.push(number)

  puts get_max_number(prime_factors)

end

def prime?(number_to_check)

  if(number_to_check % 2 == 0)
    return number_to_check == 2
  end

  square_root = Math.sqrt(number_to_check)
  if(square_root < 3)
   square_root = 3
  end

  (3..square_root).each { |num|
    if(!even?(num) && num != number_to_check)
        if(number_to_check % num == 0)
          return false
        end
    end
  }

  return true
end

def get_max_number(numbers)

  max_number = 0

  numbers.each { |num|
    if(max_number < num)
      max_number = num
    end
  }

  return max_number

end

def even?(number)
  return number % 2 == 0
end


puts largest_prime_factor(100)

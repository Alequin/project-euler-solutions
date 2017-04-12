
#find the sum of all number that are multiples of 3 and 5 and less then 1000

def sum_3_and_5_multiples(maxNumber)

  sum = 0

  (1..maxNumber-1).each { |num|

    if(num % 3 == 0 || num % 5 == 0)
      sum += num
    end
  }

  return sum

end

puts sum_3_and_5_multiples(1000)

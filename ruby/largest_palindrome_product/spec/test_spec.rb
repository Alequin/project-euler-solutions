require_relative "../ruby"

describe "number_palindrome?" do

  it "returns true for 9009" do
    expect(number_palindrome?(9009)).to eq(true)
  end

  it "returns true for 890098" do
    expect(number_palindrome?(890098)).to eq(true)
  end

  it "returns false for 123456" do
    expect(number_palindrome?(123456)).to eq(false)
  end

  it "returns false for 1" do
    expect(number_palindrome?(1)).to eq(false)
  end

end

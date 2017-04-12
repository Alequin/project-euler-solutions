require_relative "../ruby"

describe "prime?" do

  it "returns false when input is 4" do
    expect(prime?(4)).to eq(false)
  end

  it "returns false when input is 4" do
    expect(prime?(6)).to eq(false)
  end

  it "returns false when input is 4" do
    expect(prime?(3)).to eq(true)
  end

  it "returns false when input is 4" do
    expect(prime?(5)).to eq(true)
  end

  it "returns true when input is 11" do
    expect(prime?(11)).to eq(true)
  end

end

describe "max_number" do

  it "return 4" do
    expect(get_max_number([1,2,3,4])).to eq(4)
  end

  it "return 60" do
    expect(get_max_number([1,6,3,2,6,16,60])).to eq(60)
  end

end

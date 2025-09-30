hello = "hi mom"
puts hello
class Human
  @@human_population = 0

  attr_accessor:face

  def initialize()
    @dna = Random.rand
    @face = "winking face emoji"
  end

  def quack()
    puts "quack!".upcase()
  end
end

jeff = Human.new

puts jeff.quack
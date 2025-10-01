# escape characters

# puts "Hello \n\nHello"

# interpolation

# name = "odin"

# puts "Hello, #{name}"

puts "string" == "string"

"string".object_id == "string".object_id  #=> false

# this returns false because each new string object has a different object_id.
# so even though both strings contain the same value ("string") they are different objects in memory so they have different object IDs

:symbol.object_id == :symbol.object_id    #=> true

# this returns true because ruby is creating only one object here and so it'll have the same object_id when called again - ruby is reusing the exact same object in memory
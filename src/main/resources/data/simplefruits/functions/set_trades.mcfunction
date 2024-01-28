# Called by: simplefruits:tick
# @s: minecraft:villager

data modify entity @s[predicate=simplefruits:villager_type/plains] Offers.Recipes[{sell:{id:"minecraft:apple"}}] set value {xp:5,buy:{id:"minecraft:emerald",Count:1b},sell:{id:"minecraft:apple",Count:4b},maxUses:8,rewardExp:1b,priceMultiplier:0.05f}
data modify entity @s[predicate=simplefruits:villager_type/desert] Offers.Recipes[{sell:{id:"minecraft:apple"}}] set value {xp:5,buy:{id:"minecraft:emerald",Count:1b},sell:{id:"simplefruits:orange",Count:4b},maxUses:8,rewardExp:1b,priceMultiplier:0.05f}
data modify entity @s[predicate=simplefruits:villager_type/taiga] Offers.Recipes[{sell:{id:"minecraft:apple"}}] set value {xp:5,buy:{id:"minecraft:emerald",Count:1b},sell:{id:"simplefruits:pear",Count:4b},maxUses:8,rewardExp:1b,priceMultiplier:0.05f}
data modify entity @s[predicate=simplefruits:villager_type/snow] Offers.Recipes[{sell:{id:"minecraft:apple"}}] set value {xp:5,buy:{id:"minecraft:emerald",Count:1b},sell:{id:"minecraft:baked_potato",Count:4b},maxUses:12,rewardExp:1b,priceMultiplier:0.05f}
data modify entity @s[predicate=simplefruits:villager_type/jungle] Offers.Recipes[{sell:{id:"minecraft:apple"}}] set value {xp:5,buy:{id:"minecraft:emerald",Count:1b},sell:{id:"simplefruits:banana",Count:4b},maxUses:8,rewardExp:1b,priceMultiplier:0.05f}
data modify entity @s[predicate=simplefruits:villager_type/swamp] Offers.Recipes[{sell:{id:"minecraft:apple"}}] set value {xp:5,buy:{id:"minecraft:emerald",Count:1b},sell:{id:"simplefruits:plum",Count:4b},maxUses:8,rewardExp:1b,priceMultiplier:0.05f}
data modify entity @s[predicate=simplefruits:villager_type/savanna] Offers.Recipes[{sell:{id:"minecraft:apple"}}] set value {xp:5,buy:{id:"minecraft:emerald",Count:1b},sell:{id:"simplefruits:fig",Count:4b},maxUses:8,rewardExp:1b,priceMultiplier:0.05f}

tag @s add sf.checked
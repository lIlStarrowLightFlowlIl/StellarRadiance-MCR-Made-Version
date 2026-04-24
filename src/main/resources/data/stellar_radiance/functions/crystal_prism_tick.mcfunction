#这些是控制水晶的朝向的
execute as @e[type=stellar_radiance:active_crystal] at @s run data merge entity @s {NoAI:1b}
execute as @e[type=stellar_radiance:active_crystal] at @s if entity @p[nbt={SelectedItem:{id:"stellar_radiance:prism_controller"}},distance=..1] run data modify entity @s Rotation set from entity @p[nbt={SelectedItem:{id:"stellar_radiance:prism_controller"}},distance=..1] Rotation

#无线发射器

#无线发射器-红石
execute as @e[type=stellar_radiance:active_crystal] at @s if block ~ ~-2 ~ #stellar_radiance:fsqactiver if block ~ ~-1 ~ #stellar_radiance:fsq run fill ~ ~-1 ~ ~ ~-1 ~ stellar_radiance:crystal_wireless_transmitter_on
execute as @e[type=stellar_radiance:active_crystal] at @s if block ~ ~-2 ~ #stellar_radiance:fsqactiver if block ~ ~-1 ~ #stellar_radiance:fsq run playsound minecraft:block.beacon.ambient ambient @a ~ ~ ~ 1 1 0
execute as @e[type=stellar_radiance:active_crystal,tag=!stellar_radiance.receving] at @s unless block ~ ~-2 ~ #stellar_radiance:fsqactiver if block ~ ~-1 ~ #stellar_radiance:fsq run fill ~ ~-1 ~ ~ ~-1 ~ stellar_radiance:crystal_wireless_transmitter

#无线发射器-接受信号
execute as @e[type=stellar_radiance:active_crystal,tag=stellar_radiance.receving] at @s if block ~ ~-1 ~ #stellar_radiance:fsq run fill ~ ~-1 ~ ~ ~-1 ~ stellar_radiance:crystal_wireless_transmitter_on
execute as @e[type=stellar_radiance:active_crystal,tag=stellar_radiance.receving] at @s if block ~ ~-1 ~ #stellar_radiance:fsq run playsound minecraft:block.beacon.ambient ambient @a ~ ~ ~ 1 1 0

#发射信号(请忽略这些抽象的命名)
execute as @e[type=stellar_radiance:active_crystal,tag=!stellar_radiance.receving] at @s if block ~ ~-1 ~ stellar_radiance:crystal_wireless_transmitter_on anchored eyes run function stellar_radiance:fsq/fsq
execute as @e[type=stellar_radiance:active_crystal,tag=stellar_radiance.receving] at @s if block ~ ~-1 ~ #stellar_radiance:fsq anchored eyes run function stellar_radiance:fsq/fsq

execute as @e[type=stellar_radiance:active_crystal] at @s unless block ~ ~-1 ~ #stellar_radiance:fsq_jsq run tag @s remove stellar_radiance.receving
execute as @e[type=stellar_radiance:active_crystal,tag=!stellar_radiance.receving_imedently,tag=stellar_radiance.receving] at @s run playsound minecraft:block.respawn_anchor.deplete ambient @a ~ ~ ~ 1 1 0


#无线接收器

execute as @e[type=stellar_radiance:active_crystal,tag=!stellar_radiance.receving] at @s if block ~ ~-1 ~ #stellar_radiance:jsq run fill ~ ~-1 ~ ~ ~-1 ~ stellar_radiance:crystal_wireless_recever

#无线接收器-接受信号
execute as @e[type=stellar_radiance:active_crystal,tag=stellar_radiance.receving] at @s if block ~ ~-1 ~ #stellar_radiance:jsq anchored eyes run particle minecraft:electric_spark ~ ~ ~ 0.5 0.5 0.5 0 3 force

execute as @e[type=stellar_radiance:active_crystal,tag=stellar_radiance.receving] at @s if block ~ ~-1 ~ #stellar_radiance:jsq run fill ~ ~-1 ~ ~ ~-1 ~ stellar_radiance:crystal_wireless_recever_on
execute as @e[type=stellar_radiance:active_crystal,tag=stellar_radiance.receving] at @s if block ~ ~-1 ~ #stellar_radiance:jsq run playsound minecraft:block.beacon.ambient ambient @a ~ ~ ~ 1 1 0




execute as @e[type=stellar_radiance:active_crystal,tag=!stellar_radiance.receving_imedently] at @s run tag @s remove stellar_radiance.receving
tag @e[type=stellar_radiance:active_crystal] remove stellar_radiance.receving_imedently
tag @e[distance=..1,type=stellar_radiance:active_crystal] add stellar_radiance.receving_imedently
execute as @e[distance=..1,type=stellar_radiance:active_crystal] at @s if block ~ ~-1 ~ #stellar_radiance:fsq_jsq run tag @s add stellar_radiance.receving

execute if entity @e[distance=..1,tag=crystal_jh] run particle minecraft:dragon_breath ~ ~ ~ 0 0 0 0.05 3 force
execute if entity @e[distance=..1,tag=crystal_fs] run particle minecraft:dragon_breath ~ ~ ~ 0 0 0 0.05 3 force
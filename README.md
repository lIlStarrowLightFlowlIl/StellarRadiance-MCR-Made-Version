

# StellarRadiance-MCR-Made-Version
## 星·辉 - 旧版

- 这是《星·辉》（StellarRadiance）Minecraft 模组的开源仓库
- This is the open-source repository for the Minecraft mod **StellarRadiance**

---

<details open>
<summary><b>中文</b></summary>

# 模组简介

**星·辉**是一个冒险类的模组，在模组的 1.1.21 版本之前中文名称为“-星·辉-”。

添加了三个新的生物群系，一个新的维度和相关方块、物品、实体等；同时也有部分专门服务于指令（或数据包）玩家的功能。

这个模组目前仅支持中文，由于我当时糟糕的外语水平，它的英文翻译和命名空间id都弄得很糟糕，是英文和汉语拼音混杂的东西……

---
## 主要内容

### 生物群系

星辉森林：生物群系，会生成星辉木（可能看久了会眼睛疼），化石和裸露的矿石。

水晶丘陵：生长着巨型水晶的群系，只在星辉之域生成。

星辉平原：更改了一些颜色，并且没有树的星辉森林，其余生成设置基本不变，通常伴随星辉森林一同出现。

### 星辉之域

新维度，由浮空岛、水晶丘陵和星辉森林组成。

### 星影合金装备

穿在身上的每件护甲 +10 护甲值。物品初级星影权杖集合了绝大部分工具的功能，并可以远程攻击。

物品星影神枪有超高额的伤害，并且在将游戏规则 spearRemoveEntity 设置为 true 之后会尝试删除攻击到的实体，若在此状态下攻击这个世界自然生成的第一条末影龙，将有可能出现一些 Bug（此时需要重新召唤末影龙并用正常手段击杀），但是合成很繁琐，定位是给创造模式玩家使用的武器。

### 命令相关

在玩星·辉的时候，如果你打开按键绑定，你会发现多了9个按键，命名是清一色的“成就触发器+按键”，它们是便捷的，检测玩家按键动作的触发器。

这九个按键都分别绑定了两个固定名称的进度，其中一个会在玩家按下对应按键的时候获得，名称中包含_1，另一个会在玩家松开的时候获得，名称中包含_2。

我在v1.2.1的发布中附上了一个名为demo.zip的文件，这是一个数据包，可以放到你的地图中的“datapacks”文件夹里，进入游戏并输入/reload可以快速地应用这些功能，并且将你操作按键的动作输出到记分板中。（虽然这个数据包里头有一些冗余的东西……）

我新增了几条指令，它们分别是：

1. /removeentity <target>:

可以删除指定实体，如果实体为玩家，则效果为杀死玩家。

2. /KILL <target>:

全为大写的KILL，比原版更加强力（执行原版kill，同时执行血量更改为0的操作），这可以杀死一些通过特殊手段将伤害吸收的属性设置成无限，以规避/kill造成的伤害的实体。

5. /runcommand <pos> <area> <command> :

指定一个位置，让范围内所有实体执行一条命令，这个范围检测是方形的，并且一些已经死亡但遗体并未被清除的实体也可以被检测到。

7. /explosion <pos> <level> <type> :

在指定位置制造强度为<level>的爆炸，<type>可以设置为none/block/mob/tnt，有细微的效果差别（例如能否通过原版gamerule禁止其破坏方块）

9. /playerfly <name> <T|F> :

为了与一些常见的/fly指令区分，使用了更加繁琐的写法，实际功能并无什么区别。可以给予或剥夺某名玩家的飞行权限，对本来就能飞行的游戏模式似乎无效。

我新增了几条游戏规则，它们分别是：

1. `cleardeadentities`：
反黑客机制，用于自动清除已死亡但未被系统移除的实体，避免实体残留占用游戏性能。

2. `nexusexplosionwhendie`：
设置为true时，星辰能量节点（Boss生物）在死亡时会发生爆炸。

3. `enableentityclearance`：
当密码正确时，/removeentity指令可以使用（密码为114514）。

4. `modentityspeaking`：
开启后，右键"作者的oc（分身）"实体可以令其说话。

5. `spearremoveentity`：
开启后，星影神枪会试图删除击中的实体。

6. `sendplayerflymessageback`：
与模组`/playerfly`指令配套，开启后会向玩家回显飞行权限变更的消息反馈。

7. `woodparasiteevents`：
为false的时候，禁用生成星辉木寄生兽（敌对生物）的检测。

8. `entitynamemaxlength`：
避免用特殊手段设置的过长名称给游戏带来严重卡顿，是一种反黑客机制。

9. `setablocknoai`：
ABlock是一种没有模型，碰撞箱大小可调的生物，开启后自动为生物添加`{NoAI:1b}`的NBT标签。

---

这个模组同时也在中国版我的世界发布，（为了以防万一，）应（中国版代理）官方要求，我会附上指向（中国版代理）官方的网址：http://mc.163.com/

- 适配版本：Minecraft Java Edition 1.20.1

- 前置依赖：Forge + Geckolib

---

## 说明
- 绝大部分功能由MCreator自动生成

- 以下内容不是用MCR生成的：
  - 材质与模型
  - 自定义维度
  - 内置数据包

---

## 未来计划
- 我计划在未来几个月或几年内，从零开始重制《星·辉》模组。AWA (这就是为什么我要在这里写“MCR-Made-Version”)

- 重置版将不依赖任何模组生成器（吧）


</details>

<details>
<summary><b>English</b></summary>

# About the Mod
*The English text is AI-generated and may contain errors.*

**StellarRadiance** is an adventure-themed mod.

It adds three new biomes, one new dimension, as well as corresponding blocks, items, entities and more. It also includes exclusive features specially made for command and datapack players.

This mod only supports Chinese for now. Due to my poor English skills , its English translations and namespace IDs are very rough, mixed with broken English and Chinese Pinyin……

---
## Main Content

### Biomes

Stellar Radiance Forest: A new biome that generates *Stellar Radiance Trees* (which may cause eye strain after looking at it for a long time), fossils and exposed ores.

Stellar Crystal Lands：A biome covered with giant crystals, it only generates within the Stellar Radiance Dimension.

Stellar Plains: A treeless variant of Stellar Radiance Forest with adjusted color hues. It retains most generation settings and usually generates alongside the Stellar Radiance Forest.

### Stellar Radiance Dimension

A brand-new dimension composed of floating islands, *Stellar Crystal Lands* and *Stellar Radiance Forest* biomes.

### Starshadow Alloy Equipment

Every piece of this armor set grants +10 armor. The *Basic Stellar Spear* integrates most tool functions and supports ranged attacks.

The *Stellar God Spear* deals extremely high damage. When the gamerule `spearRemoveEntity` is set to true, it will attempt to delete any hit entity. If you attack the naturally spawned Ender Dragon under this condition, some bugs may occur. (You will need to respawn the Ender Dragon and defeat it through normal means.) It has complex crafting recipes and is designed for creative mode players.

### Commands

While playing StellarRadiance, open your control settings and you will see nine additional keybinds uniformly named *成就触发器 + Key*. They are practical triggers for detecting player keyboard and mouse inputs.

Each keybind is linked to two fixed advancements: one with `_1` in its ID is unlocked when the key is pressed, and the other with `_2` is unlocked when the key is released.

I have attached a file named demo.zip in the v1.2.1 release. This is a datapack. Place it in the `datapacks` folder of your world, join the world and run the `/reload` command to quickly enable all features and output your key operation actions to scoreboards. (This datapack still contains some redundant content……)

I have added several custom commands as follows:

1. /removeentity <target>:

Removes the target entity. If the target is a player, this command has the same effect as using /kill on them.

2. /KILL <target>:

Fully capitalized /KILL command, more powerful than the vanilla /kill. It executes the original vanilla kill logic and directly sets the target's health to zero. It can eliminate entities that exploit special methods to set their AbsorptionAmount attribute to infinite, so as to evade the damage dealt by the vanilla /kill command.

5. /runcommand <pos> <area> <command> :

Specify a position and a square area to make all entities within the range execute a specific command. This detection also includes dead entities whose remains have not yet been cleared.

7. /explosion <pos> <level> <type> :

Creates an explosion of specified power at the given position. The <type> parameter supports none/block/mob/tnt with subtle differences, such as whether block destruction can be restricted by vanilla gamerules.

9. /playerfly <name> <T|F> :

This command adopts a unique naming scheme to avoid conflicts with common /fly commands, while retaining identical core functions. It grants or revokes flight permission for specific players, and does not take effect on game modes with built-in flying abilities.

I have added several custom gamerules as follows:

1. `cleardeadentities`：Anti-cheat mechanism that automatically cleans up dead but persistent entities to reduce server and client performance overhead.

2. `nexusexplosionwhendie`：When set to true, the Star Energy Nexus boss will trigger an explosion on death.

3. `enableentityclearance`：Unlocks the /removeentity command after entering the correct password (Password: 114514).

4. `modentityspeaking`：Right-click the "Author's OC (Clone)" entity to trigger its dialogue and speech when enabled.

5. `spearremoveentity`：The Starshadow God Spear will directly remove hit entities from the world when this rule is enabled.

6. `sendplayerflymessageback`：Works with the /playerfly command to send prompt messages to players when flight access is modified.

7. `woodparasiteevents`：Disables the spawn logic and detection of hostile Starlight Wood Parasite creatures when set to false.

8. `entitynamemaxlength`：Restricts the maximum length of entity names to prevent game lag and exploits from modified ultra-long name tags.

9. `setablocknoai`：ABlock is a modelless entity with adjustable collision bounds, this rule applies the {NoAI:1b} NBT tag to disable its artificial intelligence.

---

This mod is also released on Minecraft China Edition. In accordance with official platform requirements, the official website of Minecraft China Edition is attached below: http://mc.163.com/

- Supported Version: Minecraft Java Edition 1.20.1

- Dependencies: Forge Mod Loader + Geckolib

---

## Note
- Most functions of this mod are automatically generated by MCreator

- The following content is independently produced:
  - Textures & models
  - Custom dimensions
  - Built-in datapacks

---

## Future Plans
- I plan to fully remake StellarRadiance from scratch in the coming months or years. AWA (This is why this repository is marked as "MCR-Made-Version".)

- The remastered version will not rely on any mod generators (probably)


</details>


# StellarRadiance-MCR-Made-Version
## 星·辉 - 旧版

> 语言切换：[简体中文](#zh) | [English](#en)

---

<h2 id="zh">🇨🇳 简体中文</h2>

# 模组简介

**星·辉**是一个冒险类的模组，在模组的 1.1.21 版本之前中文名称为“-星·辉-”。

添加了三个新的生物群系，一个新的维度和相关方块、物品、实体等；同时也有部分专门服务于指令（或数据包）玩家的功能。

这个模组目前仅支持中文，由于我当时糟糕的外语水平，它的英文翻译和命名空间id都弄得很糟糕，是英文和汉语拼音混杂的东西……

---
## 主要内容

### 生物群系

星辉森林：生物群系，会生成星辉木（可能看久了会眼睛疼），化石和裸露的矿石。

水晶丘陵：生长着巨型水晶的群系，只在星辉之域生成。

星辉平原：更改了一些颜色，并且没有树的星辉森林，其余生成设置基本不变，通常伴随星辉森林一同出现。

### 星辉之域

新维度，由浮空岛、水晶丘陵和星辉森林组成。

### 星影合金装备

穿在身上的每件护甲 +10 护甲值。物品初级星影权杖集合了绝大部分工具的功能，并可以远程攻击。

物品星影神枪有超高额的伤害，并且在将游戏规则 spearRemoveEntity 设置为 true 之后会尝试删除攻击到的实体，若在此状态下攻击这个世界自然生成的第一条末影龙，将有可能出现一些 Bug（此时需要重新召唤末影龙并用正常手段击杀），但是合成很繁琐，定位是给创造模式玩家使用的武器。

### 命令相关

在玩星·辉的时候，如果你打开按键绑定，你会发现多了9个按键，命名是清一色的“成就触发器+按键”，它们是便捷的，检测玩家按键动作的触发器。

这九个按键都分别绑定了两个固定名称的进度，其中一个会在玩家按下对应按键的时候获得，名称中包含_1，另一个会在玩家松开的时候获得，名称中包含_2。

我在v1.2.1的发布中附上了一个名为demo.zip的文件，这是一个数据包，可以放到你的地图中的“datapacks”文件夹里，进入游戏并输入/reload可以快速地应用这些功能，并且将你操作按键的动作输出到记分板中。（虽然这个数据包里头有一些冗余的东西……）

我新增了几条指令，它们分别是：

1. /removeentity <target>:

可以删除指定实体，如果实体为玩家，则效果为杀死玩家。

2. /KILL <target>:

全为大写的KILL，比原版更加强力（执行原版kill，同时执行血量更改为0的操作），这可以杀死一些通过特殊手段将伤害吸收的属性设置成无限，以规避/kill造成的伤害的实体。

5. /runcommand <pos> <area> <command> :

指定一个位置，让范围内所有实体执行一条命令，这个范围检测是方形的，并且一些已经死亡但遗体并未被清除的实体也可以被检测到。

7. /explosion <pos> <level> <type> :

在指定位置制造强度为<level>的爆炸，<type>可以设置为none/block/mob/tnt，有细微的效果差别（例如能否通过原版gamerule禁止其破坏方块）

9. /playerfly <name> <T|F> :

为了与一些常见的/fly指令区分，使用了更加繁琐的写法，实际功能并无什么区别。可以给予或剥夺某名玩家的飞行权限，对本来就能飞行的游戏模式似乎无效。

我新增了几条游戏规则，它们分别是：

1. `cleardeadentities`：
反黑客机制，用于自动清除已死亡但未被系统移除的实体，避免实体残留占用游戏性能。

2. `nexusexplosionwhendie`：
设置为true时，星辰能量节点（Boss生物）在死亡时会发生爆炸。

3. `enableentityclearance`：
当密码正确时，/removeentity指令可以使用（密码为114514）。

4. `modentityspeaking`：
开启后，右键"作者的oc（分身）"实体可以令其说话。

5. `spearremoveentity`：
开启后，星影神枪会试图删除击中的实体。

6. `sendplayerflymessageback`：
与模组`/playerfly`指令配套，开启后会向玩家回显飞行权限变更的消息反馈。

7. `woodparasiteevents`：
为false的时候，禁用生成星辉木寄生兽（敌对生物）的检测。

8. `entitynamemaxlength`：
避免用特殊手段设置的过长名称给游戏带来严重卡顿，是一种反黑客机制。

9. `setablocknoai`：
ABlock是一种没有模型，碰撞箱大小可调的生物，开启后自动为生物添加`{NoAI:1b}`的NBT标签。

---

这个模组同时也在中国版我的世界发布，（为了以防万一，）应（中国版代理）官方要求，我会附上指向（中国版代理）官方的网址：http://mc.163.com/

- 适配版本：Minecraft Java Edition 1.20.1

- 前置依赖：Forge + Geckolib

---

## 说明
- 绝大部分功能由MCreator自动生成

- 以下内容不是用MCR生成的：
  - 材质与模型
  - 自定义维度
  - 内置数据包

---

## 未来计划
- 我计划在未来几个月或几年内，从零开始重制《星·辉》模组。AWA (这就是为什么我要在这里写“MCR-Made-Version”)

- 重置版将不依赖任何模组生成器（吧）



---

<h2 id="en">🇺🇸 English</h2>

# About the Mod
*The English text is AI-generated and may contain errors.*

**StellarRadiance** is an adventure-themed mod.

It adds three new biomes, one new dimension, as well as corresponding blocks, items, entities and more. It also includes exclusive features specially made for command and datapack players.

This mod only supports Chinese for now. Due to my poor English skills , its English translations and namespace IDs are very rough, mixed with broken English and Chinese Pinyin……

---
## Main Content

### Biomes

Stellar Radiance Forest: A new biome that generates *Stellar Radiance Trees* (which may cause eye strain after looking at it for a long time), fossils and exposed ores.

Stellar Crystal Lands：A biome covered with giant crystals, it only generates within the Stellar Radiance Dimension.

Stellar Plains: A treeless variant of Stellar Radiance Forest with adjusted color hues. It retains most generation settings and usually generates alongside the Stellar Radiance Forest.

### Stellar Radiance Dimension

A brand-new dimension composed of floating islands, *Stellar Crystal Lands* and *Stellar Radiance Forest* biomes.

### Starshadow Alloy Equipment

Every piece of this armor set grants +10 armor. The *Basic Stellar Spear* integrates most tool functions and supports ranged attacks.

The *Stellar God Spear* deals extremely high damage. When the gamerule `spearRemoveEntity` is set to true, it will attempt to delete any hit entity. If you attack the naturally spawned Ender Dragon under this condition, some bugs may occur. (You will need to respawn the Ender Dragon and defeat it through normal means.) It has complex crafting recipes and is designed for creative mode players.

### Commands

While playing StellarRadiance, open your control settings and you will see nine additional keybinds uniformly named *成就触发器 + Key*. They are practical triggers for detecting player keyboard and mouse inputs.

Each keybind is linked to two fixed advancements: one with `_1` in its ID is unlocked when the key is pressed, and the other with `_2` is unlocked when the key is released.

I have attached a file named demo.zip in the v1.2.1 release. This is a datapack. Place it in the `datapacks` folder of your world, join the world and run the `/reload` command to quickly enable all features and output your key operation actions to scoreboards. (This datapack still contains some redundant content……)

I have added several custom commands as follows:

1. /removeentity <target>:

Removes the target entity. If the target is a player, this command has the same effect as using /kill on them.

2. /KILL <target>:

Fully capitalized /KILL command, more powerful than the vanilla /kill. It executes the original vanilla kill logic and directly sets the target's health to zero. It can eliminate entities that exploit special methods to set their AbsorptionAmount attribute to infinite, so as to evade the damage dealt by the vanilla /kill command.

5. /runcommand <pos> <area> <command> :

Specify a position and a square area to make all entities within the range execute a specific command. This detection also includes dead entities whose remains have not yet been cleared.

7. /explosion <pos> <level> <type> :

Creates an explosion of specified power at the given position. The <type> parameter supports none/block/mob/tnt with subtle differences, such as whether block destruction can be restricted by vanilla gamerules.

9. /playerfly <name> <T|F> :

This command adopts a unique naming scheme to avoid conflicts with common /fly commands, while retaining identical core functions. It grants or revokes flight permission for specific players, and does not take effect on game modes with built-in flying abilities.

I have added several custom gamerules as follows:

1. `cleardeadentities`：Anti-cheat mechanism that automatically cleans up dead but persistent entities to reduce server and client performance overhead.

2. `nexusexplosionwhendie`：When set to true, the Star Energy Nexus boss will trigger an explosion on death.

3. `enableentityclearance`：Unlocks the /removeentity command after entering the correct password (Password: 114514).

4. `modentityspeaking`：Right-click the "Author's OC (Clone)" entity to trigger its dialogue and speech when enabled.

5. `spearremoveentity`：The Starshadow God Spear will directly remove hit entities from the world when this rule is enabled.

6. `sendplayerflymessageback`：Works with the /playerfly command to send prompt messages to players when flight access is modified.

7. `woodparasiteevents`：Disables the spawn logic and detection of hostile Starlight Wood Parasite creatures when set to false.

8. `entitynamemaxlength`：Restricts the maximum length of entity names to prevent game lag and exploits from modified ultra-long name tags.

9. `setablocknoai`：ABlock is a modelless entity with adjustable collision bounds, this rule applies the {NoAI:1b} NBT tag to disable its artificial intelligence.

---

This mod is also released on Minecraft China Edition. In accordance with official platform requirements, the official website of Minecraft China Edition is attached below: http://mc.163.com/

- Supported Version: Minecraft Java Edition 1.20.1

- Dependencies: Forge Mod Loader + Geckolib

---

## Note
- Most functions of this mod are automatically generated by MCreator

- The following content is independently produced:
  - Textures & models
  - Custom dimensions
  - Built-in datapacks

---

## Future Plans
- I plan to fully remake StellarRadiance from scratch in the coming months or years. AWA (This is why this repository is marked as "MCR-Made-Version".)

- The remastered version will not rely on any mod generators (probably)

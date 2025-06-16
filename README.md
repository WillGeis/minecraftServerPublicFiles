# minecraftServerPublicFiles

#### !!NOTICE!! None of the programs here are mine, the modpack is just for my friends to enjoy.

# tutorial:

#### 1) downloading fabric

Before we start this step, close any minecraft instances and any launcher instances, this works best on a clean restart. In this repository there is a folder labeled INSTALLER, please click into that or if you have cloned it navigate into it

download [click here](https://github.com/WillGeis/minecraftServerPublicFiles/tree/main/INSTALLER) --> click on the fabric intaller exe (v1.0.3) 

![image](https://github.com/user-attachments/assets/3bbefcd1-a341-45bf-adf3-f4ace069902c)

Ensure that your minecraft version is 1.21.1 and loader version is 0.16.14, do not mess with any other settings.

Hit install, you should see a successful message, go ahead and open the minecraft launcher BUT DO NOT CLICK PLAY UNTIL ADVISED. Make sure this is the version listed:

![image](https://github.com/user-attachments/assets/17fff9bf-adaa-4b47-9ceb-26fed66fbf45)

If not, uninstall and try again.

#### 2) adding mods

I dont know how to do this on a mac so you can google how to get to your .mincraft folder, for Windows users, hit the windows key and search "run" click this:

![image](https://github.com/user-attachments/assets/c0918471-0708-4d02-8b9f-05e549ecc783)

Enter "%AppData%" and "OK"

![image](https://github.com/user-attachments/assets/1fea3ac7-ba2b-40d3-a87a-81213b59ad51)

Open .minecraft:

![image](https://github.com/user-attachments/assets/ace26fa9-7eba-4f00-8003-8720e3cc8ba6)

Copy and paste all mods from the "MODS" folder [click here](https://github.com/WillGeis/minecraftServerPublicFiles/tree/main/MODS) within the repository into the .minecraft/mods (~\.minecraft\mods) folder:

![image](https://github.com/user-attachments/assets/8b2350a7-89d2-4722-8c1a-fb4385977fcd)

Close and relaunch the minecraft launcher and click "PLAY" now, it will take 1-15 minutes to load. Once you are in go to (and make sure you trust this modpack lol, i checked, no viruses XD) Multiplayer and either hit direct connect and connect with the IP Will can give you, or via creating a coneection on the add server button (reccommended).

#### 3) reccomended but not neccicary: game resources optimization

We are going to allocate more RAM here to have better performance, I would sugget this formula for your ram $$SystemRam - 8gb * 1000mg/1gb = mb to use for here$$ **Note:** I have both tried $2^n$ memory allocations and round ones divisible by 10 no issue there so i go with rounded; further the default string with fabric is given in gb so it doesnt really matter anyway.

Navigate to the instalations tab:

![image](https://github.com/user-attachments/assets/6211d4ff-d82b-41e5-b8f0-8ad5b0216a89)

![image](https://github.com/user-attachments/assets/87f10b9f-f74e-4a4b-8428-afc9ee2f97bb)

In this string:

![image](https://github.com/user-attachments/assets/76ddaff5-9ae9-407a-8d59-ddfae33420e0)

-Xmx**REPLACE WITH STRING FOR GB OF RAM TO ALLOCATE**G -XX:+UnlockExperimentalVMOptions -XX:+UseG1GC -XX:G1NewSizePercent=20 -XX:G1ReservePercent=20 -XX:MaxGCPauseMillis=50 -XX:G1HeapRegionSize=32M

For me on a 16gb rig, I use 8gb:

-Xmx8G -XX:+UnlockExperimentalVMOptions -XX:+UseG1GC -XX:G1NewSizePercent=20 -XX:G1ReservePercent=20 -XX:MaxGCPauseMillis=50 -XX:G1HeapRegionSize=32M

hit save and play and you are good to go




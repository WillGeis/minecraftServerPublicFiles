# minecraftServerPublicFiles

#### !!NOTICE!! None of the programs here are mine, the modpack is just for my friends to enjoy.

# tutorial:

#### $\Kappa$ ) if you do not have java

To check simply open your computers terminal and type java -version

if not download the JDK here: [java](https://www.oracle.com/java/technologies/downloads/)

if you are on mac, get fucked, idc enough to type this out you are obviously rich enough to use google.

Navigate to the windows tab and click Download the x64 Installer using the link on the right. Click the download once it is done. This will download java (specifically the a JDK) click next or whatever advances the page until it is done. It is not a virus Oracle is the worlds 17th largest company.

#### $\Sigma$ ) if you have downloaded a previous pack

You will need to delete your .minecraft folder, see steps below to navigate. This is because of the .json s that point to the old mods/releases.

#### 1) downloading fabric

Before we start this step, close any minecraft instances and any launcher instances, this works best on a clean restart. In this repository there is a folder labeled INSTALLER, please click into that or if you have cloned it navigate into it

![{5B191384-1FB5-4B5C-A1A8-124DA0BF5941}](https://github.com/user-attachments/assets/fdd2f73d-29e6-447a-9a49-b59aafd31df1)

![image](https://github.com/user-attachments/assets/3bbefcd1-a341-45bf-adf3-f4ace069902c)

Ensure that your minecraft version is 1.2.1 and loader version is 0.16.14, do not mess with any other settings.

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

**NOTE:** if you do not want to individually download all the files from this repository by hand, you can proceed to step 5 and learn how to clone this repository

Copy and paste all mods from the "MODS" folder [click here](https://github.com/WillGeis/minecraftServerPublicFiles/tree/main/MODS) within the repository into the .minecraft/mods (~\.minecraft\mods) folder (note the mods pictured below are from a previous verison, just do the current mods in this repository):

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

#### 4) Removing Distant horizons *Depricated until I can patch*

In the game menu, click options then Click here

![image](https://github.com/user-attachments/assets/2b7f5238-4dd3-4279-8a9b-60ce434f5a66)

then turn this to false:

![image](https://github.com/user-attachments/assets/256c3706-2e17-406c-887f-1948eed41f4f)

and hit done, enjoy your more fps

#### 5) Installing Git For a Faster Download

Okay, lets say that you actually see sunlight more than on your walk from your house to the convience store and you **don't** have git. This section will help you install it:

Go to [mac](https://git-scm.com/downloads/mac) if you are on mac or [windows](https://git-scm.com/downloads/win). Once there follow the download instructions, clicking through the **default** settings.

Once git is installed open it (I dont know how for mac but on windows you hit the windows key and type git, and select git bash).

![{80D4D183-D6B2-4A26-8BD8-0F1C5264D0B1}](https://github.com/user-attachments/assets/0878fdae-f7ea-4c3b-9220-a93c16cb2f0c)

Commands you will use/learn:

 1) ls - lists the contents of the directory you are in
 2) cd /path/to/file/ - change directory you are in (essentially a file navigator)
 3) git clone https://github.com/WillGeis/minecraftServerPublicFiles.git - this will clone all the files from this repository onto your computer

![{357574F0-C42A-4DE5-BD3F-EAF6E1E94252}](https://github.com/user-attachments/assets/e708090b-587b-4498-974e-902b289e3305)

Typically I put the files from this on a temporary folder on my desktop, if you want to as well first navigate there at by typing (no "") "cd Desktop/" and hitting enter. After that paste "git clone https://github.com/WillGeis/minecraftServerPublicFiles.git" and the files will appear in a file on your desktop with this repository's name (minecraftServerPublicFiles)

Bam you have the files and you learned a powerful VCS (version control system) tool that you can actually use if you want to pursue a career that will drive you slowly insane

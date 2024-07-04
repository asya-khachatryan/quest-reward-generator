# Quest Reward Generator

Quest Reward Generator gets an integer input N and gives a string as an output that consists of letters "b" and "s". The distribution of these letters is such that the output string starts with mostly "b"s and transitions to mostly "s"s.

Example:
bbbbbbbbbsbbbbbbbbsbbbsbbbsbbbbsbsbbsbsbbsbbsbsbsbsbssbsbsbsbsbsssbsssbssbssbsssssbssssssbssssssssss

## Prerequisites

- **Java Development Kit (JDK)**: Installed on your computer. You can download it from the Oracle website or use a package manager like apt for Linux, brew for macOS, or choco for Windows.
- **Git**: Installed on your computer to clone the repository. You can download it from the official Git website.
- **Text Editor/IDE**: For modifying the source code.

## How to Install and Run the Project

1. Clone this repository via terminal on your computer

```
git clone https://github.com/asya-khachatryan/quest-reward-generator
```

2. Change the input "n" in the main function to a number you want with and IDE or a text editor

```
    public static void main(String[] args) {
        int n = 100;
        String rewards = generateRewards(n);
        System.out.println(rewards);
    }
```
3. Run the program through an IDE or navigate to the src folder and run these commands from the terminal.

```
javac QuestRewardGenerator.java
java QuestRewardGenerator.java
```

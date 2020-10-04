# Performance Benchmark

A multithreaded Java program that tests your computer's performance.

## Screenshots

### Resource usage during the benchmark

![Screenshot of task manager during benchmark](https://raw.githubusercontent.com/0x416c616e/performance_benchmark/main/screenshots/task_manager.PNG)

### What the benchmark window looks like

![What the benchmark window looks like](https://raw.githubusercontent.com/0x416c616e/performance_benchmark/main/screenshots/window.PNG)

### Viewing how long it took to complete the benchmark

![Finished result of the benchmark](https://raw.githubusercontent.com/0x416c616e/performance_benchmark/main/screenshots/command_prompt.PNG)


## Warnings

Do not run this on a laptop. Laptops can overheat easily. Only run it on a desktop, and only use it on desktops that have good cooling. It's also recommended that you have 16-32GB of RAM, as this program can use 9GB or so of RAM when it's running.

This program was tested on a quad-core CPU from 2012 and it takes about 3 minutes to complete. Older or slower processors will take longer, but newer processors, and especially Xeons or Ryzens, will do well in it because of the multithreaded nature. It can utilize all of your CPU cores/threads.

Run this at your own risk. It is intended to be a stress test and performance test that is very hard on your system.

## Cheap multithreaded performance

Nowadays, you can get Xeon E5-2XXX-v4 CPUs for very cheap, and there are some interesting dual-LGA2011-3/X99 boards (but make sure they support v4 instead of v3 Xeons) online. It seems like a decent performance-per-dollar option to get a dual Xeon v4 build. The single-threaded performance isn't amazing, but it's cheap overall and gets good multithreaded performance, which can be useful for compiling code, as well as benchmarks like this program. 

## OS

This is currently only meant for Windows, but maybe in the future I could add support for macOS/Linux.

## Instructions

1. You need to have Java 15 installed in order to run the program.
2. Open a task manager window to monitor resource usage.
3. Click on the RUN_BENCHMARK.bat file.
4. It will take a while, but a JavaFX window with the title "Benchmark" will open up.
5. Long story short, it was hard to make the program monitor when everything was displayed, so you need to manually watch the benchmark and click on the "click me to end the benchmark" button in order to end it and log how long it took to run.
6. Keep in mind -- the Benchmark window WILL be unresponsive at first -- that's expected behavior! It's a very resource-intensive benchmark. But you need to keep on clicking on the button until it finally responds. Then the benchmark knows how long it took to finally complete everything.
7. Look at the command prompt window that the RUN_BENCHMARK.bat file opened and it will show you the starting and ending times, letting you know how long it took to complete.

## Why?

I made this program because I wanted a more developer-centric performance benchmark. I wrote it in Java and it does a lot of stuff with objects, IO, mathematical operations, and things like that. Many computer performance benchmarks are graphics-centric, but this one is not. It's heavier on CPU and RAM. And it is especially useful for measuring multithreaded performance. Some applications don't use all cores well, but this one does. 

I intend to run this the next time I upgrade my computer so that I can see how much better it is for multithreaded programming tasks, as coding is the main thing I use my computer for. Running this on your old computer and new computer will let you see just how much better your new computer is.

# Multiples:
my_fine_program.py inside multiples folder is a python program that takes a file as the first command line argument. The file content is list of numbers, with 3 numbers per row separated by space and number of rows is undefined. First number in a row is X and the second is Y, third one is the goal number. The program search all multiples of X and Y which are below the third number(goal number) and write results to file which was given as the second command line argument.

## Usage

```python
python my_fine_program.py input.txt wild_output.txt
```

## Input and Output
### Example input file content: 
2 7 26
5 8 31

### Example screen output and output file content: 
31: 5 8 10 15 16 20 24 25 30
26: 2 4 6 7 8 10 12 14 16 18 20 21 22 24

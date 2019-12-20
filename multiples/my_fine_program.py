# input 2 7 26
# Example input file content: 2 7 26
# 5 8 31
# Example command line command: python my_fine_program.py input.txt input.txt
# Example screen output and output file content: 31: 5 8 10 15 16 20 24 25 30
# 26: 2 4 6 7 8 10 12 14 16 18 20 21 22 24

import numpy as np
import sys


def main():
    file_name = sys.argv[1]
    with open(file_name, "r") as ins:
        array = []
        for line in ins:
            array.append(line)

        for element in array:
            line = element.rstrip('\n')
            line = line.split(' ')
            value_1 = line[0]
            value_2 = line[1]
            value_of_range = line[2]

            x = np.arange(1, int(value_of_range))

            # find  multiple of value1 or value2
            n = x[(x % int(value_1) == 0) | (x % int(value_2) == 0)]

            with open("wild_output.txt", "a") as out:
                n = str(n).strip('[').strip(']')
                out.write('{}: {}\n'.format(value_of_range, n))


if __name__ == "__main__":
    main()

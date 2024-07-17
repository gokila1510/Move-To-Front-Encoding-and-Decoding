The project provides a simple encoder and decoder functionality using a predefined symbol table (symTable). Users can enter text to be encoded or a series of encoded integers to be decoded. 
Encoding:

Converts each character of the input string into its corresponding index in the symbol table.
Only characters found in the symbol table are encoded.
The encoded output is a list of integers.
Decoding:

Converts a string of comma-separated integers back into characters using the symbol table.
The input string should represent a list of integers in the format [n1, n2, n3, ...].

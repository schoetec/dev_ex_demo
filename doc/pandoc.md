pandoc -V papersize:a4 en.md -o en.pdf

pandoc -V papersize:a4 -V geometry:margin=4cm en.md -o en.pdf

pandoc -V papersize:a4 -V geometry:margin=3cm -V pagestyle=empty en.md -o en.pdf


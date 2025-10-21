from sortSelection import SortSelection
def main():
    numeros = [5, 2, 9, 1, 5, 6]
    print("Nombre: Dayanna Chacha")
    print("Original: ", numeros)

    ##instanciar la clase
    selection = SortSelection()
    selection.sort_ascendente(numeros)
    print("Ascendente: ", numeros)

    selection.sort_descendente(numeros)
    print("Descendente: ", numeros)


if __name__ == "__main__":
    main()
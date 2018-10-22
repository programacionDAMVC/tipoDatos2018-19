moneda = 12.5
EUROS_A_DOLARES = 1.16
DOLARES_A_EUROS = 0.86



def convertirEurosADolares(euros):
    dolares = euros * EUROS_A_DOLARES
    print(euros, " € son ", dolares, "$")

def convertirDolaresAEuros(dolares):
    euros = dolares * DOLARES_A_EUROS
    print(dolares, ' $ son ', euros, '€')

convertirEurosADolares(moneda)
convertirDolaresAEuros(moneda)

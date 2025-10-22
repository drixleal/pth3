def validar_cpf(cpf):
    cpf = ''.join(filter(str.isdigit, cpf))



    if len(cpf) != 11:
        return False
    

    if cpf == cpf[0] * 11:
        return False

    soma = sum(int(cpf[i]) * (10 - i) for i in range(9))
    resto = soma % 11
    if resto < 2:
        dv_1 = 0
    else:
        dv_1 = 11 - resto

    if int(cpf[9]) != dv_1:
        return False

    soma = sum(int(cpf[i]) * (11 - i) for i in range(10))
    resto = soma % 11
    if resto < 2:
        dv_2 = 0
    else:
        dv_2 = 11 - resto

    if int(cpf[10]) != dv_2:
        return False

    return True


if __name__ == "__main__":
    cpf = input("Digite o CPF (somente números ou com pontuação): ")
    if validar_cpf(cpf):
        print("CPF válido.")
    else:
        print("CPF inválido.")
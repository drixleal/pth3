import tkinter as tk
from tkinter import messagebox
import re # Usaremos regex para a validação de dígitos repetidos, como na versão Java

# ==============================================================================
#  1. SUA FUNÇÃO DE VALIDAÇÃO DE CPF (sem modificações na lógica interna)
# ==============================================================================
def validar_cpf(cpf):
    """Valida um número de CPF brasileiro."""
    
    # Removendo caracteres não numéricos
    # Usando re.sub para maior clareza (substitui tudo que NÃO é dígito por vazio)
    cpf = re.sub(r'\D', '', cpf)

    # Verificando se o CPF possui 11 dígitos
    if len(cpf) != 11:
        return False

    # Verificando se todos os dígitos são iguais (usando regex para clareza)
    if re.match(r'(\d)\1{10}', cpf):
         return False

    # --- Cálculo e Verificação do Primeiro Dígito Verificador ---
    try: # Adiciona try-except para caso a conversão para int falhe (embora re.sub deva evitar)
        soma = sum(int(cpf[i]) * (10 - i) for i in range(9))
        resto = soma % 11
        dv_1 = 0 if resto < 2 else 11 - resto

        # Verificando o primeiro dígito verificador
        if int(cpf[9]) != dv_1:
            return False

        # --- Cálculo e Verificação do Segundo Dígito Verificador ---
        soma = sum(int(cpf[i]) * (11 - i) for i in range(10))
        resto = soma % 11
        dv_2 = 0 if resto < 2 else 11 - resto

        # Verificando o segundo dígito verificador
        if int(cpf[10]) != dv_2:
            return False
            
    except ValueError:
        # Se ocorrer erro na conversão para int (improvável após re.sub, mas seguro)
        return False

    # Se passou por todas as verificações, o CPF é válido
    return True

# ==============================================================================
#  2. FUNÇÃO CALLBACK PARA A INTERFACE GRÁFICA
# ==============================================================================
def verificar_cpf_gui():
    """Pega o CPF da caixa de entrada, valida e mostra o resultado."""
    cpf_digitado = entry_cpf.get() # Pega o texto da caixa de entrada 'entry_cpf'
    
    if validar_cpf(cpf_digitado):
        # Mostra uma janela popup de INFORMAÇÃO se for válido
        messagebox.showinfo("Resultado da Validação", f"O CPF '{cpf_digitado}' é VÁLIDO.")
    else:
        # Mostra uma janela popup de ERRO se for inválido
        messagebox.showerror("Resultado da Validação", f"O CPF '{cpf_digitado}' é INVÁLIDO.")

# ==============================================================================
#  3. CRIAÇÃO DA JANELA E WIDGETS (Interface Gráfica com Tkinter)
# ==============================================================================

# Cria a janela principal
janela = tk.Tk()
janela.title("Validador de CPF")
janela.geometry("380x120") # Define um tamanho inicial (largura x altura)

# Cria um rótulo (Label) com instruções
label_instrucao = tk.Label(janela, text="Digite o CPF (com ou sem pontuação):")
# Posiciona o rótulo na grelha (linha 0, coluna 0)
label_instrucao.grid(row=0, column=0, padx=10, pady=10, sticky="w") # sticky="w" alinha à esquerda

# Cria uma caixa de entrada (Entry) para o CPF
# width=25 define a largura da caixa em caracteres
entry_cpf = tk.Entry(janela, width=25)
# Posiciona a caixa de entrada (linha 0, coluna 1)
entry_cpf.grid(row=0, column=1, padx=10, pady=10)

# Cria um botão (Button) para iniciar a validação
# command=verificar_cpf_gui liga o clique do botão à nossa função callback
botao_validar = tk.Button(janela, text="Validar CPF", command=verificar_cpf_gui)
# Posiciona o botão (linha 1), fazendo-o ocupar 2 colunas (columnspan=2)
botao_validar.grid(row=1, column=0, columnspan=2, padx=10, pady=10)

# ==============================================================================
#  4. INICIA O LOOP PRINCIPAL DA INTERFACE GRÁFICA
# ==============================================================================
janela.mainloop() # Mantém a janela aberta e responsiva a eventos
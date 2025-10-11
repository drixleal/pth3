def read_name():
	"""Lê o nome do usuário garantindo que não seja vazio."""
	name = input("Digite seu nome: ").strip()
	while not name:
		print("Nome não pode ser vazio.")
		name = input("Digite seu nome: ").strip()
	return name


def read_age():
	"""Lê a idade do usuário e valida que seja um inteiro não-negativo."""
	while True:
		s = input("Digite sua idade: ").strip()
		if not s:
			print("Idade não pode ser vazia.")
			continue
		try:
			age = int(s)
			if age < 0:
				print("Idade não pode ser negativa.")
				continue
			return age
		except ValueError:
			print("Por favor, insira um número inteiro para a idade.")


def main():
	name = read_name()
	age = read_age()
	print(f"Olá, {name}! Você tem {age} anos.")


if __name__ == "__main__":
	main()
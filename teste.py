#!/usr/bin/python 
# -*- coding: utf-8 -*	
cases = input('Entre com o valor de caso de teste: ')

if (cases < 1 or cases > 1000):
	print "Valor invalido"

testeCasos = []
for i in range(cases):
	qtdCasos = input ('Digite a qtd de cidade do caso ' + str(i+1) + " :")

	if (qtdCasos< 2 or qtdCasos > 100):
		print "Valor Invalido"
		exit()

	line = raw_input ('Digite o numero de rotas: ')
	cidades = line.split(" ")
	
	for i in cidades:
		if (int(i)< 1 or int(i)> 1000):
			print "Rota Errada"
			exit()		

	for i in range(cases):
		total = 0
		soma = 0
		for i in range(len(cidades)-1):
			soma += int(cidades[i])
		total = soma * int(cidades[len(cidades)-1])
	print total	
	

		

	




	
	

	
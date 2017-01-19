#!/usr/bin/python 
# -*- coding: utf-8 -*	
cases = input('Entre com o valor de caso de teste: ')

#Verifica se os casos digitados estao entre a condicao fornecida
if (cases < 1 or cases > 1000):
	print "Valor invalido"

testeCasos = []
for i in range(cases):
	qtdCasos = input ('Digite a qtd de cidade do caso ' + str(i+1) + " :")

	#Verifica se a quantidade de casos esta entre a condicao fornecida
	if (qtdCasos< 2 or qtdCasos > 100):
		print "Valor Invalido"
		exit()

	line = raw_input ('Digite o numero de rotas: ')
	#Split dos valores add em line
	#add no array cidades[]
	cidades = line.split(" ")
	
	for i in cidades:
		#Verifica cada numero digitado esta na condicao informada
		if (int(i)< 1 or int(i)> 1000):
			print "Rota Errada"
			exit()		

	for i in range(cases):
		total = 0
		soma = 0
		#calculo da analise combinatória
		for i in range(len(cidades)-1):
			soma += int(cidades[i])
		total = soma * int(cidades[len(cidades)-1])
	print total	
	

		

	




	
	

	
    ---Relatório---
CASOS DE TESTE INICIAS
    Particionamento do Espaço de Entrada

     -Teste de Deposito:
    valor<0
    valor>=200000 && status=0
    valor>=0 && valor+saldo<50000 && status=0
    valor>=0 && valor+saldo>=50000 && status=0
    valor>=0 && valor+saldo<200000 && status=1
    valor>=0 && valor+saldo>=200000 && status=1
    valor>=0 && status=2
   
     -Teste de Retirada:
    valor<0
    saldo-valor<0
    valor>=0 && saldo-valor>=0 && status=0
    valor>=0 && saldo-valor>=25000 && status=1
    valor>=0 && saldo-valor<25000 && status=1
    valor>=0 && saldo-valor>=100000 && status=2
    valor>=0 && saldo-valor<100000 && status=2

     -Teste de Gets:
    getSaldo
    getStatus
    setStatus

ANALISE DE COBERTURA DO CÓDIGO
    -1º teste
        Instructions Coverage 90%
        Branch Coverage 88%
    -2º teste
        Instructions Coverage 100%
        Branch Coverage 96%
    -3º teste
        Instructions Coverage 100%
        Branch Coverage 100%    

NOVOS CASOS DE TESTE
    valor<0 && status=1 (Segundo teste do JaCoCo)
    valor<0 && status=2 (Segundo teste do JaCoCo)

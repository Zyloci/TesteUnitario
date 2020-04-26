
Relatório contendo:
CASOS DE TESTE

    Particionamento do Espaço de Entrada

    Teste de Deposito:
    valor<0
    valor>=200000 && status=0(Added)
    valor>=0 && valor+saldo<50000 && status=0
    valor>=0 && valor+saldo>=50000 && status=0
    valor>=0 && valor+saldo<200000 && status=1
    valor>=0 && valor+saldo>=200000 && status=1
    valor>=0 && status=2
   
    Teste de Retirada:
    valor<0
    saldo-valor<0(Added)
    valor>=0 && saldo-valor>=0 && status=0
    valor>=0 && saldo-valor>=25000 && status=1
    valor>=0 && saldo-valor<25000 && status=1
    valor>=0 && saldo-valor>=100000 && status=2
    valor>=0 && saldo-valor<100000 && status=2

    Teste de Gets:
    getSaldo
    getStatus
    setStatus(Added)


relatórios de defeitos (até que todos foram eliminados)

análise de cobertura do código

novos casos de teste acrescentados (com justificativa) ou justificativa para a não necessidade de acrescentar casos de teste.


Código do driver de teste implementado

Código da classe implementada

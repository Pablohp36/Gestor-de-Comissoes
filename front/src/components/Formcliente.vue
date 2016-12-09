<template>

    <div id="formcliente">
    <h3 class="title is-3 is-danger">{{msg}}</h3>

    <form >

    <label for="nome" class="label">Nome:</label>
    <p class="control">
      <input name="nome" id="nome" v-model="cliente.nome" class="input" type="text" placeholder="Nome completo">
    </p>
    <label for="apelido" class="label">Apelido:</label>
    <p class="control">
      <input name="apelido" id="apelido" v-model="cliente.apelido" class="input" type="text" placeholder="Apelido">
    </p>
    <label for="coduniident" class="label">Código único de Identificação:</label>
    <p class="control">
      <input name="coduniident" id="coduniident" v-model="cliente.codUniIdent" class="input" type="text" placeholder="CPF / CNPJ">
    </p>
      <button  class="button is-primary " v-on:click="acSalvarCliente" type="button" >Salvar</button>
      <button type="button" class="button is-warning" v-on:click="alternarComponente()">Voltar</button>
    </form>
    {{cliente.nome}},{{cliente.apelido}},{{cliente.codUniIdent}}
    </div>
</template>
<style>
    body{

    }
</style>
<script>

    export default{

        name: 'formcliente',
        data(){
            return{
                msg:'Cadastro de cliente',
                cliente : {id: null, nome: '', apelido : '', codUniIdent:'' }
            }
        },
        computed : {

          salvarCliente: function(){
            acSalvarCliente();
            return false;
          }

        },
        props : {
          
        },
       methods:{
          acSalvarCliente: function(){
          var self = this;
          if(this.cliente.nome == "" || this.cliente.nome == null){
          this.msg = 'Campos em branco'
          }else{
          console.log(this.cliente);
            self.cliente = this.cliente;
            self.cliente.codUniIdent = this.cliente.codUniIdent;
            this.$http.post('http://localhost:70/cliente', self.cliente).then(
             response=>{
              console.log(response.statusText);
              self.msg = 'Cliente salvo com sucesso !!!';
             },
             error=>{
               console.log(error)
               this.$set('msg', error)
             }).finally(function () {
              return false;

            })
            }
          }

        }
    }
</script>

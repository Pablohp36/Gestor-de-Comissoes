<template>
  <div id="listaclientes" class="">
    <h3 class="title is-3 is-danger">{{msg}}</h3>

        <table class="table">
        <thead>
          <tr>
            <th>ID:</th>
            <th>Nome Completo:</th>
            <th>Apelido:</th>
            <th>CPF/CNPJ</th>
          </tr>
        </thead>
        <tfoot>
          <tr>
          <th>ID:</th>
          <th>Nome Completo:</th>
          <th>Apelido:</th>
          <th>CPF/CNPJ</th>
          </tr>
        </tfoot>
        <tbody>


            <template v-for="cli in clientes">
            <tr>
            <td>{{cli.id}}</td>
            <td>{{cli.nome}}</td>
            <td>{{cli.apelido}}</td>
            <td>{{cli.codUniIdent}}</td>
            </tr>
            </template>

          </tbody>
        </table>


  </div>

</template>
<style></style>
<script>
  export default {
    name:'listacliente',
    data (){
    return {
    clientes : [

    ],
     cliente : 'Teste',
     msg : 'Clientes cadastrados'
    }
    },
    mounted: function() {
      this.carregarClientes();


    }, methods: {
      carregarClientes : function(){
      var self = this;
      var dadosbuscados;
     //alert('foi')
      self.$http.get('http://localhost:70/clientes/').then(
      response =>{
      console.log(response.body);
        self.clientes = response.body;
      }, error => {
        console.log(error);
      }
      )

    }
    }
  }
</script>
